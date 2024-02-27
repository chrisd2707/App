package com.leo1.App;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.time.Duration;
//import java.util.Scanner;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

//import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
//import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.remote.MobileCapabilityType;


import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

//import connection. src/test/java/connection/FurtherOps_DBqueries.java;
import connection.FurtherOps_DBqueries;



public class leo1cardrework {
	public String otp, pin;
	public WebElement w;
	public AndroidDriver driver;

	@Test
	public void testingblock() throws IOException, InterruptedException, ClassNotFoundException, SQLException {

		System.out.println("Leo1 Card capabilities");
		DesiredCapabilities c = new DesiredCapabilities();
		//c.setCapability("enforceXPath1","true"); // Trial capability check, needs to be checked
		//  SetCapabilities below	
		c.setCapability("appium:deviceName", "OnePlus 6T");
		c.setCapability("appium:appId", "com.leo1_card");
		c.setCapability("platformName", "Android");
		c.setCapability("appium:automationName", "UIAutomator2");
		c.setCapability("unicodeKeyboard","false");
		c.setCapability("resetKeyboard","false");
	//	c.setCapability("appium:app", "C:\\Users\\User\\Desktop\\Programs\\app-release.apk");
		c.setCapability("appium:app", "C:\\Users\\User\\Desktop\\Programs\\app-release-preprod.apk");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723"), c);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//	System.out.println("Attempting to ensure" + driver + "is working as expected");
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.setSetting("enforceXpath1",true); 
		driver.findElement(By.xpath("//*[@text='Skip']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//driver.findElement(By.xpath("//*[@text='Mobile Number']")).sendKeys("7506553677");
		/* The section below is verifying for long-click gestures
		 * 
		 * 
		 */

		// Java
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
				"x",309,"y",1123,"duration",500));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(500);
		System.out.println("Long Clicked");
		System.out.println(driver.getCapabilities());
		//driver.setSetting()
		/*
		 * 
		 * 
		 */
		// The line below was added to check if Xpath1 issue is resolved
		driver.findElement(By.xpath("//*[contains(text(),'Sign Up')]")).click();
		WebElement v=driver.findElement(By.xpath("//*[@text='Mobile Number']"));
		v.sendKeys("7506553677");


		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x",888,"y",1115));
		// UNCOMMENT THE TWO LINES BELOW IF THIS RUN DOES NOT WORK
		//((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
		//    "x",888,"y",1115,"duration",100));
		//driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup'])[21]")).click();
		//This needs to be uncommented once code is working fine
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		Thread.sleep(10000);
		//driver.openNotifications();
		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x",106,"y",352));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
				"x",258,"y",920,"duration",1000));
		Thread.sleep(2000);

		// DELETE THE TWO LINES BELOW
		//WebElement w=driver.findElement(By.xpath("//*[@class='android.widget.TextView'])[2]"));
		//Clicks on the Verify OTP text box as expected 2 lines below -------CORRECT
		//WebElement wi=driver.findElement(By.xpath("//*[@bounds='[240,887][279,964]']"));
		//wi.click();
		//System.out.println("Keyboard is clicked at the textbox");
		//wi.sendKeys("1"); //sendKeys("5376");
		//driver.
		//w.sendKeys("5421");
		// //*[@bounds='[240,887][279,964]']
		//		w.sendKeys("1234");
		//		driver.quit();
		//System.out.println(((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
		//		"x",258,"y",920)).getClass()+" here it is");

		

		// Click on paste
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x",156,"y",804));


		// Attempting a sendkeys execution below
		//WebElement w=driver.findElement(By.xpath("//*[@class='android.widget.TextView'])[2]"));
		//w.sendKeys("1234");
		//Click on arrow to the next screen
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x",939,"y",928));

		System.out.println("You are on PIN Verification screen");
		Thread.sleep(2000);
		//PIN Verification pin digits being entered after clicking on the Verify Pin Digit Entry box
		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x",258,"y",920));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x",262,"y",1624));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x",262,"y",1624));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x",262,"y",1624));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x",262,"y",1624));

		/*((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x",419,"y",923));
		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x",591,"y",923));
		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x",747,"y",923));*/
		//Arrow button being clicked
		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x",947,"y",923));
		Thread.sleep(2000);
		System.out.println("You are in the main screen");
		
		FurtherOps_DBqueries obj2= new FurtherOps_DBqueries();
		int v1=obj2.realtime_otp();
		int d[]=obj2.individual_digits(v1); //obj1.individual_digits(realtime_otp())
		for (int i=0;i<4;i++) {

			System.out.println( "This is the copied function"+"  "+d[i]);

		}
		/*Copy and paste OTP in the screen capture below
		 */
		//((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
		//	    "x",113,"y",348,"duration",50));

		//System.out.println("Copied again");
		/*((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
				"x",258,"y",920,"duration",1000));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
				"x",254,"y",1624,"duration",1000));

		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
				"x",262,"y",927,"duration",10000));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
				"x",935,"y",935,"duration",100));


		/*
		 * 
		 */

		//WebElement w=driver.findElement(By.xpath("//*[@class='android.widget.TextView'])[2]"));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//w.sendKeys("1234");

		//System.out.println("line 71");
		//driver.executeScript("mobile: clickGesture", ImmutableMap.of(
		//    "elementId", ((RemoteWebElement) w).getId()));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript  (w.click(),button);
		// js.executeScript("arguments[0].click();", w);

		//js.executeScript("$(’#fooElement’).val(‘some text’)");
		//js.executeScript("alert('Welcome to app automation');"); 
		//TouchAction action = new TouchAction(driver); action.press(10, 10);
		//await driver.performActions();

		//TouchAction tc=newTouchAction();





	}}
