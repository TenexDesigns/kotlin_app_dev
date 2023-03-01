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


****************************** SECONDARY COLOR ***************************
  
Secondary color

A secondary color provides more ways to accent and distinguish your product.
Having a secondary color is optional, and should be applied sparingly to accent select parts of your UI.

If you don’t have a secondary color, your primary color can also be used to accent elements.

Secondary colors are best for:

Floating action buttons
Selection controls, like sliders and switches
Highlighting selected text
Progress bars
Links and headlines

 ************ACCESSIBLE COLORS ********

To ensure an accessible background behind light or dark text, your background can use light or dark variants
of your primary and secondary colors.

Alternatively, these colors can be used for typography that appears in front of light and dark backgrounds.
Just like the primary color, your secondary color can have dark and light variants.
A color theme can use your primary color, secondary color, and dark and light variants of each color.


****************************** SURFACE , BACKGROUND AND ERROR COLORS ***************************

Surface, background, and error colors typically don’t represent brand:

SURFACE COLORS - affect surfaces of components, such as cards, sheets, and menus.
THE BACKGROUND COLOR - appears behind scrollable content.
ERROR COLOR - indicates errors in components, such as invalid text in a text field. 
Check the surface_background_errors image for a more visual refernce in this pepisitory.




****************************** TYPOGRAPHY AND ICONOGRAPHY COLORS ***************************
  These are the "ON COLORS" e.g -->  onPrimary, onSecondary, onError, onSurface, onBackground

This category of colors is called “on” colors, referring to the fact that they color elements that appear “on” top of surfaces 
that use the following colors: a primary color, secondary color, surface color, background color, or error color.

When a color appears “on” top of a primary color, it’s called an “on primary color.” 
They are labelled using the original color category (such as primary color) with the prefix “on.”
“On” colors are primarily applied to text, iconography, and strokes.
The default values for “on” colors are #FFFFFF and #000000. but you can change this and apply your own custom colors.

Check an image example of the ON Colors on the image on this repisotiry called  -->ON_COLORS

PRINCIPLES FOR COLORS---->
  
HIERARCHICAL
Color indicates which elements are interactive,
how they relate to other elements, and their
level of prominence. 
Important elements should stand out the most.


LEGIBLE
Text and important elements, like icons,
should meet legibility standards when appearing
on colored backgrounds.

Expressive
Show brand colors at memorable 
moments that reinforce your brand’s style.


  





  




  
  
  
  COLOR PALETTE : Tinting Widgets

************ BUTTON COLORS ***********
  
The color of the button is controlled by the attribute colorButtonNormal. Use this to set your desired color e.g
in the theme styles folder

   <style>
  
    <item name="colorButtonNormal"> #000000<item/>
  
  
  <style/>
  
  This makes the color of all buttons to be black.

*************** SELECTED RADIO BUTTON/CHECKBOX/ RATTING START *************

The color of the selected item can be controlled using the  colorControlActivitated attribute
in the theme styles folder

   <style>
  
    <item name="colorButtonNormal"> #000000<item/>
  
  
  <style/>
  This make the color of the checkbox to be balck when selected.



Ripple Effect

The rippe effect color is inherited fom the colorAccent
How ever if you want to set your own custom color then use the colorConterolHighlight attribute.
The riiple effect can be seen on buttons ,checkboxes and radiobuttons.

e.g chekbox abd radio button
selected                             Not selected
colorControlActivated                colorControlNormal         --> If this colors are not defined then the colorAccent is used.

  
  
  
