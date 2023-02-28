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











    <style name="Theme.Tenex" parent="Theme.MaterialComponents.Light.DarkActionBar">
      
         //Primary brand color. -->
        // This controls the color of the Action bar ,buttons-->
      For refernce on what controls what color --> Go tho then color-i color-is and color-image files in this repisototy as they have explantions for the above.

        <item name="colorPrimary">@color/teal_700</item> // Controls color of Appbar /toolbar buttons
        <item name="colorPrimaryDark">@color/red</item>// Controls color of Status bar
        <item name="colorAccent">@color/purple_200</item>// Controls color of active or selected widgets or views e,g checkbox
        <item name="android:windowBackground">@color/black</item> // Controls color of the window background
  
    </style>
 
COLOR THEME CREATION

Material Design comes designed with a built-in, baseline theme that can be used as-is, straight out of the proverbial box.

This includes default colors for:

Primary and secondary colors
Variants of primary and secondary colors
Additional UI colors, such as colors for backgrounds, surfaces, errors, typography, and iconography.
All of these colors can be customized for your app.

There are colors e.g for

primary
primaryVariant
Secondary
SecondaryVariant
background
surface
error
onPrimary
onSecondary
onBackground
onSurface
onError

****************************** PRIMARY COLOR ***************************
 
Primary color

A primary color is the color displayed most frequently across your app’s screens and components.
Your primary color can be used to make a color variants

Distinguish UI elements
To create contrast between UI elements, such as a top app bar from a system bar, you can use light or dark variants of your primary colors.
You can also use these to distinguish elements within a component, such as the icon of a floating action button from its circular container.
e.g whatsapp and its floating action bar. llok at the image example in this reposorty for whatsappImage-screenshot for an example of the above. 






  
  
  
  COLOR PALETTE : Tinting Widgets

Ripple Effect

The rippe effect color is inherited fom the colorAccent
How ever if you want to set your own custom color then use the colorConterolHighlight attribute.
The riiple effect can be seen on buttons ,checkboxes and radiobuttons.

e.g chekbox abd radio button
selected                             Not selected
colorControlActivated                colorControlNormal         --> If this colors are not defined then the colorAccent is used.

  
  
  
