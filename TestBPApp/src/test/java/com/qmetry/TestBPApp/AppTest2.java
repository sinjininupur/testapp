package com.qmetry.TestBPApp;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qmetry.TestBPApp.basics;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

/*package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;*/
import static org.testng.Assert.*;
//import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class AppTest2 extends basics
{

	/*// private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  AndroidDriver driver;
	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
	   // driver = new FirefoxDriver();
	    baseUrl = "http://automationpractice.com/";
	    
		 driver=setcapabilities();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     System.out.println("wait for 10 sec");
	     Thread.sleep(10000L);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	@BeforeSuite
	public  void checkapp() throws InterruptedException, IOException {
		
		
		// TODO Auto-generated method stub
	
		

  //xpath id className, androidUIautomator
         xpath Syntax
      *    //tagName[@attribute='value']
    
      * 
      
	}
	@Test
	public  void checkappnew() throws InterruptedException, IOException {
		
		
		   driver.get(baseUrl + "/index.php");
		   
		   
		   
			 //driver.get("http://automationpractice.com/index.php");
			 
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    
			 
			 
			   // driver.get(baseUrl + "/index.php");
			 
			if  (isElementPresent(By.linkText("Sign out")))
			{
				driver.findElement(By.linkText("Sign out")).click();
			}
			
			
		    driver.findElement(By.cssSelector("div.cat-title.active")).click();
		    driver.findElement(By.linkText("Women")).click();
		    driver.findElement(By.cssSelector("h2.title_block.active")).click();
		    driver.findElement(By.xpath("(//a[contains(text(),'Tops')])[2]")).click();
		    driver.findElement(By.cssSelector("p.title_block.active")).click();
		    driver.findElement(By.id("layered_category_5")).click();
		    driver.findElement(By.xpath("//div[@id='center_column']/ul/li/div/div[2]/div[2]/a/span")).click();
		    driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span")).click();
		    driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span")).click();
		    driver.findElement(By.cssSelector("#button_order_cart > span")).click();
		    driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span")).click();
		    driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).clear();
		    driver.findElement(By.id("email")).sendKeys("sinjininupur1@gmail.com");
		    driver.findElement(By.id("passwd")).clear();
		    driver.findElement(By.id("passwd")).sendKeys("jjjjsssoou");
		    driver.findElement(By.id("SubmitLogin")).click();
		    driver.findElement(By.name("processAddress")).click();
		    driver.findElement(By.id("cgv")).click();
		    driver.findElement(By.name("processCarrier")).click();
		    driver.findElement(By.cssSelector("a.bankwire > span")).click();
		    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		    driver.findElement(By.cssSelector("p.cheque-indent > strong.dark")).click();
		    driver.findElement(By.linkText("Sign out")).click();
		    
		    //---------------------------------------------------------
			    driver.findElement(By.linkText("Women")).click();
			    driver.findElement(By.id("layered_id_feature_11")).click();
			    driver.findElement(By.xpath("//div[@id='center_column']/ul/li/div/div[2]/div[2]/a/span")).click();
			    driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/span/span")).click();
			    driver.findElement(By.xpath("//div[@id='center_column']/ul/li[3]/div/div[2]/div[2]/a/span")).click();
			    driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span")).click();
			    driver.findElement(By.id("total_price")).click();
			    driver.findElement(By.cssSelector("i.icon-trash")).click();
			    driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span")).click();
			    
			    driver.findElement(By.id("email")).click();
			    driver.findElement(By.id("email")).clear();
			    driver.findElement(By.id("email")).sendKeys("sinjininupur1@gmail.com");
			    driver.findElement(By.id("passwd")).clear();
			    driver.findElement(By.id("passwd")).sendKeys("jjjjsssoou");
			    driver.findElement(By.id("SubmitLogin")).click();
			 
			    
			    driver.findElement(By.name("processAddress")).click();
			    driver.findElement(By.name("processCarrier")).click();
			    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
			    driver.findElement(By.id("cgv")).click();
			    driver.findElement(By.name("processCarrier")).click();
			    driver.findElement(By.cssSelector("a.bankwire > span")).click();
			    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			    driver.findElement(By.id("center_column")).click();
			    
			    driver.findElement(By.linkText("Sign out")).click();
	}

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
	  private boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
*/
	}

