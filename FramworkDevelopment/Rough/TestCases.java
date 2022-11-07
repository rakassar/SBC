package Rough;
	

import java.time.Duration;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;             		

@Listeners(Rough.ListenerTest.class)			

public class TestCases {				
	// WebDriver driver = new ChromeDriver();				

//Test to pass as to verify listeners.		
@Test		
public void Login() throws InterruptedException				
{		

    String driverPath="D:\\Rizwan\\Automation\\lib\\chromedriver.exe";    
    String uname="109840";
    String pwd="acid_qa";
    String expectedTitle="CRMnext - Smart.Easy.Complete";
    String actualLeadUrl="https://sbcdev.crmnext.biz/sn/app/CRMNextObject/Home/Lead";

    System.setProperty("webdriver.chrome.driver", driverPath);
    WebDriver driver = new ChromeDriver();

//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("https://sbcdev.crmnext.com/sn/app/login/login");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    System.out.println("Browser launch successfully and App is also launched");
    driver.findElement(By.xpath("//input[@id='TxtName']")).sendKeys(uname);
    driver.findElement(By.xpath("//*[@id=\"TxtPassword\"]")).sendKeys(pwd);
    driver.findElement(By.xpath("//*[@id=\"registration\"]/input")).click();
    Thread.sleep(1000);
     driver.findElement(By.name("ProfileImage_header")).click();
     //WebElement mouse = driver.findElement(By.cssSelector("div[data-autoid='Logout']"));
     
     //Actions action = new Actions(driver);
    // action.moveToElement(mouse).perform();
     Thread.sleep(1000);
     driver.findElement(By.linkText("Logout")).click();
     
}		

//Forcefully failed this test as verify listener.		
@Test		
public void TestToFail()				
{		
    System.out.println("This method to test fail");					
    Assert.assertTrue(false);			
}		
}