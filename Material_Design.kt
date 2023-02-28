Density Buckets

Google assignes differnt density buckets to devices with diffrent density screens.
A device with 442 density screen might be assigned to a 480dpi density bucket.
But genreally you only have to work with the middle four density buckets. I,E 1X ,1.5X ,2X, 3 X 
These buckets give you the control of the scallling of your graphic assets.i.e things like icons
Thus you dont have to make diffrent if not hundreds versions of icons for diffrent screen density ,you can just scale the icons based on its density buckets

DENSITY BUCKETS


LDPI           120dpi     .75x
MDPI           160dpi     1x
HDPI           240dpi     1.5x
XHDPI          320dpi     2x
XXHDPI         480dpi     3x
XXXHDPI        640dpi     4x







ASSET SHARPNESS / CRISPNESS
Nor mally it is good to provide assets for the for major density buckets .
But instaetd ,you can provide assets for the XXHDPI  or XHDPI and let android scale them down.
Now android is not suited for down scalling but you can create icons for these density buckets from the ANDROID ASSETS STUDDIO// https://romannurik.github.io/AndroidAssetStudio/ 



STATE LISTS 

This give condtions to  be implememted when a state is true
e.g for a check button

//This puts a  graphic image if the state of the check box is pressed.
<slector>
  <item android:state_pressed = true"
         android:drwable="checked">
<selector/>  
  Thre are many diffrent types of states e.g
e.g selected 
focused 
checked 
pressed
YOU CAN EVEN MAKE YOUR OWN states 
