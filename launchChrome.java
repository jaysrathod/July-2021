package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class launchChrome {
	WebDriver driver;
  @Test
  public void CheckTitle() {
	  String ExpectedTitle = "ToolsQA";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
  }
  @Test
  public void CheckButtons()
  {
	  WebElement TabButton = driver.findElement(By.xpath("//button[@id='tabButton']"));
	  WebElement WindowButton = driver.findElement(By.xpath("//button[@id='windowButton']"));
	  WebElement MessageButton = driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
	  
	  TabButton.click();
	  WindowButton.click();
	  MessageButton.click();
  }
  @BeforeMethod
  public void beforeMethod() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Dropbox\\My PC (LAPTOP-IKS9SD1L)\\Desktop\\chromedriver.exe");
	    driver=new ChromeDriver(); 
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
