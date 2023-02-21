Android LAyout Types

    There are five android layout types

            Linear Layout         - This layout is a view group that aligns all its chilfren in a single direction ,either verticaly or horizontaly
            Relative layout       - Relative layout is a view group that dispalys its children in relative positions 
            Table layout          - Table ayout is a view that groups views into rows and columns
            Frame Layout          - The frame layout is a placeholder on screen that you can use to display a single view
      **    Absolute layout       - Absolute layout enables you to specify the exact loaction of its children                          **Depricated 
    
    There are several group views
       List view -- List view is a view group that displays a list of scrollable items
       Grid view -- Grid view is a view group that displays items in a two-dimensional scroll grid
       Web view  -- Web view is a view that dispay web pages inside your application


Note----> List view and Grid view are subclasses of the AdapterView and they can be populated by binding them to an Adapter, which receives data from an external source
          and creates a View that represents each data entry.
Note---> View group is a component that provides an invisible container to hold other views  or other view groups and define their layout properties.
         e.g of view group list view Linerar layout.



       HOW TO CREATE LAYOUT
   1. XML based            -- Declare ui elemnts in the XML.Is simple to learn and use.It is more prfered
   2. Programmatically     -- Instanciate layout elements at run time.


                    ANDROID UI CONTROLS
android:id                              --  Gives a unique id to identify the view or control
android:background                      --  This is a drawable to ude as the background
android:contentDescription              --  This defines text that briefly describes content of the view
android:onClick                         --  This is the name of the method ,in this view context to invoke when the view is invoked
android:visibility                       --  This controls the initial visibility of the view



                     LINEAR LAYOUT

            Linear Layout         - This layout is a view group that aligns all its chilfren in a single direction ,either verticaly or horizontaly

This layout has some unique attributes

  android:id             It provides an id that uniquely identifies the view
  android:orientation    This provides direction for arrangement of the children ,either horizontal for the children to be arrange in a row or vertical for children to be arrange in a colunm....Derault is  horizontal 
  android:igravity       This specifies how the children should positon its content ,either center ,top ,bottom or left
  android:baselineAligned.   Prevent layout from aligning its children baseline 
  android:divider             To draw a vericla divider betewwn buttons 
  android:weightSum      Sum up child weight 
  android:id 



    


