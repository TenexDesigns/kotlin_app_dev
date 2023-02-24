If you want to get suggestions , when you type in an editable text field , you can do this via AutoCompleteTextView. 
It provides suggestions automatically when the user is typing. 
The list of suggestions is displayed in a drop down menu from which the user can choose an item to replace the content of the edit box with.

In order to use AutoCompleteTextView you have to first create an AutoCompletTextView activity in the xml. Its syntax is given below.
e.g <AutoCompleteTextView
   android:id="@+id/autoCompleteTextView1"
   android:layout_width="wrap_content"
   android:layout_height="wrap_content"
   
   
   Now In the activity file 




        var auto:AutoCompleteTextView = findViewById(R.id.auto) /// This get the autocomplet tag


        var suggestions = arrayOf("Apple","Google","Samsung","Huwaei","Facebook")  //This are the suggestions to be put in the drop down menu
        var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,suggestions)  //This puts the suggestions in the  drop down menu or adapter
        auto.threshold = 0  //This states that on typing the first charaacter ,suggestions mation the first character typed should be displayed 
        auto.setAdapter(adapter)  //This sets the adapter with the suggestions
       // auto.setOnFocusChangeListener({view,b -> if (b ) auto.showDropDown()})  This makes the whole drop down meniu o be displayed ..But i dont recomment id
