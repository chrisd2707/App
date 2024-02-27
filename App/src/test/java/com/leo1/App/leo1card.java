package com.leo1.App;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
//import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

public class leo1card extends base{

	public String otp, pin;
	// public AndroidDriver driver;

	@Test
	public void testingblock() {
		
		

		System.out.println("Leo1 Card capabilities");
		DesiredCapabilities c = new DesiredCapabilities();
		c.setCapability("appium:deviceName", "OnePlus 6T");
		c.setCapability("appium:appId", "com.leo1_card");
		c.setCapability("platformName", "Android");
		c.setCapability("appium:automationName", "UIAutomator2");
	//	c.setCapability("appium:BROWSER_NAME", "Chrome"); // Delete this line VIMP
		c.setCapability("appium:app", "C:\\Users\\User\\Desktop\\Programs\\app-release.apk");

		try

		{
			System.out.println("inside the try block");
			AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723"), c);
	//		driver.context("WEBVIEW_chrome"); // Delete this line VIMP
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			System.out.println("Attempting to ensure" + driver + "is working as expected");
			driver.findElement(By.xpath("//*[@text='Skip']")).click();
			// driver.findElement(By.xpath("//select[@id='usernamereg-month']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("//*[@text='Mobile Number']")).sendKeys("7506553677");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			// driver.findElement(By.className("//*[@class='android.view.ViewGroup']")).click();

			// (//*[@class='android.view.ViewGroup'])[21]
			// This clicks on the next arrow on Leo1 Card app
			driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup'])[21]")).click();
			System.out.println("Typing inside the block");
			// Scanner to input Otp and Pin in the App
			//Scanner obj = new Scanner(System.in);
			//System.out.println("Enter otp");
			//otp = obj.nextLine();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			// This block of code needs to be completed and corresponds to OTP entry
			//driver.findElement(By.xpath("//*[@class='android.widget.TextView'])[2]")).sendKeys("1234");
			//driver.findElement(By.xpath("(//*[@class='android.widget.TextView'])[2]")).click();
			driver.findElement(By.xpath("//*[@class='android.widget.TextView'])[3]")).click();
			System.out.println("Typing inside the block");
			Actions action = new Actions(driver);
			action.sendKeys("1234").perform();
			
			//new Actions(driver).sendKeys(otp).perform();

			// ----------------------

			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// Scanner pin=new Scanner(System.in);
			System.out.println("Enter pin");
			//pin = obj.nextLine();
			System.out.println("The value of otp is " + otp + "value of pin is:" + pin);
			// Attempting to open notifications panel in android
			// System.out.println("Attempting to open notification panel");
			// driver.startActivity(AppPackageName, AppActivityName);
			driver.openNotifications();
			//obj.close();

			//driver.quit();
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}

	}
	// @AfterTest
	// public void teardown() {
	// AndroidDriver driver;
	// driver.quit();
}

/*
 * @Test public void Openapp() { AppiumDriver<MobileElement> driver; leo1card
 * c=new leo1card(); DesiredCapabilities capabilities = new
 * DesiredCapabilities();
 * capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
 * "com.leo1_card");
 * capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"");
 * capabilities.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME,
 * "android");
 * 
 * driver=new AndroidDriver<MobileElement>(new
 * URL("http://127.0.0.1:4723/wd/hub"),capabilities); Thread.sleep(3000);
 * driver.quit(); }
 */

/*
 * @Test
 * 
 * DesiredCapabilities caps = new DesiredCapabilities();
 * caps.setCapability("deviceName", "OnePlus 6T"); caps.setCapability("udid",
 * "869671045625561"); caps.setCapability("platformName", "Android");//Give
 * Device ID caps.setCapability("platformName", "Android");
 * caps.setCapability("platformVersion", "11.0");
 * caps.setCapability("appPackage", "com.android.vending");
 * caps.setCapability("appActivity",
 * "com.google.android.finsky.activities.MainActivity");
 * caps.setCapability("noReset", "true");
 * 
 * //Instantiate Appium Driver
 * 
 * try { AppiumDriver driver = new AndroidDriver(new
 * URL("http://0.0.0.0:4723/wd/hub"), caps);
 * System.out.println("Attempting to ensure"+driver+"is working as expected"); }
 * catch (MalformedURLException e) { System.out.println(e.getMessage());
 * 
 * }
 */
