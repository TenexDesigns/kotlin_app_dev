If a new version of Android adds theme attributes that you want to use, you can add them to your theme while still being compatible with old versions.
All you need is another styles.xml file saved in a values directory that includes the resource version qualifier. For example:


res/values/styles.xml        # themes for all versions
res/values-v21/styles.xml    # themes for API level 21+ only
Because the styles in the values/styles.xml file are available for all versions, your themes in values-v21/styles.
xml can inherit them. As such, you can avoid duplicating styles by beginning with a "base" theme and then extending it in your version-specific styles.

For example, to declare window transitions for Android 5.0 (API level 21) and higher, you need to use some new attributes. 
So your base theme in res/values/styles.xml could look like this:


<resources>
    <!-- base set of styles that apply to all versions -->
    <style name="BaseAppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <item name="colorPrimary">@color/primaryColor</item>
        <item name="colorPrimaryDark">@color/primaryTextColor</item>
        <item name="colorAccent">@color/secondaryColor</item>
    </style>

    <!-- declare the theme name thats actually applied in the manifest file -->
    <style name="AppTheme" parent="BaseAppTheme" />
</resources>
Then add the version-specific styles in res/values-v21/styles.xml as follows:


<resources>
    <!-- extend the base theme to add styles available only with API level 21+ -->
    <style name="AppTheme" parent="BaseAppTheme">
        <item name="android:windowActivityTransitions">true</item>
        <item name="android:windowEnterTransition">@android:transition/slide_right</item>
        <item name="android:windowExitTransition">@android:transition/slide_left</item>
    </style>
</resources>
  
  Now you can apply AppTheme in your manifest file and the system selects the styles available for each system version.
