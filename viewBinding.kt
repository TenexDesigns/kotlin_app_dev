// Note --- To be able to use view binding you need to enable it in the app leve gradel   i.e build.gradle by adding this  
//within the android scope//           buildFeatures{
                                                   viewBinding true
                                                    }




class MainActivity:AppCompatActivity() {
  
  //Create a variable of the type of the xml activity you want to buid a view for.
  // private lateinit var  binding: ActivityMainBinding
                                   ---------------------   This is the name of the activity you are apply a view for e.g activity_main.xml, without the underscores
  

    private lateinit var  binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)                             //Instanciate the binding variable before the set content function   
        binding = ActivityMainBinding.inflate(layoutInflater)          //Inflate the activity and pass layout inflater as an argument
        setContentView(binding.root)                                   // Use the variable dot root in the content view to complete the set up
        

        binding.button3.setOnClickListener{                           // the variable will now give you access to all views in the xml file
            Log.i("TAg","I was clicked")
        }








    }


}

