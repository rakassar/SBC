package TestScenarios;
import org.testng.annotations.Test;

import crm.mhc.common.Screenshot;
import crm.mhc.common.TestDataFromExcel;
import crm.mhc.pages.methods.CollectDocsLeadPageMethod;
import crm.mhc.pages.methods.CustomerSerachPageMethod;
import crm.mhc.pages.methods.HomePageMethod;
import crm.mhc.pages.methods.LeadObjectPageMethod;
import crm.mhc.pages.methods.IndividualSalesJourneyPageMethod;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;		


//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

   public class TC_006_ETBLeadCreation extends HomePageMethod
   {
	//Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
    Screenshot screen=new Screenshot();
    @Test
	public void ETBCreateNewLead() throws Exception
	{   
	   
    	//launchBrowser();
    	TDFX.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName);
        EnterPassword(TestDataFromExcel.Password); 
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_006_ETBLeadCreation-");
        ClickOnsaleswidget();
        ClickOnsalesJouney();
        lopm.ClickOnOnBoardingJourney();
        cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
        Thread.sleep(1000);
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_006_ETBLeadCreation-");
        cspm.ChooseBBNfromList();
        cspm.clickstartjourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_006_ETBLeadCreation-");
        cspm.ETBIndividualSalesJorney();
        //cspm.clickonredbutton();
        //cspm.ClickOnOnBoardingJourneynext2();
        Thread.sleep(2000);
        
	}
        @Test
    	public void ETBCreateNewLead1() throws Exception
    	{    
        
        	NTBSJPM.LeadRating("Hot");
            NTBSJPM.NTBJourneynext1();
            Thread.sleep(1000);
            NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
            NTBSJPM.Product(TestDataFromExcel.Product);
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_006_ETBLeadCreation-");
            NTBSJPM.NTBJourneynext2();
            Thread.sleep(2000);
            //NTBSJPM.NTBignoreandCreate();
            CLDLPM.CheckEmployeetype();
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_006_ETBLeadCreation-");
            Thread.sleep(2000);
            CLDLPM.CreatedNewLeadEdit();
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_006_ETBLeadCreation-");
            Thread.sleep(2000);
	   }
	
        
        @Test
    	public void ETBCreateNewLead2() throws InterruptedException, IOException
    	{   
            CLDLPM.selectstatuscode(); 
            Thread.sleep(1000);
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_006_ETBLeadCreation-");
            CLDLPM.SoleOwner(TestDataFromExcel.SoleOwner);
            Thread.sleep(1000);
			/*
			 * CLDLPM.businessname(); CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
			 * Thread.sleep(2000);
			 */
            
         if (CollectDocsLeadPageMethod.Employeetype.equals("Self-Employed"))
         {
        	 
        	  CLDLPM.businessname();
        	  CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        	  Thread.sleep(1000);
              screen.ScreenshotMethod("TC_006_ETBLeadCreation-");
			  Thread.sleep(2000); 
			  System.out.println("EmployeeType is self-employed");
        	 
         }
         else if (CollectDocsLeadPageMethod.Employeetype.equals("Unemployed"))
        	 
         {
        	 CLDLPM.selectstatuscode(); 
             Thread.sleep(1000);
             screen.ScreenshotMethod("TC_006_ETBLeadCreation-");
             CLDLPM.SoleOwner(TestDataFromExcel.SoleOwner);
             Thread.sleep(1000);
        	 System.out.println("EmployeeType is unemployed");
         }
         else if (CollectDocsLeadPageMethod.Employeetype.equals("Employed"))
         {
       		 CLDLPM.employername();
             Thread.sleep(1000);
             screen.ScreenshotMethod("TC_006_ETBLeadCreation-");
             CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
             Thread.sleep(1000);
             CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
             Thread.sleep(1000);
             screen.ScreenshotMethod("TC_006_ETBLeadCreation-");
             CLDLPM.NatureOfWork(TestDataFromExcel.NatureOfWork);
             Thread.sleep(1000);
        	 System.out.println("EmployeeType is Employed");
         }
           
    	}   
        
        @Test
    	public void ETBCreateNewLead3() throws InterruptedException, IOException
    	
    	{   
        	CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_006_ETBLeadCreation-");
            CLDLPM.IDNumner();
            Thread.sleep(2000);
    	} 
       
        
        @Test
    	public void ETBCreateNewLead4() throws InterruptedException, IOException
    	
    	{   Thread.sleep(2000);
            CLDLPM.ClickOnAddress();
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_006_ETBLeadCreation-");
        	CLDLPM.PermanentAddresssameasPresentAddress(TestDataFromExcel.PermanentAddresssameasPresentAddress);
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_006_ETBLeadCreation-");
            lopm.saveAndProceed();
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_006_ETBLeadCreation-");
            Thread.sleep(3000);
    	} 
       
    

      //screen shot using listner class
    /* @Test
	  public void TestToPass() 
	  
	  {
	  System.out.println("This method to Check Fail Or Pass");
	  Assert.assertTrue(true);
	       */
}
