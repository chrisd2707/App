/**
 * 
 */
package com.leo1.App;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class gplaytest extends base{

	public static void main(String[] args) {

//Set the Desired Capabilities
		/*
		 * System.out.println("Attempting to execute first test"); DesiredCapabilities
		 * caps = new DesiredCapabilities(); caps.setCapability("deviceName",
		 * "OnePlus 6T"); caps.setCapability("udid", "869671045625561");
		 * caps.setCapability("platformName", "Android");//Give Device ID
		 * caps.setCapability("platformName", "Android");
		 * //caps.setCapability("platformVersion", "11.0");
		 * caps.setCapability("appPackage", "com.android.vending");
		 * caps.setCapability("appActivity",
		 * "com.google.android.finsky.activities.MainActivity");
		 * caps.setCapability("noReset", "true");
		 */

		System.out.println("Leo1 Card capabilities");
		DesiredCapabilities c = new DesiredCapabilities();
		c.setCapability("appium:deviceName", "OnePlus 6T");
		c.setCapability("appium:appId", "com.leo1_card");
		c.setCapability("platformName", "Android");
		c.setCapability("appium:automationName", "UIAutomator2");
		c.setCapability("appium:app", "C:\\Users\\User\\Desktop\\Programs\\app-release.apk");

//Instantiate Appium Driver

		try

		{
			AppiumDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), c);
			System.out.println("Attempting to ensure" + driver + "is working as expected");
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
}
