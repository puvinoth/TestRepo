package com.glogs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class pract  {
	
	WebDriver driver;
	//Logger log = Logger.getLogger(pract.class);
	
@BeforeMethod
public void mm() {
	//PropertyConfigurator.configure(".\\log4j.properties");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\java\\chromedriver_win32\\chromedriver.exe");
	
}
	
	@Test
	public void method() {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-Maximized");
		options.addArguments("--headless");
		driver  = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		
		/*
		 * //System.out.println(driver.getPageSource()); Robot robot = new Robot(); //
		 * Robot class throws AWT Exception Thread.sleep(2000); // Thread.sleep throws
		 * InterruptedException robot.keyPress(KeyEvent.VK_CONTROL); Thread.sleep(500);
		 * // sleep has only been used to showcase each event separately
		 * robot.keyPress(KeyEvent.VK_S); Thread.sleep(500);
		 * robot.keyRelease(KeyEvent.VK_S); Thread.sleep(500);
		 * robot.keyRelease(KeyEvent.VK_CONTROL); Thread.sleep(2000);
		 * robot.keyPress(KeyEvent.VK_ENTER); Thread.sleep(500);
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); By el =
		 * null; WebDriverWait wait = new WebDriverWait(driver, 20);
		 * wait.until(ExpectedConditions.presenceOfElementLocated(el));
		 */
	}

}
