package crm.mhc.pages.methods;

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import crm.mhc.pages.objects.CaseJourneyPageObject;
import crm.mhc.pages.objects.CaseStage1Page;
import crm.mhc.pages.objects.CollectDocsLeadPageObject;
import crm.mhc.pages.objects.CustomerCareExecutiveObjects;
import crm.mhc.pages.objects.CustomerSearchPageObject;
import crm.mhc.pages.objects.HomePageObject;
import crm.mhc.pages.objects.IndividualSalesJourneyPageObject;

import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseStage1PageMethod extends HomePageMethod {

	JavascriptExecutor js;

//************************Fill the Info Stage1 process*****************************-------------//

	public void fill_DetailsInConcern(String data) throws InterruptedException

	{

		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)","" );
		Thread.sleep(2000);
		CaseStage1Page.fill_DetailsInConcern.click();
		Thread.sleep(1000);
		CaseStage1Page.fill_DetailsInConcern.sendKeys(data);

	}
	
	
	
	public void SelectComputationRequest(String ComputationRequest)
	    {
		    CaseStage1Page.ComputationRequest.click();
	    	Select sel1 = new Select(CaseStage1Page.ComputationRequest);
	    	sel1.selectByVisibleText(ComputationRequest);
	
	    }
	
	public void fill_Remarks(String Remarks)
    {
		CaseStage1Page.fill_Remarks.click();
		CaseStage1Page.fill_Remarks.sendKeys(Remarks);

    }
	
	 public void NextOnCasePage() 
	  {
		  CaseJourneyPageObject.clk_NextOnCasePage.click();
	    
	  }
	

}