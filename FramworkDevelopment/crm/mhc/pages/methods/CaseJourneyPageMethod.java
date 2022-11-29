package crm.mhc.pages.methods;

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import crm.mhc.pages.objects.CRRSCLeadPageObject;
import crm.mhc.pages.objects.CaseJourneyPageObject;

import crm.mhc.pages.objects.CollectDocsLeadPageObject;
import crm.mhc.pages.objects.CustomerCareExecutiveObjects;
import crm.mhc.pages.objects.CustomerSearchPageObject;
import crm.mhc.pages.objects.HomePageObject;
import crm.mhc.pages.objects.IndividualSalesJourneyPageObject;
import crm.mhc.pages.objects.LeadObjectPageObject;
import crm.mhc.pages.objects.LoginPageObject;

import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseJourneyPageMethod extends HomePageMethod {

	String SDmobilenumber;
	public static String leadid;
	JavascriptExecutor js;

//************************Fill the Info for new lead process*****************************-------------//

	public void IndividualCaseJorney()

	{
		
	   CaseJourneyPageObject.clk_IndividualCaseJorney.click();

	 }
	
       public void FillSSC(String sscname) throws InterruptedException
	
		{
    	
		  driver.manage().window().maximize();
          CaseJourneyPageObject.fillSSC.click();
          WebElement SSCSearch = CaseJourneyPageObject.fillSSC;
          SSCSearch.sendKeys(sscname);
          Thread.sleep(3000);
          SSCSearch.sendKeys(Keys.DOWN);
          SSCSearch.sendKeys(Keys.ENTER);
    	    
	      }
	      
			
			  public void creditcardproduct() throws InterruptedException 
			  
			  {
			  
				  
			  CharSequence searchString = "Master";
			  CaseJourneyPageObject.fillcardproduct.click();

			  CaseJourneyPageObject.clk_productssorting.click();
			  CaseJourneyPageObject.clk_sortingM.click();
			  //Select sel=new Select(CaseJourneyPageObject.clk_pagingdropdownlist);
			  //sel.selectByValue(Product);
			  //sel.selectByVisibleText("100");
			  Thread.sleep(1000);
			  List<WebElement> creditcardproduct = CaseJourneyPageObject.fillcreditcardproduct; 
			  for(int i=0;i<creditcardproduct.size();i++) 
			  { 
				 
			  String  creditCardProductName=creditcardproduct.get(i).getText();
			  if(creditCardProductName.contains(searchString))	  
			  {
              creditcardproduct.get(i).click();
			  System.out.println("Credit Card Account Number is selected"); 
			  break;
			  
			  } 
			  else { System.out.println("Credit Card Product not found"); } }
			  
			  }
			 
       
	  public void NextOnCasePage() 
	  {
		  CaseJourneyPageObject.clk_NextOnCasePage.click();
			/*
			 * Thread.sleep(2000); JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(0,1500)", "");
			 */
	    
	    }
	  
	  
	  public void casesaveAndProceed()
		
	 	{
	 	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

		  CaseJourneyPageObject.clk_casesaveandproceed.click();
	 	}
	  
	  public void Source( String Source )
		
	 	{
	 	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		  Select source = new Select(CaseJourneyPageObject.clk_casesource);
		  source.selectByVisibleText(Source);
		
	 	}
	   
	   
}