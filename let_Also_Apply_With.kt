class MainActivity:AppCompatActivity() {

    private lateinit var  age:Int? = null
    
    // NOTE: let,also,apply and with are scope functions
    //This scope functions can be called on every object in kotlin
    //We usualy use LET for null checks in kotline



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
                                         //***************************** LET ***********************//
        
        
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
                                  //                            val it* 4              |  default value.There is like an else statement i.e ?:
                                 //                            }?:3                   _|Note:- To access the age within the brackets we us IT..to refer to the age

                                                                                      _
                                    //      var age? = 3                               |
                                   //       var num =  age?.let{                       |_This code will excute since the age is not  null .it will return 12 as the 
                                  //                            val it * 4             |value after code excution.The default value is is ignored.
                                 //                            }?:3                   _|Note:- To access the age within the brackets we us IT..to refer to the age




        
        
        
        
        
                                         //*****************************   APPLY ***********************//
        //Apply is vey useful when making changes to an object
        
       // e.g When we use an apply scope function .We don't need to refer to the object on which apply is used within the scope
        e.g intentClass() {                          |        intentClass().apply{ 
        intentClass.putExtra()   }                   |                  putExtra()  }
        
        e.g class Person{
            var age =0
            var name="
            fun group(){
                println("$name")}
        }
        
        //To change the age of the person we have to d it like this
        var person = Person()
        person.age = 12
        person.name = "George"
        //But with apply we can do it like this
        var person = Person().apply{
            age= 43
            name = "Kimani"
        }
        //It returns an object with tshe same type it is modifying ,Only this time with the modifications made.
        
        
                                         //***************************** Run ***********************//
         // It is the same as apply but it returns the last line in its scope
            var person = Person().run{
            age= 43
            name = "Kimani"
            "George"
        }
        //This will return a string
        
        
                                         //***************************** Run ***********************//
                                         
                                         
        
        
        
        

    }


}

