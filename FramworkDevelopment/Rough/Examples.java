package Rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import crm.mhc.pages.objects.HomePageObject;
import crm.mhc.repository.Properties;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Properties;

public class Examples implements Properties {
	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException  {
		/*
	    System.setProperty(ChromeWebDriver, ChromeDriverPath);
		driver =new ChromeDriver();
		//driver.close();
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--start-maximized");
		driver.get("http://mhcsa/sn/app/AutoFlow/RunFlow?x=m7psnshf4ta9sl5cx5jbfw6wwq2e427bkm2pjwatsr5tfgm4hwpc48vjj4sbdas3&layid=EXFtv7nimAw16qPKWayMog%3D%3D&pid=eXuLuIrzMbtx0sxEgyy8Ew%3D%3D&cogtype=false");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("TxtName")).sendKeys("so1");
		driver.findElement(By.id("TxtPassword")).sendKeys("acid_qa");
		driver.findElement(By.xpath(".//*[@id='registration']/ul/li[5]/input")).click();
		driver.findElement(By.id("CampaignNameimgpick")).click();
		//driver.switchTo().frame("0");
		driver.findElement(By.id("TxtSearch")).sendKeys("aditya");
		Thread.sleep(1000);
		driver.findElement(By.id("TxtSearch")).sendKeys(Keys.ENTER);
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
	    //executor.executeScript("window.scrollBy(0,250)", "");		
		//driver.findElement(By.id(".//div[contains(@class,'serch-input-container')]/ul/li[3]/a/i")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.id(".//div[contains(@id,'row0')]/div[1][contains(@class,'jqx-grid-cell')]/div[1]/a[contains(@id,'iv_0')]")).click();
		*/
		String date="30/05/1990" ;
		String month,day, year;

	    String date_dd_MM_yyyy[] = (date.split("/"));

	      month= date_dd_MM_yyyy[0];

	      day= date_dd_MM_yyyy[1];
          year= date_dd_MM_yyyy[2];
		
		 // Connection conn1 = null;
	        
	    /*try {
	            
	            Class.forName("oracle.jdbc.OracleDriver");
	            String dbURL2 =  "jdbc:oracle:thin:@192.168.0.16:1521/CRMNEXT_LOCAL";
	            String username = "MHC_LOCAL_NEW";
	            String password = "abc123";
	            conn1 = DriverManager.getConnection(dbURL2, username, password);
	            if (conn1 != null) {
	                System.out.println("Connected with connection #1");
	            }
	            Statement st=conn1.createStatement();
     String sql="select  Loginid from az_user where  userid in (select distinct AssignTo  from leads where Phone='87899797956') and AppOwnerID=444 and rownum = 1";
	 ResultSet rs=st.executeQuery(sql);
	 while (rs.next())
		 
	 {
		 System.out.println(rs.getString(1));
		 conn1.close();
	 }
	             } catch (ClassNotFoundException ex) {
	            ex.printStackTrace();
	            } catch (SQLException ex) {
	            ex.printStackTrace();
	            } finally {
	            try {
	                if (conn1 != null && !conn1.isClosed()) {
	                    conn1.close();
	                }
	               } catch (SQLException ex) {
	                ex.printStackTrace();
	            }
	        }
	    }*/
          
          
}
}
		
