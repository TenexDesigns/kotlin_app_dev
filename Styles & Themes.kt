STYLE
A style i a collection of properties that specify the look and the format of a view or window.
You can style a specific view or widget. While a theme is applied to the whole app or activity.

THEME
A theme is a style appliend to an entire Activiy or an Apllication  ,rather than an individual view. e.g you can appley them to make background of windons same between ac


   STYLE                    THEME
                                     
    TEXT 1                  TEXT 1                    
text 2                      TEXT 2                
text 3                      TEXT 3                
text 4                      TEXT 4                
text 5                      TEXT 5                
text 6                      TEXT 6                
text 7                      TEXT 7                
text 8                      TEXT 8                





NOW LISTEN .---> DEFAULT THEMES MADE BY ANDROID DESIGNERS AND THEMS/ STYLES WE MAKE OUR SELVES ,CAN BE INHERITED AND CHANHED A LITTLE BASED ON OUR NEEDS

E.g Here we made a style that displays a black button with white text.
    <style name="button1">
        <item name="android:background">@color/black</item>
        <item name="android:gravity">center</item>
        <item name="android:textSize">24sp</item>
        <item name="android:textColor">@color/white</item>

    </style>
         
         
         
         
How ever if we want to display a button with the same attributes but with red text.Instead of making the same style again and changing only one aspect of it
We can inherit the above style and only change what we want to customize.
To inherit the style we give our new style the same name as the old style and only andd a period and a name  e.g inheritedStyle.CustomName
Then we can change the aspect of the inherited style that we want ot chanh=ge.


        <style name= "button1.RedColor">
            <item name="android:textColor">Red<item/>
         <style/>
         
         
         
 The same above holds true for even the android default themes. These themses can be inherited and the customised
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
