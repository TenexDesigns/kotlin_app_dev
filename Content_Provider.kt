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

      content://authority/optionalPath/optionalID
         
       val PROVIDER_NAME = "any name"
     e.g val URL = "content://$PROVIDER_NAME/users"

DETAILES OF DIFFERY PARTS OF THE CONTENT URI

--> content:// – Mandatory part of the URI as it represents that the given URI is a Content URI.
--> authority – Signifies the name/string  of the content provider like contacts, browser, etc. This part must be unique for every content provider.
--> optionalPath – Specifies the type of data provided by the content provider. It is essential as this part helps content providers to support different types of data that are not related to each other like audio and video files.
--> optionalID – It is a numeric value that is used when there is a need to access a particular record.

Note --> If an ID is mentioned in a URI then it is an id-based URI otherwise a directory-based URI.


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





