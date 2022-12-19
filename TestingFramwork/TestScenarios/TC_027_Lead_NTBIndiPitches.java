package TestScenarios;
import org.testng.annotations.Test;


import crm.mhc.common.ListnersClassAnotation;
import crm.mhc.common.Screenshot;
import crm.mhc.common.TestDataFromExcel;
import crm.mhc.pages.methods.CollectDocsLeadPageMethod;
import crm.mhc.pages.methods.CustomerSerachPageMethod;
import crm.mhc.pages.methods.HomePageMethod;
import crm.mhc.pages.methods.LeadObjectPageMethod;
import crm.mhc.pages.methods.IndividualSalesJourneyPageMethod;

import org.testng.Assert;
import org.testng.annotations.Listeners;		

/* Lead creation process for NTB Individual
 
 */

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

   public class TC_027_Lead_NTBIndiPitches extends HomePageMethod
   {
	//Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
    Screenshot screen=new Screenshot();


	//************************Fill the Info for SD process*****************************-------------//
	//ListnersClassAnotation css=new ListnersClassAnotation(); 
    @Test(priority=1)
	public void CreateNewLead() throws Exception
	{  
    	
    	//rizwan
	   
    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_027_Lead_NTBIndiPitches-");
    	TDFX.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.UserName_CA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("TC_027_Lead_NTBIndiPitches-");
        EnterPassword(TestDataFromExcel.Password); 
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_027_Lead_NTBIndiPitches-");
        CheckRole();
        screen.ScreenshotMethod("TC_027_Lead_NTBIndiPitches-");
       
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_027_Lead_NTBIndiPitches-");
        ClickOnsalesJouney();
        
        lopm.ClickOnOnBoardingJourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_027_Lead_NTBIndiPitches-");
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(2000);
        screen.ScreenshotMethod("TC_027_Lead_NTBIndiPitches-");
	}
    
    @Test(priority=2)
	public void CreateNewLead1() throws Exception
	{   
    
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        NTBSJPM.pitchMultipleProduct("Yes");
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_027_Lead_NTBIndiPitches-");
        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_027_Lead_NTBIndiPitches-");
        Thread.sleep(1000);
        CLDLPM.Gender(TestDataFromExcel.Gender);
        NTBSJPM.SDBranch("Acropolis");
        Thread.sleep(500);
        CLDLPM.salesID("0014-Velasco, Jacqueline L.");
        Thread.sleep(500);
        screen.ScreenshotMethod("TC_027_Lead_NTBIndiPitches-");  
    }
    
    
    @Test(priority=3)
	public void CreateNewLead2() throws Exception
	{   
        scrollBy();
        NTBSJPM.checkboxSaving();
        NTBSJPM.checkboxChecking();
        NTBSJPM.checkboxDeal();      	
        NTBSJPM.checkboxPersonalLoan();      	
        NTBSJPM.checkboxAutoloan();      	
        NTBSJPM.checkboxHomeLoan();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_027_Lead_NTBIndiPitches-");
        NTBSJPM.checkboxCreditCard();      	
        NTBSJPM.checkboxOtherloan();      	
        NTBSJPM.checkboxTrust();      	
        NTBSJPM.checkboxUITF();      	
        NTBSJPM.checkBoxBanca();      	
        NTBSJPM.checkboxTreasury();
        Thread.sleep(500);
        screen.ScreenshotMethod("TC_027_Lead_NTBIndiPitches-");
        scrollBy();
        CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
        screen.ScreenshotMethod("TC_027_Lead_NTBIndiPitches-");
        lopm.saveAndProceed();
    	Thread.sleep(5000);


    
    }
    @Test(priority=4)
	public void CreateNewLead3() throws Exception
	{  
    	Thread.sleep(7000);
        screen.ScreenshotMethod("TC_027_Lead_NTBIndiPitches-");
        scrollBy();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_027_Lead_NTBIndiPitches-");
        scrollBy();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_027_Lead_NTBIndiPitches-");
        LogoutButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
	}

  //screen shot using listner class
	/*
	 * @Test public void TestToPass() {
	 * System.out.println("This method to Check Fail Or Pass");
	 * Assert.assertTrue(true);
	 * 
	 * }
	 */
   }
      

