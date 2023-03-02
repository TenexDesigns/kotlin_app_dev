Tool bar 


Used to give app identity
Indicates users location in app
Used to acess important actions
Support for easy view switching
You can show multiple tool bar on screen

Compatible for API 7+
Simialr to action bar
To use ActionBar as toool bar
  . setSupportActionBar
  . setActionBar

Tool bar is a view group - Meaning it has its own layout and can be placed anywhere on the screen.
                         - It can have multiple views as child view
                         - It can contain custom views



The tool bar can have
-Title
-Subtitle
-Menu Icon
- Overflow menu
- Naviagtion button

WHEN WE USE THE TOOL BAE ,WE USE IT A VIEW GROUP

To get started with the tool bar we have to set it in the activity we want it to appear
We have to put it in thx xml of the activty we want the toool bar to appear.
We instanciate the tool bar by using the foolowing tag   <androidx.appcompat.widget.Toolbar>
We can define the toolbar as a layoutfile of the menu type and in it we define , what we want to be dispalyed
  

  ACTIVITY FILE.xml
  // THIS IS THE XML FILE OF THE ACTIVITY WE WANT OUR APP BAR TO APPEAR
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
  
  // THIS IS OUR APP BAR

    <androidx.appcompat.widget.Toolbar
        android:id="@+id/toolbar2"
        android:layout_width="0dp"
        android:layout_height="?attr/actionBarSize"
        android:background="@color/teal_700"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        tools:ignore="MissingConstraints">

    </androidx.appcompat.widget.Toolbar>

</androidx.constraintlayout.widget.ConstraintLayout>

   *************** OR **************
  
  We can declare our toolbar in a differnt layout file and then include it in our acivit file e.g

********************* Different layout file where we declared our app bar *******
  App_bar.xml
  <?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
  
// This is where we declare our app bar.
    <androidx.appcompat.widget.Toolbar
        android:id="@+id/toolbar2"
        android:layout_width="0dp"
        android:layout_height="?attr/actionBarSize"
        android:background="@color/teal_700"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

    </androidx.appcompat.widget.Toolbar>

</androidx.constraintlayout.widget.ConstraintLayout>
  
  
  ******************* OUR ACTIVITY FILE *************
  
  <?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

  // This is where we call the file we declared our app bar and include it in our xml file for our activty.
    <include
        android:id="@+id/layout"
        layout="@layout/items"/>



</androidx.constraintlayout.widget.ConstraintLayout>
  
  
  
  
  // NOW WE WANT TO POPULATE THE TOOLBAR WITH ICONS AND A POP UP MENU
  
  To do this we have to define a menu layout xml file 
In this file we define icons and the names for this items.
If the  showActions type of the item is "always " . Then it will be displayed on the action bar as an icon ,but without the name
If the  showActions type of the item is "never " . Then it will be shown in the menu item will be shown in the pop up menu .The name will be displayed in the pop up menu insteda of an icon.
The pop up brought to view by clicking the three verticaly stacked button at the far right of the toolbar.

  
  
  <?xml version="1.0" encoding="utf-8"?>
<menu xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:id ="@+id/menu0"
        android:icon="@drawable/icon"
        android:title="Save1"
        app:showAsAction="never">       ************* ITS NAME WILL BE SEEN ON THE POP UP MENU as NAME ONLY ,WITHOUT ICON **************

    </item>

    <item
        android:id ="@+id/menu1"
        android:icon="@drawable/icon"
        android:title="Save2"
        app:showAsAction="always">       ************* ITS ICON WILL BE SEEN ON TOOL BAR **************

    </item>

    <item
        android:id ="@+id/menu2"
        android:icon="@drawable/icon"
        android:title="Save3"
        app:showAsAction="always">       ************* ITS ICON WILL BE SEEN ON TOOL BAR **************

    </item>

    <item
        android:id ="@+id/menu3"
        android:icon="@drawable/icon"
        android:title="Save4"
        app:showAsAction="always">        ************* ITS ICON WILL BE SEEN ON TOOL BAR **************

    </item>

    <item
        android:id ="@+id/menu4"
        android:icon="@drawable/icon"
        android:title="Save5"
        app:showAsAction="never">       ************* ITS NAME WILL BE SEEN ON THE POP UP MENU as NAME ONLY ,WITHOUT ICON **************

    </item>

</menu>
  
  
  
  Now to populate our toolbar with the above menu items or icons we use
This inflates the toolbar with the icons or names of items in the ppop up menu.
 toolbar.inflateMenu(R.menu.menu_main)
 
 
 This is seen like this in the activity menu.

// class ToolActivity : AppCompatActivity() {

//     override fun onCreate(savedInstanceState: Bundle?) {
//         super.onCreate(savedInstanceState)
//         setContentView(R.layout.tool_activity)
        var toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar2)

        toolbar.setTitle("Stand up")                              // Here we set the titl of the app bar
        toolbar.setNavigationIcon(R.drawable.icon)  // Here we set the ico for the naviagtion Icon ...e.g To go back
        toolbar.inflateMenu(R.menu.menu_main)  //Here we put the items we had in the menu in the  toolbar.



Now we have to set the onClick listent on the tool bar for each of the items on it
// class ToolActivity : AppCompatActivity() {

//     override fun onCreate(savedInstanceState: Bundle?) {
//         super.onCreate(savedInstanceState)
//         setContentView(R.layout.tool_activity)
//         var toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar2)

//         toolbar.setTitle("Stand up")
//         toolbar.setNavigationIcon(R.drawable.icon)
           toolbar.inflateMenu(R.menu.menu_main)

        toolbar.setOnMenuItemClickListener {  // Here we set the onClik listener for each of the items on our menu.


         


            return true

        }

        
       CUSTOMISING TOOL BAR AND THE POP UP MENU


To customise our tool bar we have to give it a theme. We also have to give out pop up menu its own theme
In the styles file we code the style themes to be applied on the popup menu and the tool bar separately.



This is the theme for the toolbar 
    <style name="ToolbarTheme" parent="Theme.AppCompat.Light">

        <item name="android:textColorPrimary">@android:color/holo_green_light</item>
        // This is the color of the toolbar title


        <item name="android:textColorSecondary">@color/purple_500</item>
    // This is the color of the Overflow Menu (3 dots icon)
    //and color of the Navigation Drawer icon
    </style>
  
  This is the theme for the pop up menu.
        
  
  
      <style name="PopUpTheme" parent="Theme.AppCompat.Light">

        <item name="android:background">@android:color/holo_green_light</item>
        // This is the color of the background on which the toolbar items will be displayed 


        <item name="android:textColorPrimary">@color/purple_500</item>
    //This is the color of the text on the items on the pop up menu
    </style>
  
  
  
  
  
  ******************** CONTEXTUAL MENU IN TOOLBAR ***************
  
  This contextual menu in tool bar is displayed when you long press an item ...E.g whats app ..Look at the contextMenu image in this repisotory for a visual example.


















SNACKBAR

It is a lightweight feedback like toast.  e.g when u delete a message ,you get a tast like message with an UNDO option to undo the done opertion
It disappers afert a timeout  --> setTimeout
Can be swipped off the screen  --> Usig coordinator layout
may contain an action or not


Types of snackbar
simple snackbar --No action
Custom Color snack bar ---Can be customised in terms of color e.tc
Snackbar with option -- > Give user an option e.g to undo the action.



CORDINATOR lAYOUT

tHIS ENABLE FEATURES SUCH AS

- Swipe to dismiss
- Automatic moving of widgets like fab































































