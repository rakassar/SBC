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

import crm.mhc.pages.objects.CaseStage1PageObject;
import crm.mhc.pages.objects.CollectDocsLeadPageObject;
import crm.mhc.pages.objects.CustomerCareExecutiveObjects;
import crm.mhc.pages.objects.CustomerSearchPageObject;
import crm.mhc.pages.objects.HomePageObject;
import crm.mhc.pages.objects.IndividualSalesJourneyPageObject;

import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseStage1PageMethod extends HomePageMethod {

	JavascriptExecutor js;
	String caseIDCreated;
//************************Fill the Info Stage1 process*****************************-------------//

	public void fill_DetailsInConcern(String data1) throws InterruptedException

	{
		
		   Thread.sleep(1000);
           js = (JavascriptExecutor) driver;
           js.executeScript("window.scrollBy(0,1500)","" );
		   Thread.sleep(5000);
		   CaseStage1PageObject.fill_DetailsInConcern.click();
           CaseStage1PageObject.fill_DetailsInConcern.sendKeys(data1);
	       System.out.println("Entered text in Details of Concern field");
	}
	
	
	
	public void SelectComputationRequest(String ComputationRequest) throws InterruptedException
	    {
		
		    //Thread.sleep(1000);
		    //CaseStage1PageObject.ComputationRequest.click();
		    //Thread.sleep(5000);
	    	Select sel1 = new Select(CaseStage1PageObject.ComputationRequest);
	    	sel1.selectByValue(ComputationRequest);
	
	    }
	
	public void fill_Remarks(String Remarks)
    {
		CaseStage1PageObject.fill_Remarks.click();
		CaseStage1PageObject.fill_Remarks.sendKeys(Remarks);
		
    }
	
	 public void GetCaseId() 
	  {
		  WebElement caseID=CaseStage1PageObject.caseIDCreated;
		  caseIDCreated=caseID.getText();  
		  System.out.println("Account Balance Computation CaseID:"+caseIDCreated);
	  }
	 
	 

}