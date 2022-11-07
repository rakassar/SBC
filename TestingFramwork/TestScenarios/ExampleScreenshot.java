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

//screen shot using listner class
@Listeners(crm.mhc.common.ListnersClassAnotation.class)

   public class ExampleScreenshot extends HomePageMethod
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
    @Test
	public void CreateNewLead() throws Exception
	{   
	   
    	//launchBrowser();
    	TDFX.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName);
        EnterPassword(TestDataFromExcel.Password); 
        LoginButtonClick();
        ClickOnsaleswidget();
        ClickOnsalesJouney();
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(2000);
        screen.ScreenshotMethod("NTBJourney");
	}
    
    @Test
	public void CreateNewLead1() throws Exception
	{   
    {
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        NTBSJPM.Product(TestDataFromExcel.Product);
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(2000);
        //CLDLPM.CreatedNewLeadEdit(); 
        //LoginPageRedircet(); 
        //LogoutButtonClick();
        
    }
    }
    

  //screen shot using listner class
	@Test		
    public void TestToPass()				
    {		
        System.out.println("This method to Check Fail Or Pass");					
        Assert.assertTrue(true);
        
    }	

      
}
