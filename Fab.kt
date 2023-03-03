Buttons: floating action button

A floating action button (FAB) represents the primary action of a screen.
A FAB performs the primary, or most common, action on a screen. It appears in front of all screen content,
typically as a circular shape with an icon in its center.

Note: If the FloatingActionButton is a child of a CoordinatorLayout, you get certain behaviors for free.
It will automatically shift so that any displayed Snackbars do not cover it,
and will automatially hide when covered by an AppBarLayout or BottomSheetBehavior.



VISIBILITY

Use the show and hide methods to animate the visibility of a FloatingActionButton or an ExtendedFloatingActionButton. 
The show animation grows the widget and fades it in, while the hide animation shrinks the widget and fades it out.





// To show:
fab.show()
// To hide:
fab.hide()

