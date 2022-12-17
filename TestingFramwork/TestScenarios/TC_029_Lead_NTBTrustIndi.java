package TestScenarios;
import java.io.IOException;

import org.openqa.selenium.By;
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

/*Customer Joint Onboarding process for NTB employed Indidvidual

To run on G7 please change nature of work field and uncomment the CRRSC section
*/

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class TC_029_Lead_NTBTrustIndi extends HomePageMethod
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
    	screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
    	TDFX.DataRead();
 		EnterUserName(TestDataFromExcel.UserName_CA);
        EnterPassword(TestDataFromExcel.Password); 
    	screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        ClickOnsalesJouney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
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
        NTBSJPM.InterestedIn("Trust");

        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");

        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        NTBSJPM.ProductCategory("UITF");
        Thread.sleep(500);
        NTBSJPM.Product("SB PESO BOND FUND");
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        
	}

    @Test(priority=3)
	public void CreateNewLeadCollEmp2() throws InterruptedException, IOException
	{  
        CLDLPM.selectstatuscode(); 
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        CLDLPM.Enteremail();
        CLDLPM.settlementaccntType("Open New Settlement Account");
        Thread.sleep(300);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
        CLDLPM.Gender(TestDataFromExcel.Gender);
        CLDLPM.PlcaeOfBirth();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
        CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
        CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);        
        CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
        CLDLPM.AoCode(TestDataFromExcel.AoCode);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        //Joint fields
        CLDLPM.SoleOwner("Yes");
        CLDLPM.GroupID("Groupid123");
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
	}   
    

    @Test(priority=4)
	public void CreateNewLeadCollEmp3() throws InterruptedException, IOException
	{ 
       /*employed steps start */
        CLDLPM.Employeetype(TestDataFromExcel.Employeetype); 
        CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsEmp);
        CLDLPM.employername();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        CLDLPM.occupation(TestDataFromExcel.occupation);
        CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
        Thread.sleep(1000);
        CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        CLDLPM.EconomicActivity(TestDataFromExcel.EconomicActivity);
        Thread.sleep(500);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        CLDLPM.NatureOfWork(TestDataFromExcel.NatureOfWork);  // remove New to run on g7
        Thread.sleep(1000);
        CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        /*employed steps end */  
        
	}
    

    @Test(priority=5)
	public void CreateNewLeadCollEmp4() throws InterruptedException, IOException
	{ 
        CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
        CLDLPM.IDNumner();
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        CLDLPM.MaidanName();
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        //CLDLPM.Tin("");
        CLDLPM.dosriFlag("No");
        CLDLPM.fatcaFlag("Yes");
        Thread.sleep(500);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        CLDLPM.ClickOnAddress();
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        CLDLPM.streetfied();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
   	    screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");

       
        //LogoutButtonClick();
        }
    
    
    @Test(priority=6)
 	public void CreateNewLeadCollEmp5() throws InterruptedException 
 	{    
    	 CLDLPM.clickClosePopup();
    	 screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
         
 	}

    @Test(priority=8)
 	public void CreateNewLeadCollEmp7() throws InterruptedException 
 	{  
    	CLDLPM.clickIndiAccntCreateBtn();
        lopm.SwitchToSecondaryWindow();
        NTBSJPM.LeadRating("Hot");
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        Thread.sleep(500);
        NTBSJPM.Product(TestDataFromExcel.Product);
        Thread.sleep(1000);
    	screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        CLDLPM.selectstatuscode(); 
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        Thread.sleep(500);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        Thread.sleep(500);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        CLDLPM.ClickOnAddress();
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        Thread.sleep(500);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        scrollBy();
        CLDLPM.mailingaddress(TestDataFromExcel.mailingaddress);
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
   	    screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
   	    
   	 CLDLPM.clickClosePopup();
	 screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     CLDLPM.clickCRRSCButton();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     
  // OLD CRRSC 
  	CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
  	CRRSC.BankInternalChecklist(TestDataFromExcel.BankInternalChecklist);
  	CRRSC.AllegedPerdsonf(TestDataFromExcel.AllegedPerdsonf);
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
  	CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
  	CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
  	CRRSC.ForeignNational(TestDataFromExcel.ForeignNational);
  	CRRSC.NumberAccount(TestDataFromExcel.NeumberAccount);
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
  	CRRSC.EmploymentTypeCRRSC(TestDataFromExcel.EmploymentTypeCRRSC);
  	CRRSC.IndustryCRRSC(TestDataFromExcel.IndustryCRRSC);
  	Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
  	//CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
     //Thread.sleep(1000);
  	CRRSC.ManagerialCRRSC(TestDataFromExcel.managerialCRRSC);
  	CRRSC.DirectDealingCRRSC(TestDataFromExcel.DirectDealingCRRSC);
  	Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     Thread.sleep(1000);
  	CRRSC.CityCRRSC(TestDataFromExcel.CityCRRSC);
  	//CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
  	//CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC);
  	Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
  	CRRSC.vicinityRRSC(TestDataFromExcel.vicinityRRSC);
  	
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
  	CRRSC.intialdepositeRRSC(TestDataFromExcel.intialdepositeRRSC);
  	
  	CRRSC.InwprdOutwordRRSC(TestDataFromExcel.InwprdOutwordRRSC);

     Thread.sleep(1000);
  	CRRSC.customerdeclaredCRRSC(TestDataFromExcel.customerdeclaredCRRSC);   	
  

  	
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
  	CRRSC.ComfortableInformationRRSC(TestDataFromExcel.ComfortableInformationRRSC);
  	CRRSC.ComfortableDocumentsRRSC(TestDataFromExcel.ComfortableDocumentsRRSC);
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     
     CRRSC.RemarksCRRSC("I am Indian!");
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     CRRSC.Finish();
    
     Thread.sleep(1000);
     CLDLPM.clickClosePopup();
 	screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     lopm.ClickOnCRRSCtab();
     Thread.sleep(2000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
 	CLDLPM.CreatedNewLeadEdit();
     Thread.sleep(1000);
 	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
 	Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
 	lopm.saveAndProceed();
 	Thread.sleep(1000);
 	screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     FAIPM.ClickFillAccountInformation();
     FAIPM.RequestType(TestDataFromExcel.RequestTypef);
     FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
     FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
     FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
     FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
     CRRSC.Finish();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
     lopm.ProcessApplication();
     Thread.sleep(1000);
     screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
     lopm.ProcessApplicationPopUpClose();
     Thread.sleep(2000);
     screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
     
     Thread.sleep(60000);  // for soap hit
     
        

    	
    	
    	
    	
 	}
    @Test(priority=9)
    public void CreateNewLeadCollEmp8() throws InterruptedException 
 	{      
    	lopm.SwitchToParentWindow();
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        CLDLPM.settlementaccntType("Choose from Existing Account");
        Thread.sleep(500);
        CLDLPM.settlementaccntPickerclk();
        Thread.sleep(500);
        CLDLPM.settlementaccntclk();
        Thread.sleep(500);
        scrolldown();
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        Thread.sleep(500);
        scrolldown();
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        Thread.sleep(500);
        scrolldown();
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        Thread.sleep(500);
        scrolldown();
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        Thread.sleep(500);
        scrolldown();
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        Thread.sleep(500);
        scrolldown();
        screen.ScreenshotMethod("TC_029_Lead_NTBTrustIndi-");
        CLDLPM.UpdateDetailsTrustTreasury("No");
        lopm.saveAndProceed();
        NTBSJPM.CaseDedupeOnDocsLead();
        
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        CLDLPM.settlementaccntType("Choose from Existing Account");
        Thread.sleep(500);
        CLDLPM.settlementaccntPickerclk();
        Thread.sleep(500);
        CLDLPM.settlementaccntclk();
        Thread.sleep(500);
        CLDLPM.UpdateDetailsTrustTreasury("No");
        lopm.saveAndProceed();
        
        NTBSJPM.CaseDedupeOnDocsLead();
        System.out.println("Please fill csq");
        Thread.sleep(30000);

        

    	
        
 	}
    
    
    @Test(priority=10)
 	public void CreateNewLeadCollEmp9() throws InterruptedException 
 	{      
   
    	
    	
    	
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
	
      
