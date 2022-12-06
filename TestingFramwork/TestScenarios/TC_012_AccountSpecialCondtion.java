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

/*case creation by CA for SSC=Account Special Condition-Tagging/Untagging
Source=Branch Walkin

*/


   public class TC_012_AccountSpecialCondtion extends HomePageMethod
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
    
    
	//ListnersClassAnotation css=new ListnersClassAnotation(); 
    @Test(priority=1)
	public void CreateNewLead() throws Exception
	{   
    	launchBrowser();
    	TDFX.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName_CA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
        EnterPassword(TestDataFromExcel.Password); 
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
        ClickOnCaseJouney();
        CJPM.IndividualCaseJorney();
        cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
        cspm.ClickOnNextButtonOnCustomerSearch();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_007_CaseAccountBalanceComputation-");
        cspm.ChooseBBNfromList();
        Thread.sleep(1000);
        cspm.clickstartjourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
        Thread.sleep(1000);
        cspm.CustomerServiceJourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
        Thread.sleep(2000);
        CJPM.FillSSC("Account Special Condition-Tagging/Untagging");
        Thread.sleep(2000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
       	CJPM.Source("Branch Walkin");
	    Thread.sleep(1000); 
	    CJPM.creditcardproduct();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
	    Thread.sleep(1000); 
		CJPM.NextOnCasePage(); 
		Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
		home.scrollBy(); 
		Thread.sleep(2000);
	   //Stage1 Case Journey
		cs1pm.fill_DetailsInConcern("Test Details of Concern Field");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
        cs1pm.SpecialCondition("Lifting of Escheatment Tag");
        cs1pm.Specialaction("Untagging");
        cs1pm.ReasonforTagging("Untagging");
		Thread.sleep(1000); 
		cs1pm.fill_Remarks("Successful Case Creation");
		Thread.sleep(1000); 
		CJPM.casesaveAndProceed();
		cs1pm.GetCaseId();
		Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
		Thread.sleep(1000);
		//LogoutButtonClick();
		QuiteBrowser();
		

		
		
		launchBrowser();
	    //TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_BranchBCM);
	 	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    EnterPassword(TestDataFromExcel.Password); 
	    LoginButtonClick();
	    Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    Thread.sleep(1000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Assigned to Me");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    cs1pm.sel_depetdecison("Additional Information Required");
	    cs1pm.fill_Remarks("Additional Information Required by CA");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(5000);
		//LogoutButtonClick();
		QuiteBrowser();
		
		
		
		
		
		
		
		
		
		
		
    	launchBrowser();
    	//TDFX.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName_CA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("TC_011__CaseAccountBalanceComputationAIP-");
        EnterPassword(TestDataFromExcel.Password); 
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_011__CaseAccountBalanceComputationAIP-");
        Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_011__CaseAccountBalanceComputationAIP-");
	    //Thread.sleep(1000);
	   // cs1pm.clk_selfassigncase("Assigned to Department");
	    //Thread.sleep(1000);
        //screen.ScreenshotMethod("TC_011__CaseAccountBalanceComputationAIP-");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Additional Info Required/ Re-categorize");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_011__CaseAccountBalanceComputationAIP-");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(3000);
        screen.ScreenshotMethod("TC_011__CaseAccountBalanceComputationAIP-");
	    cs1pm.sel_depetdecisonreverse("Additional Info Provided");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
	    cs1pm.fill_Remarks("Additional Info Provided by CA");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_011__CaseAccountBalanceComputationAIP-");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(5000);
		//LogoutButtonClick();
		QuiteBrowser();
		
		
		
		launchBrowser();
    	//TDFX.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName_BranchBCM);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("TC_011__CaseAccountBalanceComputationAIP-");
        EnterPassword(TestDataFromExcel.Password); 
        LoginButtonClick();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_011__CaseAccountBalanceComputationAIP-");
        Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_011__CaseAccountBalanceComputationAIP-");
	    //Thread.sleep(1000);
	   // cs1pm.clk_selfassigncase("Assigned to Department");
	    //Thread.sleep(1000);
        //screen.ScreenshotMethod("TC_011__CaseAccountBalanceComputationAIP-");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Additional Info Provided");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_011__CaseAccountBalanceComputationAIP-");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(3000);
        screen.ScreenshotMethod("TC_011__CaseAccountBalanceComputationAIP-");
	    cs1pm.sel_depetdecison("Accept");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
	    cs1pm.fill_Remarks("After Additional Info Provided BCM Approved");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_011__CaseAccountBalanceComputationAIP-");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(5000);
		//LogoutButtonClick();
		QuiteBrowser();
		
		
		
		
		
		launchBrowser();
	    //TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_AreaHead);
	 	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    EnterPassword(TestDataFromExcel.Password); 
	    LoginButtonClick();
	    Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    Thread.sleep(1000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Assigned to Me");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    cs1pm.sel_depetdecison("Rework Required");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
	    cs1pm.fill_Remarks("Rework Required to BCM");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(5000);
		//LogoutButtonClick();
		QuiteBrowser();
		
		
		
		launchBrowser();
	    //TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_BranchBCM);
	 	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    EnterPassword(TestDataFromExcel.Password); 
	    LoginButtonClick();
	    Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    Thread.sleep(1000);
	   // cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Rework Required");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    cs1pm.sel_depetdecisonRR("Rework Done");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
	    cs1pm.fill_Remarks("Rework Done by BCM");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(5000);
		//LogoutButtonClick();
		QuiteBrowser();
		
		
		
		
		
		launchBrowser();
	    //TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_AreaHead);
	 	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    EnterPassword(TestDataFromExcel.Password); 
	    LoginButtonClick();
	    Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    Thread.sleep(1000);
	    //cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Rework Done");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    cs1pm.sel_depetdecison("Accept");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
	    cs1pm.fill_Remarks("After Rework Done accept decision");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(5000);
		//LogoutButtonClick();
		QuiteBrowser();
		
		
		

		
		launchBrowser();
	    //TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_BbogRegionHead);
	 	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    EnterPassword(TestDataFromExcel.Password); 
	    LoginButtonClick();
	    Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    Thread.sleep(1000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Assigned to Me");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    cs1pm.sel_depetdecison("Accept");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
	    cs1pm.fill_Remarks("Accept by BBOG Region Head");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(5000);
		//LogoutButtonClick();
		QuiteBrowser();
		
		
		launchBrowser();
	    //TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_BranchFinconHead);
	 	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    EnterPassword(TestDataFromExcel.Password); 
	    LoginButtonClick();
	    Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    Thread.sleep(1000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Assigned to Me");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    cs1pm.sel_depetdecison("Accept");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
	    cs1pm.fill_Remarks("Accept by BCM Fincon Head");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(5000);
		//LogoutButtonClick();
		QuiteBrowser();
		
		
		
		
		

		launchBrowser();
	    //TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_BBGCDMaintenanceAnalyst);
	 	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    EnterPassword(TestDataFromExcel.Password); 
	    LoginButtonClick();
	    Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    Thread.sleep(1000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Assigned to Me");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    cs1pm.sel_depetdecison("Accept");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion-");
	    cs1pm.fill_Remarks("Accept by BBGCDC Manintenance");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("TC_012_AccountSpecialCondtion");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(5000);
		//LogoutButtonClick();
		QuiteBrowser();
		
		}
    }
   
   
   

