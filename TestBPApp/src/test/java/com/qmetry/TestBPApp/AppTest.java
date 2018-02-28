package com.qmetry.TestBPApp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qmetry.TestBPApp.ExcellReading;

import io.appium.java_client.android.AndroidDriver;



public class AppTest extends basics
{
	
	
	ExcellReading excellReading;

	//ExcellReading excellReading;
	// private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  AndroidDriver driver;
	  
	  
	@BeforeTest
	  @Parameters({"browsername","sheetname","deviceName"}) 
	  public void setUp(String browsername, String sheetname, String deviceName  ) throws Exception {
	   // driver = new FirefoxDriver();
		excellReading = new ExcellReading();
	    baseUrl = "http://automationpractice.com/";
	    
		 driver=setcapabilities(deviceName,browsername);
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     System.out.println("wait for 10 sec");
	     Thread.sleep(5000L);
	    // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  }

	/*@BeforeSuite
	public  void checkapp() throws InterruptedException, IOException {
		
		
		// TODO Auto-generated method stub
	
		

  //xpath id className, androidUIautomator
         xpath Syntax
      *    //tagName[@attribute='value']
    
      * 
      
	}*/
	  @Parameters({"rowno","sheetname"}) 
	@Test(invocationCount=5,threadPoolSize = 2)
	public  void checkappnew(String rowno,String sheetname ) throws InterruptedException, IOException {
		
		  long start = System.currentTimeMillis();
		   driver.get(baseUrl + "/index.php");
		   long finish = System.currentTimeMillis();
		   long totalTime = finish - start; 
		   System.out.println("Total Time for page load - "+totalTime); 
		   
			 //driver.get("http://automationpractice.com/index.php");
			 
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
			 
			 
			   // driver.get(baseUrl + "/index.php");
			 
			if  (isElementPresent(By.linkText("Sign out")))
			{
				driver.findElement(By.linkText("Sign out")).click();
			}
			
			
			int rowno1=Integer.parseInt(rowno);
		//	if  (isElementPresent(By.xpath("//*[@id='block_top_menu']/div")))
			if  (driver.findElement(By.xpath("//*[@id='block_top_menu']/div")).isDisplayed())
			{
				driver.findElement(By.xpath("//*[@id='block_top_menu']/div")).click();
			 // driver.findElement(By.cssSelector("div.cat-title.active")).click();
				 Thread.sleep(2000L);
			 // WebElement element = driver.findElement(By.xpath("(//*[text()='"+excellReading.getData(sheetname, 1, "Category")+"'])[1]"));
			  driver.findElement(By.linkText(excellReading.getData(sheetname, rowno1, "Category"))).click();
			 Thread.sleep(2000L);
			    //driver.findElement(By.xpath("(//*[text()='"+excellReading.getData(sheetname, rowno1, "Category")+"'])")).click();
			    driver.findElement(By.xpath("//*[@id='categories_block_left']/h2")).click();
			   Thread.sleep(2000L);
			  // driver.findElement(By.xpath("//a[contains(text(),'Dresses')][2]")).click();
			   
			   
			   //*[@id='categories_block_left']/div/ul//a[contains(text(),'Dresses')]
			    driver.findElement(By.xpath("//*[@id='categories_block_left']/div/ul//a[contains(text(),'" + excellReading.getData(sheetname, rowno1, "Subcat")+"')]")).click();
			   Thread.sleep(2000L);
			    driver.findElement(By.xpath("//*[@id='categories_block_left']/h2")).click();
			   Thread.sleep(2000L);
			   
			   driver.findElement(By.xpath("//*[@id='categories_block_left']/div/ul//a[contains(text(),'" + excellReading.getData(sheetname, rowno1, "Cattype")+"')]")).click();
			   //*[@id='categories_block_left']/div/ul//a[contains(text(),'Evening Dresses')]
			 //   driver.findElement(By.xpath("(//a[contains(text(),"+ excellReading.getData(sheetname, rowno1, "Cattype")+")])[3]")).click();
			  Thread.sleep(3000L);
			  
			//  (//*[@id='center_column']/ul/li/div/div[2]//a[contains(text(),'Printed Summer Dresses')])[1]
			    driver.findElement(By.xpath("(//*[@id='center_column']/ul/li/div/div[2]//a[contains(text(),'" +excellReading.getData(sheetname, rowno1, "Item")+ "')])[1]")).click();
			    Thread.sleep(2000L);
			    
			    
			    
			    driver.findElement(By.xpath("//*[@id='add_to_cart']/button")).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[@title='Proceed to checkout']")).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.id("email")).click();
			    driver.findElement(By.id("email")).clear();
			    driver.findElement(By.id("email")).sendKeys("sinjininupur1@gmail.com");
			    driver.findElement(By.id("passwd")).clear();
			    driver.findElement(By.id("passwd")).sendKeys("jjjjsssoou");
			    driver.findElement(By.id("SubmitLogin")).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.name("processAddress")).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.id("cgv")).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.name("processCarrier")).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.cssSelector("a.bankwire > span")).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.cssSelector("p.cheque-indent > strong.dark")).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.linkText("Sign out")).click();
			}
			    
			    else
			    {
			    	
			   // driver.findElement(By.linkText("Women")).click();
			    driver.findElement(By.linkText(excellReading.getData(sheetname, rowno1, "Category"))).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.xpath("//*[@id='categories_block_left']/div/ul//a[contains(text(),'" + excellReading.getData(sheetname, rowno1, "Subcat")+"')]")).click();
			    Thread.sleep(5000L);
			    driver.findElement(By.xpath("//*[@id='categories_block_left']/div/ul//a[contains(text(),'" + excellReading.getData(sheetname, rowno1, "Cattype")+"')]")).click();
			    Thread.sleep(3000L);
			    driver.findElement(By.xpath("(//*[@id='center_column']/ul/li/div/div[2]//a[contains(text(),'" +excellReading.getData(sheetname, rowno1, "Item")+ "')])[1]")).click();
			    Thread.sleep(2000L);
			  
			    
			    
			    
			    driver.findElement(By.xpath("//*[@id='add_to_cart']/button")).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[@title='Proceed to checkout']")).click();
			    Thread.sleep(2000L);
		    
			    driver.findElement(By.id("email")).click();
			    driver.findElement(By.id("email")).clear();
			    driver.findElement(By.id("email")).sendKeys("sinjininupur1@gmail.com");
			    driver.findElement(By.id("passwd")).clear();
			    driver.findElement(By.id("passwd")).sendKeys("jjjjsssoou");
			    driver.findElement(By.id("SubmitLogin")).click();
			    Thread.sleep(2000L);
			    
			    driver.findElement(By.name("processAddress")).click();
			    Thread.sleep(2000L);
			   // driver.findElement(By.name("processCarrier")).click();
			    //driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
			    driver.findElement(By.id("cgv")).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.name("processCarrier")).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.cssSelector("a.bankwire > span")).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.id("center_column")).click();
			    Thread.sleep(2000L);
			    driver.findElement(By.linkText("Sign out")).click();
			    }
	}

	 
	@AfterTest
	  public void tearDown(ITestResult result) throws Exception {
		 driver.executeScript("sauce:job-result=" + (result.isSuccess() ? "passed" : "failed"));
	       
	    driver.quit();
	   // @AfterMethod
	  //  public void tearDown(ITestResult result) throws Exception {
	     //   ((JavascriptExecutor) webDriver.get()).executeScript("sauce:job-result=" + (result.isSuccess() ? "passed" : "failed"));
	     //   webDriver.get().quit();
	   // }

	   /* protected void annotate(String text) {
	        ((JavascriptExecutor) webDriver.get()).executeScript("sauce:context=" + text);
	    }
	    */
	    
	    
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      Assert.fail(verificationErrorString);
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

	}

