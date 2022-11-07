package TestScenarios;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import crm.mhc.common.Screenshot;
import crm.mhc.common.TestDataFromExcel;
import crm.mhc.pages.methods.CollectDocsLeadPageMethod;
import crm.mhc.pages.methods.CustomerSerachPageMethod;
import crm.mhc.pages.methods.HomePageMethod;
import crm.mhc.pages.methods.LeadObjectPageMethod;
import crm.mhc.pages.methods.IndividualSalesJourneyPageMethod;


//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class TC_005_LeadDocsCollectedSelfEmployed extends HomePageMethod
{
	 //Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
	TestDataFromExcel TDFX=new TestDataFromExcel();
	Screenshot screen=new Screenshot();

	//************************Fill the Info for SD process*****************************-------------//
		
    @Test
	public void CreateNewLeadCollSelfEmp() throws InterruptedException, IOException
	{   

	   
    	//launchBrowser();
    	TDFX.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName);
        EnterPassword(TestDataFromExcel.Password); 
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        ClickOnsaleswidget();
        ClickOnsalesJouney();
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        Thread.sleep(2000);
        
	}
    
    @Test
	public void CreateNewLeadCollSelfEmp1() throws InterruptedException, IOException
	{   
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        Thread.sleep(1000);
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        NTBSJPM.Product(TestDataFromExcel.Product);
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        Thread.sleep(2000);
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        
	}
    
    @Test
	public void CreateNewLeadCollSelfEmp2() throws InterruptedException, IOException
	{  
        
        CLDLPM.selectstatuscode(); 
        Thread.sleep(1000);
        CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");;
        CLDLPM.Enteremail();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.Gender(TestDataFromExcel.Gender);
        CLDLPM.PlcaeOfBirth();
        CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
        CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact); 
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
        CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
        CLDLPM.SoleOwner(TestDataFromExcel.SoleOwner);
        Thread.sleep(1000);
	}
    
    @Test
	public void CreateNewLeadCollSelfEmp3() throws InterruptedException, IOException
	{  
        /*self-employed steps start */
        CLDLPM.Employeetype("Self-Employed"); 
        CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsSelemp);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.businessname();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.occupation(TestDataFromExcel.occupation);
        CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
        Thread.sleep(1000);
        CLDLPM.EconomicActivity(TestDataFromExcel.EconomicActivity);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed");
        Thread.sleep(1000);
        CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
        Thread.sleep(1000);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed");
        CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        Thread.sleep(1000);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.NatureOfWork(TestDataFromExcel.NatureOfWork);
        Thread.sleep(1000);
   
        /*self-employed steps end */
       
	}
    
    @Test
	public void CreateNewLeadCollSelfEmp4() throws InterruptedException, IOException
	{  
        CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
        Thread.sleep(1000);
        CLDLPM.IDNumner();
        //CLDLPM.Tin("");
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.AoCode(TestDataFromExcel.AoCode);
        CLDLPM.MaidanName();
        CLDLPM.ClickOnAddress();
        CLDLPM.streetfied();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        Thread.sleep(1000);
        CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.mailingaddress(TestDataFromExcel.mailingaddress);
        lopm.saveAndProceed();
        Thread.sleep(1000);
        //LogoutButtonClick();
       // QuiteBrowser();

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
    
 	
 
