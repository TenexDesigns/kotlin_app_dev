 /*
 What is a service
 
 
 Service  is a component that operates in the background without direct user input.
       A Service is no connected to the life time of an activity or fragment since it lacks a user interface 
 Services are used for processes that are repeated and may take a long time to complete.
      e.g Internet downloads , cheching for data, data processing content providers.
 Services have a greater priority than idle or invisible activity.
       The android systen is less likely to kill the services.How ever if the system does kill them e.g due to lack of enough resources
       The service can be programmned to restart again if the resources are available again.
       
       Types of services 
       
       Foreground services - Services that notify the user about its ongoing operation.User can interact with the service by the notification provider about ongoing task such as downloading file
       Background services
       Bound services
       
       
 The Life cycle of android services 
 In android ,Service has only two possible  life cycle paths to be excuted 
     1. Started service  (Unbounded service )
     2. Bound service
     
     Started Service
     
     A service is called /categorised as  started when an application component, such as an activity, starts it by calling startService() method.
     Once started, a service can run in the background indefinitely, even if the component that started it is destroyed.
     Two options are available to stio the excution of this service.
          1. BY calling stopService() method. 
          2. The service can stop itself by calling the stopSelf() method
          
     Bounded Service
     A service is called /categorised as  bound when an application component binds itself with the service by calling bindService(). 
     A bound service offers a client-server interface betwwen the service and the application component it is bound to.
     The service can be treated as a server and the application component it is bound to as the client.
     The application component can send request and get resoults from the service e.t.c 
     To stop the excution of this service all components must unbind themselves from the service by using the unbindService() method. 
     
     
     
     Example of a service
     
     Bellow is a service that will play the default rington of an android phone . The acticity has two buttons ,Start and Stop , to start and stop the service
     The MainActvity where the buttons are is where you start the service.
     */
     
                                   MAinActivity File
                                   
 class MainActivity:AppCompatActivity() {
 
 override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
                                   
 ***       var start = findViewById<Button>(R.id.start)
 ***       var stop = findViewById<Button>(R.id.stop)

***        start.setOnClickListener {
                startService(Intent(this@MainActivity,MyService::class.java))               // focus here mostly --- This is where the service is started
        }

***        stop.setOnClickListener {
                 stopService(Intent(this@MainActivity,MyService::class.java))                 // focus here mostly --- This is where the service is stopped
        }




                                  The service
         To create a service ,go to a separate file and create a class file.
         This class file will extend the Service() class.
  
        Here we use the MediaPALyer class to play and stop the ringtone
                                  
                                  
 class MyService: Service() {
    private lateinit var player: MediaPlayer

    override fun onStartCommand(init:Intent, flag:Int, startId:Int):Int {
        player = MediaPlayer.create(this,Settings.System.DEFAULT_RINGTONE_URI)
        player.isLooping
        player.start()
        return START_STICKY


    }

    override fun onDestroy() {                            // This is what method is called when the service is destroyed
        super.onDestroy()
        player.stop()
    }





    override fun onBind(intent: Intent?): IBinder? {                // It is compulsory to overide this function in all servicess
                                                                    // It is necessay if other components want to connect with this service
        return null                                                 // How ever if you have no intention of connectiong to other components e.g in the case of a stared service, then you can just return null.

    }


}
     Intent service                                                                         Service
     Run on a separate thread automaticaly ,so it wont block the main thread                Runs on main thread by default,so allways start its excution on a separate thread
     It does'nt support multithreading.                                                     It supports multi threading
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
        
