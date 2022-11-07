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
    	TDFX.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName);
        EnterPassword(TestDataFromExcel.Password); 
        LoginButtonClick();
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        ClickOnsaleswidget();
        ClickOnsalesJouney();
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        NTBSJPM.NTBJourneynext1();
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        Thread.sleep(1000);
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        NTBSJPM.Product(TestDataFromExcel.Product);
        NTBSJPM.NTBJourneynext2();
        
        
        Thread.sleep(1000);
        CLDLPM.CreatedNewLeadEdit();
        CAPM.selectstatuscodeappointment();
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
        CAPM.PreferredDayTime("12:30 AM");
        Thread.sleep(1000);
        lopm.saveAndProceed();
        LogoutButtonClick();
        QuiteBrowser();

        
      
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
