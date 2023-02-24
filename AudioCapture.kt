To start recording audion in your app
You have to first ak for use permssion

Put the necessary permissions in the android manifest file

<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.RECORD_AUDIO"/>
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
  
  
  Now In the activity file you have to give the alert to ask the user for the permission to record if the user has not given the permission
To check if the user has given permission or not we use ContextCompat.checkSelfPermission() whicj returns PERMISSION_GRANTED or PERMISSION_DENIED depending on if user has given permission or not. ,We pass in the context and the permssion to be checked as parameters
The alert is given by the ActivityCompat.requestPermissions() method ,which takes in the context and the permissions to be requested from the user and the custom made request code.


if (ContextCompat.checkSelfPermission(applicationContext,android.Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) 
         {
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.RECORD_AUDIO,android.Manifest.permission.WRITE_EXTERNAL_STORAGE), 444 )
            
         }
         
    Now we go to the audio capturing     
         
Android has a built in microphone through which you can capture audio and store it , or play it in your phone.
There are many ways to do that but the most common way is through MediaRecorder class.

Android provides MediaRecorder class to record audio or video. 
In order to use MediaRecorder class ,you will first create an instance of MediaRecorder class and pass in the context. Its syntax is given below.



  var myAudioRecorder:MediaRecorder = MediaRecorder(applicationContext)
  
  
  
  Secondly we have to define a stoarege path to store our recording

var path = Environment.getExternalStorageDirectory().toString() + "/myrec.3gp"


Now we move to the start stop and play recording buttons

In the start button you will have to set the source , output and encoding format and output file path. Their syntax is given below.
After specifying the audio source and format and its output file, we can then call the two basic methods prepare and start to start recording the audio.   i.e the  .prepare() and .start() method 


          startButton.setOnClickListener {
                myAudioRecorder.setAudioSource(MediaRecorder.AudioSource.MIC)
                myAudioRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP)
                myAudioRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB)
                myAudioRecorder.setOutputFile(path)
                myAudioRecorder.prepare()
                myAudioRecorder.start()  
          }

          
          Now to stop the audio recording
           // Stop recordinng

            stopButton.setOnClickListener {
                myAudioRecorder.stop()
            }
            
            
            Now to play the audio recording
Create an instance of the media player classs
Now in the play button  set the source of the file to be played.
This path has to be the same as the one we set above to  store the audio recorded
Then call the prepare() and start() method of the MediapLayer lass


            //Play recording
            var myPlayer = MediaPlayer()
            
            playButton.setOnClickListner{
                    myPlayer.setDataSource(path)
                    myPLayer.prepare()
                    myPlayer.start()
            }



  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
