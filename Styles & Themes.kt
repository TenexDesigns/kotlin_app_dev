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
To inherit the deefault android themes ,you have to use the parent tag in the style tag and then give the name of the default theme that you want to customize
         


             <style name="MyStyle" parent="Theme.MaterialComponents.DayNight.NoActionBar">
   
   Then you can point which as pects of this inherited parent style you want to change 
    <style name="Theme.Tenex" parent="Theme.MaterialComponents.DayNight.NoActionBar">
        <!-- Primary brand color. -->
        <item name="colorPrimary">@color/purple_200</item>
//        <!-- Secondary brand color. -->
        <item name="colorSecondary">@color/teal_200</item>
//        <!-- Status bar color. -->
        <item name="android:statusBarColor">?attr/colorPrimaryVariant</item>
   
       </style>
   
   
   
   Also ther is a reason for using and extending the default theemes using the parent attribute. This is so as to ensure backward compatibility
When creating your own customised styles, you should always extend an existing style from the framework or support library so that you maintain compatibility with platform UI styles. 
To extend a style, specify the style you want to extend with the parent attribute. 
You can then override the inherited style attributes and add new ones.








e.g for theme

<style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
    <!-- Customize your theme here. -->
    <item name="colorPrimary">@color/colorPrimary</item>
    <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
    <item name="colorAccent">@color/colorAccent</item>
</style>
   
   
   
   The use of the colors defined in the theme.
   
   
   <?xml version="1.0" encoding="utf-8"?>
<resources>
    <!--   color for the app bar and other primary UI elements -->
    <color name="colorPrimary">#3F51B5</color>

    <!--   a darker variant of the primary color, used for
           the status bar (on Android 5.0+) and contextual app bars -->
    <color name="colorPrimaryDark">#303F9F</color>

    <!--   a secondary color for controls like checkboxes and text fields -->
    <color name="colorAccent">#FF4081</color>
</resources>
   
   
   
   Heres a list of themes you can extent and overide

<?xml version="1.0" encoding="utf-8"?>
<!-- Copyright (C) 2012 The Android Open Source Project
     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at
          http://www.apache.org/licenses/LICENSE-2.0
     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.
-->
<resources>
    <!-- Themes in the "Theme.AppCompat" family will contain an action bar by default.
         If Holo themes are available on the current platform version they will be used.
         A limited Holo-styled action bar will be provided on platform versions older
         than 3.0. (API 11)
         These theme declarations contain any version-independent specification. Items
         that need to vary based on platform version should be defined in the corresponding
         "Theme.Base" theme. -->
    <!-- Platform-independent theme providing an action bar in a dark-themed activity. -->
    <style name="Theme.AppCompat" parent="Base.Theme.AppCompat" />
    <!-- Platform-independent theme providing an action bar in a light-themed activity. -->
    <style name="Theme.AppCompat.Light" parent="Base.Theme.AppCompat.Light" />
    <!-- Platform-independent theme providing an action bar in a dark-themed activity. -->
    <style name="Theme.AppCompat.Light.DarkActionBar" parent="Base.Theme.AppCompat.Light.DarkActionBar" />
    <style name="Theme.AppCompat.NoActionBar">
        <item name="windowActionBar">false</item>
        <item name="windowNoTitle">true</item>
    </style>
    <style name="Theme.AppCompat.Light.NoActionBar">
        <item name="windowActionBar">false</item>
        <item name="windowNoTitle">true</item>
    </style>
    <style name="Theme.AppCompat.DialogWhenLarge"
           parent="Base.Theme.AppCompat.DialogWhenLarge">
    </style>
    <style name="Theme.AppCompat.Light.DialogWhenLarge"
           parent="Base.Theme.AppCompat.Light.DialogWhenLarge">
    </style>
    <style name="Theme.AppCompat.Dialog" parent="Base.Theme.AppCompat.Dialog" />
    <style name="Theme.AppCompat.Light.Dialog" parent="Base.Theme.AppCompat.Light.Dialog" />
    <!-- Material theme for alert dialog windows, which is used by the AlertDialog class.
         This is basically a dialog but sets the background to empty so it can do
         two-tone backgrounds. For applications targeting Honeycomb or newer, this is the default
         AlertDialog theme. -->
    <style name="Theme.AppCompat.Dialog.Alert" parent="Base.Theme.AppCompat.Dialog.Alert" />
    <style name="Theme.AppCompat.Light.Dialog.Alert" parent="Base.Theme.AppCompat.Light.Dialog.Alert" />
    <!-- Variant of Theme.AppCompat.Dialog that has a nice minimum width for
         a regular dialog. -->
    <style name="Theme.AppCompat.Dialog.MinWidth" parent="Base.Theme.AppCompat.Dialog.MinWidth" />
    <style name="Theme.AppCompat.Light.Dialog.MinWidth" parent="Base.Theme.AppCompat.Light.Dialog.MinWidth" />
    <!-- Menu/item attributes -->
    <style name="Theme.AppCompat.CompactMenu" parent="Base.Theme.AppCompat.CompactMenu" />
    <style name="ThemeOverlay.AppCompat" parent="Base.ThemeOverlay.AppCompat" />
    <!-- Theme overlay that replaces colors with their light versions but preserves
         the value of colorAccent, colorPrimary and its variants. -->
    <style name="ThemeOverlay.AppCompat.Light" parent="Base.ThemeOverlay.AppCompat.Light" />
    <!-- Theme overlay that replaces colors with their dark versions but preserves
         the value of colorAccent, colorPrimary and its variants. -->
    <style name="ThemeOverlay.AppCompat.Dark" parent="Base.ThemeOverlay.AppCompat.Dark" />
    <!-- Theme overlay that replaces the normal control color, which by default is the same as the
         secondary text color, with the primary text color. -->
    <style name="ThemeOverlay.AppCompat.ActionBar" parent="Base.ThemeOverlay.AppCompat.ActionBar" />
    <!-- Theme overlay that replaces colors with their dark versions and replaces the normal
         control color, which by default is the same as the secondary text color, with the primary
         text color. -->
    <style name="ThemeOverlay.AppCompat.Dark.ActionBar" parent="Base.ThemeOverlay.AppCompat.Dark.ActionBar" />
