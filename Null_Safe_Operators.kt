There are four null safety operators

Safe call operator   ---->  ?.
Safe call with let   ---->  ?.let{...}
Elvis operator       ---->  ?:
Not null assertion   ---->  !!
  
  The precedence/order of importance of operators !, ?., !! is 
    ?. > !! > !
   --------------->Most important
  
  1. Safe CAll ( ?. )
  Heres an example.
  There is a string that can have a null value or a string value.But kotlin does not support variables having null as a value. --> e.g val name:String = null IS not allowed
  Now to enable a varaible to be nullable, we have to make it of a nullable data type.e.g To make a string or integer or any data type nullable
  we have to put a question mark after the data type. After  doing this ,we can put the value of the strinng or any valiable as null.
  e.g   var name:String? = null

  Now incase we want to excute code on a nullable data type ,we have to put the null safety operator. This signifies that there is a popssibily that the excution of code on the null able dat type may return null .
  We use the null safet call opreator to avoid the null exeption

   e.g print(name?.lenth)  This returns the lenth of the name if name is not null e.g var name:String? = "dog" returns 3  ,else it returns null if the value of the valiabl is null e.g var name:String? = null. The code is after the queston mark not even excuted 
   Use the null safety operator if you dont mind getting null value.


  2. Safe call with let ?.let{...}
  It only excutes the code if the value is not null.
  If the value is null ,the code within the let scope will nnot be excuted

This code will excute                                    This code will NOT excute.Since the value is null
 Since the value is not null
var name:String? ="George"                                  var name:String? = null
    
    name?.let{                                                      name?.let{
        print("Hello George")                                              print("Hello George")
    }                                                                     }
  

  3.Elvis - operator ( ?: )
  This is like an itenary operator in javascrit. 
  If the value on one side is null, then it will return the value on the right side or excute the code on the right side as the default
  This opearator checks if the code on the left is null,if it is not null, then it excutes the code.However if the code on the left is null,it will return or excute the code on the right
  It worrks like an if else state ment where if the code on the right is null, excute the code on the left ,but if the code on the right is not null ,then excute it.


 This code will excute                                    This code will NOT excute.Since the value is null
 Since the value is not null                               Instead it will return a  value of ans = -1
and return ans = 5
var name:String? ="George"                                  var name:String? = null
       

  var ans = name?.lenth ?: -1                                  var ans = name?.lenth ?: -1



   4. Non-null assertion operator  ( !! )
   //Use it when you are a 100% sure that the value is not null,Else if the value is null it will throw the Nll POINTER Exception which will crash your app and provide poor user experince.
   //

NULL 
