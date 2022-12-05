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


//case creation by CA for option call centrer
   public class sadadasd extends HomePageMethod
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
   
    
    @Test()
    public void CreateCase2() throws Exception
    {   
    	
    	
    	launchBrowser();
	    TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_CCGVendorCoordinator_Pro);
	 	Thread.sleep(1000);
	    screen.ScreenshotMethod("TC_007_CaseAccountBalanceComputation-");
	    EnterPassword(TestDataFromExcel.Password); 
	    LoginButtonClick();
	    Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(3000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Assigned to Me");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    cs1pm.clk_onMyBucketcase();
	    cs1pm.clk_caseEditButton();
	    cs1pm.sel_depetdecison("Accept");
	    cs1pm.fill_Remarks("rizwan");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(500);
		//LogoutButtonClick();
		QuiteBrowser();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	Thread.sleep(1500);
	    launchBrowser();
	    TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_CCGVendorCoordinator_Sup);
	 	Thread.sleep(1000);
	    screen.ScreenshotMethod("TC_007_CaseAccountBalanceComputation-");
	    EnterPassword(TestDataFromExcel.Password); 
	    LoginButtonClick();
	    Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(3000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    cs1pm.sel_caseview("Assigned to Me");
	    cs1pm.clk_onMycaseview_220("Assigned to Me");
	    cs1pm.clk_onMyBucketcase();
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
	    screen.ScreenshotMethod("TC_007_CaseAccountBalanceComputation-");
	    EnterPassword(TestDataFromExcel.Password); 
	    LoginButtonClick();
	    Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(3000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    cs1pm.sel_caseview("Assigned to Me");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    cs1pm.clk_onMyBucketcase();
	    cs1pm.clk_caseEditButton();
	    cs1pm.sel_depetdecison("Accept");
	    cs1pm.fill_Remarks("rizwan");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(500);
		LogoutButtonClick();
		QuiteBrowser();
        
	}
    

   }
   
   
   

