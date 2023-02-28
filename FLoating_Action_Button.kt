        <androidx.coordinatorlayout.widget.CoordinatorLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent">

            <com.google.android.material.floatingactionbutton.FloatingActionButton
                android:id="@+id/floating_action_button"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="bottom|right"
                android:layout_margin="16dp"
                android:contentDescription="nice"
                app:srcCompat="@drawable/play"/>

        </androidx.coordinatorlayout.widget.CoordinatorLayout>
  
  
  
  
  
Feature                           Atribute
  
  
Color                           	app:backgroundTint
Stroke	                          app:borderWidth
Stroke                          	app:borderWidth
Shape                     	      shapeAppearance  , shapeAppearanceOverlay
Elevation	                        app:elevation
Hovered/Focused elevation 	      app:hoveredFocusedTranslationZ
Ripple	app:rippleColor
Motion                          	app:showMotionSpec , app:hideMotionSpec
Icon	                            app:srcCompat
Color	                            app:tint




EXTENDED FABS

The extended FAB is wider, and it includes a text label.

Note: ExtendedFloatingActionButton is a child class of MaterialButton, rather than FloatingActionButton.
This means that several attributes which are applicable to FloatingActionButton have different naming in ExtendedFloatingActionButton. 
For example, FloatingActionButton uses app:srcCompat to set the icon drawable, whereas ExtendedFloatingActionButton uses app:icon.
See the attributes tables below for more details.


An extended FAB has a text label, a transparent container and an optional icon.

Container
Icon (Optional)
Text label


Feature                                        Attribute

Color	                                         app:backgroundTint
Stroke color                                   app:strokeColor
Stroke width	                                 app:strokeWidth
Size	                                         app:collapsedSize
Shape	                                         app:shapeAppearance,app:shapeAppearanceOverlay
Elevation                                      app:elevation
Hovered/Focused elevation              	       app:hoveredFocusedTranslationZ
Pressed elevation                              app:pressedTranslationZ
Ripple	                                       app:rippleColor
Motion	                                       app:showMotionSpec,app:hideMotionSpec,extendMotionSpec,shrinkMotionSpec
Icon	                                         app:icon
Color	                                         app:iconTint
Size	                                         app:iconSize
Padding between icon and text	                 app:iconPadding
Text label                                     android:text
Color	                                         android:textColor
Typography	                                   android:textAppearance














































         
