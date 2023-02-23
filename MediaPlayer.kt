
class MainActivity:AppCompatActivity() {


    private  var mp:MediaPlayer? = null   //Here we set the mediaplayer to null so as to avoid the null pointer exception
    private var song = R.raw.audio        //Here we initialize sone of the songs we put in our raw file ..How ever .If you want you can read users exterstorage and play the songs by putting them in array list.
    private var sia = R.raw.sia


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        
        
        var play :Button = findViewById(R.id.play)          //These are the button s to controll the play functionality
        var pause :Button = findViewById(R.id.pause)
        var stop :Button = findViewById(R.id.stop)





         play.setOnClickListener {
             if(mp==null){   //Here we check if the media player is null and if it is we create an instance of the media player 
                 mp = MediaPlayer.create(this,song)   //Here we pass the context and the ong we want to be palyed.We can use an array to randomly select a song
             }
             mp?.start()   //Here we start the song


         }

        pause.setOnClickListener {
            if(mp != null){    //Here we check if the player is null
                mp?.pause()   // Here we pause the song
            }
        }

        stop.setOnClickListener {
            if(mp != null){         //Here we check if the player is null
                mp?.stop()      // Here we reset and release the media player so that it does not consume any more memmory
                mp?.reset()
                mp?.release()
                mp = null   //Here we revert the mp player to null to prevent memory consumption
            }
        }







































































