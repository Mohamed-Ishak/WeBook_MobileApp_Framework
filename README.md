# WeBook_MobileApp_Framework
Small Script for WeBook android application using Appium TestNG and Java

============================================

Environment Setup I have used different Technologies in building the Mobile framework and Isntall the following on my local machine

1- JDK 11
2- Node Js latest version
3- Android Studio IDE
4- Build an Emulator
5- Appium Server
6- Appim Inspector and UiAutomatorViewr to inspect the elements
7- Eclipse IDE and install some plugins like (TestNG ) From it's Market Place
8- Apache Maven 3.9.5
============================================

Define Some Envrioment Variables like JAVA_HOME , ANDROID_HOME , NODE_HOME define paths for adb , android , emulator , apkanalyzer from the SDK folder
Check all the necessary dependencies for installation using appium-doctor command

So you can Start Execute WeBookAndroidApp.java  class to run the script but it have prerequisites 
   • Appium server must be up and running so run appium in cmd 
   • Android device must be connected so you can use emulator or real device it doesn't matter howver 
   change the configuration in the desired capabilites as per device(platformVersion, platformName)
