class MainActivity:AppCompatActivity() {

    private lateinit var  age:Int? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        //The let key word retuns the last line of code in its scope
                              // var num =  age?.let{
                               //                   return  2}      This will return the num 2
        //The let key word can be used like an if else statement why by ,The code in the let scope will not excute if the value is null.
        //If the value is not num The code will be excuted                            _ 
                                    //      var age? = null                            |
                                   //       var num =  age?.let{                       |_This code will  not excute since the age is null
                                  //                            return  2}            _|
                                                                                   _
                                 //      var age? = 23                              |
                                //       var num =  age?.let{                       |_This code will excute since the age is not null
                               //                            return  2}            _|  It will return a two
        
        
       // The let key word can be used as a else if .Where if the value is null.It will no excute the code within the let scope and insted return a vlaue you specifie as folow
                                                                                      _
                                    //      var age? = null                            |
                                   //       var num =  age?.let{                       |_This code will  not excute since the age is null but it will return 3 as the 
                                  //                            val age* 4             |  default value.There is like an else statement i.e ?:
                                 //                            }?:3                   _|







    }


}

