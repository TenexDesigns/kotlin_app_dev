TOUCH FEEDBACK ANIMATION

This is when user interacts with UI elements
e.g Ripple animation
The ripple provides instantanious vissula confirmation at the point of contact
There two types of Ripple effects 
Bounded and unbounded
Bounded -  Has boundaries within that view only
Unbounded - Sppeads across the screen and beyound that view on which it is placed
There after you can also implememnt custom bounded and custom unbounded ripple effects.


This ripple animation is provided to buttons by default i.e the bounded ripple effecte
For other view ,you hace to declare it explicitly




To explicity declare the ripple effect on other views you use this athhribute on that view e.g

Bounded Ripple effect

android:background="?android::attr/selectableItemBackground"   This declares a bounded ripple effect on the view.

Unbounded ripple effect

android:background="?android::attr/selectableItemBackgroundBorderless"   This declares un  unbounded ripple effect on the view.


FOR CUSTOM RIPPLE EFFECT ----E.G WITH OUR OWN COLOR OF CHOOSING
We have to declare a new xml file  the drawerbal folder.
Then we have to declare the ripple tags and within the ripple tags we give our ripple its custom color e.yt.c

  
  Bounded Ripple effect
For a bounded ripple effect we have to include an ite in it and give it an id of mask

Drwarebal folder -- file name custom_boredere_ripple.xml
<?xml version="1.0 " encoding ="utf -8" ?>
<ripple
      xmlns:android="http://schemas.android.com/apk/res/android"
      android:color="@color_Green"  >  //This is whre we declaer the color of our ripple effect
  
  
        <item android:id="@android:id/mask"  />

<ripple/>


Unboinded ripple effect
Drwarebal folder -- file name custom_Unboredere_ripple.xml


For an unbounded ripple effect we dont include an iten within the ripple tags with the id of mask

<?xml version="1.0 " encoding ="utf -8" ?>
<ripple
      xmlns:android="http://schemas.android.com/apk/res/android"
      android:color="@color_Green"  >  This is whre we declaer the color of our ripple effect

<ripple/>
  
  
  
  To see the custom additions we have done to our ripple effect on our desired view ,we have to refer to this files 
where we have described our custom ripple effects in the drawerbal folder.

For our Bordered Custom rippple effect

    <TextView
        android:id="@+id/textView"
        android:layout_width="204dp"
        android:layout_height="78dp"
        android:background="@drawerbal/cutom_border_riiple">
  
  
  For our UnBordered Custom rippple effect

    <TextView
        android:id="@+id/textView"
        android:layout_width="204dp"
        android:layout_height="78dp"
        android:background="@drawerbal/cutom_Unborder_riiple">
  
  
  By default the ripple effect has a grey color . To change the default ripple color you have to change the android:colorControlHighligt in the theme file.


  
  

  
  
  



  
