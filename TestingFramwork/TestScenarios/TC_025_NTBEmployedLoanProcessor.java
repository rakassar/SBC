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
public class TC_025_NTBEmployedLoanProcessor extends HomePageMethod
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
    	screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
    	TDFX.DataRead();
 		EnterUserName(TestDataFromExcel.UserName_LoanProcessor);
        EnterPassword(TestDataFromExcel.Password); 
    	screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        ClickOnLoanJouney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        lopm.ClickOnOnBoardingJourney();
        Thread.sleep(1000);
	}   
    

    @Test(priority=2)
	public void CreateNewLeadCollEmp1() throws InterruptedException, IOException
	{   
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");

        NTBSJPM.NTBJourneynext1();
        
        Thread.sleep(1000);
    	screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        
	}

    @Test(priority=3)
	public void CreateNewLeadCollEmp2() throws InterruptedException, IOException
	{  
        CLDLPM.selectstatuscode(); 
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        CLDLPM.Enteremail();
        Thread.sleep(300);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
        CLDLPM.Gender(TestDataFromExcel.Gender);
        CLDLPM.PlcaeOfBirth();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
        CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
        CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);        
        CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        CLDLPM.SoleOwner(TestDataFromExcel.SoleOwner);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
	}   
    

    @Test(priority=4)
	public void CreateNewLeadCollEmp3() throws InterruptedException, IOException
	{ 
       /*employed steps start */
        CLDLPM.Employeetype(TestDataFromExcel.Employeetype); 
        CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsEmp);
        CLDLPM.employername();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        CLDLPM.occupation(TestDataFromExcel.occupation);
        CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
        Thread.sleep(1000);
        CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        CLDLPM.EconomicActivity(TestDataFromExcel.EconomicActivity);
        Thread.sleep(500);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        CLDLPM.NatureOfWork(TestDataFromExcel.NatureOfWork);  // remove New to run on g7
        Thread.sleep(1000);
        CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        /*employed steps end */  
        
	}
    

    @Test(priority=5)
	public void CreateNewLeadCollEmp4() throws InterruptedException, IOException
	{ 
        CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
        CLDLPM.IDNumner();
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        CLDLPM.MaidanName();
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        //CLDLPM.Tin("");
        CLDLPM.AoCode(TestDataFromExcel.AoCode);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        CLDLPM.ClickOnAddress();
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        CLDLPM.streetfied();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        CLDLPM.mailingaddress(TestDataFromExcel.mailingaddress);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
   	    screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");

       
        //LogoutButtonClick();
        }
    
    
    @Test(priority=6)
 	public void CreateNewLeadCollEmp5() throws InterruptedException 
 	{    
    	 CLDLPM.clickClosePopup();
    	 screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
         CLDLPM.clickCRRSCButton();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
    	//CLDLPM.leadredbutton();  
         
         
        // OLD CRRSC 
     	CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
     	CRRSC.BankInternalChecklist(TestDataFromExcel.BankInternalChecklist);
     	CRRSC.AllegedPerdsonf(TestDataFromExcel.AllegedPerdsonf);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
     	CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
     	CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
     	CRRSC.ForeignNational(TestDataFromExcel.ForeignNational);
     	CRRSC.NumberAccount(TestDataFromExcel.NeumberAccount);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
     	CRRSC.EmploymentTypeCRRSC(TestDataFromExcel.EmploymentTypeCRRSC);
     	CRRSC.IndustryCRRSC(TestDataFromExcel.IndustryCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
     	//CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
        //Thread.sleep(1000);
     	CRRSC.ManagerialCRRSC(TestDataFromExcel.managerialCRRSC);
     	CRRSC.DirectDealingCRRSC(TestDataFromExcel.DirectDealingCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        Thread.sleep(1000);
     	CRRSC.CityCRRSC(TestDataFromExcel.CityCRRSC);
     	//CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
     	//CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
     	CRRSC.vicinityRRSC(TestDataFromExcel.vicinityRRSC);
     	
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
     	CRRSC.intialdepositeRRSC(TestDataFromExcel.intialdepositeRRSC);
     	
     	CRRSC.InwprdOutwordRRSC(TestDataFromExcel.InwprdOutwordRRSC);

        Thread.sleep(1000);
     	CRRSC.customerdeclaredCRRSC(TestDataFromExcel.customerdeclaredCRRSC);   	
     

     	
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
     	CRRSC.ComfortableInformationRRSC(TestDataFromExcel.ComfortableInformationRRSC);
     	CRRSC.ComfortableDocumentsRRSC(TestDataFromExcel.ComfortableDocumentsRRSC);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        
         
        /* 
         //New CRRSC
         CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
         CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
         screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
         CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
         CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
         CRRSC.Sbol(TestDataFromExcel.Sbol);
         screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
         CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);         
         
         */
           
         CRRSC.RemarksCRRSC("I am Indian!");
         screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
         CRRSC.Finish();
        
         Thread.sleep(1000);
 	}
    
    @Test(priority=7)
 	public void CreateNewLeadCollEmp6() throws InterruptedException 
 	{      
    	Thread.sleep(1000);
   	    CLDLPM.clickClosePopup();
    	screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        lopm.ClickOnCRRSCtab();
        Thread.sleep(2000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
    	CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
    	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
    	lopm.saveAndProceed();
    	Thread.sleep(1000);
    	screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");    	

 	}
    
    @Test(priority=8)
 	public void CreateNewLeadCollEmp7() throws InterruptedException 
 	{      
    	Thread.sleep(500);
    	scrolldown();
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        lopm.ProcessApplication();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
        lopm.ProcessApplicationPopUpClose();
        Thread.sleep(2000);
        screen.ScreenshotMethod("TC_025_NTBEmployedLoanProcessor-");
 
        
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
	
      
