package crm.mhc.pages.methods;

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import crm.mhc.pages.objects.CaseJourneyPageObject;
import crm.mhc.pages.objects.CollectDocsLeadPageObject;
import crm.mhc.pages.objects.CustomerCareExecutiveObjects;
import crm.mhc.pages.objects.CustomerSearchPageObject;
import crm.mhc.pages.objects.HomePageObject;
import crm.mhc.pages.objects.IndividualSalesJourneyPageObject;
import crm.mhc.pages.objects.LeadObjectPageObject;

import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseJourneyPageMethod extends HomePageMethod {

	String SDmobilenumber;
	public static String leadid;

//************************Fill the Info for new lead process*****************************-------------//

	public void IndividualCaseJorney()

	{
		
	   CaseJourneyPageObject.clk_IndividualCaseJorney.click();

	 }
	
       public void FillSSC(String sscname) throws InterruptedException
	
		{
		
		  Set<String> listofWindows=driver.getWindowHandles();//Move to child window
	      Iterator<String> ite = listofWindows.iterator();
	      String S1 = ite.next();
	      String S2 = ite.next();
	      driver.switchTo().window(S2);
	      driver.manage().window().maximize();
	      CaseJourneyPageObject.fillSSC.click();
		  WebElement SSCSearch = CaseJourneyPageObject.fillSSC;
		  SSCSearch.sendKeys(sscname);
		  Thread.sleep(1000);
		  SSCSearch.sendKeys(Keys.DOWN);
		  SSCSearch.sendKeys(Keys.ENTER);

		
		}
	
	  public void NextOnCasePage() 
	  {
		  CaseJourneyPageObject.clk_NextOnCasePage.click();
	    
	    }
	  
	  
	  public void casesaveAndProceed()
		
	 	{
	 	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

		  CaseJourneyPageObject.clk_casesaveandproceed.click();
	 	}
	   
}