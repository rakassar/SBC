package TestScenarios;
import org.testng.annotations.Test;


import crm.mhc.common.ListnersClassAnotation;
import crm.mhc.common.Screenshot;
import crm.mhc.common.TestDataFromExcel;
import crm.mhc.pages.methods.CaseJourneyPageMethod;
import crm.mhc.pages.methods.CaseStage1PageMethod;
import crm.mhc.pages.methods.CaseStage2PageMethod;
import crm.mhc.pages.methods.CollectDocsLeadPageMethod;
import crm.mhc.pages.methods.CustomerSerachPageMethod;
import crm.mhc.pages.methods.HomePageMethod;
import crm.mhc.pages.methods.LeadObjectPageMethod;
import crm.mhc.pages.methods.IndividualSalesJourneyPageMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Listeners;		


//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

   public class TC_007_CaseAccountBalanceComputation extends HomePageMethod
   {
	//Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
    Screenshot screen=new Screenshot();
    CaseJourneyPageMethod CJPM=new CaseJourneyPageMethod();
    CaseStage1PageMethod  cs1pm = new CaseStage1PageMethod();
    CaseStage2PageMethod  cs2pm = new CaseStage2PageMethod();
    HomePageMethod home = new HomePageMethod();
	//************************Fill the Info for SD process*****************************-------------//
	//ListnersClassAnotation css=new ListnersClassAnotation(); 
    @Test(priority=1)
	public void CreateNewLead() throws Exception
	{   
	   
    	//launchBrowser();
    	TDFX.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("TC_007_CaseAccountBalanceComputation-");
        EnterPassword(TestDataFromExcel.Password); 
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_007_CaseAccountBalanceComputation-");
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_007_CaseAccountBalanceComputation-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_007_CaseAccountBalanceComputation-");
        ClickOnCaseJouney();
        CJPM.IndividualCaseJorney();
        cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_007_CaseAccountBalanceComputation-");
        cspm.ClickOnNextButtonOnCustomerSearch();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_007_CaseAccountBalanceComputation-");
        cspm.ChooseBBNfromList();
        Thread.sleep(1000);
        cspm.clickstartjourney();
        Thread.sleep(1000);
        cspm.CustomerServiceJourney();
        Thread.sleep(2000);
        CJPM.FillSSC("Account Balance Computation");
	    Thread.sleep(5000); 
	   CJPM.creditcardproduct();
	   Thread.sleep(5000); 
		
		  CJPM.NextOnCasePage(); 
		  home.scrollBy(); 
		  Thread.sleep(5000);
		  
		  //Stage1 Case Journey
		  cs1pm.fill_DetailsInConcern("Test Details of Concern Field");
		  Thread.sleep(1000);
		  cs1pm.SelectComputationRequest("Available Balance Computation");
		  Thread.sleep(1000); 
		  cs1pm.fill_Remarks("Successfull Case Creation");
		  Thread.sleep(1000); 
		  CJPM.casesaveAndProceed(); Thread.sleep(10000);
		  LogoutButtonClick();
		  TDFX.DataRead();
	    	Thread.sleep(5000);
	 		EnterUserName(TestDataFromExcel.UserName1);
	 		Thread.sleep(1000);
	        //screen.ScreenshotMethod("TC_007_CaseAccountBalanceComputation-");
	        EnterPassword(TestDataFromExcel.Password1); 
	        LoginButtonClick();
	        cs2pm.clk_caseobject();
	        Thread.sleep(3000);
	        cs2pm.clk_selfassigncase("Remark By Processor");
	        CJPM.casesaveAndProceed(); 
	        Thread.sleep(1000);
        
        
	}
    

   }
   
   
   

