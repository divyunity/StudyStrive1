# Installation Instructions

## Running the StudyStrive App on Your Android Phone

To build and install the StudyStrive app on your Android phone, follow these steps:

### Method 1: Using Android Studio (Recommended)

1. **Install Android Studio**
   - Download and install Android Studio from [https://developer.android.com/studio](https://developer.android.com/studio)

2. **Open the Project**
   - Open Android Studio
   - Select "Open an Existing Project"
   - Navigate to the StudyStrive project folder and select it
   - Wait for the project to sync and build

3. **Connect Your Android Device**
   - Enable "Developer Options" on your Android device:
     - Go to Settings > About Phone
     - Tap "Build Number" 7 times to enable developer options
   - Enable "USB Debugging" in Developer Options
   - Connect your phone to your computer with a USB cable
   - Allow USB debugging when prompted on your phone

4. **Run the App**
   - In Android Studio, click the "Run" button (green triangle)
   - Select your connected device from the list
   - Wait for the app to build and install on your device

### Method 2: Generate APK and Install Manually

1. **Generate APK**
   - Open the project in Android Studio
   - Select Build > Build Bundle(s) / APK(s) > Build APK(s)
   - Wait for the build to finish
   - Click on the notification to locate the APK file

2. **Transfer and Install the APK**
   - Connect your phone to your computer
   - Copy the APK file (usually located at app/build/outputs/apk/debug/app-debug.apk) to your phone
   - On your phone, use a file manager to navigate to the APK file
   - Tap the APK file to install it
   - You may need to enable installation from "Unknown Sources" in your settings

### Troubleshooting

If you encounter any issues:

1. Make sure you have the latest version of Android Studio
2. Verify that USB debugging is enabled on your device
3. Try using a different USB cable or port
4. Check that you have the required Android SDK versions installed in Android Studio
5. Ensure your phone allows installation from unknown sources

### System Requirements

- Android device running Android 8.0 (API level 26) or higher
- At least 100 MB of free storage space on your device
 