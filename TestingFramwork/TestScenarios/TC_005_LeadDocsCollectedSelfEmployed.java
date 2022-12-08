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
	CRRSCLeadPageMethod CRRSC= new CRRSCLeadPageMethod();
    FillAccountInformationPageMethod FAIPM=new FillAccountInformationPageMethod();

	//************************Fill the Info for SD process*****************************-------------//
		
    @Test
	public void CreateNewLeadCollSelfEmp() throws InterruptedException, IOException
	{   

	   
    	launchBrowser();
    	screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed--");
    	TDFX.DataRead();
 		EnterUserName(TestDataFromExcel.UserName_CA);
        EnterPassword(TestDataFromExcel.Password); 
    	screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        LoginButtonClick();
        CheckRole();
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        ClickOnsalesJouney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
        
	}
    
    @Test
	public void CreateNewLeadCollSelfEmp1() throws InterruptedException, IOException
	{   
        
    	NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");

        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        NTBSJPM.Product(TestDataFromExcel.Product);
        Thread.sleep(500);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);        
	}
    
    @Test
	public void CreateNewLeadCollSelfEmp2() throws InterruptedException, IOException
	{  
        
    	CLDLPM.selectstatuscode(); 
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.Enteremail();
        Thread.sleep(300);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
        CLDLPM.Gender(TestDataFromExcel.Gender);
        CLDLPM.PlcaeOfBirth();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
        CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
        CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);        
        CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.SoleOwner(TestDataFromExcel.SoleOwner);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
	}
    
    @Test
	public void CreateNewLeadCollSelfEmp3() throws InterruptedException, IOException
	{  
        /*self-employed steps start */
        CLDLPM.Employeetype("Self-Employed"); 
        CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsSelemp);
        CLDLPM.businessname();
        Thread.sleep(1000);
        CLDLPM.occupation(TestDataFromExcel.occupation);
        CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
        Thread.sleep(1000);
        scrollBy();
        CLDLPM.EconomicActivity(TestDataFromExcel.EconomicActivity);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        Thread.sleep(1000);
        CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        Thread.sleep(1000);
        CLDLPM.NatureOfWork(TestDataFromExcel.NatureOfWork);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed--");

   
        /*self-employed steps end */
       
	}
    
    @Test
	public void CreateNewLeadCollSelfEmp4() throws InterruptedException, IOException
	{  
    	CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
        CLDLPM.IDNumner();
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.MaidanName();
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        //CLDLPM.Tin("");
        CLDLPM.AoCode(TestDataFromExcel.AoCode);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.ClickOnAddress();
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.streetfied();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.mailingaddress(TestDataFromExcel.mailingaddress);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
   	    screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        //LogoutButtonClick();
       // QuiteBrowser();

	}@Test
 	public void CreateNewLeadCollSelfEmp5() throws InterruptedException 
 	{    
    	CLDLPM.clickClosePopup();
   	 screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CLDLPM.clickCRRSCButton();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
   	//CLDLPM.leadredbutton();    	
    	CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
    	CRRSC.BankInternalChecklist(TestDataFromExcel.BankInternalChecklist);
    	CRRSC.AllegedPerdsonf(TestDataFromExcel.AllegedPerdsonf);
       Thread.sleep(1000);
       screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
    	CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
    	CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
    	CRRSC.ForeignNational(TestDataFromExcel.ForeignNational);
    	CRRSC.NumberAccount(TestDataFromExcel.NeumberAccount);
       Thread.sleep(1000);
       screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
    	CRRSC.EmploymentTypeCRRSC(TestDataFromExcel.EmploymentTypeCRRSC);
    	CRRSC.IndustryCRRSC(TestDataFromExcel.IndustryCRRSC);
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
    	//CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
       //Thread.sleep(1000);
    	CRRSC.ManagerialCRRSC(TestDataFromExcel.managerialCRRSC);
    	CRRSC.DirectDealingCRRSC(TestDataFromExcel.DirectDealingCRRSC);
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
       Thread.sleep(1000);
    	CRRSC.CityCRRSC(TestDataFromExcel.CityCRRSC);
    	//CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
    	//CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC);
    	Thread.sleep(1000);
       screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
    	CRRSC.vicinityRRSC(TestDataFromExcel.vicinityRRSC);
    	
       Thread.sleep(1000);
       screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
    	CRRSC.intialdepositeRRSC(TestDataFromExcel.intialdepositeRRSC);
    	
    	CRRSC.InwprdOutwordRRSC(TestDataFromExcel.InwprdOutwordRRSC);

       Thread.sleep(1000);
    	CRRSC.customerdeclaredCRRSC(TestDataFromExcel.customerdeclaredCRRSC);   	
    

    	
       screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
    	CRRSC.ComfortableInformationRRSC(TestDataFromExcel.ComfortableInformationRRSC);
    	CRRSC.ComfortableDocumentsRRSC(TestDataFromExcel.ComfortableDocumentsRRSC);
       Thread.sleep(1000);
       screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
       CRRSC.RemarksCRRSC("I am Indian!");
       CRRSC.Finish();
       Thread.sleep(1000);
 	}
    
    @Test
 	public void CreateNewLeadCollSelfEmp6() throws InterruptedException 
 	{      
    	Thread.sleep(1000);
   	    CLDLPM.clickClosePopup();
    	screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        lopm.ClickOnCRRSCtab();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
    	CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
    	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
    	lopm.saveAndProceed();
    	Thread.sleep(1000);
    	screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-"); 
 	}
    
    @Test
 	public void CreateNewLeadCollSelfEmp7() throws InterruptedException 
 	{      
    	Thread.sleep(500);
    	scrolldown();
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        FAIPM.ClickFillAccountInformation();
        FAIPM.RequestType(TestDataFromExcel.RequestTypef);
        FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
        FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
        FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
        FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        CRRSC.Finish();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        Thread.sleep(1000);
        
        
 	}
    
    
    @Test
 	public void CreateNewLeadCollSelfEmp8() throws InterruptedException 
 	{      
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        lopm.ProcessApplication();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
        lopm.ProcessApplicationPopUpClose();
        Thread.sleep(2000);
        screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed-");
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
    
 	
 
