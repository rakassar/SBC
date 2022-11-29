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

import crm.mhc.pages.objects.CaseStagePageObject;

import crm.mhc.pages.objects.CollectDocsLeadPageObject;
import crm.mhc.pages.objects.CustomerCareExecutiveObjects;
import crm.mhc.pages.objects.CustomerSearchPageObject;
import crm.mhc.pages.objects.HomePageObject;
import crm.mhc.pages.objects.IndividualSalesJourneyPageObject;

import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseStagePageMethod extends HomePageMethod {

	JavascriptExecutor js;
	String caseIDCreated;
//************************Fill the Info Stage1 process*****************************-------------//

	public void fill_DetailsInConcern(String data1) throws InterruptedException

	{
		
		   Thread.sleep(1000);
           js = (JavascriptExecutor) driver;
           js.executeScript("window.scrollBy(0,1500)","" );
		   Thread.sleep(5000);
		   CaseStagePageObject.fill_DetailsInConcern.click();
           CaseStagePageObject.fill_DetailsInConcern.sendKeys(data1);
	       System.out.println("Entered text in Details of Concern field");
	}
	
	
	
	public void SelectComputationRequest(String ComputationRequest) throws InterruptedException
	    {
		
		    //Thread.sleep(1000);
		    //CaseStagePageObject.ComputationRequest.click();
		    //Thread.sleep(5000);
	    	Select sel1 = new Select(CaseStagePageObject.ComputationRequest);
	    	sel1.selectByValue(ComputationRequest);
	
	    }
	
	public void fill_Remarks(String Remarks)
    {
		//CaseStagePageObject.fill_Remarks.click();
		CaseStagePageObject.fill_Remarks.sendKeys(Remarks);
		
    }
	
	 public void GetCaseId() 
	  {
		 caseIDCreated=CaseStagePageObject.caseIDCreated.getText();
	     System.out.println("Account Balance Computation CaseID:"+caseIDCreated);
	  }
	 
	 
	 public void clk_caseobject() throws InterruptedException

		{
			
			   Actions quick1 = new Actions(driver);
			   quick1.moveToElement(CaseStagePageObject.clk_Casequicklink).perform();
			   Thread.sleep(3000);
			   CaseStagePageObject.clk_Caseobject.click();
		       Select bucket2 = new Select(CaseStagePageObject.clk_caseobject3);
		       bucket2.selectByVisibleText("Case");
		       //CaseStagePageObject.clk_caseobject4.click();
		}
		
		public void clk_selfassigncase(String assigntodept) throws InterruptedException

		{
			
			    JavascriptExecutor js =(JavascriptExecutor)driver;
			    js.executeScript("window.scrollBy(0,1100)", " ");
			    Select View = new Select(CaseStagePageObject.clk_selectview);
			    View.selectByVisibleText(assigntodept);
			    Thread.sleep(1000);
			    CaseStagePageObject.clk_arrorw.click(); 
			    Thread.sleep(1000);
			    CaseStagePageObject.clk_selectcase.click(); 
				Thread.sleep(1000);
			    CaseStagePageObject.clk_selfassigncase.click();
			    Thread.sleep(1000);
			    CaseStagePageObject.clk_okbutton.click(); 
			    Thread.sleep(1000);
			    
		}
			
		public void sel_caseview(String caseview) throws InterruptedException

		{
			    JavascriptExecutor js =(JavascriptExecutor)driver;
			    js.executeScript("window.scrollBy(0,1100)", " ");
			    Select View = new Select(CaseStagePageObject.clk_selectview);
			    View.selectByVisibleText(caseview);
			    Thread.sleep(1000);
			    CaseStagePageObject.clk_arrorw.click(); 
		}
		public void clk_onMycaseview_56(String assigntome) throws InterruptedException

		{
			    Select sel = new Select(CaseStagePageObject.clk_selectmycaseview_56);
	    	    sel.selectByVisibleText(assigntome);
	
		        //CaseStagePageObject.clk_selectmycaseview_56.click(); 
		        CaseStagePageObject.clk_arrorw.click(); 
			    Thread.sleep(1000);
			    
			    
		}	
		
		public void clk_onMycaseview_220(String assigntome) throws InterruptedException

		{
			
			 Select sel = new Select(CaseStagePageObject.clk_selectmycaseview_220);
	    	    sel.selectByVisibleText(assigntome);
	
		        //CaseStagePageObject.clk_selectmycaseview_56.click(); 
		        CaseStagePageObject.clk_arrorw.click(); 
			    Thread.sleep(1000);
			  
			    
			    
		}	 
			
		public void clk_onMyBucketcase() throws InterruptedException

		{
			
		        CaseStagePageObject.clk_selectthecase.click();
			    Thread.sleep(1000);
			    
			    
		}
		
		public void clk_caseEditButton() throws InterruptedException

		{
			    CaseStagePageObject.clk_editthecase.click();
			    Thread.sleep(1000);
			    
		}
		
		public void sel_depetdecison(String deptdecision) throws InterruptedException

		{
			    Select Department = new Select(CaseStagePageObject.clk_dropdownacceptvalue);
			    Thread.sleep(2000);
			    Department.selectByVisibleText(deptdecision);
			    System.out.println("Selcted Department Decision");
			    Thread.sleep(2000);
			    
		}
		
	
	 

}