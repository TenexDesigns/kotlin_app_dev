INTENT

Intent- Is an intention to do something. E.g navigate from one activity to another,send data,make a phone call e.t.c

In android-->
Intent is a messaging object used to request an action from another app component.
Intents facilitate communication between different components.

Intents are of two types
----> Implict intent
----> Explicit implicit

Explicit intent 
---> An explicit intent communicates between two activities inside the same application or if you want to jump from one activity to another activity within the same application.

Implict intent
---> Communicates between two activities of different application.
e.g Clicking a link in whats up,will start the browser activit in a different appp ,e.g chrome.If ther are multiple browser apps in the phone, we ca use the Intent.createChooser() object to ask the user tochooses their prefered app.


Intents are Used to

----> Start an activity
----> Start a service(e.g open gmail,web browser,calling)
----> Pass data in the same applicatio or diffferent application 
----> Intents are also used for broadcating a message (e.g Low phone battery,airplane mode,screen of,no internet )If battery is low app receive intent/message from android system.This communication between the android apps and the android system is callied out throug=ght intents.Apps receive therse intents throuch broad cast receivers.



Explicit intents

1.Used to jump from one activity to another within the same application.

Tod do that we do the following
Since our intention is to move to a second activity.

We use the class of Intent()                                                                                                                                                                                                ------------This here               
Since we are moving from one activity to another ,we have to pass in our current context and the address of the second actvity.The second activity address also contains the concept of Kotlin reflection e.g SecondActivity::Class.java
Then use StartAcity() and pass in the intent as a parameter .This is enough to navigate to  the next activity.

        button.setOnClickListener {
            var intent = Intent(this,secondActivity::class.java)
            startActivity(intent)

        }


2. Used to pass data from one activity to another within the same app.




















Android Intent is the message that is passed between components such as activities, content providers, broadcast receivers, services etc.
It is generally used with startActivity() method to invoke activity, broadcast receivers etc.

Android intents are mainly used to:

Start an activity
Start the service  e.g(Open web brower,
                       Pass data in the same application or a different application
Broadcast a message
                       
Display a list of contacts
Dial a phone call
Display a web page



Types of Intent
Implict 
Explicit 



Explicit iNtent -is used for communication within the same app
Implict is used for communication with other apps.
                       
                       
                       
                       
Since our intention is to move to as second activity.
We use the class of Intent()
Since we are moving from one activity to another ,we have to pass in our current context and the address of the second actvity.This address also contains theconcept of Kotlin reflection e.g SecondActivity::Class.java
Then use StartAcity() and pass in the intent as a parameter .This is enough to navigate to  the next activity.

        button.setOnClickListener {
            var intent = Intent(this,secondActivity::class.java)
            startActivity(intent)

        }
        





















