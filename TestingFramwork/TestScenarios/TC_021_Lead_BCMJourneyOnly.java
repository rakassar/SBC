package TestScenarios;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import crm.mhc.common.Screenshot;
import crm.mhc.common.TestDataFromExcel;
import crm.mhc.pages.methods.CRRSCLeadPageMethod;
import crm.mhc.pages.methods.CollectDocsLeadPageMethod;
import crm.mhc.pages.methods.CustomerSerachPageMethod;
import crm.mhc.pages.methods.FillAccountInformationPageMethod;
import crm.mhc.pages.methods.HomePageMethod;
import crm.mhc.pages.methods.LeadObjectPageMethod;
import crm.mhc.pages.methods.IndividualSalesJourneyPageMethod;

/* lead for high risk BCM jourmey 
*/


//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class TC_021_Lead_BCMJourneyOnly extends HomePageMethod
{
	
    //Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
	TestDataFromExcel TDFX=new TestDataFromExcel();
	CRRSCLeadPageMethod CRRSC= new CRRSCLeadPageMethod();
    Screenshot screen=new Screenshot();
    FillAccountInformationPageMethod FAIPM=new FillAccountInformationPageMethod();
    
    
    
   
    @Test
 	public void LeadHighRiskBCM7() throws InterruptedException, IOException 
 	{ 
    //LogoutButtonClick();
    launchBrowser();
    TDFX.DataRead();
    Thread.sleep(1000);
    screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    EnterUserName(TestDataFromExcel.UserName_BranchBCM);
    EnterPassword(TestDataFromExcel.Password); 
	screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    LoginButtonClick();
    CheckRole();
	Thread.sleep(500);
    clk_leadobject();
    lopm.categoryview("Deposit-Individual");
    lopm.selfassignlead("Need Approval");
    lopm.leadview("Assigned Leads");
    lopm.onMyBucketlead();
    lopm.BmApproveButtonclk();
    lopm.BmApproveComments("BM Comments");
    lopm.BmApproveUpdate();
    screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    QuiteBrowser();
 	}
    
    @Test
 	public void LeadHighRiskBCM8() throws InterruptedException 
 	
 	{   
    	
    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        EnterUserName(TestDataFromExcel.UserName_CA);
        EnterPassword(TestDataFromExcel.Password); 
    	screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        clk_leadobject();
        lopm.categoryview("Deposit-Individual");
        lopm.leadview("Assigned Leads");
        lopm.onMyBucketlead();

 	}
 	
    
    @Test
 	public void LeadHighRiskBCM9() throws InterruptedException 
 	{      
    	Thread.sleep(500);
    	scrolldown();
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        FAIPM.ClickFillAccountInformation();
        FAIPM.RequestType(TestDataFromExcel.RequestTypef);
        FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
        FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
        FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
        FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        CRRSC.Finish();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        Thread.sleep(1000);
        
 	}
    
    
    @Test
 	public void LeadHighRiskBCM10() throws InterruptedException 
 	{      
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        lopm.ProcessApplication();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        lopm.ProcessApplicationPopUpClose();
        Thread.sleep(2000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
 	}
    
    
	/*
	 * //screen shot using listner class
	 * 
	 * @Test public void TestToPass() {
	 * System.out.println("This method to Check Fail Or Pass");
	 * Assert.assertTrue(true);
	 * 
	 * }
	 */

     }
	
      
