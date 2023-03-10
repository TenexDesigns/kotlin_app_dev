What is a Fragment.
It is an area of an activity which can be changed to hold other functionality
e.g The top bar of whats up has three tabs of chats status and calls.The area below this bar is a fragment 
When you swipe to either of chat ,staus or call you are changing from one fragment to another ,thus changing functionality of what is displyed.
The basis of fragments is to reduce the number of activities.
Frgments can be reused.e.g Think of it as a function, declare it once and use it or call it anywhere


A Fragment is a piece of an activity which enable more modular activity design. A fragment encapsulates functionality so that it is easier to reuse within activities and layouts.
It will not be wrong if we say, a fragment is a kind of sub-activity.


We can have either a static fragment that alaways remains the same in our activity 
We can also have a fragment container that we can dynamicaly add replace and remove fragments from our activity.


Following are important points about fragment −

----->  A fragment has its own layout and its own behaviour with its own life cycle callbacks.

----->  You can add or remove fragments in an activity while the activity is running.

----->  You can combine multiple fragments in a single activity to build a multi-pane UI.

----->  A fragment can be used in multiple activities.

----->  Fragment life cycle is closely related to the life cycle of its host activity which means when the activity is paused, all the fragments available in the activity will also be stopped.

----->  A fragment can implement a behaviour that has no user interface component.

----->  Fragments were added to the Android API in Honeycomb version of Android which API version 11.




Prior to fragment introduction, we had a limitation because we can show only a single activity on the screen at one given point in time.
So we were not able to divide device screen and control different parts separately.
But with the introduction of fragment we got more flexibility and removed the limitation of having a single activity on the screen at a time. 
Now we can have a single activity but each activity can comprise of multiple fragments which will have their own layout, events and complete life cycle.


     Life cycle of Fragments

onAttach() ----> onCreate()----> onCreateView()----> onActivityCreated()----> onStart()----> onResume()
                                                                                                     |
                                                                                                     |
                                                                                                     |                                                                                                     
                                                                                                     v
                           onDetach <---- onDestroy() <---- onDestroyView() <---- onPause() <---- onStop() 

onAttach()           : The fragment instance is associated with an activity instance.The fragment and the activity is not fully initialized. Typically you get in this method a reference to the activity which uses the fragment for further initialization work.
onCreate()           : The system calls this method when creating the fragment. You should initialize essential components of the fragment that you want to retain when the fragment is paused or stopped, then resumed.
onCreateView()       : The system calls this callback when it’s time for the fragment to draw its user interface for the first time. To draw a UI for your fragment, you must return a View component from this method that is the root of your fragment’s layout. You can return null if the fragment does not provide a UI.
onActivityCreated()  : The onActivityCreated() is called after the onCreateView() method when the host activity is created. Activity and fragment instance have been created as well as the view hierarchy of the activity. At this point, view can be accessed with the findViewById() method. example. In this method you can instantiate objects which require a Context object
onStart()            : The onStart() method is called once the fragment gets visible.
onResume()           : Fragment becomes active.
onPause()            : The system calls this method as the first indication that the user is leaving the fragment. This is usually where you should commit any changes that should be persisted beyond the current user session.
onStop()             : Fragment going to be stopped by calling onStop()
onDestroyView()      : Fragment view will destroy after call this method
onDestroy()          : called to do final clean up of the fragment’s state but Not guaranteed to be called by the Android platform.



Types of Fragments

Basically fragments are divided as three stages as shown below.

----> Single frame fragments − Single frame fragments are using for hand hold devices like mobiles, here we can show only one fragment as a view.

----> List fragments − fragments having special list view is called as list fragment

----> Fragments transaction − Using with fragment transaction. we can move one fragment to another fragmen




//Note--->When you create a fragment --It is usally surrounded by Frame Layout ,Change this layout to <androidx.constraintlayout.widget.ConstraintLayout to work easily with the fragment.

How to use Fragments?

This involves number of simple steps to create Fragments.

----> First of all decide how many fragments you want to use in an activity. For example lets we want to use two fragments to handle landscape and portrait modes of the device.

----> Next based on number of fragments, create classes which will extend the Fragment class. The Fragment class has above mentioned callback functions. You can override any of the functions based on your requirements.

----> Corresponding to each fragment, you will need to create layout files in XML file. These files will have layout for the defined fragments.

----> Finally modify activity file to define the actual logic of replacing fragments based on your requirement.


