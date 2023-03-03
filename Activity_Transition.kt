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






CIRCULAR REVEAL TRANSITION

Provides viula continuity to show or hide the ui elemnents
Enables to animate circle elemnts when clicked to reveal or hide a view.


First find which view will start the animation when clicked 

val text = findViewById(R.id.text)
next find the center of the sccrreeen

val centerX = (view.getLeft() + view.getRight() )/2
val centerY = (view.getTop() + view.getBottom() )/2


val radious = ( MAth.max(text.getWidth(),text.getHerifght()) ) *2.0f here we calculate the radious to which the view  will extend to

// This is where we  set the visibility of the txt field to be seen and the text to be displayed
if(text.getVisibility() == view.INS=VISIBLE){
 
    text.setVisibility(view.VISIBLE)
    text.setText("Helllow")
    
    
    viewAnimationUtils.createCircularReveal(text, centerX,centerY,0,radius).start()   ./ This strats the animation from the center 0 all throught the radius assigned up to the sided=s X and Y 



}
else {
 // THIS RETRACTS THE ANIMATIO AND HIDES THE TEXT
 
reveal =  viewAnimationUtils.createCircularReveal(text, centerX,centerY,0,radius)   ./ This retracts the animation from the center 0 all throught the radius assigned up to the sided=s X and Y 
  text.setVisibility(text.INVISIBLE)



}


ENTER AND EXIT ACTIVITY TRANSITIONS

ENTER TRANSITIONS - Determines how views in an activity enters
EXIT TRANSITION = Determines how views in an activity exits


Thers transitions can be categorised into

Explode transition
Slide transition
Fade transition



EXPLODE TRANSITION

Views move to center of screen when one enters into an activity
and views move away from the center when an activity is moved out of or exited

There are two ways to carry out this transtions .
Either by code or by xml

We are going to focus on the xml side

In a transition folder in the resource file


TransitionExplode.xml
<transtionset>
 
     <explode  
             android:duration ="1000"
             android:interpolation ="@android:interpolation/bounce "  ---> Describes the type of animation to beused
 
 
 <transitionset>
 
 
 In the main activty

buttomn.setOnClickListener{
 
 options = ActivityOptions.makeSceneTranstions(this)
 intent = Intent(mainactivity.this,SecondeActivity::class.java)
 intent.putExtra(constant.Explode,constants.TransityionType.TransitionExplodexmlFile)
stratActivirt(intent,optinons) 
 




}


Now in the Seconde activity that we will be transiting to

class SecondActivity : Appcompact(){
 
Oncreate{
val  entertransition = TransitionInflater.from(this).inflateTransition(R.transition.Transitionexploedde.xml)
getWindow().setEnterTransition(enterTranstion)


}
}




SLIDE TRANSTION

Moves views in or out from the activiyt from one of the edges of the scene
We create a new file in the resource folde and give that file th name of
slideTransition

<transtionset
 
     <slide 
             android:duration ="1000"
             android:slideEdge="right"
 
 
 <transitionset>
 
 
 In the main activty

buttomn.setOnClickListener{
 
 options = ActivityOptions.makeSceneTranstions(this)
 intent = Intent(mainactivity.this,SecondeActivity::class.java)
 intent.putExtra(constant.Explode,constants.TransityionType.SlideTranstion)
stratActivirt(intent,optinons) 
 




}


Now in the Seconde activity that we will be transiting to

class SecondActivity : Appcompact(){
 
Oncreate{
 
val  entertransition = TransitionInflater.from(this).inflateTransition(R.transition.SlideTranstion.xml)
 getWindow().setEnterTransition(enterTranstion)


}
}



FADE TRANSTION

 This adds or removes a view from the scene by changing its opacity. It will just fade out or fade into the screen 

We create a new file in the resource folde and give that file th name of
FadeTransition

<transtionset
 
     <fade
             android:duration ="1000"
             android:slideEdge="right"
 
 
 <transitionset>
 
 
 In the main activty

buttomn.setOnClickListener{
 
 options = ActivityOptions.makeSceneTranstions(this)
 intent = Intent(mainactivity.this,SecondeActivity::class.java)
 intent.putExtra(constant.Explode,constants.TransityionType.SlideTranstion)
stratActivirt(intent,optinons) 
 




}


Now in the Seconde activity that we will be transiting to

class SecondActivity : Appcompact(){
 
Oncreate{
 
val  entertransition = TransitionInflater.from(this).inflateTransition(R.transition.SlideTranstion.xml)
 getWindow().setEnterTransition(enterTranstion)


}
}



AFTER EXCUTING THIS TRANSIOTONS TO THIS ACTIVITYS ,wE MAY WNAT TO GO BACK TO THE MAINACTIVITY

Main activity


class mainActivity:Appcompact(){


getWindew.setReenterTrastion(SlideTranstion) // This sets the renentering transtion animation
getWindow().setAllowTranstionOverlap(fasles) // This prevents overlap of transtion s

}







 





