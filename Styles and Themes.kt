  **************************** Style *****************************

A style is a collection of attributes that specify the appearance/look for a view / window or UI.
A style can specify ttributes such as color,font soze and background color.
A style resource defines the format and look for a UI. A style can be applied to an individual View (from within a layout file) or to an entire Activity or application (from within the manifest file).



   <style name="CustomFontStyle">
      <item name="android:layout_width">fill_parent</item>
      <item name="android:layout_height">wrap_content</item>
      <item name="android:capitalize">characters</item>
      <item name="android:typeface">monospace</item>
      <item name="android:textSize">12pt</item>
      <item name="android:textColor">#00FF00</item>/> 
   </style>
   
   
   CREATING A STYLE
   
   A style is file created in the  res/values/ directory of your project .. The name of the XML file can be custom, but it must use the .xml extension.
   This style file will be enclosed in a <resources>  root tag that will enclose it.
   You can define multiple styles per file using <style> tag but each style will have its name that uniquely identifies the style.
   Android style attributes are set using <item> tag as shown below −
   The item tag takes in the name of the android view attribute that you wish to modify in the opening tag,.Then takes the value for the named android attribute between the openning and clossing tag as seen below
   
   <?xml version="1.0" encoding="utf-8"?>
<resources>
   <style name="CustomFontStyle">
      <item name="android:layout_width">fill_parent</item>
      <item name="android:layout_height">wrap_content</item>
      <item name="android:capitalize">characters</item>
      <item name="android:typeface">monospace</item>
      <item name="android:textSize">12pt</item>
      <item name="android:textColor">#00FF00</item>/> 
   </style>
</resources>

USING A STYLE ON A VIEW

To use the syle you have created on any view e.g button,You need to use the attribute  STYLE and then give the name of the custom style that you defined
Like here below.

   <TextView
      android:id="@+id/text_id"
                    ___________________ > This is the name of the custom style we made.
      style="@style/CustomFontStyle"
      
      android:text="@string/hello_world" />
      
     
     
     STYLE INHERITANCE
Android supports style Inheritance in very much similar way as cascading style sheet in web design.
You can use this to inherit properties from an existing style and then define only the properties that you want to change or add.
      
      
      
      
      
      
      
      
      
      
      
      
  **************************** THEME *****************************
      
  A theme is nothing but an Android style applied to an entire Activity or application OR View hierarchy, rather than an individual View.
  
  Themes can also apply styles to non-view elemnts such as the status bar and the window background
  Thus, when a style is applied as a theme, every View in the Activity or application will apply each style property that it supports.
  
  
  ----> SET THEME FOR ALL ACTIVITIES IN YOUR APP
  
  To set a theme for all the activities of your application, open the AndroidManifest.xml file 
  and edit the <application> tag to include the android:theme attribute with the style name.
  For example −
     <application android:theme="@style/CustomFontStyle">
     
     
  ----> SET THEME FOR JUST ONE ACTIVITY IN YOUR APP
       
  But if you want a theme applied to just one Activity in your application,
  then add the android:theme attribute to the <activity> tag only.
  For example −
      <activity android:theme="@style/CustomFontStyle">
      
      
      
  ----> INHERIT THEMES
  
   The Android platform provides a large collection of styles and themes that you can use in your applications. 
   You can find a reference of all available styles in the R.style class. 
   
   There are number of default themes defined by Android 
   which you can use directly or inherit them using parent attribute as follows −
   
        <style name="CustomTheme" parent="android:Theme.Light">
          ...
        </style>
        
        
      
      DEFAULT STYLES AND THEMES
The Android platform provides a large collection of styles and themes that you can use in your applications.
You can find a reference of all available styles in the R.style class. 
To use the styles listed here, replace all underscores in the style name with a period.
For example, you can apply the Theme_NoTitleBar theme with "@android:style/Theme.NoTitleBar". 
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      


























