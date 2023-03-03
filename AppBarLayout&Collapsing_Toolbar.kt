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











































