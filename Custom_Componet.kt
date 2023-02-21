Android offers a great list of pre-built widgets like Button, TextView, CheckBox, RadioButton e.t.c
but there may be a situation when you are not satisfied with existing functionality of any of the available widgets. 
Android provides you with means of creating your own custom components which you can customized to suit your needs.

If you only need to make small adjustments to an existing widget or layout, you can simply subclass the widget or layout
and override its methods which will give you precise control over the appearance and function of a screen element.


                                      Pas in the below parameters                            Use this to overide your desired view
class Custom @JvmOverloads constructor(context: Context,style:Int =0,attribute:AttributeSet,):MaterialButton(context,attribute,style){

init{  // Hree you define you dimensons 
  
  height = res/style.dimension //It is better to define the dimensions and style in the resource folder
}




}

































































