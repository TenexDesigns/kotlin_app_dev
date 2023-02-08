
/*
// BENEFITS OF DATA BINDING

Helps not to use FindViewBYId()
Heps no to create many Adapters
Heps to handle Call Backs easily
Helps in data binding for forms
Helps to set fonts directly to xml


*/


// Note --- To be able to use data binding you need to enable it in the app leve gradel   i.e build.gradle by adding this  
//within the android scope//           buildFeatures{
                                                   dataBinding true
                                                    }





class MainActivity:AppCompatActivity() {
  
  //Create a variable of the type of the xml activity you want to buid a view for.
  // private lateinit var  binding: ActivityMainBinding
                                   ---------------------   This is the name of the activity you are apply a view for e.g activity_main.xml, without the underscores
  

    private lateinit var  binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)                                             //Instanciate the binding variable after the super function   
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)          //Use the data bindingutil to set the content view and indictate the activity
                                                                                      // Use the variable dot root in the content view to complete the set up
        

        binding.button3.setOnClickListener{                           // the binding  variable will now give you access to all views in the xml activity file
            Log.i("TAg","I was clicked")
        }

        
        







    }


}


                                   ******************************  USes of Data Binding **********************
  
  Data binding can be used to send data from the activity to the xml file e.g via a variable
To enable this ,you need to convert the layout in the xml file to enable data binding
To do this wrap the layout the file in a Layout tag.

Now in the xml file there is the data tag

<data>
  <varaiable
        name="my_variable"
        type = "String"
/>
  <data/>
  
  <EditText

 android:hint="@{my_variable}"
/>
  
  
  In the activity file ,we can assighn our value to the edit text

binding.myVaraiable = "Hellllo From main activvity"
















