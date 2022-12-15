package TestScenarios;
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

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Listeners;		

/*
ETB onboarding journey, Including open case dedupe
*/

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

   public class TC_024_ETBLeadCreationNonIndi extends HomePageMethod
   {
	//Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
	CRRSCLeadPageMethod CRRSC= new CRRSCLeadPageMethod();
    FillAccountInformationPageMethod FAIPM=new FillAccountInformationPageMethod();
    Screenshot screen=new Screenshot();
    
    @Test(priority=1)
	public void ETBCreateNewLead() throws Exception
	{   
	   
    	launchBrowser();
    	screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
    	TDFX.DataRead();
    	Thread.sleep(500);
    	screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
 		EnterUserName(TestDataFromExcel.UserName_CA);
        EnterPassword(TestDataFromExcel.Password); 
    	screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
        LoginButtonClick();
        CheckRole();
        Thread.sleep(500);
        screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
        ClickOnsalesJouney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
        lopm.ClickOnOnBoardingJourneyNonIndi();
        cspm.BBNFillForCustomerSearchNonIndi("10200000980");
        Thread.sleep(1000);
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
        cspm.ChooseBBNfromListNonIndi();
        Thread.sleep(2000);
        screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
        cspm.clickstartjourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
        cspm.ETBIndividualSalesJorney();
        //cspm.clickonredbutton();
        //cspm.ClickOnOnBoardingJourneynext2();
        Thread.sleep(2000);
        screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
        
	}
    @Test(priority=2)
    	public void ETBCreateNewLead1() throws Exception
    	{    
        
        	
            NTBSJPM.InterestedIn("Deposit");
            NTBSJPM.NTBJourneynext1();
            Thread.sleep(1000);
            NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
            Thread.sleep(500);
            NTBSJPM.Product(TestDataFromExcel.Product);
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            NTBSJPM.NTBJourneynext2();
            Thread.sleep(2000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            //NTBSJPM.NTBignoreandCreate();
			lopm.ClickOnAddresstab();
			Thread.sleep(500);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
           
	   }
	
        
    @Test(priority=3)
    	public void ETBCreateNewLead2() throws InterruptedException, IOException
    	{   
        	 CLDLPM.CreatedNewLeadEdit();
             Thread.sleep(1000);
             screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            CLDLPM.selectstatuscode(); 
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
			    	}   
        
    @Test(priority=4)
    	public void ETBCreateNewLead3() throws InterruptedException, IOException
    	
    	{   
        	CLDLPM.CorporateDocumentPickerCLK();
            Thread.sleep(500);
            CLDLPM.CorporateDocumentPickerCheck();
            Thread.sleep(500);
            lopm.ProcessApplicationPopUpClose();
            screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
    	} 
       
        
    @Test(priority=5)
    	public void ETBCreateNewLead4() throws InterruptedException, IOException
    	
    	{   Thread.sleep(2000);
            CLDLPM.AddressTabNonindi();
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
        	CLDLPM.PlantAddresssameasOfficeAddress(TestDataFromExcel.PermanentAddresssameasPresentAddress);
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            lopm.saveAndProceed();
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            Thread.sleep(3000);
            
			/*
			 * try{driver.findElement(By.xpath("//button[@type = 'button'][1]")).click();
			 * System.out.println("case dedupe fired");}
			 * 
			 * 
			 * catch(NoSuchElementException e) { System.out.println("no case dedupe");
			 */
            NTBSJPM.CaseDedupeOnDocsLead();
    	} 
    @Test(priority=6)
    	public void ETBCreateNewLead5() throws InterruptedException, IOException
    	
    	{  
        
        Thread.sleep(1000);
   	    CLDLPM.clickClosePopup();
        screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
    	CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
    	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
    	lopm.saveAndProceed();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
       
    
    	}
    @Test(priority=7)
    	public void ETBCreateNewLead6() throws InterruptedException, IOException
     	{      
        	Thread.sleep(500);
        	lopm.ClickOnUpdtButton();
        	Thread.sleep(500);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            lopm.popupdate360("No");
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            lopm.update360();
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            FAIPM.ClickFillAccountInformation();
            FAIPM.RequestType(TestDataFromExcel.RequestTypef);
            FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
            FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
            FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
            FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            CRRSC.Finish();
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            Thread.sleep(1000);
            
            
     	}
    @Test(priority=8)
    	public void ETBCreateNewLead7() throws InterruptedException, IOException
     	{      
        	Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            lopm.ProcessApplication();
            Thread.sleep(1000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
            lopm.ProcessApplicationPopUpClose();
            Thread.sleep(2000);
            screen.ScreenshotMethod("TC_024_ETBLeadCreationNonIndi-");
     	}
        
      //screen shot using listner class
    /* @Test
	  public void TestToPass() 
	  
	  {
	  System.out.println("This method to Check Fail Or Pass");
	  Assert.assertTrue(true);
	       */
}
