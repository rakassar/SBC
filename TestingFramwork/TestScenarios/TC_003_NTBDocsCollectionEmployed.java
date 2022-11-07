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
public class TC_003_NTBDocsCollectionEmployed extends HomePageMethod
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
	public void CreateNewLeadCollEmp() throws InterruptedException, IOException
	{   
    	//launchBrowser();
    	TDFX.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName);
        EnterPassword(TestDataFromExcel.Password); 
        LoginButtonClick();
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
        ClickOnsalesJouney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
	}   
    

    @Test
	public void CreateNewLeadCollEmp1() throws InterruptedException, IOException
	{   
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        NTBSJPM.Product(TestDataFromExcel.Product);
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        
	}

    @Test
	public void CreateNewLeadCollEmp2() throws InterruptedException, IOException
	{  
        CLDLPM.selectstatuscode(); 
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
        CLDLPM.Enteremail();
        CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
        CLDLPM.Gender(TestDataFromExcel.Gender);
        CLDLPM.PlcaeOfBirth();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
        CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
        CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
        CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);        
        CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
        CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
        CLDLPM.SoleOwner(TestDataFromExcel.SoleOwner);
        Thread.sleep(1000);
	}   
    

    @Test
	public void CreateNewLeadCollEmp3() throws InterruptedException, IOException
	{ 
       /*employed steps start */
        CLDLPM.Employeetype(TestDataFromExcel.Employeetype); 
        CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsEmp);
        CLDLPM.employername();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
        CLDLPM.occupation(TestDataFromExcel.occupation);
        CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
        Thread.sleep(1000);
        CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
        Thread.sleep(1000);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
        CLDLPM.EconomicActivity(TestDataFromExcel.EconomicActivity);
        Thread.sleep(1000);
        CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
        Thread.sleep(1000);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
        CLDLPM.NatureOfWork(TestDataFromExcel.NatureOfWork);
        Thread.sleep(1000);
        CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        Thread.sleep(1000);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
        /*employed steps end */  
        
	}
    

    @Test
	public void CreateNewLeadCollEmp4() throws InterruptedException, IOException
	{ 
        CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
        Thread.sleep(2000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
        CLDLPM.IDNumner();
        CLDLPM.MaidanName();
        //CLDLPM.Tin("");
        CLDLPM.AoCode(TestDataFromExcel.AoCode);
        CLDLPM.ClickOnAddress();
        CLDLPM.streetfied();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
        CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
        Thread.sleep(1000);
        CLDLPM.mailingaddress(TestDataFromExcel.mailingaddress);
        lopm.saveAndProceed();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
       
        //LogoutButtonClick();
        }
    
    
    @Test
 	public void CreateNewLeadCollEmp5() throws InterruptedException 
 	{    
    	 CLDLPM.clickClosePopup();
         CLDLPM.clickCRRSCButton();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployedCRRSC-");
    	//CLDLPM.leadredbutton();    	
     	CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
     	CRRSC.BankInternalChecklist(TestDataFromExcel.BankInternalChecklist);
     	CRRSC.AllegedPerdsonf(TestDataFromExcel.AllegedPerdsonf);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployedCRRSC-");
     	CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
     	CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
     	CRRSC.ForeignNational(TestDataFromExcel.ForeignNational);
     	CRRSC.NumberAccount(TestDataFromExcel.NeumberAccount);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployedCRRSC-");
     	CRRSC.EmploymentTypeCRRSC(TestDataFromExcel.EmploymentTypeCRRSC);
     	CRRSC.IndustryCRRSC(TestDataFromExcel.IndustryCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployedCRRSC-");
     	//CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
        //Thread.sleep(1000);
     	CRRSC.ManagerialCRRSC(TestDataFromExcel.managerialCRRSC);
     	CRRSC.DirectDealingCRRSC(TestDataFromExcel.DirectDealingCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployedCRRSC-");
        Thread.sleep(1000);
     	CRRSC.CityCRRSC(TestDataFromExcel.CityCRRSC);
     	//CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
     	//CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployedCRRSC-");
     	CRRSC.vicinityRRSC(TestDataFromExcel.vicinityRRSC);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployedCRRSC-");
     	CRRSC.intialdepositeRRSC(TestDataFromExcel.intialdepositeRRSC);
     	CRRSC.customerdeclaredCRRSC(TestDataFromExcel.customerdeclaredCRRSC);   	
     	CRRSC.InwprdOutwordRRSC(TestDataFromExcel.InwprdOutwordRRSC);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployedCRRSC-");
     	CRRSC.ComfortableInformationRRSC(TestDataFromExcel.ComfortableInformationRRSC);
     	CRRSC.ComfortableDocumentsRRSC(TestDataFromExcel.ComfortableDocumentsRRSC);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployedCRRSC-");
        CRRSC.RemarksCRRSC("I am Indian!");
        CRRSC.Finish();
        Thread.sleep(1000);
 	}
    
    @Test
 	public void CreateNewLeadCollEmp6() throws InterruptedException 
 	{      
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployedOfac-");
    	CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
    	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
    	lopm.saveAndProceed();
    	Thread.sleep(1000);
 	}
    
    @Test
 	public void CreateNewLeadCollEmp7() throws InterruptedException 
 	{      
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployedFillAccount-");
        FAIPM.ClickFillAccountInformation();
        FAIPM.RequestType(TestDataFromExcel.RequestTypef);
        FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployedFillAccount-");
        FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
        FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployedFillAccount-");
        FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
        FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
        FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployedFillAccount-");
        CRRSC.Finish();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployedFillAccount-");
        Thread.sleep(1000);
        
 	}
    
    
    @Test
 	public void CreateNewLeadCollEmp8() throws InterruptedException 
 	{      
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployedProcessApplication");
        lopm.ProcessApplication();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployedFillAccount-");
        lopm.ProcessApplicationPopUpClose();
        Thread.sleep(77770);
        
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
	
      
