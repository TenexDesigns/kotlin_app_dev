Material Desigh=n Enabled us to create differnt types of buttons

Types of buttons
1. Text button, 
2. Outlined button, 
3. Contained button,
4. Toggle button


 1 -> TEXT BUTTTON
Text buttons have a transparent background showing only the text.
A text button has a text label, a transparent container and an optional icon.
Text buttons are typically used for less-pronounced actions, including those located in dialogs and cards.
In cards, text buttons help maintain an emphasis on card content.
This button has a ripple effect and it takes the color for the riplle effect fro the colorAccent in the theme

An Example of a text Buttton

<Button
    android:id="@+id/textButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Text button"
    style="@style/Widget.MaterialComponents.Button.TextButton"
/>
  
  ---->  ADDING AN ICON TO A TEXT BUTTON
<Button
    ...
    app:icon="@drawable/ic_add_24dp"
    style="@style/Widget.MaterialComponents.Button.TextButton.Icon"
/>
  
  
  
  

2 --> OUTLINED BUTTON

This button has a stroke to it .

<Button
    android:id="@+id/outlinedButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Outlined button"
    style="?attr/materialButtonOutlinedStyle"
/>
  
  ADDING ICON TO OUTLINE BUTTTON

<Button
    ...
    app:icon="@drawable/ic_add_24dp"
    style="@style/Widget.MaterialComponents.Button.OutlinedButton.Icon"
/>
  
  
  
  CONTAINED BUTTON
The contained button is the default button style on android. but its style is --> @style/Widget.MaterialComponents.Button

<Button
    android:id="@+id/containedButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Contained button"
    style = @style/Widget.MaterialComponents.Button
/>
  
  Add an icon to the button
<Button
    ...
    app:icon="@drawable/ic_add_24dp"
    style="@style/Widget.MaterialComponents.Button.Icon"
/>

  
  
  
  
    
  
  Element	Attribute	               Related method(s)	
  
  Text atrributes
Text label	                       android:text	setText
Color                              android:textColor	setTextColor
Typography	                       android:textAppearance

Container attributes

Color	                             app:backgroundTint
Stroke color	                     app:strokeColor
Stroke width	                     app:strokeWidth
Shape                              app:shapeAppearance
Ripple color	                     app:rippleColor
Elevation	                         app:elevation

Icon Attributes

Icon	                             app:icon
Color                              app:iconTint
Size	                             app:iconSize
Gravity                            app:iconGravity
(position relative to text label)	
Padding                            app:iconPadding
(space between icon and text label)



TOGGLE BUTTON

Toggle buttons can be used to select from a group of choices.

There are two types of toggle buttons:

Toggle button
Icon

This tooglle group has three buttons with the outline style

<com.google.android.material.button.MaterialButtonToggleGroup
    android:id="@+id/toggleButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">
    <Button
        android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button 1"
        style="?attr/materialButtonOutlinedStyle"
    />
    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button 2"
        style="?attr/materialButtonOutlinedStyle"
    />
    <Button
        android:id="@+id/button3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button 3"
        style="?attr/materialButtonOutlinedStyle"
    />
</com.google.android.material.button.MaterialButtonToggleGroup>
  
  To respond to any of the above button selection
in code
toggleButton.addOnButtonCheckedListener { toggleButton, checkedId, isChecked ->
    // Respond to button selection
}


ICON tOGGLE BUTTON

In a resource folder
In res/values/styles.xml:


<style name="Widget.App.Button.OutlinedButton.IconOnly" parent="Widget.MaterialComponents.Button.OutlinedButton">
    <item name="iconPadding">0dp</item>
    <item name="android:insetTop">0dp</item>
    <item name="android:insetBottom">0dp</item>
    <item name="android:paddingLeft">12dp</item>
    <item name="android:paddingRight">12dp</item>
    <item name="android:minWidth">48dp</item>
    <item name="android:minHeight">48dp</item>
</style>


<style name="Widget.App.Button.OutlinedButton.IconOnly" parent="Widget.MaterialComponents.Button.OutlinedButton">
    <item name="iconPadding">0dp</item>
    <item name="android:insetTop">0dp</item>
    <item name="android:insetBottom">0dp</item>
    <item name="android:paddingLeft">12dp</item>
    <item name="android:paddingRight">12dp</item>
    <item name="android:minWidth">48dp</item>
    <item name="android:minHeight">48dp</item>
</style>
  
  
  
  In the activity_main.xml layout file
<com.google.android.material.button.MaterialButtonToggleGroup
    ...>
    <Button
        ...
        app:icon="@drawable/ic_favorite_24dp"
        style="@style/Widget.App.Button.OutlinedButton.IconOnly"
    />
    <Button
        ...
        app:icon="@drawable/ic_remove_red_eye_24dp"
        style="@style/Widget.App.Button.OutlinedButton.IconOnly"
    />
    <Button
        ...
        app:icon="@drawable/ic_notifications_24dp"
        style="@style/Widget.App.Button.OutlinedButton.IconOnly"
    />
</com.google.android.material.button.MaterialButtonToggleGroup>
  
  A toggle button has a shared stroked container, icons and/or text labels.


TOGGLE BUTTON SELECTION ATTRIBUTES

ELEMENT                          ATTRIBUTE


Single selection                 	app:singleSelection
Selection required	              app:selectionRequired


Theme butttons

<style name="Theme.App" parent="Theme.MaterialComponents.*">
    ...
    <item name="colorPrimary">@color/shrine_pink_100</item>
    <item name="colorOnPrimary">@color/shrine_pink_900</item>
    <item name="textAppearanceButton">@style/TextAppearance.App.Button</item>
    <item name="shapeAppearanceSmallComponent">@style/ShapeAppearance.App.SmallComponent</item>
</style>

<style name="TextAppearance.App.Button" parent="TextAppearance.MaterialComponents.Button">
    <item name="fontFamily">@font/rubik</item>
    <item name="android:fontFamily">@font/rubik</item>
</style>

<style name="ShapeAppearance.App.SmallComponent" parent="ShapeAppearance.MaterialComponents.SmallComponent">
    <item name="cornerFamily">cut</item>
    <item name="cornerSize">4dp</item>
</style>


  
  



  
  





