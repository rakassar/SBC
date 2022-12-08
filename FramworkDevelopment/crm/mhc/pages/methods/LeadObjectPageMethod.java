package crm.mhc.pages.methods;
import org.openqa.selenium.JavascriptExecutor;

import crm.mhc.pages.objects.CRRSCLeadPageObject;
import crm.mhc.pages.objects.HomePageObject;
import crm.mhc.pages.objects.LeadObjectPageObject;
import crm.mhc.pages.objects.IndividualSalesJourneyPageObject;

public class LeadObjectPageMethod extends HomePageMethod{

   public static String leadid;
   
   public void ClickOnOnBoardingJourney()
	
	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   LeadObjectPageObject.clk_salesonbaordingjourney.click();
	}
  
   public void saveAndProceed()
	
 	{
 	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   LeadObjectPageObject.clk_saveandproceed.click();
 	}
   public void ClickOnCRRSCtab()
	
	{
	   LeadObjectPageObject.clk_CRRSCtab.click();
		
	}
   

//Click on Activities tab on lead detail page
public void ClickOnActivitiestab()
	
	{
	LeadObjectPageObject.clk_Activitiestab.click();
		
	}
   
   
   public void ProcessApplication()
	
 	{
 	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   LeadObjectPageObject.clk_ProcessApplication.click();
	   
	   
 	}
   
   public void ProcessApplicationPopUpClose()
	
	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   LeadObjectPageObject.clk_closeProcessApplicationPopup.click();
	   
	   
	}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  
	public void ClickPlusSign()
	
	{
		LeadObjectPageObject.clk_plussign.click();
	}
	
	public void ClickSavingAndDepositeLink() throws InterruptedException
	
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", LeadObjectPageObject.link_SavingsandDeposits);
		
	}
	
	
public void ClickOnSaveAndProceed() throws InterruptedException
	
	{		
	JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", LeadObjectPageObject.btn_SaveandProceed);
            
	}

public void ClickOnSaveAndProceedEdit() throws InterruptedException
	
	{		HomePageObject.btn_SaveandProceed_edit.click();
            
	}
	
public void ClickCorporateLoanLink() throws InterruptedException

{
	LeadObjectPageObject.link_CorporateLoan.click();

}

public void ClickOnEditButton()

{
	LeadObjectPageObject.btn_ClickOnEditButton.click();
}


public void Clicksearchaftertype()

{
	LeadObjectPageObject.btn_Clickleadsearch.click();
}



public void ClickOnAdvancesearched() throws InterruptedException

{
	//JavascriptExecutor executor = (JavascriptExecutor)driver;
    //executor.executeScript("arguments[0].click();", HomePageObject.btn_Advancesearched);
 HomePageObject.btn_Advancesearched.click();

}

public String ExtractLeadid()

{
	leadid =LeadObjectPageObject.extra_Leadid.getText();
	return leadid;
}

}
