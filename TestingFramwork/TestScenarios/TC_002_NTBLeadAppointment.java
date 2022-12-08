package TestScenarios;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import crm.mhc.common.Screenshot;
import crm.mhc.common.TestDataFromExcel;
import crm.mhc.pages.methods.CollectDocsLeadPageMethod;
import crm.mhc.pages.methods.CustomerSerachPageMethod;
import crm.mhc.pages.methods.HomePageMethod;
import crm.mhc.pages.methods.LeadObjectPageMethod;
import crm.mhc.pages.methods.IndividualSalesJourneyPageMethod;
import crm.mhc.pages.methods.CreateLeadAppointmentPageMethod;

//screen shot via listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

public class TC_002_NTBLeadAppointment extends HomePageMethod
{
	

	//************************Fill the Info for SD process*****************************-------------//
		
    @Test
	public void CreateSNewLead() throws InterruptedException, IOException
	{   
    	 
	    //Object for methods class
    	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
    	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
    	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
    	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
    	TestDataFromExcel TDFX=new TestDataFromExcel();
    	CreateLeadAppointmentPageMethod CAPM=new CreateLeadAppointmentPageMethod();
    	Screenshot screen=new Screenshot();

    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
    	TDFX.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.UserName_CA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        EnterPassword(TestDataFromExcel.Password); 
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        CheckRole();
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        ClickOnsalesJouney();
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        NTBSJPM.NTBJourneynext1();
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        Thread.sleep(1000);
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        NTBSJPM.Product(TestDataFromExcel.Product);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        CAPM.selectstatuscodeappointment();
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        CAPM.PreferredDayTime("11:50 PM");
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        lopm.ClickOnActivitiestab();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        
        LogoutButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
       // QuiteBrowser();

        
      
    }
    
    //screen shot via listner class
    /*
	 * @Test public void TestToPass() {
	 * System.out.println("This method to Check Fail Or Pass");
	 * Assert.assertTrue(true);
	 * 
	 * }
	 */

      
}
