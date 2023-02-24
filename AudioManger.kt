Audio Manager is a class present in Android that helps manage the audio of the specific android device. 
The name of the class audio manager itself tells us that it is used to manage audio.
The Audio Manager class is used to change the audio mode in different modes such as normal, silent, and vibrate mode. 







package com.gtappdevelopers.kotlingfgproject

import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.media.AudioManager
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

	// on below line we are creating variable for
	// text view, image button and audio manager.
	lateinit var currentModeTV: TextView
	lateinit var vibrateIB: ImageButton
	lateinit var silentIB: ImageButton
	lateinit var ringerIB: ImageButton
	lateinit var audioManager: AudioManager
	
	// on below line we are creating an integer
	// variable to get the current audio mode.
	var currentAudioMode = 0

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		// on below line we are initializing
		// image buttons and text view.
		vibrateIB = findViewById(R.id.idIBVibrateMode)
		silentIB = findViewById(R.id.idIBSilentMode)
		ringerIB = findViewById(R.id.idIBRingtoneMode)
		currentModeTV = findViewById(R.id.idTVCurrentMode)
		
		// on below line we are initializing our audio manager.
		audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
		
		// on below line we are getting our current ring tone mode.
		currentAudioMode = audioManager.ringerMode;

		// on below line we are setting text view for the current mode.
		when (currentAudioMode) {
			// on below line we are setting text view as ringer mode for normal ringer mode.
			AudioManager.RINGER_MODE_NORMAL -> currentModeTV.setText("Ringer Mode")
			
			// on below line we are setting silent mode for current silent mode.
			AudioManager.RINGER_MODE_SILENT -> currentModeTV.setText("Silent Mode")
			
			// on below line we are setting vibrate mode for current vibrate mode.
			AudioManager.RINGER_MODE_VIBRATE -> currentModeTV.setText("Vibrate Mode")
			
			// below code will be called when the current mode is not able to detect
			else -> currentModeTV.setText("Fail to get mode")
		}

		// on below line we are setting on click
		// listener for our silent image button.
		silentIB.setOnClickListener {
			// on below line we are initializing our notification manager.
			val notificationManager: NotificationManager =
				getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
			
			// on below line we are creating a variable for intent.
			val intent =
				if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M && !notificationManager.isNotificationPolicyAccessGranted) {
					// if notification policy is not granted we
					// are calling this intent on below line.
					
					Intent(Settings.ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS)
					// on below line we are simply calling start activity
					// to start the activity.
					startActivity(intent)
				} else {
					Log.e("tag", "Audio Manager not accessible..")
					// on below line we are simply updating audio manager
					// ringer mode to silent.
					audioManager.ringerMode = AudioManager.RINGER_MODE_SILENT
					
					// on below line we are displaying a simple toast message.
					Toast.makeText(this@MainActivity, "Silent Mode activated..", Toast.LENGTH_SHORT)
						.show()
					
					// on below line we are setting current mode text as silent mode.
					currentModeTV.text = "Silent Mode Activated.."
				}
		}

		// on below line we are adding on click listener for vibrate image button.
		vibrateIB.setOnClickListener {
			// on below line we are setting ringer mode for audio manager
			// as ringer mode vibrate
			audioManager.ringerMode = AudioManager.RINGER_MODE_VIBRATE
			
			// on below line we are displaying a toast message as vibrate mode activated.
			Toast.makeText(this@MainActivity, "Vibrate Mode activated..", Toast.LENGTH_SHORT).show()
			
			// on below line we are setting current mode
			// text view to vibrate mode activated.
			currentModeTV.text = "Vibrate Mode Activated.."
		}

		// on below line we are adding on click listener
		// for our ringer image button.
		ringerIB.setOnClickListener {
			// on below line we are setting ringer mode as normal ringer mode.
			audioManager.ringerMode = AudioManager.RINGER_MODE_NORMAL
			
			// on below line we are displaying a toast message and
			// setting current mode text view.
			Toast.makeText(this@MainActivity, "Ringer Mode activated..", Toast.LENGTH_SHORT).show()
			currentModeTV.text = "Ringtone Mode Activated.."
		}

	}
}
