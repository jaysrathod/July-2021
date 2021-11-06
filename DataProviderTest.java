package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String username, String password) {
	  System.out.println(Thread.currentThread().getId());
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Dropbox\\My PC (LAPTOP-IKS9SD1L)\\Desktop\\chromedriver.exe");
	    driver=new ChromeDriver(); 
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("pass")).sendKeys(password);
			//driver.findElement(By.name("login")).click();
		driver.close();
  }
//  @Test
//  public void CheckTitle()
//  {
//	  String ExpectedTitle = "Facebook – log in or sign UP";
//	  String ActualTitle = driver.getTitle();
//	  // Hard Assert default Assert
//	  //Assert.assertEquals(ActualTitle, ExpectedTitle);
//	  // Soft Assert or verify
//	  SoftAssert sassert = new SoftAssert();
//	  sassert.assertEquals(ActualTitle, ExpectedTitle);
//	  System.out.println("Test Failed");
//	  sassert.assertAll();
//  }
  @DataProvider(parallel = true)
  public Object[][] dp() {
    return new Object[][] {
    	new Object[]   { "ravinangare@gmail.com", "1234567899" },
    	new Object[]  { "ravinangare1983@gmail.com", "21314134235" },
    	new Object[]   { "ravi.nangare@gmail.com", "123421412" }
      };
}
}
