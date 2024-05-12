package webookMobileAutomationFramework;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class WeBookAndroidApp {
	public AndroidDriver driver;

	@BeforeTest
	public void startDriver() throws MalformedURLException {
		// Appium code => appium Server = > Mobile

				UiAutomator2Options options = new UiAutomator2Options();
				options.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
				options.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
				options.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
				options.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
				options.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.webook.android");
				options.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.webook.android.MainActivityDefault");
				driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	}
	@Test
	public void goToWeBookApp() throws InterruptedException {
		

		// change the language from arabic to english
		String changeLag = driver.findElement(By.xpath("//android.widget.TextView[@text,'تصفح بالعربية']")).getText();
		System.out.println(changeLag);
		driver.findElement(By.xpath("//android.widget.TextView[@text,'تصفح بالعربية']")).click();
		Assert.assertEquals("تصفح بالعربية", changeLag);
		Thread.sleep(10000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//android.widget.TextView[@text,'تصفح أولاً']"))));
		String browseFirst = driver.findElement(By.xpath("//android.widget.TextView[@text,'تصفح أولاً']")).getText();
		System.out.println(browseFirst);
		driver.findElement(By.xpath("//android.widget.TextView[@text,'تصفح أولاً']")).click();
		Thread.sleep(10000);
		// Assert.assertEquals("تصفح أولاً", browseFirst);

		String myProfile = driver.findElement(By.xpath("//android.widget.TextView[@text,'حسابى']")).getText();
		System.out.println(myProfile);
		driver.findElement(By.xpath("//android.widget.TextView[@text,'حسابى']")).click();

//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//android.widget.TextView[@text,'بحث']")).click();
//		driver.findElement(By.xpath("//android.widget.TextView[@text,'استكشف']")).click();
//	    driver.close();

	}

	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
