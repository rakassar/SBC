package TestScenarios;
import org.testng.annotations.Test;


import crm.mhc.common.ListnersClassAnotation;
import crm.mhc.common.Screenshot;
import crm.mhc.common.TestDataFromExcel;
import crm.mhc.pages.methods.CaseJourneyPageMethod;
import crm.mhc.pages.methods.CaseStagePageMethod;

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

/*case creation by CA for SSC=Account Balance Computation
Source=Call Center
Computation request=TAD / MAD Computation
*/



   public class TC_008_CaseAccountBalanceComputation extends HomePageMethod
   {
	//Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
    Screenshot screen=new Screenshot();
    CaseJourneyPageMethod CJPM=new CaseJourneyPageMethod();
    CaseStagePageMethod  cs1pm = new CaseStagePageMethod();
 
    HomePageMethod home = new HomePageMethod();
	//************************Fill the Info for SD process*****************************-------------//
	//ListnersClassAnotation css=new ListnersClassAnotation(); 
    @Test(priority=1)
	public void CreateCase1() throws Exception
	{   
	   
    	launchBrowser();
    	TDFX.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName_CA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
        EnterPassword(TestDataFromExcel.Password); 
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
        ClickOnCaseJouney();
        CJPM.IndividualCaseJorney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
        cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
        cspm.ClickOnNextButtonOnCustomerSearch();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
        cspm.ChooseBBNfromList();
        Thread.sleep(1000);
        cspm.clickstartjourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
        Thread.sleep(1000);
        cspm.CustomerServiceJourney();
        Thread.sleep(2000);
        CJPM.FillSSC("Account Balance Computation");
        CJPM.Source("Call Center");
	    Thread.sleep(1000); 
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
	    CJPM.creditcardproduct();
	    Thread.sleep(5000); 
		CJPM.NextOnCasePage(); 
		home.scrollBy(); 
		Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
		Thread.sleep(1000);
	   //Stage1 Case Journey
		cs1pm.fill_DetailsInConcern("Test Details of Concern Field");
		Thread.sleep(1000);
		cs1pm.SelectComputationRequest("TAD / MAD Computation");
		Thread.sleep(1000); 
		cs1pm.fill_Remarks("Successful Case Creation");
		Thread.sleep(1000); 
		CJPM.casesaveAndProceed();
		Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
		cs1pm.GetCaseId();
		Thread.sleep(1000); 
		CJPM.casesaveAndProceed();
		Thread.sleep(1000);
		//LogoutButtonClick();
		QuiteBrowser();
		
		
		launchBrowser();
	    //TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_CCGVendorCoordinator_Pro);
	 	Thread.sleep(1000);
	    screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
	    EnterPassword(TestDataFromExcel.Password); 
	    LoginButtonClick();
	    Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
	    Thread.sleep(3000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Assigned to Me");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
	    cs1pm.sel_depetdecison("Accept");
	    cs1pm.fill_Remarks("rizwan");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(500);
		//LogoutButtonClick();
		QuiteBrowser();
	}
		
    
    @Test(priority=2)
    public void CreateCase2() throws Exception
    {
    	Thread.sleep(1500);
	    launchBrowser();
	    //TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_CCGVendorCoordinator_Sup);
	 	Thread.sleep(1000);
	    screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
	    EnterPassword(TestDataFromExcel.Password); 
	    LoginButtonClick();
	    Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
	    Thread.sleep(3000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Assigned to Me");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
	    Thread.sleep(1000);
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    cs1pm.clk_onMyBucketcase();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
	    cs1pm.clk_caseEditButton();
	    cs1pm.sel_depetdecison("Accept");
	    cs1pm.fill_Remarks("rizwan");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(500);
		//LogoutButtonClick();
		QuiteBrowser();
		Thread.sleep(1500);
		

		Thread.sleep(1500);
	    launchBrowser();
	    //TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_CallCenterThirdPartyTeamLeader_Sup);
	 	Thread.sleep(1000);
	    screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
	    EnterPassword(TestDataFromExcel.Password); 
	    LoginButtonClick();
	    Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(3000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Assigned to Me");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
	    Thread.sleep(1000);
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    cs1pm.clk_onMyBucketcase();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
	    cs1pm.clk_caseEditButton();
	    cs1pm.sel_depetdecison("Accept");
	    cs1pm.fill_Remarks("rizwan");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_008_CaseAccountBalanceComputation-");
	    Thread.sleep(5000);
		//LogoutButtonClick();
		QuiteBrowser();
        
        
	}
    

   }
   
   
   

