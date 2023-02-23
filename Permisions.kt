First we have to put the permissions we want to use in our app in the android manifest file

e.g   <?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.RECORD_AUDIO"/>
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
    <uses-permission android:name="android.permission.CAMERA"/>
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
  
  
 
  Then we proceede to the activity we want use the permissions we want to use

class MainActivity:AppCompatActivity() {

    val location_code = 101            // First we create uniquerequest codes for each of the persssions we want from the user.This enables us to identify the permissions 
    val camera_code= 102
    val record =103
    val write =104

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val cam:Button = findViewById(R.id.camera)       // This can be the function that we call when the activity is stated of the buttons to which the user can use to detemine what the app accesss in their phone
        val rec:Button = findViewById(R.id.record)
        val loc:Button = findViewById(R.id.location)
        val wri:Button = findViewById(R.id.write)

        
        // LISTEN HERE  ---> Here's where the fun starts. We can instigate the askimg os permissions by puttint the checkPermission function in one function and calling the function in the oncreate function or we can do it as we did here below.

        
                                      __________________>We  made the checkPermission() function 
        Now ...The fun beigns on the checkForPermsssion() function which takes in three arguments ,The permission and the custom name for the permission , and the request code for the permission
        Now let us go to the checkPermission function()------------> 
      
       cam.setOnClickListener {                          
          
            checkForPermission(android.Manifest.permission.CAMERA,"camera",camera_code)
        }



        rec.setOnClickListener {
            checkForPermission(android.Manifest.permission.ACCESS_FINE_LOCATION,"location",location_code)
        }


        loc.setOnClickListener {
            checkForPermission(android.Manifest.permission.RECORD_AUDIO,"record",record)
        }


        wri.setOnClickListener {
            checkForPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE,"write",write)
        }












    }

    private fun checkForPermission(permission:String,name:String,requestCode:Int){

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){        // Here we check if the android version id=s above android version 6, where the asking for user permission was required.

          
          //Here we excute the code that will excute in either of theree ways   -----------------------------------------------    v                   ---
            when{ 
             // To check whether the user already granted your app a particular permission, pass that permission into the ContextCompat.checkSelfPermission() method. 
             // This method returns either PERMISSION_GRANTED or PERMISSION_DENIED, depending on whether your app has the permission.
              //Here we passin the context and permission to the ContextCompat.checkSelfPermission() method
                ContextCompat.checkSelfPermission(applicationContext,permission) == PackageManager.PERMISSION_GRANTED -> { // If the user has already given the permission to the app.Then a toast message is show or any desired code.
                    Toast.makeText(applicationContext," Permission Granted For $name",Toast.LENGTH_LONG).show()


                }
               // If the ContextCompat.checkSelfPermission() method returns PERMISSION_DENIED, call the  shouldShowRequestPermissionRationale() method.
               // If this method returns true, show an educational UI to the user.
               // In this UI, describe why the feature that the user wants to enable needs a particular permission.
                shouldShowRequestPermissionRationale(permission) -> showDialog(permission,name,requestCode)  ----> This showDialog() method is what we use to call that eductional ui telling the user why the permission is required for this app to function propery //We pass in th permission and the name of the permission and the request code as parameters. 

              
              // If the shouldShowRequestPermissionRationale() returns false and the  ContextCompat.checkSelfPermission(applicationContext,permission)  returns that the permission is denied then this means that the user has not yet been reuested to give acees to the required permissionss
              // This is the code that shows the alert diialog asking the user for permission to access the required files or user data.  
              else -> ActivityCompat.requestPermissions(this, arrayOf(permission),requestCode)
            }

        }





    }



    override fun onRequestPermissionsResult(requestCode: Int,permissions: Array<out String>,grantResults: IntArray) {


        super.onRequestPermissionsResult(requestCode, permissions, grantResults)


        fun innerCheck(name:String){
            if(grantResults.isEmpty() || grantResults[0] != PackageManager.PERMISSION_GRANTED){
                Toast.makeText(applicationContext,"$name permission refused",Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(applicationContext,"$name permission granted ",Toast.LENGTH_LONG).show()


            }
        }

         when (requestCode){
             location_code -> innerCheck("location")
             camera_code -> innerCheck("camera")
             record -> innerCheck("record")
             write -> innerCheck("write")


         }
    }

    private fun showDialog(permission:String,name:String,requestCode:Int){
        val builder = AlertDialog.Builder(this)

        builder.apply {
            setMessage("Permission to access your $name is required to use this app")
            setTitle("Permission Required")
            setPositiveButton("Ok"){
                dialog, which -> ActivityCompat.requestPermissions(this@MainActivity, arrayOf(permission),requestCode)

            }
        }
        val dialog:AlertDialog = builder.create()
        dialog.show()


    }







