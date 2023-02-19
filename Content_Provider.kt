CUSTOM CONTENT PROVIDER

Content providers enable other applications to securely access and modifies data of one application based on the user requirements. 
Android system allows the content provider to store the application data e.g(images, audio videos and persona contact) in several ways like  storing them in SQLite Database, in files, or even on a network.
In order to share the data, content providers have certain permissions that are used to grant or restrict the rights to other applications to interfere with the data.
For this ,content providers use contentURI



                 other-Applications
                         ^
                         |
                         |
                         v  
                 your-content provider
                         ^  
                         |                      
                         |
                         v
                   your app data
                          |   //Read or Write      
             ------------------------------
            |               |              |
         Internet        SQLite            Files



CONTENT URI

Content URI(Uniform Resource Identifier) iS used to to access the data from a content provider
Content URI is used as a query string.

STRUCTURE OF CONTENT URI

      content://authority/data_type/optionalID
                                                                                                                                                                                     package com.example.tenex                                                         
       val AUTHORITY_NAME = "any name"                            //For the authority name ,since it has to be unique ,we can pass in the package name and add a slash for the content provider name e.b val PROVIDER_NAME = "com.example.tenex/ Provider"
     e.g val URL = "content://$AUTHORITY_NAME/users"              // Now for the data_type ,we can pass in the table name of the data base we created in case we are aceessig our own custom data base we created

******************NOTE----> Now ,that you have finished writing the uri.You NEED TO PARSE IT TO CONVET IT IN A FORMAT ANDROID CAN UNDERTAND I.E convert your URI to a content_uri

TO CONVERT THE URI TO A CONTENT_URI
You have to user the Uri.parse() method and pass in your uri as a argument.



Now ---->val content_uri =  Uri.parse(URI) 

DETAILES OF DIFFERY PARTS OF THE CONTENT URI

--> content:// – Mandatory part of the URI as it represents that the given URI is a Content URI.
--> authority – Signifies the name/string  of the content provider like contacts, browser, etc. This part must be unique for every content provider.
--> data_type – Specifies the type of data provided by the content provider. It is essential as this part helps content providers to support different types of data that are not related to each other like audio and video files.
--> optionalID – It is a numeric value that is used when there is a need to access a particular record.

Note --> If an ID is mentioned in a URI then it is an id-based URI otherwise a directory-based URI.




FOR EXAMPLE---> WE HAVE CREATE OUR OWN DATA BASE AND WE WOULD WANT OURCONTENT PROVIDER TO ASSESS THE DATA IN THE TABLE WE CREATED IN OUR DATA BASE E.G HERE BELOW
// class Database (context: Context) :SQLiteOpenHelper(context,"ACDB",null,1){
//    override fun onCreate(db: SQLiteDatabase?) {
//        db?.execSQL("CREATE TABLE STUDENTS_RESULTS (_id INTEGER PRIMARY KEY AUTOINCREMENT ,NAME TEXT, MARKS TEXT)")
//        db?.execSQL("INSERT INTO STUDENTS_RESULTS(NAME,MARKS) VALUES ('George',432)")
//        db?.execSQL("INSERT INTO STUDENTS_RESULTS(NAME,MARKS) VALUES ('Eliud',455)")
//    }
//
//    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
//        TODO("Not yet implemented")
//    }
//
//}
In our content provider to enable the user to access the  columns in the data base i.e , NAME,MEANING .
We have to create variables with the same names as the columns we are tying to access from our data base  in our content provider.


i.e val _name = "NAME"  <----- This name has to be the same as the one in our columns in our data base
    val _marks ="MARKS"

We usually carry out the above implementation in a companion object within the content provider class.We use a companion object so that we can directly access the values in the companion object from the outside using just the name of the class .
class Provider : ContentProvider(){


    companion object{
        val AUTHORITY_NAME = "com.example.tenex/ Provider"
        val URI = "content://$AUTHORITY_NAME/ACTABLE"

        val _id ="_id"
        val _name ="NAME"
        val _marks ="MARKS"


    }
    
    
    ----> Now in our content provider class we have  to overide the soame functions in the content provider.This a re namely
onCreate() getType()   delete()  update() insert()  query()  methods .
	
	
THE SIX ABSTRACT METHODS OF THE CONTENTPROVIDER CLASS.



Abstract Method                              Description

query()                                      A method that accepts arguments and fetches the data from the                                	
                                             desired table. Data is retired as a cursor object.
	
insert()                                     To insert a new row in the database of the content provider. 
                                             It returns the content URI of the inserted row.

