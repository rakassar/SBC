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

/* lead for high risk BCM jourmey 
*/


//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class TC_019_Lead_BCMJourneyNewAccountOpen extends HomePageMethod
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
	public void LeadHighRiskBCM() throws InterruptedException, IOException
	{   
    	launchBrowser();
    	screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    	TDFX.DataRead();
 		EnterUserName(TestDataFromExcel.UserName_CA);
        EnterPassword(TestDataFromExcel.Password); 
    	screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        ClickOnsalesJouney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
	}   
    

    @Test(priority=2)
	public void LeadHighRiskBCM1() throws InterruptedException, IOException
	{   
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");

        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        Thread.sleep(500);
        NTBSJPM.Product(TestDataFromExcel.Product);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        
	}

    @Test(priority=3)
	public void LeadHighRiskBCM2() throws InterruptedException, IOException
	{  
        CLDLPM.selectstatuscode(); 
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.Enteremail();
        Thread.sleep(300);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
        CLDLPM.Gender(TestDataFromExcel.Gender);
        CLDLPM.PlcaeOfBirth();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
        CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
        CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);        
        CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.SoleOwner(TestDataFromExcel.SoleOwner);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
	}   
    

    @Test(priority=4)
	public void LeadHighRiskBCM3() throws InterruptedException, IOException
	{ 
       /*employed steps start */
        CLDLPM.Employeetype(TestDataFromExcel.Employeetype); 
        CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsEmp);
        CLDLPM.employername();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.occupation(TestDataFromExcel.occupation);
        CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
        Thread.sleep(1000);
        CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        CLDLPM.EconomicActivity(TestDataFromExcel.EconomicActivity);
        Thread.sleep(500);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.NatureOfWork(TestDataFromExcel.NatureOfWork);
        Thread.sleep(1000);
        CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        /*employed steps end */  
        
	}
    

    @Test(priority=5)
	public void LeadHighRiskBCM4() throws InterruptedException, IOException
	{ 
        CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
        CLDLPM.IDNumner();
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.MaidanName();
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        //CLDLPM.Tin("");
        CLDLPM.AoCode(TestDataFromExcel.AoCode);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.ClickOnAddress();
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.streetfied();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.mailingaddress(TestDataFromExcel.mailingaddress);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
   	    screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");

       
        //LogoutButtonClick();
        }
    
    
    @Test(priority=6)
 	public void LeadHighRiskBCM5() throws InterruptedException 
 	{    
    	 CLDLPM.clickClosePopup();
    	 screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
         CLDLPM.clickCRRSCButton();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    	//CLDLPM.leadredbutton();  
         
         
        //  OLD CRRSC 
     	CRRSC.AmlcUnJmf("No");
     	CRRSC.BankInternalChecklist("No");
     	CRRSC.AllegedPerdsonf("No");
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
     	CRRSC.HPIOrJoint("No");
     	CRRSC.BenifOFW("No");
     	CRRSC.ForeignNational("No");
     	CRRSC.NumberAccount("No");
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
     	CRRSC.EmploymentTypeCRRSC("Employed");
     	CRRSC.IndustryCRRSC("CARPENTRY");
     	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
     	//CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
        //Thread.sleep(1000);
     	CRRSC.ManagerialCRRSC("No");
     	CRRSC.DirectDealingCRRSC("No");
     	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        Thread.sleep(1000);
     	CRRSC.CityCRRSC("Aglipay");
     	//CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
     	//CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
     	CRRSC.vicinityRRSC("Yes");
     	
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
     	CRRSC.intialdepositeRRSC("No");
     	
     	CRRSC.InwprdOutwordRRSC("Yes");

        Thread.sleep(1000);
     	CRRSC.customerdeclaredCRRSC("Yes");   	
     

     	
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
     	CRRSC.ComfortableInformationRRSC("Yes");
     	CRRSC.ComfortableDocumentsRRSC("Yes");
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        
         
         
		/*
		  //New CRRSC CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
		  CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
		  screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
		  CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
		  CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
		  CRRSC.Sbol(TestDataFromExcel.Sbol);
		  screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
		  CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);
		 */
         CRRSC.RemarksCRRSC("I am Indian!");
         screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
         CRRSC.Finish();
        
         Thread.sleep(1000);
 	}
    
    @Test(priority=7)
 	public void LeadHighRiskBCM6() throws InterruptedException 
 	{      
    	Thread.sleep(1000);
   	    CLDLPM.clickClosePopup();
    	screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        lopm.ClickOnCRRSCtab();
        Thread.sleep(2000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    	CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
    	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    	lopm.saveAndProceed();
    	Thread.sleep(1000);
    	screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");  
        QuiteBrowser();

 	}
    
    @Test(priority=8)
 	public void LeadHighRiskBCM7() throws InterruptedException, IOException 
 	{ 
    //LogoutButtonClick();
    launchBrowser();
    TDFX.DataRead();
    Thread.sleep(1000);
    screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    EnterUserName(TestDataFromExcel.UserName_BranchBCM);
    EnterPassword(TestDataFromExcel.Password); 
	screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    LoginButtonClick();
    CheckRole();
	Thread.sleep(500);
    clk_leadobject();
    lopm.categoryview("Deposit-Individual");
    lopm.selfassignlead("Need Approval");
    lopm.leadview("Assigned Leads");
    Thread.sleep(500);
    lopm.onMyBucketlead();
    Thread.sleep(500);
    lopm.BmApproveButtonclk();
    Thread.sleep(500);
    lopm.BmApproveComments("BM Comments");
    lopm.BmApproveUpdate();
    screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
    QuiteBrowser();
 	}
    
    @Test(priority=9)
 	public void LeadHighRiskBCM8() throws InterruptedException 
 	
 	{   
    	
    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        EnterUserName(TestDataFromExcel.UserName_CA);
        EnterPassword(TestDataFromExcel.Password); 
    	screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        clk_leadobject();
        lopm.categoryview("Deposit-Individual");
        lopm.leadview("Assigned Leads");
        Thread.sleep(1000);
        lopm.onMyBucketlead();
        Thread.sleep(1000);

 	}
 	
    
    @Test(priority=10)
 	public void LeadHighRiskBCM9() throws InterruptedException 
 	{      
    	Thread.sleep(500);
    	scrolldown();
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        FAIPM.ClickFillAccountInformation();
        FAIPM.RequestType(TestDataFromExcel.RequestTypef);
        FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
        FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
        FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
        FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        CRRSC.Finish();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        
        //
       
        
 	}
    
   
      @Test(priority=11)
 	public void LeadHighRiskBCM10() throws InterruptedException 
 	{      
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        Thread.sleep(1000);
        lopm.ProcessApplication();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
        lopm.ProcessApplicationPopUpClose();
        Thread.sleep(2000);
        screen.ScreenshotMethod("TC_019__Lead_BCMJourneyNewAccount-");
 	}
    
   
     }
	
      
