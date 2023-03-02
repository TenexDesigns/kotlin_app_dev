Activity Transition

This offers visula connections between states throught motion
Transformations betwen common elements.
 We can specify custom animations between visual elemnts

Types of activity Transitions

--> Shared elemnts transitio
--> Entry transition
--> Exit transition

SHARED ELEMENT TRANSITION
Determines how views that are shared between two activities transition between these activities.


STEPS TO FOLLOW

Enable window transitions in theme
Specify a shared elements transition in the style/ Define transiton as a resource
Give common name to the shared elemnts with --> android:transitonName attribute that will have a shared transition.
Next is defining the ActivityOptions class that will amke the transitions possible. 


________-WHEN YOU CLICK ON AN IMAGE & TEXT TOGETHER  AND THEY OPEN UP IN AN NEW ACTIVTY WITH THAT IMAGE AND THAT TEXT IN THAT ACTIVTI

 That is a shared elemnt activty. Where elemnts on one activy are presnent on another activy
This elementsa re the shared elemnts and you have to give then same names on both activit files

e.g This is the main actiyty file containg the image and text file 
You have to give these shared elemnts that are f=going to be on both atvitys the same transitionName

<linearLayerout>
  
  
    <TextView
        android:id="@+id/textView"
        android:layout_width="204dp"
        android:layout_height="78dp"
        android:transitionName="sharedText"
 >
  
    <ImageView
        android:id="@+id/imageView"
        android:layout_width="204dp"
        android:layout_height="78dp"
        android:transitionName="sharedImage">


  
  
  
<linearLayerout>
  
  
  This is the second actiivy which will share the same elemnts as the main activity
The shared elemts will be used to move from that activit to this one
To enable that mwe have to use the same transtion name s for this shared view


Now in the secondActity.kt file we have to implememnt the
 getWindow().requestFeature()Window.FEATURE_CONTENT_TRASITIONS) method before the onCreate method To enable transtions to happenn
OR WE CAN DO THIS IN THE THEME FILE
----> <item name="android:windowContentTransitions">true<item/>
 //This enables transitoons to occcur throughout the app.
 


<style name="Theme.App" parent="Theme.AppComaapct.light">

----> <item name="android:windowContentTransitions">true<item/>
 
 <style/>

 
 __> Now wehave to implement the ActivityOptions.makeSceneTrabstion() method to enable trastions to happen
This method takes in the context and the view to be shared. If the views are many then we have to put them in an array of key,value pair
val arrayPair = arrayof(image,"sharedImage")
val arrayPair = arrayof(image,"sharedText")

val options:ActivityOptions = ActivityOptions.makeSceneTrabstion(this,arrayPair) ;;We put the items to be shared in an array and then pass that array as the second arumntet here to form the option s varialble

intent = Intent(MainActivity.this,secondActivity::class.java) // This tells android to move from the mainactivity to the secondActivity
startActivity(intent,options.bundle())  // This is what implements the intent to move to the second aciviyt. We combine the intent with the shared eeeeelemnts  in the options array.