 update()                                    This method is used to update the fields of an existing row. 
                                             It returns the number of rows updated.

delete()                                     This method is used to delete the existing rows. 
                                             It returns the number of rows deleted.	

getType()                                    This method returns the Multipurpose Internet Mail Extension(MIME)    
                                             MIME i.e--> type of data to the given Content URI.

onCreate()                                   As the content provider is created, the android system calls 
                                             this method immediately to initialise the provider.
	
	//--->Proceede to next explanation..............................................................  Down here below

class Provider : ContentProvider(){
	
	companion object{
        val PROVIDER_NAME = "com.example.tenex/ Provider"
        val URI = "content://$PROVIDER_NAME/ACTABLE"

        val _id ="_id"
        val _name ="NAME"
        val _marks ="MARKS"


    }
 
    override fun onCreate(): Boolean {
    }
 
    override fun query(
    ): Cursor? {
        TODO("Not yet implemented")
    }

    override fun getType(uri: Uri): String? {
        TODO("Not yet implemented")
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        TODO("Not yet implemented")
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
        TODO("Not yet implemented")
    }

    override fun update(

    ): Int {
        TODO("Not yet implemented")
    }
}

--------------->Now on we need to access our data base that we created ...
	To do that we create a variable of type SQLiteDatabase outside of all overiden methods
	  lateinit var db:SQLiteDatabase
	
	Then next we need todo is instanceate the Data base in the on create method .The we will chage if the object hass been returend correctly or if it is null.
	
