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



public class leo1methods_test {
	public String otp, pin;
	public WebElement w;
	public AndroidDriver driver;


	public void longPressAction(String x, String y, String d) {
		// Method template

		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
				"x",309,"y",1123,"duration",500));
	}

	public void clickAction(String x, String y) {
		// Method template
		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x",x,"y",y));
	}

	public void longclick(String x, String y, String d) {

	}
	@Test
	public void testingblock() throws IOException, InterruptedException, ClassNotFoundException, SQLException {

		System.out.println("Leo1 Card capabilities");
		DesiredCapabilities c = new DesiredCapabilities();
		//  SetCapabilities below	
		c.setCapability("appium:deviceName", "OnePlus 6T");
		c.setCapability("appium:appId", "com.leo1_card");
		c.setCapability("platformName", "Android");
		c.setCapability("appium:automationName", "UIAutomator2");
		c.setCapability("unicodeKeyboard","false");
		c.setCapability("resetKeyboard","false");
		c.setCapability("appium:app", "C:\\Users\\User\\Desktop\\Programs\\app-release.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723"), c);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//	System.out.println("Attempting to ensure" + driver + "is working as expected");
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@text='Skip']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
				"x",309,"y",1123,"duration",500));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("Long Clicked");


		WebElement v=driver.findElement(By.xpath("//*[@text='Mobile Number']"));
		v.sendKeys("7506553677");

		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x",888,"y",1115));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		Thread.sleep(10000);
		//driver.openNotifications();
		//	((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
		//			"x",106,"y",352));
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//	Thread.sleep(2000);
		//	((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
		//			"x",258,"y",920,"duration",1000));
		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x",258,"y",920));
		//	Thread.sleep(2000);


		// INSERTING NEW CODE HERE 
		Thread.sleep(2000);
		FurtherOps_DBqueries obj3= new FurtherOps_DBqueries();
		int v2=obj3.realtime_otp();
		int doet[]=obj3.individual_digits(v2);
		for (int i=0;i<4;i++) {


			switch(doet[i]) {

			case 0:
				System.out.println("0");
				((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
						"x",520,"y",2093));
				break;
			case 1:
				System.out.println("1");
				((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
						"x",266,"y",1616));
				break;
			case 2:
				System.out.println("2");
				((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
						"x",528,"y",1616));
				break;
			case 3:
				System.out.println("3");
				((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
						"x",802,"y",1616));
				break;
			case 4:
				System.out.println("4");
				((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
						"x",254,"y",1777));
				break;
			case 5:
				System.out.println("5");
				((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
						"x",528,"y",1777));
				break;
			case 6:
				System.out.println("6");
				((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
						"x",779,"y",1777));
				break;
			case 7:
				System.out.println("7");
				((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
						"x",262,"y",1929));
				break;
			case 8:
				System.out.println("8");
				((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
						"x",520,"y",1929));
				break;
			case 9:
				System.out.println("9");
				((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
						"x",783,"y",1929));
				break;
				//	}
			}
			Thread.sleep(2000);
		}



		// NEW CODE ENDS HERE
		//select_digits_keypad(individual_digits(realtime_otp()));


		//
		// Click on paste UNCOMMENT THE TWO LINES BELOW
		//	Thread.sleep(2000);
		//	((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
		//			"x",156,"y",804));

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

		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x",947,"y",923));
		Thread.sleep(2000);
		System.out.println("You are in the main screen");

		FurtherOps_DBqueries obj2= new FurtherOps_DBqueries();
		int v1=obj2.realtime_otp();
		int d[]=obj2.individual_digits(v1); //obj1.individual_digits(realtime_otp())
		for (int loop=0;loop<4;loop++) {

			System.out.println( "This is the copied function"+"  "+d[loop]);

		}

		/*Copy and paste OTP in the screen capture below*/
		// Resume testing
		//	clickAction(obj2.x_cordinates((obj2.getDigits_cordsMap())), otp;
	}}
