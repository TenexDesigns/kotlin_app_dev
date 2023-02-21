Intent- Is an intention to do something. E.g navigate from one activity to another.

Since our intention is to move to as second activity.
We use the class of Intent()
Since we are moving from one activity to another ,we have to pass in our current context and the address of the second actvity.This address also contains theconcept of Kotlin reflection e.g SecondActivity::Class.java
Then use StartAcity() and pass in the intent as a parameter .This is enough to navigate to  the next activity.

        button.setOnClickListener {
            var intent = Intent(this,secondActivity::class.java)
            startActivity(intent)

        }
        
        
Android Intent is the message that is passed between components such as activities, content providers, broadcast receivers, services etc.
It is generally used with startActivity() method to invoke activity, broadcast receivers etc.

Android intents are mainly used to:

Start the service
Launch an activity
Display a web page
Display a list of contacts
Broadcast a message
Dial a phone call


Types of Intent
Implict 
Explicit 



Explicit iNtent -is used for communication within the same app
Implict is used for communication with other apps.






















