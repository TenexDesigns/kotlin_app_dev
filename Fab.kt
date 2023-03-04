FLOATING ACTION BUTTON

Buttons: floating action button

A floating action button (FAB) represents the primary action of a screen.
A FAB performs the primary, or most common, action on a screen. It appears in front of all screen content,
typically as a circular shape with an icon in its center.

Note: If the FloatingActionButton is a child of a CoordinatorLayout, you get certain behaviors for free.
It will automatically shift so that any displayed Snackbars do not cover it,
and will automatially hide when covered by an AppBarLayout or BottomSheetBehavior.



VISIBILITY

Use the show and hide methods to animate the visibility of a FloatingActionButton or an ExtendedFloatingActionButton. 
The show animation grows the widget and fades it in, while the hide animation shrinks the widget and fades it out.

// To show:
fab.show()
// To hide:
fab.hide()


EXTENDING AND SHRINKING

Use the extend and shrink methods to animate showing and hiding the text of an ExtendedFloatingActionButton.
The shrink animation shrinks the FAB to show just the icon.The extend animation extends the FAB to show the text and the icon.

// To extend:
extendedFab.extend()
// To shrink:
extendedFab.shrink()



SIZING FABs


The FloatingActionButton can be sized either by using the FAB sizing modes or a custom size.

There are three app:fabSize modes:

normal - the normal sized button, 56dp.
mini - the mini sized button, 40dp.
auto (default) - the button size will change based on the window size.
For small sized windows (largest screen dimension < 470dp) this will select a mini sized button, 
and for larger sized windows it will select a normal sized button.

Or, you can set a custom size via the app:fabCustomSize attribute.
If set, app:fabSize will be ignored, unless the custom size is cleared via the clearCustomSize method.




TYPES OF FABS

1. Regular FABs,
2. Mini FABs,
3. Extended FABs



REGULAR FAB
Regular FABs are FABs that are not expanded and are a regular size.

<androidx.coordinatorlayout.widget.CoordinatorLayout
    ...
    android:layout_width="match_parent"
    android:layout_height="match_parent">

 // <!-- Main content -->

  <com.google.android.material.floatingactionbutton.FloatingActionButton
      android:id="@+id/floating_action_button"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:layout_gravity="bottom|right" // This is the position of the fab
      android:layout_margin="16dp"  // This is the recommened margin 
      android:contentDescription="@string/fab_content_desc"
      app:srcCompat="@drawable/ic_plus_24"/>  // This is where we set the icon

</androidx.coordinatorlayout.widget.CoordinatorLayout>
  
  
  
  


MINI FABs

A mini FAB should be used on smaller screens.

Mini FABs can also be used to create visual continuity with other screen elements.


<androidx.coordinatorlayout.widget.CoordinatorLayout
    ...
    >

  <!-- Main content -->

  <com.google.android.material.floatingactionbutton.FloatingActionButton
      ...
      app:fabSize="mini"/>

</androidx.coordinatorlayout.widget.CoordinatorLayout>
  
  
  REGULAR AND MINI FAB ATTRIBUTES



Container attributes

Element                     	Attribute
Color	                        app:backgroundTint
Stroke                   	    app:borderWidth
Size	                        app:fabSize OR app:fabCustomSize
Shape	                        shapeAppearance  OR  shapeAppearanceOverlay
Elevation	                    app:elevation
Hovered/Focused elevation	    app:hoveredFocusedTranslationZ
Pressed elevation	            app:pressedTranslationZ
Ripple	                      app:rippleColor
Motion	                      app:showMotionSpec OR app:hideMotionSpec

icon attributes

Icon	                        app:srcCompat
Color	                        app:tint



EXTENDED FABs

The extended FAB is wider, and it includes a text label.
Note: ExtendedFloatingActionButton is a child class of MaterialButton, rather than FloatingActionButton.
This means that several attributes which are applicable to FloatingActionButton have different naming in ExtendedFloatingActionButton.
For example, FloatingActionButton uses app:srcCompat to set the icon drawable, whereas ExtendedFloatingActionButton uses app:icon.


The extended FAB has
An extended FAB has a text label, a transparent container and an optional icon.

Container
Icon (Optional)
Text label



IN LAYOUT


<androidx.coordinatorlayout.widget.CoordinatorLayout
    ...
    >

  //<!-- Main content -->

  <com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
    android:id="@+id/extended_fab"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_margin="16dp"
    android:layout_gravity="bottom|right"
    android:contentDescription="@string/extended_fab_content_desc"
    android:text="@string/extended_fab_label"
    app:icon="@drawable/ic_plus_24px"/>

</androidx.coordinatorlayout.widget.CoordinatorLayout>
  
  
  
  
  EXTENTED FLOATING BUTTON ATTRIBUTES
  
Container attributes

Element	                                      Attribute
Color	                                        app:backgroundTint
Stroke color	                                app:strokeColor
Stroke width	                                app:strokeWidth
Size	                                        app:collapsedSize
Shape	                                        app:shapeAppearance OR  app:shapeAppearanceOverlay
Elevation	                                    app:elevation
Hovered/Focused elevation	                    app:hoveredFocusedTranslationZ
Pressed elevation	                            app:pressedTranslationZ
Ripple	                                      app:rippleColor
Motion	                                      app:showMotionSpec app:hideMotionSpec extendMotionSpec shrinkMotionSpec

ICON ATTRIBUTES

Element                                     	Attribute
Icon	                                        app:icon
Color	                                        app:iconTint
Size	                                        app:iconSize
Padding between icon and text               	app:iconPadding


Text Label


Element                                     	Attribute

Text label                                  	android:text
Color	                                        android:textColor
Typography	                                  android:textAppearance



THEMEING FABS
These are the attributes you can change to ghange the appearance of the fab.

<style name="Theme.App" parent="Theme.MaterialComponents.*">
    ...
    <item name="colorSecondary">@color/shrine_pink_100</item>
    <item name="colorOnSecondary">@color/shrine_pink_900</item>
    <item name="colorOnSurface">@color/shrine_pink_900</item>
    <item name="shapeAppearanceSmallComponent">@style/ShapeAppearance.App.SmallComponent</item>
</style>

<style name="ShapeAppearance.App.SmallComponent" parent="ShapeAppearance.MaterialComponents.SmallComponent">
    <item name="cornerFamily">cut</item>
    <item name="cornerSize">4dp</item>
</style>

























































































