There is alot of conditions here such as 
asking for permissions


Target Android 11 or lower
If your app targets Android 11 (API level 30) or lower, declare the following permissions in your apps manifest file:

BLUETOOTH is necessary to perform any Bluetooth classic or BLE communication, such as requesting a connection, accepting a connection, and transferring data.
ACCESS_FINE_LOCATION is necessary because, on Android 11 and lower, a Bluetooth scan could potentially be used to gather information about the location of the user.

If your app targets Android 9 (API level 28) or lower, you can declare the ACCESS_COARSE_LOCATION permission instead of the ACCESS_FINE_LOCATION permission.


If your app targets Android 12 (API level 31) or higher, declare the following permissions in your apps manifest file:

If your app looks for Bluetooth devices, such as BLE peripherals, declare the BLUETOOTH_SCAN permission.
If your app makes the current device discoverable to other Bluetooth devices, declare the BLUETOOTH_ADVERTISE permission.
If your app communicates with already-paired Bluetooth devices, declare the BLUETOOTH_CONNECT permission.
For your legacy Bluetooth-related permission declarations, set android:maxSdkVersion to 30. This app compatibility step helps the system grant your app only the Bluetooth permissions that it needs when installed on devices that run Android 12 or higher.
If your app uses Bluetooth scan results to derive physical location, declare the ACCESS_FINE_LOCATION permission. Otherwise, you can strongly assert that your app doesnt derive physical location.
The BLUETOOTH_ADVERTISE, BLUETOOTH_CONNECT, and BLUETOOTH_SCAN permissions are runtime permissions. Therefore, you must explicitly request user approval in your app before you can look for Bluetooth devices, make a device discoverable to other devices, or communicate with already-paired Bluetooth devices.
When your app requests at least one of these permissions, the system prompts the user to allow your app to access Nearby devices, as shown in figure 1.

The following code snippet demonstrates how to declare Bluetooth-related permissions in your app if it targets Android 12 or higher:

<manifest>
    <!-- Request legacy Bluetooth permissions on older devices. -->
    <uses-permission android:name="android.permission.BLUETOOTH"
                     android:maxSdkVersion="30" />
    <uses-permission android:name="android.permission.BLUETOOTH_ADMIN"
                     android:maxSdkVersion="30" />

    <!-- Needed only if your app looks for Bluetooth devices.
         If your app doesn't use Bluetooth scan results to derive physical
         location information, you can strongly assert that your app
         doesn't derive physical location. -->
    <uses-permission android:name="android.permission.BLUETOOTH_SCAN" />

    <!-- Needed only if your app makes the device discoverable to Bluetooth
         devices. -->
    <uses-permission android:name="android.permission.BLUETOOTH_ADVERTISE" />

    <!-- Needed only if your app communicates with already-paired Bluetooth
         devices. -->
    <uses-permission android:name="android.permission.BLUETOOTH_CONNECT" />

    <!-- Needed only if your app uses Bluetooth scan results to derive physical location. -->
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
    ...
</manifest>
  
  
  
  
  
  
  
  
  
 Using the Bluetooth APIs, an app can perform the following:

Scan for other Bluetooth devices.
Query the local Bluetooth adapter for paired Bluetooth devices.
Establish RFCOMM channels.
Connect to other devices through service discovery.
Transfer data to and from other devices.
Manage multiple connections.
  

         THIS TUTORIAL WILL COVE THE FOLOWING

Setting up Bluetooth.
Find nearby Bluetooth devices, either devices that are already paired or new ones.
Connect to a Bluetooth device.
Transfer data with the connected device.
  

The Blue tooth api in andrid provides us API method which we can use  
e.g BluetoothDevice(),BluetoothSocket(),BluetoothAdapter()
.Find out more here on the offical website about this methods https://developer.android.com/guide/topics/connectivity/bluetooth.html

e.g BluetoothAdapter
Represents the local Bluetooth adapter (Bluetooth radio). The BluetoothAdapter is the entry-point for all Bluetooth interaction. 
Using this, you can discover other Bluetooth devices, query a list of bonded (paired) devices, 
instantiate a BluetoothDevice using a known MAC address, and create a BluetoothServerSocket to listen for communications from other devices.



Using the BluetoothAdapter, you can find remote Bluetooth devices either through device discovery or by querying the list of paired devices.
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
