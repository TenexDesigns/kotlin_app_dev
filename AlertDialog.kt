  

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













var btn:Button = findViewById(R.id.button3)

        btn.setOnClickListener {                ___________________________>Here we pass in the custom layout we made for our selves
            val dialog = layoutInflater.inflate(R.layout.alert,null)  
            val myDialog = Dialog(this)                   //We use this class to create an instance of a dialog box
            myDialog.setContentView(dialog)         //We set the content of that dialog here
            myDialog.setCancelable(true)//This makes the dialogue box go away if you press any other part of the screen
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))  //We define the color of the background here
            myDialog.show()
        }

        
        