</resources>
   
   
   The Android Support Library also provides other attributes you can use to customize your theme extended from Theme.
AppCompat (such as the colorPrimary attribute shown above). These are
   
   
   Heres a list of things you cn customise in your theme



<?xml version="1.0" encoding="utf-8"?>
<!-- Copyright (C) 2012 The Android Open Source Project
     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at
          http://www.apache.org/licenses/LICENSE-2.0
     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.
-->
<resources>
    <!-- Many app-specific attributes are declared in this file.
         Unless otherwise specified, they are intended to be set within
         the context of a theme declaration.
         Each cluster of attributes below states whether it is meant to
         be set by the app and read by the system, or set by the system and
         read by the app. -->
    <eat-comment/>
    <attr name="title" format="string"/>
    <attr name="height" format="dimension"/>
    <!-- Specifies whether the theme is light, otherwise it is dark. -->
    <attr name="isLightTheme" format="boolean" />
    <!-- These are the standard attributes that make up a complete theme. -->
    <declare-styleable name="AppCompatTheme">
        <!-- ============= -->
        <!-- Window styles -->
        <!-- ============= -->
        <eat-comment />
        <!-- Flag indicating whether this window should have an Action Bar
             in place of the usual title bar. -->
        <attr name="windowActionBar" format="boolean" />
        <!-- Flag indicating whether there should be no title on this window. -->
        <attr name="windowNoTitle" format="boolean" />
        <!-- Flag indicating whether this windows Action Bar should overlay
             application content. Does nothing if the window would not
             have an Action Bar. -->
        <attr name="windowActionBarOverlay" format="boolean" />
        <!-- Flag indicating whether action modes should overlay window content
             when there is not reserved space for their UI (such as an Action Bar). -->
        <attr name="windowActionModeOverlay" format="boolean" />
        <!-- A fixed width for the window along the major axis of the screen,
             that is, when in landscape. Can be either an absolute dimension
             or a fraction of the screen size in that dimension. -->
        <attr name="windowFixedWidthMajor" format="dimension|fraction" />
        <!-- A fixed height for the window along the minor axis of the screen,
             that is, when in landscape. Can be either an absolute dimension
             or a fraction of the screen size in that dimension. -->
        <attr name="windowFixedHeightMinor" format="dimension|fraction" />
        <!-- A fixed width for the window along the minor axis of the screen,
             that is, when in portrait. Can be either an absolute dimension
             or a fraction of the screen size in that dimension. -->
        <attr name="windowFixedWidthMinor" format="dimension|fraction" />
        <!-- A fixed height for the window along the major axis of the screen,
             that is, when in portrait. Can be either an absolute dimension
             or a fraction of the screen size in that dimension. -->
        <attr name="windowFixedHeightMajor" format="dimension|fraction" />
        <!-- The minimum width the window is allowed to be, along the major
             axis of the screen.  That is, when in landscape.  Can be either
             an absolute dimension or a fraction of the screen size in that
             dimension. -->
        <attr name="windowMinWidthMajor" format="dimension|fraction" />
        <!-- The minimum width the window is allowed to be, along the minor
             axis of the screen.  That is, when in portrait.  Can be either
             an absolute dimension or a fraction of the screen size in that
             dimension. -->
        <attr name="windowMinWidthMinor" format="dimension|fraction" />
        <attr name="android:windowIsFloating" />
        <attr name="android:windowAnimationStyle" />
        <!-- =================== -->
        <!-- Action bar styles   -->
        <!-- =================== -->
        <eat-comment />
        <!-- Default style for tabs within an action bar -->
        <attr name="actionBarTabStyle" format="reference" />
        <attr name="actionBarTabBarStyle" format="reference" />
        <attr name="actionBarTabTextStyle" format="reference" />
        <attr name="actionOverflowButtonStyle" format="reference" />
        <attr name="actionOverflowMenuStyle" format="reference" />
        <!-- Reference to a theme that should be used to inflate popups
             shown by widgets in the action bar. -->
        <attr name="actionBarPopupTheme" format="reference" />
        <!-- Reference to a style for the Action Bar -->
        <attr name="actionBarStyle" format="reference" />
        <!-- Reference to a style for the split Action Bar. This style
             controls the split component that holds the menu/action
             buttons. actionBarStyle is still used for the primary
             bar. -->
        <attr name="actionBarSplitStyle" format="reference" />
        <!-- Reference to a theme that should be used to inflate the
             action bar. This will be inherited by any widget inflated
             into the action bar. -->
        <attr name="actionBarTheme" format="reference" />
        <!-- Reference to a theme that should be used to inflate widgets
             and layouts destined for the action bar. Most of the time
             this will be a reference to the current theme, but when
             the action bar has a significantly different contrast
             profile than the rest of the activity the difference
             can become important. If this is set to @null the current
             theme will be used.-->
        <attr name="actionBarWidgetTheme" format="reference" />
        <!-- Size of the Action Bar, including the contextual
             bar used to present Action Modes. -->
        <attr name="actionBarSize" format="dimension" >
            <enum name="wrap_content" value="0" />
        </attr>
        <!-- Custom divider drawable to use for elements in the action bar. -->
        <attr name="actionBarDivider" format="reference" />
        <!-- Custom item state list drawable background for action bar items. -->
        <attr name="actionBarItemBackground" format="reference" />
        <!-- TextAppearance style that will be applied to text that
             appears within action menu items. -->
        <attr name="actionMenuTextAppearance" format="reference" />
        <!-- Color for text that appears within action menu items. -->
        <!-- Color for text that appears within action menu items. -->
        <attr name="actionMenuTextColor" format="color|reference"/>
        <!-- =================== -->
        <!-- Action mode styles  -->
        <!-- =================== -->
        <eat-comment/>
        <attr name="actionModeStyle" format="reference"/>
        <attr name="actionModeCloseButtonStyle" format="reference"/>
        <!-- Background drawable to use for action mode UI -->
        <attr name="actionModeBackground" format="reference"/>
        <!-- Background drawable to use for action mode UI in the lower split bar -->
        <attr name="actionModeSplitBackground" format="reference"/>
        <!-- Drawable to use for the close action mode button -->
        <attr name="actionModeCloseDrawable" format="reference"/>
        <!-- Drawable to use for the Cut action button in Contextual Action Bar -->
        <attr name="actionModeCutDrawable" format="reference"/>
        <!-- Drawable to use for the Copy action button in Contextual Action Bar -->
        <attr name="actionModeCopyDrawable" format="reference"/>
        <!-- Drawable to use for the Paste action button in Contextual Action Bar -->
        <attr name="actionModePasteDrawable" format="reference"/>
        <!-- Drawable to use for the Select all action button in Contextual Action Bar -->
        <attr name="actionModeSelectAllDrawable" format="reference"/>
        <!-- Drawable to use for the Share action button in WebView selection action modes -->
        <attr name="actionModeShareDrawable" format="reference"/>
        <!-- Drawable to use for the Find action button in WebView selection action modes -->
        <attr name="actionModeFindDrawable" format="reference"/>
        <!-- Drawable to use for the Web Search action button in WebView selection action modes -->
        <attr name="actionModeWebSearchDrawable" format="reference"/>
        <!-- PopupWindow style to use for action modes when showing as a window overlay. -->
        <attr name="actionModePopupWindowStyle" format="reference"/>
        <!-- =================== -->
        <!-- Text styles -->
        <!-- =================== -->
        <eat-comment />
        <!-- Text color, typeface, size, and style for the text inside of a popup menu. -->
        <attr name="textAppearanceLargePopupMenu" format="reference"/>
        <!-- Text color, typeface, size, and style for small text inside of a popup menu. -->
        <attr name="textAppearanceSmallPopupMenu" format="reference"/>
        <!-- =================== -->
        <!-- Dialog styles -->
        <!-- =================== -->
        <eat-comment />
        <!-- Theme to use for dialogs spawned from this theme. -->
        <attr name="dialogTheme" format="reference" />
        <!-- Preferred padding for dialog content. -->
        <attr name="dialogPreferredPadding" format="dimension" />
        <!-- The list divider used in alert dialogs. -->
        <attr name="listDividerAlertDialog" format="reference" />
        <!-- =================== -->
        <!-- Other widget styles -->
        <!-- =================== -->
        <eat-comment />
        <!-- Default ActionBar dropdown style. -->
        <attr name="actionDropDownStyle" format="reference"/>
        <!-- The preferred item height for dropdown lists. -->
        <attr name="dropdownListPreferredItemHeight" format="dimension"/>
        <!-- Default Spinner style. -->
        <attr name="spinnerDropDownItemStyle" format="reference" />
        <!-- Specifies a drawable to use for the home as up indicator. -->
        <attr name="homeAsUpIndicator" format="reference"/>
        <!-- Default action button style. -->
        <attr name="actionButtonStyle" format="reference"/>
        <!-- Style for button bars -->
        <attr name="buttonBarStyle" format="reference"/>
        <!-- Style for buttons within button bars -->
        <attr name="buttonBarButtonStyle" format="reference"/>
        <!-- A style that may be applied to buttons or other selectable items
             that should react to pressed and focus states, but that do not
             have a clear visual border along the edges. -->
        <attr name="selectableItemBackground" format="reference"/>
        <!-- Background drawable for borderless standalone items that need focus/pressed states. -->
        <attr name="selectableItemBackgroundBorderless" format="reference" />
        <!-- Style for buttons without an explicit border, often used in groups. -->
        <attr name="borderlessButtonStyle" format="reference" />
        <!-- A drawable that may be used as a vertical divider between visual elements. -->
        <attr name="dividerVertical" format="reference"/>
        <!-- A drawable that may be used as a horizontal divider between visual elements. -->
        <attr name="dividerHorizontal" format="reference"/>
        <!-- Default ActivityChooserView style. -->
        <attr name="activityChooserViewStyle" format="reference" />
        <!-- Default Toolbar style. -->
        <attr name="toolbarStyle" format="reference" />
        <!-- Default Toolar NavigationButtonStyle -->
        <attr name="toolbarNavigationButtonStyle" format="reference" />
        <!-- Default PopupMenu style. -->
        <attr name="popupMenuStyle" format="reference"/>
        <!-- Default PopupWindow style. -->
        <attr name="popupWindowStyle" format="reference" />
        <!-- EditText text foreground color. -->
        <attr name="editTextColor" format="reference|color" />
        <!-- EditText background drawable. -->
        <attr name="editTextBackground" format="reference" />
        <!-- ImageButton background drawable. -->
        <attr name="imageButtonStyle" format="reference" />
        <!-- ============================ -->
        <!-- SearchView styles and assets -->
        <!-- ============================ -->
        <eat-comment />
        <!-- Text color, typeface, size, and style for system search result title. Defaults to primary inverse text color. -->
        <attr name="textAppearanceSearchResultTitle" format="reference" />
        <!-- Text color, typeface, size, and style for system search result subtitle. Defaults to primary inverse text color. -->
        <attr name="textAppearanceSearchResultSubtitle" format="reference" />
        <!-- Text color for urls in search suggestions, used by things like global search -->
        <attr name="textColorSearchUrl" format="reference|color" />
        <!-- Style for the search query widget. -->
        <attr name="searchViewStyle" format="reference" />
        <!-- =========== -->
        <!-- List styles -->
        <!-- =========== -->
        <eat-comment />
        <!-- The preferred list item height. -->
        <attr name="listPreferredItemHeight" format="dimension"/>
        <!-- A smaller, sleeker list item height. -->
        <attr name="listPreferredItemHeightSmall" format="dimension"/>
        <!-- A larger, more robust list item height. -->
        <attr name="listPreferredItemHeightLarge" format="dimension"/>
        <!-- The preferred padding along the left edge of list items. -->
        <attr name="listPreferredItemPaddingLeft" format="dimension"/>
        <!-- The preferred padding along the right edge of list items. -->
        <attr name="listPreferredItemPaddingRight" format="dimension"/>
        <!-- ListPopupWindow compatibility -->
        <attr name="dropDownListViewStyle" format="reference"/>
        <attr name="listPopupWindowStyle" format="reference"/>
        <!-- The preferred TextAppearance for the primary text of list items. -->
        <attr name="textAppearanceListItem" format="reference"/>
        <!-- The preferred TextAppearance for the primary text of small list items. -->
        <attr name="textAppearanceListItemSmall" format="reference"/>
        <!-- ============ -->
        <!-- Panel styles -->
        <!-- ============ -->
        <eat-comment />
        <!-- The background of a panel when it is inset from the left and right edges of the screen. -->
        <attr name="panelBackground" format="reference" />
        <!-- Default Panel Menu width. -->
        <attr name="panelMenuListWidth" format="dimension" />
        <!-- Default Panel Menu style. -->
        <attr name="panelMenuListTheme" format="reference" />
        <!-- Drawable used as a background for selected list items. -->
        <attr name="listChoiceBackgroundIndicator" format="reference" />
        <!-- ============= -->
        <!-- Color palette -->
        <!-- ============= -->
        <eat-comment />
        <!-- The primary branding color for the app. By default, this is the color applied to the
             action bar background. -->
        <attr name="colorPrimary" format="color" />
        <!-- Dark variant of the primary branding color. By default, this is the color applied to
             the status bar (via statusBarColor) and navigation bar (via navigationBarColor). -->
        <attr name="colorPrimaryDark" format="color" />
        <!-- Bright complement to the primary branding color. By default, this is the color applied
             to framework controls (via colorControlActivated). -->
        <attr name="colorAccent" format="color" />
        <!-- The color applied to framework controls in their normal state. -->
        <attr name="colorControlNormal" format="color" />
        <!-- The color applied to framework controls in their activated (ex. checked) state. -->
        <attr name="colorControlActivated" format="color" />
        <!-- The color applied to framework control highlights (ex. ripples, list selectors). -->
        <attr name="colorControlHighlight" format="color" />
        <!-- The color applied to framework buttons in their normal state. -->
        <attr name="colorButtonNormal" format="color" />
        <!-- The color applied to framework switch thumbs in their normal state. -->
        <attr name="colorSwitchThumbNormal" format="color" />
        <!-- The background used by framework controls. -->
        <attr name="controlBackground" format="reference" />
        <!-- ============ -->
        <!-- Alert Dialog styles -->
        <!-- ============ -->
        <eat-comment />
        <attr name="alertDialogStyle" format="reference" />
        <attr name="alertDialogButtonGroupStyle" format="reference" />
        <attr name="alertDialogCenterButtons" format="boolean" />
        <!-- Theme to use for alert dialogs spawned from this theme. -->
        <attr name="alertDialogTheme" format="reference" />
        <!-- Color of list item text in alert dialogs. -->
        <attr name="textColorAlertDialogListItem" format="reference|color" />
        <!-- Style for the "positive" buttons within button bars -->
        <attr name="buttonBarPositiveButtonStyle" format="reference" />
        <!-- Style for the "negative" buttons within button bars -->
        <attr name="buttonBarNegativeButtonStyle" format="reference" />
        <!-- Style for the "neutral" buttons within button bars -->
        <attr name="buttonBarNeutralButtonStyle" format="reference" />
        <!-- ===================== -->
        <!-- Default widget styles -->
        <!-- ===================== -->
        <eat-comment />
        <!-- Default AutoCompleteTextView style. -->
        <attr name="autoCompleteTextViewStyle" format="reference" />
        <!-- Normal Button style. -->
        <attr name="buttonStyle" format="reference" />
        <!-- Small Button style. -->
        <attr name="buttonStyleSmall" format="reference" />
        <!-- Default Checkbox style. -->
        <attr name="checkboxStyle" format="reference" />
        <!-- Default CheckedTextView style. -->
        <attr name="checkedTextViewStyle" format="reference" />
        <!-- Default EditText style. -->
        <attr name="editTextStyle" format="reference" />
        <!-- Default RadioButton style. -->
        <attr name="radioButtonStyle" format="reference" />
        <!-- Default RatingBar style. -->
        <attr name="ratingBarStyle" format="reference" />
        <!-- Indicator RatingBar style. -->
        <attr name="ratingBarStyleIndicator" format="reference" />
        <!-- Small indicator RatingBar style. -->
        <attr name="ratingBarStyleSmall" format="reference" />
        <!-- Default SeekBar style. -->
        <attr name="seekBarStyle" format="reference" />
        <!-- Default Spinner style. -->
        <attr name="spinnerStyle" format="reference" />
        <!-- Default style for the Switch widget. -->
        <attr name="switchStyle" format="reference" />
    </declare-styleable>
    <!-- ============================================ -->
    <!-- Attributes used to style the Action Bar.
         These should be set on your theme; the default actionBarStyle will
         propagate them to the correct elements as needed.
         Please Note: when overriding attributes for an ActionBar style
         you must specify each attribute twice: once with the "android:"
         namespace prefix and once without. -->
    <declare-styleable name="ActionBar">
        <!-- The type of navigation to use. -->
        <attr name="navigationMode">
            <!-- Normal static title text -->
            <enum name="normal" value="0"/>
            <!-- The action bar will use a selection list for navigation. -->
            <enum name="listMode" value="1"/>
            <!-- The action bar will use a series of horizontal tabs for navigation. -->
            <enum name="tabMode" value="2"/>
        </attr>
        <!-- Options affecting how the action bar is displayed. -->
        <attr name="displayOptions">
            <flag name="none" value="0" />
            <flag name="useLogo" value="0x1"/>
            <flag name="showHome" value="0x2"/>
            <flag name="homeAsUp" value="0x4"/>
            <flag name="showTitle" value="0x8"/>
            <flag name="showCustom" value="0x10"/>
            <flag name="disableHome" value="0x20"/>
        </attr>
        <!-- Specifies title text used for navigationMode="normal" -->
        <attr name="title"/>
        <!-- Specifies subtitle text used for navigationMode="normal" -->
        <attr name="subtitle" format="string"/>
        <!-- Specifies a style to use for title text. -->
        <attr name="titleTextStyle" format="reference"/>
        <!-- Specifies a style to use for subtitle text. -->
        <attr name="subtitleTextStyle" format="reference"/>
        <!-- Specifies the drawable used for the application icon. -->
        <attr name="icon" format="reference"/>
        <!-- Specifies the drawable used for the application logo. -->
        <attr name="logo" format="reference"/>
        <!-- Specifies the drawable used for item dividers. -->
        <attr name="divider" format="reference"/>
        <!-- Specifies a background drawable for the action bar. -->
        <attr name="background" format="reference"/>
        <!-- Specifies a background drawable for a second stacked row of the action bar. -->
        <attr name="backgroundStacked" format="reference|color"/>
        <!-- Specifies a background drawable for the bottom component of a split action bar. -->
        <attr name="backgroundSplit" format="reference|color"/>
        <!-- Specifies a layout for custom navigation. Overrides navigationMode. -->
        <attr name="customNavigationLayout" format="reference"/>
        <!-- Specifies a fixed height. -->
        <attr name="height"/>
        <!-- Specifies a layout to use for the "home" section of the action bar. -->
        <attr name="homeLayout" format="reference"/>
        <!-- Specifies a style resource to use for an embedded progress bar. -->
        <attr name="progressBarStyle" format="reference"/>
        <!-- Specifies a style resource to use for an indeterminate progress spinner. -->
        <attr name="indeterminateProgressStyle" format="reference"/>
        <!-- Specifies the horizontal padding on either end for an embedded progress bar. -->
        <attr name="progressBarPadding" format="dimension"/>
        <!-- Up navigation glyph -->
        <attr name="homeAsUpIndicator" />
        <!-- Specifies padding that should be applied to the left and right sides of
             system-provided items in the bar. -->
        <attr name="itemPadding" format="dimension"/>
        <!-- Set true to hide the action bar on a vertical nested scroll of content. -->
        <attr name="hideOnContentScroll" format="boolean"/>
        <!-- Minimum inset for content views within a bar. Navigation buttons and
             menu views are excepted. Only valid for some themes and configurations. -->
        <attr name="contentInsetStart" format="dimension"/>
        <!-- Minimum inset for content views within a bar. Navigation buttons and
             menu views are excepted. Only valid for some themes and configurations. -->
        <attr name="contentInsetEnd" format="dimension"/>
        <!-- Minimum inset for content views within a bar. Navigation buttons and
             menu views are excepted. Only valid for some themes and configurations. -->
        <attr name="contentInsetLeft" format="dimension"/>
        <!-- Minimum inset for content views within a bar. Navigation buttons and
             menu views are excepted. Only valid for some themes and configurations. -->
        <attr name="contentInsetRight" format="dimension"/>
        <!-- Elevation for the action bar itself -->
        <attr name="elevation" format="dimension" />
        <!-- Reference to a theme that should be used to inflate popups
             shown by widgets in the action bar. -->
        <attr name="popupTheme" format="reference" />
    </declare-styleable>
    <!-- Valid LayoutParams for views placed in the action bar as custom views. -->
    <declare-styleable name="ActionBarLayout">
        <attr name="android:layout_gravity"/>
    </declare-styleable>
    <declare-styleable name="ActionMenuItemView">
        <attr name="android:minWidth"/>
    </declare-styleable>
    <declare-styleable name="ActionMode">
        <!-- Specifies a style to use for title text. -->
        <attr name="titleTextStyle"/>
        <!-- Specifies a style to use for subtitle text. -->
        <attr name="subtitleTextStyle"/>
        <!-- Specifies a background for the action mode bar. -->
        <attr name="background"/>
        <!-- Specifies a background for the split action mode bar. -->
        <attr name="backgroundSplit"/>
        <!-- Specifies a fixed height for the action mode bar. -->
        <attr name="height"/>
        <!-- Specifies a layout to use for the "close" item at the starting edge. -->
        <attr name="closeItemLayout" format="reference" />
    </declare-styleable>
    <declare-styleable name="View">
        <!-- Sets the padding, in pixels, of the start edge; see {@link android.R.attr#padding}. -->
        <attr name="paddingStart" format="dimension"/>
        <!-- Sets the padding, in pixels, of the end edge; see {@link android.R.attr#padding}. -->
        <attr name="paddingEnd" format="dimension"/>
        <!-- Boolean that controls whether a view can take focus.  By default the user can not
             move focus to a view; by setting this attribute to true the view is
             allowed to take focus.  This value does not impact the behavior of
             directly calling {@link android.view.View#requestFocus}, which will
             always request focus regardless of this view.  It only impacts where
             focus navigation will try to move focus. -->
        <attr name="android:focusable" />
        <!-- Deprecated. -->
        <attr name="theme" format="reference" />
        <!-- Specifies a theme override for a view. When a theme override is set, the
             view will be inflated using a {@link android.content.Context} themed with
             the specified resource. -->
        <attr name="android:theme" />
    </declare-styleable>
    <declare-styleable name="ViewBackgroundHelper">
        <attr name="android:background" />
        <!-- Tint to apply to the background. -->
        <attr name="backgroundTint" format="color" />
        <!-- Blending mode used to apply the background tint. -->
        <attr name="backgroundTintMode">
            <!-- The tint is drawn on top of the drawable.
                 [Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc] -->
            <enum name="src_over" value="3" />
            <!-- The tint is masked by the alpha channel of the drawable. The drawable’s
                 color channels are thrown out. [Sa * Da, Sc * Da] -->
            <enum name="src_in" value="5" />
            <!-- The tint is drawn above the drawable, but with the drawable’s alpha
                 channel masking the result. [Da, Sc * Da + (1 - Sa) * Dc] -->
            <enum name="src_atop" value="9" />
            <!-- Multiplies the color and alpha channels of the drawable with those of
                 the tint. [Sa * Da, Sc * Dc] -->
            <enum name="multiply" value="14" />
            <!-- [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc] -->
            <enum name="screen" value="15" />
        </attr>
    </declare-styleable>
    <declare-styleable name="MenuView">
        <!-- Default appearance of menu item text. -->
        <attr name="android:itemTextAppearance"/>
        <!-- Default horizontal divider between rows of menu items. -->
        <attr name="android:horizontalDivider"/>
        <!-- Default vertical divider between menu items. -->
        <attr name="android:verticalDivider"/>
        <!-- Default background for the menu header. -->
        <attr name="android:headerBackground"/>
        <!-- Default background for each menu item. -->
        <attr name="android:itemBackground"/>
        <!-- Default animations for the menu. -->
        <attr name="android:windowAnimationStyle"/>
        <!-- Default disabled icon alpha for each menu item that shows an icon. -->
        <attr name="android:itemIconDisabledAlpha"/>
        <!-- Whether space should be reserved in layout when an icon is missing. -->
        <attr name="preserveIconSpacing" format="boolean" />
    </declare-styleable>
    <declare-styleable name="ActionMenuView">
        <!-- Size of padding on either end of a divider. -->
    </declare-styleable>
    <!-- Base attributes that are available to all groups. -->
    <declare-styleable name="MenuGroup">
        <!-- The ID of the group. -->
        <attr name="android:id" />
        <!-- The category applied to all items within this group.
             (This will be or ed with the orderInCategory attribute.) -->
        <attr name="android:menuCategory" />
        <!-- The order within the category applied to all items within this group.
             (This will be ored with the category attribute.) -->
        <attr name="android:orderInCategory" />
        <!-- Whether the items are capable of displaying a check mark. -->
        <attr name="android:checkableBehavior" />
        <!-- Whether the items are shown/visible. -->
        <attr name="android:visible" />
        <!-- Whether the items are enabled. -->
        <attr name="android:enabled" />
    </declare-styleable>
    <!-- Base attributes that are available to all Item objects. -->
    <declare-styleable name="MenuItem">
        <!-- The ID of the item. -->
        <attr name="android:id" />
        <!-- The category applied to the item.
             (This will be or ed with the orderInCategory attribute.) -->
        <attr name="android:menuCategory" />
        <!-- The order within the category applied to the item.
             (This will be ored with the category attribute.) -->
        <attr name="android:orderInCategory" />
        <!-- The title associated with the item. -->
        <attr name="android:title" />
        <!-- The condensed title associated with the item.  This is used in situations where the
             normal title may be too long to be displayed. -->
        <attr name="android:titleCondensed" />
        <!-- The icon associated with this item.  This icon will not always be shown, so
             the title should be sufficient in describing this item. -->
        <attr name="android:icon" />
        <!-- The alphabetic shortcut key.  This is the shortcut when using a keyboard
             with alphabetic keys. -->
        <attr name="android:alphabeticShortcut" />
        <!-- The numeric shortcut key.  This is the shortcut when using a numeric (e.g., 12-key)
             keyboard. -->
        <attr name="android:numericShortcut" />
        <!-- Whether the item is capable of displaying a check mark. -->
        <attr name="android:checkable" />
        <!-- Whether the item is checked.  Note that you must first have enabled checking with
             the checkable attribute or else the check mark will not appear. -->
        <attr name="android:checked"  />
        <!-- Whether the item is shown/visible. -->
        <attr name="android:visible" />
        <!-- Whether the item is enabled. -->
        <attr name="android:enabled" />
        <!-- Name of a method on the Context used to inflate the menu that will be
             called when the item is clicked. -->
        <attr name="android:onClick" />
        <!-- How this item should display in the Action Bar, if present. -->
        <attr name="showAsAction">
            <!-- Never show this item in an action bar, show it in the overflow menu instead.
                 Mutually exclusive with "ifRoom" and "always". -->
            <flag name="never" value="0" />
            <!-- Show this item in an action bar if there is room for it as determined
                 by the system. Favor this option over "always" where possible.
                 Mutually exclusive with "never" and "always". -->
            <flag name="ifRoom" value="1" />
            <!-- Always show this item in an actionbar, even if it would override
                 the systems limits of how much stuff to put there. This may make
                 your action bar look bad on some screens. In most cases you should
                 use "ifRoom" instead. Mutually exclusive with "ifRoom" and "never". -->
            <flag name="always" value="2" />
            <!-- When this item is shown as an action in the action bar, show a text
                 label with it even if it has an icon representation. -->
            <flag name="withText" value="4" />
            <!-- This items action view collapses to a normal menu
                 item. When expanded, the action view takes over a
                 larger segment of its container. -->
            <flag name="collapseActionView" value="8" />
        </attr>
        <!-- An optional layout to be used as an action view.
             See {@link android.view.MenuItem#setActionView(android.view.View)}
             for more info. -->
        <attr name="actionLayout" format="reference" />
        <!-- The name of an optional View class to instantiate and use as an
             action view. See {@link android.view.MenuItem#setActionView(android.view.View)}
             for more info. -->
        <attr name="actionViewClass" format="string" />
        <!-- The name of an optional ActionProvider class to instantiate an action view
             and perform operations such as default action for that menu item.
             See {@link android.view.MenuItem#setActionProvider(android.view.ActionProvider)}
             for more info. -->
        <attr name="actionProviderClass" format="string" />
    </declare-styleable>
    <declare-styleable name="Spinner">
        <!-- The prompt to display when the spinners dialog is shown. -->
        <attr name="android:prompt" />
        <!-- Theme to use for the drop-down or dialog popup window. -->
        <attr name="popupTheme" />
        <!-- Background drawable to use for the dropdown in spinnerMode="dropdown". -->
        <attr name="android:popupBackground" />
        <!-- Width of the dropdown in spinnerMode="dropdown". -->
        <attr name="android:dropDownWidth" />
        <!-- Reference to an array resource that will populate the Spinner. -->
        <attr name="android:entries" />
    </declare-styleable>
    <declare-styleable name="SearchView">
        <!-- The layout to use for the search view. -->
        <attr name="layout" format="reference" />
        <!-- The default state of the SearchView. If true, it will be iconified when not in
             use and expanded when clicked. -->
        <attr name="iconifiedByDefault" format="boolean" />
        <!-- An optional maximum width of the SearchView. -->
        <attr name="android:maxWidth" />
        <!-- An optional user-defined query hint string to be displayed in the empty query field. -->
        <attr name="queryHint" format="string" />
        <!-- Default query hint used when {@code queryHint} is undefined and
             the search views {@code SearchableInfo} does not provide a hint. -->
        <attr name="defaultQueryHint" format="string" />
        <!-- The IME options to set on the query text field. -->
        <attr name="android:imeOptions" />
        <!-- The input type to set on the query text field. -->
        <attr name="android:inputType" />
        <!-- Close button icon -->
        <attr name="closeIcon" format="reference" />
        <!-- Go button icon -->
        <attr name="goIcon" format="reference" />
        <!-- Search icon -->
        <attr name="searchIcon" format="reference" />
        <!-- Search icon displayed as a text field hint -->
        <attr name="searchHintIcon" format="reference" />
        <!-- Voice button icon -->
        <attr name="voiceIcon" format="reference" />
        <!-- Commit icon shown in the query suggestion row -->
        <attr name="commitIcon" format="reference" />
        <!-- Layout for query suggestion rows -->
        <attr name="suggestionRowLayout" format="reference" />
        <!-- Background for the section containing the search query -->
        <attr name="queryBackground" format="reference" />
        <!-- Background for the section containing the action (e.g. voice search) -->
        <attr name="submitBackground" format="reference" />
        <attr name="android:focusable" />
    </declare-styleable>
    <!-- Attrbitutes for a ActivityChooserView. -->
    <declare-styleable name="ActivityChooserView">
        <!-- The maximal number of items initially shown in the activity list. -->
        <attr name="initialActivityCount" format="string" />
        <!-- The drawable to show in the button for expanding the activities overflow popup.
             <strong>Note:</strong> Clients would like to set this drawable
             as a clue about the action the chosen activity will perform. For
             example, if share activity is to be chosen the drawable should
             give a clue that sharing is to be performed.
         -->
        <attr name="expandActivityOverflowButtonDrawable" format="reference" />
    </declare-styleable>
    <declare-styleable name="AppCompatTextView">
        <!-- Present the text in ALL CAPS. This may use a small-caps form when available. -->
        <attr name="textAllCaps" format="reference|boolean" />
        <attr name="android:textAppearance" />
    </declare-styleable>
    <declare-styleable name="LinearLayoutCompat">
        <!-- Should the layout be a column or a row?  Use "horizontal"
             for a row, "vertical" for a column.  The default is
             horizontal. -->
        <attr name="android:orientation" />
        <attr name="android:gravity" />
        <!-- When set to false, prevents the layout from aligning its childrens
             baselines. This attribute is particularly useful when the children
             use different values for gravity. The default value is true. -->
        <attr name="android:baselineAligned" />
        <!-- When a linear layout is part of another layout that is baseline
          aligned, it can specify which of its children to baseline align to
          (that is, which child TextView).-->
        <attr name="android:baselineAlignedChildIndex" />
        <!-- Defines the maximum weight sum. If unspecified, the sum is computed
             by adding the layout_weight of all of the children. This can be
             used for instance to give a single child 50% of the total available
             space by giving it a layout_weight of 0.5 and setting the weightSum
             to 1.0. -->
        <attr name="android:weightSum" />
        <!-- When set to true, all children with a weight will be considered having
             the minimum size of the largest child. If false, all children are
             measured normally. -->
        <attr name="measureWithLargestChild" format="boolean" />
        <!-- Drawable to use as a vertical divider between buttons. -->
        <attr name="divider" />
        <!-- Setting for which dividers to show. -->
        <attr name="showDividers">
            <flag name="none" value="0" />
            <flag name="beginning" value="1" />
            <flag name="middle" value="2" />
            <flag name="end" value="4" />
        </attr>
        <!-- Size of padding on either end of a divider. -->
        <attr name="dividerPadding" format="dimension" />
    </declare-styleable>
    <declare-styleable name="LinearLayoutCompat_Layout">
        <attr name="android:layout_width" />
        <attr name="android:layout_height" />
        <attr name="android:layout_weight" />
        <attr name="android:layout_gravity" />
    </declare-styleable>
    <declare-styleable name="Toolbar">
        <attr name="titleTextAppearance" format="reference" />
        <attr name="subtitleTextAppearance" format="reference" />
        <attr name="title" />
        <attr name="subtitle" />
        <attr name="android:gravity" />
        <attr name="titleMargins" format="dimension" />
        <attr name="titleMarginStart" format="dimension" />
        <attr name="titleMarginEnd" format="dimension" />
        <attr name="titleMarginTop" format="dimension" />
        <attr name="titleMarginBottom" format="dimension" />
        <attr name="contentInsetStart" />
        <attr name="contentInsetEnd" />
        <attr name="contentInsetLeft" />
        <attr name="contentInsetRight" />
        <attr name="maxButtonHeight" format="dimension" />
        <attr name="collapseIcon" format="reference" />
        <!-- Text to set as the content description for the collapse button. -->
        <attr name="collapseContentDescription" format="string" />
        <!-- Reference to a theme that should be used to inflate popups
             shown by widgets in the toolbar. -->
        <attr name="popupTheme" />
        <!-- Icon drawable to use for the navigation button located at
             the start of the toolbar. -->
        <attr name="navigationIcon" format="reference" />
        <!-- Text to set as the content description for the navigation button
             located at the start of the toolbar. -->
        <attr name="navigationContentDescription" format="string" />
        <!-- Allows us to read in the minHeight attr pre-v16 -->
        <attr name="android:minHeight" />
        <!-- Drawable to set as the logo that appears at the starting side of
             the Toolbar, just after the navigation button. -->
        <attr name="logo" />
        <!-- A content description string to describe the appearance of the
             associated logo image. -->
        <attr name="logoDescription" format="string" />
        <!-- A color to apply to the title string. -->
        <attr name="titleTextColor" format="color" />
        <!-- A color to apply to the subtitle string. -->
        <attr name="subtitleTextColor" format="color" />
    </declare-styleable>
    <declare-styleable name="PopupWindowBackgroundState">
        <!-- State identifier indicating the popup will be above the anchor. -->
        <attr name="state_above_anchor" format="boolean" />
    </declare-styleable>
    <declare-styleable name="ListPopupWindow">
        <!-- Amount of pixels by which the drop down should be offset vertically. -->
        <attr name="android:dropDownVerticalOffset" />
        <!-- Amount of pixels by which the drop down should be offset horizontally. -->
        <attr name="android:dropDownHorizontalOffset" />
    </declare-styleable>
    <declare-styleable name="PopupWindow">
        <!-- Whether the popup window should overlap its anchor view. -->
        <attr name="overlapAnchor" format="boolean" />
        <attr name="android:popupBackground" />
    </declare-styleable>
    <declare-styleable name="DrawerArrowToggle">
        <!-- The drawing color for the bars -->
        <attr name="color" format="color"/>
        <!-- Whether bars should rotate or not during transition -->
        <attr name="spinBars" format="boolean"/>
        <!-- The total size of the drawable -->
        <attr name="drawableSize" format="dimension"/>
        <!-- The max gap between the bars when they are parallel to each other -->
        <attr name="gapBetweenBars" format="dimension"/>
        <!-- The length of the arrow head when formed to make an arrow -->
        <attr name="arrowHeadLength" format="dimension"/>
        <!-- The length of the shaft when formed to make an arrow -->
        <attr name="arrowShaftLength" format="dimension"/>
        <!-- The length of the bars when they are parallel to each other -->
        <attr name="barLength" format="dimension"/>
        <!-- The thickness (stroke size) for the bar paint -->
        <attr name="thickness" format="dimension"/>
    </declare-styleable>
    <attr name="drawerArrowStyle" format="reference" />
    <declare-styleable name="ViewStubCompat">
        <!-- Supply an identifier for the layout resource to inflate when the ViewStub
             becomes visible or when forced to do so. The layout resource must be a
             valid reference to a layout. -->
        <attr name="android:layout" />
        <!-- Overrides the id of the inflated View with this value. -->
        <attr name="android:inflatedId" />
        <attr name="android:id" />
    </declare-styleable>
    <declare-styleable name="CompoundButton">
        <attr name="android:button"/>
        <!-- Tint to apply to the button drawable. -->
        <attr name="buttonTint" format="color" />
        <!-- Blending mode used to apply the button tint. -->
        <attr name="buttonTintMode">
            <!-- The tint is drawn on top of the drawable.
                 [Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc] -->
            <enum name="src_over" value="3" />
            <!-- The tint is masked by the alpha channel of the drawable. The drawable’s
                 color channels are thrown out. [Sa * Da, Sc * Da] -->
            <enum name="src_in" value="5" />
            <!-- The tint is drawn above the drawable, but with the drawable’s alpha
                 channel masking the result. [Da, Sc * Da + (1 - Sa) * Dc] -->
            <enum name="src_atop" value="9" />
            <!-- Multiplies the color and alpha channels of the drawable with those of
                 the tint. [Sa * Da, Sc * Dc] -->
            <enum name="multiply" value="14" />
            <!-- [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc] -->
            <enum name="screen" value="15" />
        </attr>
    </declare-styleable>
    <declare-styleable name="SwitchCompat">
        <!-- Drawable to use as the "thumb" that switches back and forth. -->
        <attr name="android:thumb" />
        <!-- Drawable to use as the "track" that the switch thumb slides within. -->
        <attr name="track" format="reference" />
        <!-- Text to use when the switch is in the checked/"on" state. -->
        <attr name="android:textOn" />
        <!-- Text to use when the switch is in the unchecked/"off" state. -->
        <attr name="android:textOff" />
        <!-- Amount of padding on either side of text within the switch thumb. -->
        <attr name="thumbTextPadding" format="dimension" />
        <!-- TextAppearance style for text displayed on the switch thumb. -->
        <attr name="switchTextAppearance" format="reference" />
        <!-- Minimum width for the switch component -->
        <attr name="switchMinWidth" format="dimension" />
        <!-- Minimum space between the switch and caption text -->
        <attr name="switchPadding" format="dimension" />
        <!-- Whether to split the track and leave a gap for the thumb drawable. -->
        <attr name="splitTrack" format="boolean" />
        <!-- Whether to draw on/off text. -->
        <attr name="showText" format="boolean" />
    </declare-styleable>
    <declare-styleable name="TextAppearance">
        <attr name="android:textSize" />
        <attr name="android:textColor" />
        <attr name="android:textStyle" />
        <attr name="android:typeface" />
        <attr name="textAllCaps" />
        <attr name="android:shadowColor"/>
        <attr name="android:shadowDy"/>
        <attr name="android:shadowDx"/>
        <attr name="android:shadowRadius"/>
    </declare-styleable>
    <!-- The set of attributes that describe a AlertDialogs theme. -->
    <declare-styleable name="AlertDialog">
        <attr name="android:layout" />
        <attr name="buttonPanelSideLayout" format="reference" />
        <attr name="listLayout" format="reference" />
        <attr name="multiChoiceItemLayout" format="reference" />
        <attr name="singleChoiceItemLayout" format="reference" />
        <attr name="listItemLayout" format="reference" />
    </declare-styleable>
    <!-- @hide -->
    <declare-styleable name="ButtonBarLayout">
        <!-- Whether to automatically stack the buttons when there is not
             enough space to lay them out side-by-side. -->
        <attr name="allowStacking" format="boolean" />
    </declare-styleable>
    <declare-styleable name="AppCompatImageView">
        <attr name="android:src"/>
        <!-- TODO -->
        <attr name="srcCompat" format="reference" />
    </declare-styleable>
</resources>




         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
