Broad cast recivers

Android apps can send or receive broad cast messages from the android system  and other apps.
These broadcasters are sent when an event  of intersrest occurs .
e.g When the system boots up,When the device starts 
Apps can also snd custom broadcasts e.g to notify other apps of something they may be intrested in .e.g data that has been downloaded


There are following two important steps to make BroadcastReceiver works for the system broadcasted intents −

Creating the Broadcast Receiver.

Registering Broadcast Receiver





Creating the Broadcast Receiver.


class Receiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val plane = intent?.getBooleanExtra("state", false) ?: return
            if (plane ) {
                Toast.makeText(context, "Air plane mode enabled", Toast.LENGTH_LONG).show()

            } else {
                Toast.makeText(context, "Air plane mode disabled", Toast.LENGTH_LONG).show()


            }

        }



}

To receive a broadcast from the system or other app , we need to make a receiver class .
The receiver class extends the  BroadcastReceiver() class.
Then we need to overide the onreceive function .
                   override fun onReceive(context: Context?, intent: Intent?)
This onreceive function is  what gets the broadcastred event as an intent
                         override fun onReceive(context: Context?, intent: Intent?)
                                                                   ---------------
Since in this example we are responding to the air plane mode change ,we use the intent on the onREceive function to get the boolean value
                        val plane = intent?.getBooleanExtra("state", false)    ?: return
           But since the value of the intent?  is nullable we need to add this null checher ?: .This will excute the code on the left and if it is null it will return (to the caller function) out of the
           receive function and not excute the rest of the code in the receive function
          If the code on the left is excute and not null i.e either true or false then the code in the rest of the receive function will be excuted

Then we can use the value in the plane,if true or false to display a toast message.





Registering Broadcast Receiver

There are two ways to regester receivers i.e staticaly in the Android manifest file and Dynamicay in the activit file.
As of android api 26, the only possible and recommended way is the dynamicallly way.We discuss that way here bellow.



Now ,we regetster the receiver in the activity ,it can be the main activity
Now ,we need to create an object of the receiver 
private lateinit var  receiver: Receiver              | or        private lateinit var  receiver = Receiver()
receiver = Receiver()                                 | or

Now we need to filter the intents (intent is an event of intrest we want to respond to e.g device startint)
To filter the intents we ndde to use the IntentFlter method
In the intent filter method we use the intent class to choose an intent we would like to respond to
The intent class (Intent.) has many system generated intents we can respond to, e.g
             Intent.ACTION_AIRPLANE_MODE_CHANGED
             Intent.ACTION_BATTERY_LOW
             Intent.ACTION_SCREEN_OFF
Now we need to regetser the receiver we use the registerReceiver(receiver,it,) function which takes the receiver and the intent filter as arguments .We use the also scope function to prevent memory leaks
The scope functions are used on objects .Within the also function ,the object is refured to using it.
In the regesterReceiver function wepass the receiver and the intent filter (refered to using it) are arguments.
Finally after the app activity is being stoped we use the onStop metthod to unregester the receiver using the Unregster function and passing in the receiver as an afgument.


class MainActivity:AppCompatActivity() {
    private lateinit var  receiver: Receiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        receiver = Receiver()


        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also{
            registerReceiver(receiver,it,)
        }
        fun onStop(){
            super.onStop()
            unregisterReceiver(receiver)

        }









