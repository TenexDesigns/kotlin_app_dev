COLLAPSING TOOLBAR LAYOUT

 Used as a direct child of appBarLayout

Responds to scroll events and provides collapsing property to child views 

Sibling view --> Scroll verticaly

--> Toolbar
--> ImageView
--> TabLayout


LayoutScrolFlags
-> Enter always
-> enteralwayscollapsed
-> exitUntilCollapsed

Collapse mode 
-> pin
-> parallaxe


CollapsingToolbarLayout is a wrapper for Toolbar which implements a collapsing app bar.
It is designed to be used as a direct child of a AppBarLayout. CollapsingToolbarLayout contains the following features:

Collapsing title
A title which is larger when the layout is fully visible but collapses and becomes smaller as
the layout is scrolled off screen. You can set the title to display via setTitle(CharSequence).
The title appearance can be tweaked via the collapsedTextAppearance and expandedTextAppearance attributes.



<androidx.constraintlayout.widget.CoordinatorLayout>
  
                 <androidx.constraintlayout.widget.CollapstingToolbarLayout
                  android:fitsSystemWindws="true"
                  android:theme"dark"

>
  
  
  
                        <androidx.constraintlayout.widget.Toolbar
                     app:layout_scrollFlags="scroll | enterAlaways"  ./ for toolbar to connect with nested scroll view

                            />
  
  
                 <androidx.constraintlayout.widget.appbar>

  
  
  
  
  
  
  // Now we have to connect our nested view with our app bar layout.  we use app:layou_behaviour
  
  
        <androidx.constraintlayout.widget.NestedScrollview
             android:layout_behavior="sroll"
      >
                       
  
       Here we define our scroolable itenms e.g receycler view
  
  
  
  
  
  
  
  
  
         <androidx.constraintlayout.widget.NestedScrollview>
  
  
  
  <?xml version="1.0" encoding="utf-8"?>

// <!--first of all you have to change
// 	the layout as CoordinatorLayout.
// 	This is the first thing we need to do.-->
<androidx.coordinatorlayout.widget.CoordinatorLayout
	xmlns:android="http://schemas.android.com/apk/res/android"
	xmlns:app="http://schemas.android.com/apk/res-auto"
	xmlns:tools="http://schemas.android.com/tools"
	android:layout_width="match_parent"
	android:layout_height="match_parent"
	tools:context=".MainActivity">

// 	<!--AppBarLayout helps the toolbar and other components to react on
// 		scroll changes. I am using Dark theme for AppBarLayout.
// 		Inside this AppBarLayout i
// 		have used CollapsingToolbarLayout. -->
	<com.google.android.material.appbar.AppBarLayout
		android:id="@+id/appBarLayout"
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar">

// 		<!-- In CollapsingToolbarLayout some important attributes are:
// 		i) app:layout_scrollFlags which is used to specify how collapsing
// 			layout behaves when content is scrolled.I have used
// 			app:layout_scrollFlags="scroll|snap|exitUntilCollapsed"
// 			so it will scroll until its is completely collapsed.
// 		ii) app:contentScrim="@color/green" that specifies the color
// 			of the collapsed toolbar -->
		<com.google.android.material.appbar.CollapsingToolbarLayout
			android:layout_width="match_parent"
			android:layout_height="wrap_content"
			app:contentScrim="@color/green"
			app:layout_scrollFlags="scroll|snap|exitUntilCollapsed"
			app:title="@string/app_name">

// 			<!--We are adding the image that we have added earlier
// 				in the drawable folder.The attribute app:layout_collapseMode="parallax"
// 				causes the image to move when user scrolls at a specific ratio. -->
			<ImageView
				android:layout_width="match_parent"
				android:layout_height="250dp"
				android:scaleType="centerCrop"
				android:src="@drawable/image"
				app:layout_collapseMode="parallax" />

// 			<!-- The attribute app:layout_collapseMode="pin" is set so that
// 				sticks to the top when the user scrolls the view up-->
			<androidx.appcompat.widget.Toolbar
				android:layout_width="match_parent"
				android:layout_height="?attr/actionBarSize"
				app:layout_collapseMode="pin"
				app:popupTheme="@style/ThemeOverlay.AppCompat.Dark" />

		</com.google.android.material.appbar.CollapsingToolbarLayout>

	</com.google.android.material.appbar.AppBarLayout>

// 	<!--Now add the NestedScollView-->
	<androidx.core.widget.NestedScrollView
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		app:layout_behavior="@string/appbar_scrolling_view_behavior">
		
// 		<!--In textview we will be adding the text that i have
// 			added earlier in strings.xml file.This is simply the
// 			the content to be scrolled -->
		<TextView
			android:layout_width="match_parent"
			android:layout_height="wrap_content"
			android:lineSpacingExtra="8sp"
			android:padding="16dp"
			android:text="@string/content"
			android:textSize="20sp" />
	</androidx.core.widget.NestedScrollView>

</androidx.coordinatorlayout.widget.CoordinatorLayout>
  
  
  read more here----> https://www.geeksforgeeks.org/how-to-collapse-toolbar-layout-in-android/









































































