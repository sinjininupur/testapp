package  com.qmetry.TestBPApp;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;


public class basics {
	   public static final String USERNAME = "jininupur";
	    public static final String ACCESS_KEY = "5829127d-7d6b-4696-9352-07a5be923cd4";
	    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";


public AndroidDriver setcapabilities(String devicename,String browsername) throws InterruptedException, IOException {
	

	AndroidDriver driver = null;
    DesiredCapabilities cap=new DesiredCapabilities("appWaitActivity",null,null);


   	/* capabilities.setCapability("automationName", "Appium");
		 capabilities.setCapability("platformVersion", "6.0.1"); 
		 capabilities.setCapability("deviceName","j1");
		 capabilities.setCapability("platformName","Android");	 
		 
*/		
    
   /* cap.setCapability("platform", "Windows 8.1");
    cap.setCapability("version", "latest");
    cap.setCapability("browserName", "chrome");*/
  
	   if (devicename.equals("Windows 8.1"))
	    {
		   	   cap.setCapability("automationName", "Appium");
	    	   cap.setCapability("platform", "Windows 8.1");
	           cap.setCapability("version", "latest");
	           cap.setCapability("browserName", "chrome");
	    }
	   else
	   {
       
	 cap.setCapability("automationName", "Appium");
	 cap.setCapability("browserName", browsername);
	 cap.setCapability("platformVersion", "7.1"); 
	 cap.setCapability("deviceName",devicename);
	 cap.setCapability("platformName","Android");
	   }
	 //cap.setCapability("appPackage", "com.android.chrome");
	 
	  driver=new AndroidDriver(new URL(URL),cap );
	   
   /* "appiumVersion": "1.5.3"
    	"browserName": "Safari"
    		"deviceName": "Google Nexus 7 HD Emulator"
    			"platformVersion": "9.1"
    				"platformName": "Android"
    					"app": "sauce-storage:my_app.zip"
    						
    						"appPackage": "com.example.android.myApp, com.android.settings"*/
    /*  cap.setCapability("appPackage", "com.android.chrome");
		 
		
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "j1");
			
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
			 driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
 */
		 System.out.println("Device Found");
		
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
		 System.out.println("Appium SetUp for Android is successful and Appium Driver is launched successfully");
		  
	/*	 driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		     System.out.println("preference clicked");
		     driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		     driver.findElementById("android:id/checkbox").click();
		     driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		     driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		     driver.findElementsByClassName("android.widget.Button").get(1).click();*/
		 
	return driver;
	}

}
