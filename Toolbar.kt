Tool bar 


Used to give app identity
Indicates users location in app
Used to acess important actions
Support for easy view switching
You can show multiple tool bar on screen

Compatible for API 7+
Simialr to action bar
To use ActionBar as toool bar
  . setSupportActionBar
  . setActionBar

Tool bar is a view group - Meaning it has its own layout and can be placed anywhere on the screen.
                         - It can have multiple views as child view
                         - It can contain custom views



The tool bar can have
-Title
-Subtitle
-Menu Icon
- Overflow menu
- Naviagtion button

WHEN WE USE THE TOOL BAE ,WE USE IT A VIEW GROUP

To get started with the tool bar we have to set it in the activity we want it to appear
We have to put it in thx xml of the activty we want the toool bar to appear.
We instanciate the tool bar by using the foolowing tag   <androidx.appcompat.widget.Toolbar>

  
  // THIS IS THE XML FILE OF THE ACTIVITY WE WANT OUR APP BAR TO APPEAR
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
  
  // THIS IS OUR APP BAR

    <androidx.appcompat.widget.Toolbar
        android:id="@+id/toolbar2"
        android:layout_width="0dp"
        android:layout_height="?attr/actionBarSize"
        android:background="@color/teal_700"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        tools:ignore="MissingConstraints">

    </androidx.appcompat.widget.Toolbar>

</androidx.constraintlayout.widget.ConstraintLayout>

We can define the toolbar as a layoutfile of the menu type and in it we define , what we want to be dispalyed
In the tool bar we can disp







SNACKBAR

It is a lightweight feedback like toast.  e.g when u delete a message ,you get a tast like message with an UNDO option to undo the done opertion
It disappers afert a timeout  --> setTimeout
Can be swipped off the screen  --> Usig coordinator layout
may contain an action or not


Types of snackbar
simple snackbar --No action
Custom Color snack bar ---Can be customised in terms of color e.tc
Snackbar with option -- > Give user an option e.g to undo the action.



CORDINATOR lAYOUT

tHIS ENABLE FEATURES SUCH AS

- Swipe to dismiss
- Automatic moving of widgets like fab































































