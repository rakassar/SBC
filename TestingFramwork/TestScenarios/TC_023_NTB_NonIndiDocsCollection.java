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

/*Customer Onboarding process for NTB employed Indidvidual

To run on G7 please change nature of work field and uncomment the CRRSC section
*/

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class TC_023_NTB_NonIndiDocsCollection extends HomePageMethod
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
    
    
    
    @Test(priority=1)
	public void CreateNewLeadCollEmp() throws InterruptedException, IOException
	{   
    	launchBrowser();
    	screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
    	TDFX.DataRead();
 		EnterUserName(TestDataFromExcel.UserName_CA);
        EnterPassword(TestDataFromExcel.Password); 
    	screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        ClickOnsalesJouney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        lopm.ClickOnOnBoardingJourneyNonIndi();
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
	}   
    

    @Test(priority=2)
	public void CreateNewLeadCollEmp1() throws InterruptedException, IOException
	{   
        
        NTBSJPM.CompanyName();
        NTBSJPM.EnterMobile();
        NTBSJPM.InterestedIn("Deposit");
        Thread.sleep(300);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        NTBSJPM.NTBJourneynext1();
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        Thread.sleep(500);
        NTBSJPM.Product(TestDataFromExcel.Product);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        
	}

    @Test(priority=3)
	public void CreateNewLeadCollEmp2() throws InterruptedException, IOException
	{  
        CLDLPM.selectstatuscode(); 
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        CLDLPM.Enteremail();
        Thread.sleep(300);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear); //business registration
        
        
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        CLDLPM.CustomerCategory("FINANCIAL CORPORATION (BANK)");
        CLDLPM.CustomerType("Foreign Banks");
        //CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
        CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);        
        CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        //CLDLPM.SoleOwner(TestDataFromExcel.SoleOwner);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
	}   
    

    @Test(priority=4)
	public void CreateNewLeadCollEmp3() throws InterruptedException, IOException
	{ 
       /*employed steps start */
    	CLDLPM.PlcaeOfBirth();  //place of registration
    	CLDLPM.businessExpiry("04042025");
        Thread.sleep(500);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
        Thread.sleep(1000);
        CLDLPM.TypeOfCorp("Domestic Corporation");
        Thread.sleep(500);

        CLDLPM.Tin("");
        Thread.sleep(500);

        CLDLPM.EntityType("Private");
        CLDLPM.NatureOfWork(TestDataFromExcel.NatureOfWork);  // remove New to run on g7
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        
        /*employed steps end */  
        
	}
    

    @Test(priority=5)
	public void CreateNewLeadCollEmp4() throws InterruptedException, IOException
	{ 
        CLDLPM.CorporateDocumentPickerCLK();
        Thread.sleep(500);
        CLDLPM.CorporateDocumentPickerCheck();
        Thread.sleep(500);
        lopm.ProcessApplicationPopUpClose();
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        CLDLPM.AoCode(TestDataFromExcel.AoCode);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        Thread.sleep(500);
        CLDLPM.AddressTabNonindi();
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        CLDLPM.streetfiedNonIndi();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        CLDLPM.ZipcodeNonIndi(TestDataFromExcel.Zipcode);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        Thread.sleep(1000);
        lopm.saveAndProceed();
        Thread.sleep(1000);
   	    screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");

       
        //LogoutButtonClick();
        }
    
    
    @Test(priority=6)
 	public void CreateNewLeadCollEmp5() throws InterruptedException 
 	{    
    	 CLDLPM.clickClosePopup();
    	 screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
         CLDLPM.clickCRRSCButtonNonIndi();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
    	//CLDLPM.leadredbutton();  
         
         
        // OLD CRRSC 
     	CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
     	CRRSC.BankInternalChecklist(TestDataFromExcel.BankInternalChecklist);
     	CRRSC.AllegedPerdsonf(TestDataFromExcel.AllegedPerdsonf);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
     	CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
     	CRRSC.ForeignNational(TestDataFromExcel.ForeignNational);
        scrollBy();
     	CRRSC.IndustryCRRSC(TestDataFromExcel.IndustryCRRSC);
     	Thread.sleep(400);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
     	//CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
        //Thread.sleep(1000);
    // 	CRRSC.ManagerialCRRSC(TestDataFromExcel.managerialCRRSC);
     //	CRRSC.DirectDealingCRRSC(TestDataFromExcel.DirectDealingCRRSC);
     	CRRSC.CityCRRSCNonIndi(TestDataFromExcel.CityCRRSC);
     	//CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
     	//CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
     	CRRSC.vicinityRRSC(TestDataFromExcel.vicinityRRSC);
     	
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
     	CRRSC.intialdepositeRRSC(TestDataFromExcel.intialdepositeRRSC);
     	
     	CRRSC.InwprdOutwordRRSC(TestDataFromExcel.InwprdOutwordRRSC);

        Thread.sleep(1000);
     	CRRSC.customerdeclaredCRRSC(TestDataFromExcel.customerdeclaredCRRSC);   	
     

     	
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
     	CRRSC.ComfortableInformationRRSC(TestDataFromExcel.ComfortableInformationRRSC);
     	CRRSC.ComfortableDocumentsRRSC(TestDataFromExcel.ComfortableDocumentsRRSC);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        
         
         
        /* //New CRRSC
         CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
         CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
         screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
         CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
         CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
         CRRSC.Sbol(TestDataFromExcel.Sbol);
         screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
         CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);         
         */
         CRRSC.RemarksCRRSC("I am Indian!");
         screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
         CRRSC.Finish();
        
         Thread.sleep(1000);
 	}
    
    @Test(priority=7)
 	public void CreateNewLeadCollEmp6() throws InterruptedException 
 	{      
    	Thread.sleep(1000);
   	    CLDLPM.clickClosePopup();
    	screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        lopm.ClickOnCRRSCtab();
        Thread.sleep(2000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
    	CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
    	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
    	lopm.saveAndProceed();
    	Thread.sleep(1000);
    	screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");    	

 	}
    
    @Test(priority=8)
 	public void CreateNewLeadCollEmp7() throws InterruptedException 
 	{      
    	Thread.sleep(500);
    	scrolldown();
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        FAIPM.ClickFillAccountInformation();
        FAIPM.RequestType(TestDataFromExcel.RequestTypef);
        FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
        FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
        FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
        FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        CRRSC.Finish();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        Thread.sleep(1000);
        
 	}
    
    
    @Test(priority=9)
 	public void CreateNewLeadCollEmp8() throws InterruptedException 
 	{      
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        lopm.ProcessApplication();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
        lopm.ProcessApplicationPopUpClose();
        Thread.sleep(2000);
        screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
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
	
      