Handling the Fragment Lifecycle

A Fragment exist in three states :

   ---->  Resumed  : The fragment is visible in the running activity.
   ---->  Paused   : Another activity is in the foreground and has focus, but the activity in which this fragment lives is still visible (the foreground activity is partially transparent or doesn’t cover the entire screen).
   ---->  Stopped  : The fragment is not visible. Either the host activity has been stopped or the fragment has been removed from the activity but added to the back stack. A stopped fragment is still alive (all state and member information is retained by the system). However, it is no longer visible to the user and will be killed if the activity is killed.





In fragments, views e,g buttons are created and accessible after the oncreate method has been called.
    override fun onCreate(savedInstanceState: Bundle?) {


The onCreateView method is what tiew our fragment class to the xml fragment file.
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    
    How ever there is a much a much shorter way to tie our xml file to our fragmnt.Simply tie our fragment class file to our xml file by passing R.layout.fragment_home as a parameter in the extended fragment() method.
    
class HomeFragment : Fragment(R.layout.fragment_home) {} 

and you wont have to write as much code as you did abbove.


To be able to access the views in fragments ,you first have to overide the OnCreatedview method. This method is clled after all views have been created 
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var view:TextView = findViewById(R.id.textView2)
    } 
    
    
    
    ----> Now we need a frgmemnet which we can dynamicly change our fragment content
    
    
    To do this ,in the activity we desire for the fragment to be contained.
    we add the FrameLayout container which will host our differnt fragments
    We add this frame layout in the acity xml file.
    
    
      <FrameLayout
        android:id="@+id/frame"
        android:layout_width="419dp"
        android:layout_height="500dp">
        
        e.g" encoding="utf-8"?>
         This is your activity file
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">


    <Button
        android:id="@+id/two"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="272dp"
        android:layout_marginBottom="104dp"
        android:text="two"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <Button
        android:id="@+id/one"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="64dp"
        android:layout_marginBottom="104dp"
        android:text="one"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <FrameLayout                                               //Here is the frame layout.
        android:id="@+id/frame"
        android:layout_width="399dp"
        android:layout_height="468dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"


        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0"></FrameLayout>


</androidx.constraintlayout.widget.ConstraintLayout>
         
//Note--->When you create a fragment --It is usally surrounded by Frame Layout ,Change this layout to <androidx.constraintlayout.widget.ConstraintLayout to work easily with the fragment.
         This is your fragment file
         <?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".HomeFragment">


    <TextView
        android:id="@+id/textView4"
        android:layout_width="150dp"
        android:layout_height="63dp"
        android:layout_marginTop="124dp"
        android:layout_marginEnd="204dp"
        android:text="Chat view"
        android:textSize="24sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>
        
        Now ,in our acivty filewe have to crete instances of our fragment
        
    class MainActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var first = HomeFragment()
        var second = ChatFragment()
        
        
        Now ,to be able to change the fragment contained in our frnelayout container ,
        we have to put the first fragment which is usaully displayed ,when user navigateds to the activity. bu calling this method
        
        
               supportFragmentManager.beginTransaction().apply {
                   replace(R.id.frame,first)       //This puts the first fragmne t to be displayed in the fragment container.
                   commit()

        }
        
        
        Now ,to be able to change the fragmemnt displayed ,we still use the above method.
        
        
        class MainActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var one:Button = findViewById(R.id.one)
        var two:Button = findViewById(R.id.two)

        var first = HomeFragment()
        var second = ChatFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame,first)
            commit()

        }

        one.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame,first)
                commit()

            }

        }
        two.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame,second)
                commit()

            }

        }


    }}
        
        
        Now ,there is a problem.There is no stack for fragments.So if you click the back button ,The app activity  will be destrioyed instead of going back.
         To solve this problem.We use the addToBackStack() method that will add our fragment to a stack
         This method takes in a parameter of name,the name is the optionall we give to the fragment in the stack,But you can pass null if you dont care about the name.
    
    
class MainActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var one:Button = findViewById(R.id.one)
        var two:Button = findViewById(R.id.two)

        var first = HomeFragment()
        var second = ChatFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame,first)
            commit()

        }

        one.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame,first)
                addToBackStack(null)               //We addede the addToBack Stack method.

                commit()

            }

        }
        two.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame,second)
                addToBackStack(null)

                commit()

            }

        }


    }}
















































































