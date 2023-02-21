The intent filter tells the android system ,which activities or apps can handle which actions

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
This intent filter specifies that this app can only send ,text or image data
This telllls the android system that this app can handle 
                                                          ___________
        <intent-filter>                                  |            
            <action android:name="android.intent.action.SEND"/>  --------->This tells the android system that this app can handle ACTION_SEND 
                <category android:name ="android.intent.category.DEFAULT"/> The intent filter must include a category of DEFAULT or it wont be able to receive implicit intents
                <data android:mimeType = "text/plain"/>                    
                <data android:mimeType = "image/*"/> --------------> This tells the android sytem what data that this app can handle

               
        </intent-filter>

Andoroid system compares the information in the intent with the information in the intent filter.
If a single match is found ,android starts the component and passes the intent.
If multiple matches are found ,the android system asks teh user to pick one.




















