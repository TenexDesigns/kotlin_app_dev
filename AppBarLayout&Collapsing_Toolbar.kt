APP BAR

Used as  a direct childe of the co-ordinator Layout
It reponds to scrol event in sibling view

The sibling View can be
--> Recycler View
--> Nested Sibling view

Add nestedScrollView for smooth scrolling effect



COLLAPSING TOOLBARLAYOUT

Used as a child of the cordinator layout in the Apoppbar layout
Responds to  scroll event and provide collapsing propertyto child views

Sibbling view
   -- > Toolbar
   -- > Image view
   -- > Tablayout


Both the appbar layout and the collapsing tool bar respond to scrolling events


Provide scrolling behaviour 


ScrollFlags

--> scroll | enterAlways  // Whendown scrool appp bar dissappears but on up scroll it appears
--> scroll | enterAlwaysCollapsed  // on scroll the app bar disappears untill the very top when the appbar comes to view
--> scroll | exitUntilCollapsed  // The 

Collapse mode

---> Pin
---> parallex

in the acitvity xml file we have to use the cordinator layout as the root layout
Then we have to wrap our tool bar in an app bar

<androidx.constraintlayout.widget.CoordinatorLayout>
  
                 <androidx.constraintlayout.widget.appbar
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
  <
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
<androidx.constraintlayout.widget.CoordinatorLayout/>



AppBarLayout is a vertical LinearLayout which implements many of the features of material designs app bar concept,
namely scrolling gestures.

Children should provide their desired scrolling behavior through AppBarLayout.
LayoutParams.setScrollFlags(int) and the associated layout xml attribute: app:layout_scrollFlags.

This view depends heavily on being used as a direct child within a CoordinatorLayout. 
If you use AppBarLayout within a different ViewGroup, most of its functionality will not work.

AppBarLayout also requires a separate scrolling sibling in order to know when to scroll.
The binding is done through the AppBarLayout.ScrollingViewBehavior behavior class, 
meaning that you should set your scrolling views behavior to be an instance of AppBarLayout.ScrollingViewBehavior.
A string resource containing the full class name is available.


 <androidx.coordinatorlayout.widget.CoordinatorLayout
         xmlns:android="http://schemas.android.com/apk/res/android"
         xmlns:app="http://schemas.android.com/apk/res-auto"
         android:layout_width="match_parent"
         android:layout_height="match_parent">

     <androidx.core.widget.NestedScrollView
             android:layout_width="match_parent"
             android:layout_height="match_parent"
             app:layout_behavior="@string/appbar_scrolling_view_behavior">

         <!-- Your scrolling content -->

     </androidx.core.widget.NestedScrollView>

     <com.google.android.material.appbar.AppBarLayout
             android:layout_height="wrap_content"
             android:layout_width="match_parent">

         <androidx.appcompat.widget.Toolbar
                 ...
                 app:layout_scrollFlags="scroll|enterAlways"/>

         <com.google.android.material.tabs.TabLayout
                 ...
                 app:layout_scrollFlags="scroll|enterAlways"/>

     </com.google.android.material.appbar.AppBarLayout>

 </androidx.coordinatorlayout.widget.CoordinatorLayout>







































