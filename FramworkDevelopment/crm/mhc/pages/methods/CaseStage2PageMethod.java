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
import crm.mhc.pages.objects.CaseStage2PageObject;
import crm.mhc.pages.objects.CollectDocsLeadPageObject;
import crm.mhc.pages.objects.CustomerCareExecutiveObjects;
import crm.mhc.pages.objects.CustomerSearchPageObject;
import crm.mhc.pages.objects.HomePageObject;
import crm.mhc.pages.objects.IndividualSalesJourneyPageObject;

import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseStage2PageMethod extends HomePageMethod {

	JavascriptExecutor js;

//************************Fill the Info Stage1 process*****************************-------------//

	public void clk_caseobject() throws InterruptedException

	{
		
		 Actions quick1 = new Actions(driver);
		    quick1.moveToElement(CaseStage2PageObject.clk_caseobject).perform();
		   Thread.sleep(3000);
		   CaseStage2PageObject.clk_caseobject2.click();
	       Select bucket2 = new Select(CaseStage2PageObject.clk_caseobject3);
	       bucket2.selectByVisibleText("Case");
	       //CaseStage2PageObject.clk_caseobject4.click();
	}
	
	public void clk_selfassigncase(String remark) throws InterruptedException

	{
		
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,1100)", " ");
		    CaseStage2PageObject.clk_selectview.click(); 
		    Thread.sleep(1000);
		    CaseStage2PageObject.clk_selectrecord.click(); 
		    Thread.sleep(1000);
		    CaseStage2PageObject.clk_arrorw.click(); 
		    Thread.sleep(1000);
		    CaseStage2PageObject.clk_selectcase.click(); 
		    Thread.sleep(1000);
		    CaseStage2PageObject.clk_selfassigncase.click();
		    Thread.sleep(1000);
		    CaseStage2PageObject.clk_okbutton.click(); 
		    Thread.sleep(1000);
		    CaseStage2PageObject.clk_selectmycaseview.click(); 
		    Thread.sleep(1000);
		    CaseStage2PageObject.clk_selectthecase.click();
		    Thread.sleep(1000);
		    CaseStage2PageObject.clk_editthecase.click();
		    Thread.sleep(1000);
			/*
			 * CaseStage2PageObject.clk_dropdownacceptvalue.click(); Thread.sleep(2000);
			 * WebElement ddown = CaseStage2PageObject.clk_dropdownacceptvalue; // Select
			 * Accept in drop down Select SM = new Select(ddown); SM.selectByIndex(1);
			 */
		    
		    Select Department = new Select(CaseStage2PageObject.clk_dropdownacceptvalue);
		    Thread.sleep(2000);
		    Department.selectByVisibleText("Accept");
		    System.out.println("Seelct Department Decision");
		    Thread.sleep(3000);
		    
		    Thread.sleep(2000);
		    //js.executeScript("window.scrollBy(0,1100)", " ");
		    CaseStage2PageObject.clk_RemarksbyProcessor.sendKeys(remark);
		    
	}
	
	
	/*
	 * public void SelectComputationRequest(String ComputationRequest) throws
	 * InterruptedException {
	 * 
	 * //Thread.sleep(1000); //CaseStage1PageObject.ComputationRequest.click();
	 * //Thread.sleep(5000); Select sel1 = new
	 * Select(CaseStage1PageObject.ComputationRequest);
	 * sel1.selectByValue(ComputationRequest);
	 * 
	 * }
	 * 
	 * public void fill_Remarks(String Remarks) {
	 * CaseStage1PageObject.fill_Remarks.click();
	 * CaseStage1PageObject.fill_Remarks.sendKeys(Remarks);
	 * 
	 * }
	 * 
	 * public void NextOnCasePage() {
	 * CaseJourneyPageObject.clk_NextOnCasePage.click();
	 * 
	 * }
	 * 
	 */
}