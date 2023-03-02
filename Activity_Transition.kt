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





