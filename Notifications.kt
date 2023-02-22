There are two types of notifications 
  Local Notification  -Ther are sent from the app localy
  Push notification   - These are sent from servers or third parties


In this tutoruial we are going to be focusing o Local Notifictions

First we have to create a notiv=fication channel
This enables the user to toggle between wanting to see the notifications or not
This is neccessary for all apps run on android version oreo and above

First we have to create our oification channel in a class that extends the Application() class
This is the class we have to include in our android manifest file   in the application tag e.g     <application
                                                                                                        android:name=".MyApp"/>


class MyApp :Application() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()

    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createNotificationChannel() {

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        val channel: NotificationChannel = NotificationChannel(
            CounterNot.COUNTER_CHANNEL_ID,"counter" , NotificationManager.IMPORTANCE_DEFAULT

        )
        channel.description = "Used for the increment of counter notifications"

        val notfy = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notfy.createNotificationChannel(channel)



    }

 **************** The explanationis here below ************************



----> Create a function to create the channel
      Check if the version of the android system is above oreo
      Create a notification channel using the NotificationChannel() method.

    private fun createNotificationChannel() {

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
            val channel = NotificationChannel()
    }
    
    
----> The NotificationChannel() method accepts theree parameters, The id of the custom made  channel id (,which we make in the class we are implimenting the notification)e.g CounterNotification.COUNTER_CHANNEL_ID
                                                                  The name that will be dispalyed when user goes to see the notification channel e.g "counter"
                                                                  The importance of the notification e.g NotificationManager.IMPORTANCE_DEFAULT  

  
  ----> Next we have to give a description of what our notification does when the user comes to check  out our notification channel
  
    @RequiresApi(Build.VERSION_CODES.O)
    private fun createNotificationChannel() {

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
            val channel = NotificationChannel(CounterNotification.COUNTER_CHANNEL_ID,"counter" ,NotificationManager.IMPORTANCE_DEFAULT)
            
            channel.description = "Used for the increment of counter notifications"
      //
      //Finally we have to tell the notification managerto  create this channel for the user to see

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(channel)  //We pass in our channel for the notification mager to create it.
  
  
  
  
  
  
  
  -----> Now we have to go to the class where we create our COUNTER_CHANNEL_ID and ,it is here where we will create our notification andimplimet its code logic
      
  
class CounterNotification(private val context: Context) {  // Here we pass in the context as an argument


    fun showNotification(counter:Int){  //Here we pass in a couter object that we want to be increamented
        val  notification = NotificationCompat.Builder(context, COUNTER_CHANNEL_ID) // Here we set the context we received from the calling function and the id of our notification
                                              .setSmallIcon(R.drawable.Play_Icon)   //Here we pass in a smaoll icon which is compalsory for all notifications
                                              .setContentTitle("Increment Counter") //Ths sets the title of the notification
                                              .setContentText("The counter is $counter") //This sets the content of the notification
                                            //.setStyle(                                  //This can be used to set the style of the notification ,but we won't use it now
                                           //             Notification.BigTextStyle
                                          //            )
                                              .setContentIntent(activityPendingIntent)  // When the user click on our notification,The pending actvity will be launched
           Now when a user click on our notifiction,we wold like to lauch our app. To do that we use intent
           var activityIntent = Intent(context,MainActivity::class.java)  //This will start the mainActivity class but notifications only accept pending intents
           var activityPendingIntent = PendingIntent.getActivity{
             
             context,
             1 ,  //This is the request code.It can be any number
             activityIntent,  //This is the intent that we  want to be started when the user clicks on the notification
             if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) PendingIntent.FLAG_IMMUTABLE else 0
           
           }                                
                                          
                                          
    }
  
  
  
  
  
  
  
  **************** Here is another form of excuting the above code *************
  
  
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.RemoteViews
import androidx.appcompat.app.AppCompatActivity
 
class MainActivity : AppCompatActivity() {
 
    // declaring variables
    lateinit var notificationManager: NotificationManager
    lateinit var notificationChannel: NotificationChannel
    lateinit var builder: Notification.Builder
    private val channelId = "i.apps.notifications"
    private val description = "Test notification"
 
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
 
        // accessing button
        val btn = findViewById<Button>(R.id.btn)
 
        // it is a class to notify the user of events that happen.
        // This is how you tell the user that something has happened in the
        // background.
        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
 
        // onClick listener for the button
        btn.setOnClickListener {
 
            // pendingIntent is an intent for future use i.e after
            // the notification is clicked, this intent will come into action
            val intent = Intent(this, afterNotification::class.java)
 
            // FLAG_UPDATE_CURRENT specifies that if a previous
            // PendingIntent already exists, then the current one
            // will update it with the latest intent
            // 0 is the request code, using it later with the
            // same method again will get back the same pending
            // intent for future reference
            // intent passed here is to our afterNotification class
            val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
 
            // RemoteViews are used to use the content of
            // some different layout apart from the current activity layout
            val contentView = RemoteViews(packageName, R.layout.activity_after_notification)
 
            // checking if android version is greater than oreo(API 26) or not
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                notificationChannel = NotificationChannel(channelId, description, NotificationManager.IMPORTANCE_HIGH)
                notificationChannel.enableLights(true)
                notificationChannel.lightColor = Color.GREEN
                notificationChannel.enableVibration(false)
                notificationManager.createNotificationChannel(notificationChannel)
 
                builder = Notification.Builder(this, channelId)
                        .setContent(contentView)
                        .setSmallIcon(R.drawable.ic_launcher_background)
                        .setLargeIcon(BitmapFactory.decodeResource(this.resources, R.drawable.ic_launcher_background))
                        .setContentIntent(pendingIntent)
            } else {
 
                builder = Notification.Builder(this)
                        .setContent(contentView)
                        .setSmallIcon(R.drawable.ic_launcher_background)
                        .setLargeIcon(BitmapFactory.decodeResource(this.resources, R.drawable.ic_launcher_background))
                        .setContentIntent(pendingIntent)
            }
            notificationManager.notify(1234, builder.build())
        }
    }
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  


