The intent filter tells the android system ,which activities or apps can handle which actions

e.g The below intent tells the android system that our app can handle sending actions,e.g sending message,sending email,sending tweet e.t.c
 <intent-filter>                                  |            
            <action android:name="android.intent.action.SEND"/>
  <intent-filter/>
  
  

Intent Resolution
When android is given an intent,the android system has to figure out which activty /app /activities can handle it.This process is known as intent resolution.

There are two types of intent.
Implicit Intent
Explicit Intent



Explicit intent
For explicit intents,intent resolutions are staright forward.

Implicit intents
When you use implicit intents ,the android systems uses the information in the intent to figure out which apps or components are able to receive it.
It does this by checking the intent filters in the manifest file of each app in the pphone
Intent filters specifie what intent each app/component can receive .


e.g
This intent filter specifies that this app can only send text or image data
This telllls the android system that this app can handle 
                                                          ___________
        <intent-filter>                                  |            
            <action android:name="android.intent.action.SEND"/>  --------->This tells the android system that this app can handle ACTION_SEND 
                <category android:name ="android.intent.category.DEFAULT"/> The intent filter must include a category of DEFAULT or it wont be able to receive implicit intents
                <data android:mimeType = "text/plain"/>  --------------> This tells the android sytem what data that this app can handle
//Our android app can send more than one type of data.                    
                <data android:mimeType = "image/*"/> --------------> This tells the android sytem what data that this app can handle

               
        </intent-filter>
  
  
  Since we will be reading user data,we need to ask user permission.
We ask for user permission inthe android manifest file.
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"></uses-permission>



Andoroid system compares the information in the intent with the information in the intent filter.
If a single match is found ,android starts the component and passes the intent.
If multiple matches are found ,the android system asks teh user to pick one.





