       override fun onCreate(): Boolean {
                        var database = Database(requireContext())
                        db = database.writableDatabase

       return if(db==null) false else true
	       
	       
------->  Now in the inssert method we need to indert the row received throught the content uri  to the data base.
	   The insert method accepts two arguments. uri: Uri, values: ContentValues? .The uri is the content_uri and the content value is the values received with the uri.
	    
override fun insert(uri: Uri, values: ContentValues?): Uri? {
	         db.insert("ACTABLE",null,values)                   // Here we inseet the values i.e ContentVlaue  to the table of the data base i.e ACTABLE,We pass null as the nullcomunhack.
                  context?.contentResolver?.notifyChange(uri,null) // We use this to notify the user of the change made
		  return uri                                      // finally we retrn the uri after making changes 
    
    
    
-----> Now we go to the update method.This receivers four parameters   
	
	
	overide update(uri: Uri, cv: ContentValues?,condition: String?, condition_val: Array<out String>)  // Ther uri is the content uri , also cv is content values passed with the uri,then selection is the condition to be met for the updata and the slection array is the condtion value.We have to passs all of this to the data base update method
	 val number =  db.update("ACTABLE",cv,condition,condition_val)   //First we pass the name of the table,We pass all the parameters we received.This method reruns the count of rows changed
         context?.contentResolver?.notifyChange(uri,null)  // Finally we have to notify the user of the change made
	 return number   // We return the number of changes made to the table.

    
	
-----> Now we go to the delete method.This receivers three parameters   
	
	
	overide delete(uri: Uri, condition: String?,condition_val: Array<out String>)  // Ther uri is the content uri ,then selection is the condition to be met for the updata and the slection array is the condtion value.We have to passs all of this to the data base delete method
	 val number =  db.update("ACTABLE",condition,condition_val)   //First we have to pass the name of the table are connecting to.We pass all the parameters we received.This method reruns the count of rows changed
         context?.contentResolver?.notifyChange(uri,null)  // Finally we have to notify the user of the change made
	 return number   // We return the number of changes made to the table.

    
    -----> Now we move on to the querry metod.This receives four parameter.
	This method returns the data requested by the user as a cursor object
	
override fun query(
        uri: Uri,
        cols: Array<out String>?,
        condtion: String?,
        condition_val: Array<out String>?,
        sortOrder: String?
    ): Cursor? {
	return db.query("ACTABLE",cols,condtion,condition_val,null,null)
        TODO("Not yet implemented")
    }







-----> Now the get type method.We have to mentin the vendor specific directory.
	
override fun getType(uri: Uri): String? {
        return "vnd.android.cursor.dir/vnd.example.actable"
	                                           ----------->Pass your table name here.
    }



------> Finally after doing all of this you need to regester your provider class in the android manifest file
	It is also compulsory that you provide the authority by providing the package name and the name of thr provider
	
	
<provider
   android:name=".Provider"                //It is compulsory that you provide the name of the provider that you create 
   android:authorities=" com.example.tenex.Provider" //It is also compulsory that you provide the authority by providing the package name and the name of thr provider
   android:exported="true"     //Do you want  to export your content provider any where else
   android:grantUriPermissions="true"  //Do you want to grant permission for this uri to be used to access this data base.
	
	>
</provider>
    



OPERATIONS IN THE CONTENT PROVIDER

Four fundamental operations are possible in Content Provider namely CREATE, READ, UPDATE ,DELETE .
 These operations are often termed as CRUD operations.

Create  : Operation to create data in a content provider.
Read    : Used to fetch data from a content provider.
Update  : To modify existing data.
Delete  : To remove existing data from the storage.

WORKING WITH THE CONTENT PROVIDER

UI components of android applications like Activity and Fragments use an object called CURSORLOADER to send query requests (Content URI) to ContentResolver. 
The CONTENT RESOLVER object  sends requests (like create, read, update, and delete) to the ContentProvider as a client.
After receiving a request, ContentProvider process it and returns the desired result.

         Below is a diagram to represent these processes in pictorial form.

              ACTIVITY/ FRAGMENT
                   ^
                   |
                   v
              CURSOR LOADER
                   ^
                   |
                   v
              CONTENT RESOLVER
                   ^
                   |
                   v
              CONTENT PROVIDER
                   ^
                   |
                   v
              DATA STORAGE


CREATING A CONTENT PROVIDER

Create a class that extends ContentProvider() class.
Create a content URI to access the content.
Create a database to store the application data.
Implement the six compulsory abstruct methods of the ContentProvider class.
Register the content provider in AndroidManifest.xml file using <provider> tag.




THE SIX ABSTRACT METHODS OF THE CONTENTPROVIDER CLASS.



Abstract Method                              Description

query()                                      A method that accepts arguments and fetches the data from the                                	
                                             desired table. Data is returned as a cursor object.
	
insert()                                     To insert a new row in the database of the content provider. 
                                             It returns the content URI of the inserted row.

 update()                                    This method is used to update the fields of an existing row. 
                                             It returns the number of rows updated.

delete()                                     This method is used to delete the existing rows. 
                                             It returns the number of rows deleted.	

getType()                                    This method returns the Multipurpose Internet Mail Extension(MIME)    
                                             MIME i.e--> type of data to the given Content URI.

onCreate()                                   As the content provider is created, the android system calls 
                                             this method immediately to initialise the provider.





                          THIS IS A CLASS CREATING  / IMPLEMENTING THE CONTENT PROVIDER


class Provider : ContentProvider() {




    val ath = "authority"
    val contenURI = "content://$ath/user"
	
	
	
override fun onCreate(): Boolean {
	  }
	
    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor? {
        TODO("Not yet implemented")
    }

    override fun getType(uri: Uri): String? {
        TODO("Not yet implemented")
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        TODO("Not yet implemented")
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
        TODO("Not yet implemented")
    }

    override fun update(
        uri: Uri,
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<out String>?
    ): Int {
        TODO("Not yet implemented")
    }
}












































































  
  

Content Providers are used to share data of one application with other application in Android. 
For example, the details of contacts stored in your mobile device with the help
of Contacts application is shared with other applications like WhatsApp, Facebook





  



CUSTOM CONTENT PROVIDER

To create a custom content provider

A provider must be declared in the manifest file for the application
e.g <provider><provider/>
Via the android:exported = true|false flag ,you can define if the provideris available for other applications or not .

Example of provide you could impliment in the manifest file

<provider
         android:name:=".contentprovider.MyContentProvider"
         android:exported = true>
</provider>
  
  
  CONTENT URI
Any URI which starts with content:// points to a reseourse which can be accessed via a provider.
A URI for a resourse may alllow to persform the basic CRUD operatoions (CREATE,READ,UPDATE,DELETE) on the resource via the content provider.

A provider allows applications to access data.The data can be stored in an SQLite database ,on the file system, in flat files or on a remote server.





