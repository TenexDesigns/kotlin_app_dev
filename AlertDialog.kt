  

The alert can be created using the AlertDialog.Builder class

    lateinit var builder:AlertDialog.Builder   // Create a variable of the type to be inristialized later
        builder = AlertDialog.Builder(this)  //We pass in the context within the brackets
    
  
    var btn:Button = findViewById(R.id.button3)  //We use a button to display the alert dailog


        btn.setOnClickListener {
            builder.setTitle("Alert")  //This is used to set the title for the alert dialog
                   .setMessage("Do you want to Exit") // This is used to set the message content for the dialog
                   .setCancelable(true)  // This makes the dialogue box go away if you press any other part of the screen
                   .setPositiveButton("Yes"){   //The dialog has a positive button which the user clicks to confirm that they wish to continue with the excution of the action
                        dialogInterface,it ->   //This posive button receeives two parameters
                        finish()                //Here we kill the activity ,to thus ensure tht the users desired action has been excuted
                       }
                   .setNegativeButton("No") {  //The dialog has a negative button which the user clicks to cancel the ecucution of an action
                        dialogInterface,it ->   //This posive button receeives two parameters
                      
                      ialogInterface.cancel()  // Here we cance the dialog box and continue with the activity.
                   }
                   .show()  //We put the dialog box here for the dialog box to be called
        }

        
        THERE ARE MATERIAL DESIGN DIALOGS


Dialogs inform users about a task and can contain critical information, require decisions, or involve multiple tasks.

IMPLEMENTATION OF DIALOG BUTTONS

MaterialAlertDialogBuilder(context)
    // Add customization options here
    .show()
    
    
    TYPES OF DIALOGS

1. Alert dialog, 
2. Simple dialog,
3. Confirmation dialog,
4. Full-screen dialog


A dialog is a type of modal window that appears in front of app content to provide critical information or ask for a decision.

Dialogs disable all app functionality when they appear, and remain on screen until confirmed, dismissed, or a required action has been taken.

Dialogs are purposefully interruptive, so they should be used sparingly.




ALERT DIALOGS

Alert dialogs interrupt users with urgent information, details, or actions.


IMPLEMENTATION

MaterialAlertDialogBuilder(context)
        .setTitle(resources.getString(R.string.title))
        .setMessage(resources.getString(R.string.supporting_text))
        .setNeutralButton(resources.getString(R.string.cancel)) { dialog, which ->
            // Respond to neutral button press
        }
        .setNegativeButton(resources.getString(R.string.decline)) { dialog, which ->
            // Respond to negative button press
        }
        .setPositiveButton(resources.getString(R.string.accept)) { dialog, which ->
            // Respond to positive button press
        }
        .show()

        
        SIMPLE DIALOG

Simple dialogs can display items that are immediately actionable when selected. 
They don’t have text buttons.

As simple dialogs are interruptive, they should be used sparingly.
Alternatively, dropdown menus provide options in a non-modal, less disruptive way.

EXAMPLE OF IMPLIMENTATION

val items = arrayOf("Item 1", "Item 2", "Item 3")

MaterialAlertDialogBuilder(context)
        .setTitle(resources.getString(R.string.title))
        .setItems(items) { dialog, which ->
             // Respond to item chosen
         }
        .show()
        
        
        
        
        CONFIRMATION DIALOG

Confirmation dialogs give users the ability to provide final confirmation of a choice 
before committing to it, so they have a chance to change their minds if necessary.



val singleItems = arrayOf("Item 1", "Item 2", "Item 3")
val checkedItem = 1

MaterialAlertDialogBuilder(context)
        .setTitle(resources.getString(R.string.title))
        .setNeutralButton(resources.getString(R.string.cancel)) { dialog, which ->
            // Respond to neutral button press
        }
        .setPositiveButton(resources.getString(R.string.ok)) { dialog, which ->
            // Respond to positive button press
        }
        // Single-choice items (initialized with checked item)
        .setSingleChoiceItems(singleItems, checkedItem) { dialog, which ->
             // Respond to item chosen
         }
        .show()














