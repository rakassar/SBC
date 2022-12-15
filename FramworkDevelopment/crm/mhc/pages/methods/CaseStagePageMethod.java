package crm.mhc.pages.methods;

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import crm.mhc.pages.objects.CaseJourneyPageObject;

import crm.mhc.pages.objects.CaseStagePageObject;

import crm.mhc.pages.objects.CollectDocsLeadPageObject;
import crm.mhc.pages.objects.CustomerCareExecutiveObjects;
import crm.mhc.pages.objects.CustomerSearchPageObject;
import crm.mhc.pages.objects.HomePageObject;
import crm.mhc.pages.objects.IndividualSalesJourneyPageObject;

import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseStagePageMethod extends HomePageMethod {

	JavascriptExecutor js;
	String caseIDCreated;
//************************Fill the Info Stage1 process*****************************-------------//

	public void fill_DetailsInConcern(String data1) throws InterruptedException

	{
		
		   Thread.sleep(1000);
           js = (JavascriptExecutor) driver;
           js.executeScript("window.scrollBy(0,1500)","" );
		   Thread.sleep(5000);
		   CaseStagePageObject.fill_DetailsInConcern.click();
           CaseStagePageObject.fill_DetailsInConcern.sendKeys(data1);
	       System.out.println("Entered text in Details of Concern field");
	}
	
	
	
	public void SelectComputationRequest(String ComputationRequest) throws InterruptedException
	    {
		
		    //Thread.sleep(1000);
		    //CaseStagePageObject.ComputationRequest.click();
		    //Thread.sleep(5000);
	    	Select sel1 = new Select(CaseStagePageObject.ComputationRequest);
	    	sel1.selectByValue(ComputationRequest);
	
	    }
	
	public void fill_Remarks(String Remarks)
    {
		//CaseStagePageObject.fill_Remarks.click();
		CaseStagePageObject.fill_Remarks.sendKeys(Remarks);
		
    }
	
	 public void GetCaseId() 
	  {
		 caseIDCreated=CaseStagePageObject.caseIDCreated.getText();
	     System.out.println("Account Balance Computation CaseID:"+caseIDCreated);
	  }
	 
	 
	 public void clk_caseobject() throws InterruptedException

		{
			
			   Actions quick1 = new Actions(driver);
			   quick1.moveToElement(CaseStagePageObject.clk_Casequicklink).perform();
			   Thread.sleep(3000);
			   CaseStagePageObject.clk_Caseobject.click();
		       Select bucket2 = new Select(CaseStagePageObject.clk_caseobject3);
		       bucket2.selectByVisibleText("Case");
		       //CaseStagePageObject.clk_caseobject4.click();
		}
		
		public void clk_selfassigncase(String assigntodept) throws InterruptedException

		{
			
			    JavascriptExecutor js =(JavascriptExecutor)driver;
			    js.executeScript("window.scrollBy(0,1100)", " ");
			    Select View = new Select(CaseStagePageObject.clk_selectview);
			    View.selectByVisibleText(assigntodept);
			    Thread.sleep(1000);
			    CaseStagePageObject.clk_arrorw.click(); 
			    Thread.sleep(1000);
			    CaseStagePageObject.clk_selectcase.click(); 
				Thread.sleep(1000);
			    CaseStagePageObject.clk_selfassigncase.click();
			    Thread.sleep(1000);
			    CaseStagePageObject.clk_okbutton.click(); 
			    Thread.sleep(1000);
			    
		}
			
		public void sel_caseview(String caseview) throws InterruptedException

		{
			    JavascriptExecutor js =(JavascriptExecutor)driver;
			    js.executeScript("window.scrollBy(0,1100)", " ");
			    Select View = new Select(CaseStagePageObject.clk_selectview);
			    View.selectByVisibleText(caseview);
			    Thread.sleep(1000);
			    CaseStagePageObject.clk_arrorw.click(); 
		}
		public void clk_onMycaseview_56(String assigntome) throws InterruptedException

		{
			    Select sel = new Select(CaseStagePageObject.clk_selectmycaseview_56);
	    	    sel.selectByVisibleText(assigntome);
	
		        //CaseStagePageObject.clk_selectmycaseview_56.click(); 
		        CaseStagePageObject.clk_arrorw.click(); 
			    Thread.sleep(1000);
			    
			    
		}	
		
		public void clk_onMycaseview_220(String assigntome) throws InterruptedException

		{
			
			 Select sel = new Select(CaseStagePageObject.clk_selectmycaseview_220);
	    	    sel.selectByVisibleText(assigntome);
	
		        //CaseStagePageObject.clk_selectmycaseview_56.click(); 
		        CaseStagePageObject.clk_arrorw.click(); 
			    Thread.sleep(1000);
			  
			    
			    
		}	 
			
		public void clk_onMyBucketcase() throws InterruptedException

		{
			
		        CaseStagePageObject.clk_selectthecase.click();
			    Thread.sleep(1000);
			    
			    
		}
		
		public void clk_caseEditButton() throws InterruptedException

		{
			    CaseStagePageObject.clk_editthecase.click();
			    Thread.sleep(1000);
			    
		}
		
		public void sel_depetdecison(String deptdecision) throws InterruptedException

		{
			    Select Department = new Select(CaseStagePageObject.clk_dropdownacceptvalue);
			    Thread.sleep(2000);
			    Department.selectByVisibleText(deptdecision);
			    System.out.println("Selcted Department Decision");
			    Thread.sleep(2000);
			    
		}
		
		public void sel_depetdecisonRR(String deptdecision) throws InterruptedException

		{
			    Select Department = new Select(CaseStagePageObject.clk_RRdropdownacceptvalue);
			    Thread.sleep(2000);
			    Department.selectByVisibleText(deptdecision);
			    System.out.println("Selcted Department Decision");
			    Thread.sleep(2000);
			    
		}
		
		
		public void sel_depetdecisonreverse(String deptdecision) throws InterruptedException

		{
			    Select Department = new Select(CaseStagePageObject.clk_dropdownreversevalue);
			    Thread.sleep(2000);
			    Department.selectByVisibleText(deptdecision);
			    System.out.println("Selcted Department Decision Reverse");
			    Thread.sleep(2000);
			    
		}
		
	
		
		
	 
		
		public void SpecialCondition(String SpecialCondition) throws InterruptedException

		{
			    Select Department = new Select(CaseStagePageObject.sel_SpecialCondition);
			    Thread.sleep(2000);
			    Department.selectByVisibleText(SpecialCondition);
			    System.out.println("Selcted SpecialCondition");
			    Thread.sleep(2000);
			    
		}
		
		
		public void Specialaction(String action) throws InterruptedException

		{
			    Select Department = new Select(CaseStagePageObject.sel_action);
			    Thread.sleep(2000);
			    Department.selectByVisibleText(action);
			    System.out.println("Selcted SpecialCondition");
			    Thread.sleep(2000);
			    
		}
		
		

		public void ReasonforTagging(String ReasonforTagging)
	    {
			//CaseStagePageObject.fill_Remarks.click();
			CaseStagePageObject.ent_ReasonforTagging.sendKeys(ReasonforTagging);
			
	    }
	
		
		
		public void ReportedSystem(String ReportedSystem) throws InterruptedException
	    {

		    Select sel_ReportedSystem = new Select(CaseStagePageObject.sel_ReportedSystem);
		    Thread.sleep(2000);
		    sel_ReportedSystem.selectByVisibleText(ReportedSystem);
		    System.out.println("Reported System");
		    Thread.sleep(2000);
	    }
		
		public void ForEmployement(String ForEmployement) throws InterruptedException
	    {

		    Select sForEmployement= new Select(CaseStagePageObject.sel_forEmployment);
		    Thread.sleep(2000);
		    sForEmployement.selectByVisibleText(ForEmployement);
		    System.out.println("Reported System");
		    Thread.sleep(2000);
	    }
		
		public void EmployeeInvolved(String txt_EmployeeInvolved)
	    {
			//CaseStagePageObject.fill_Remarks.click();
			CaseStagePageObject.txt_EmployeeInvolved.sendKeys(txt_EmployeeInvolved);
			
	    }
		
		
		public void UnitGroup(String txt_UnitGroup)
	    {
			//CaseStagePageObject.fill_Remarks.click();
			CaseStagePageObject.txt_UnitGroup.sendKeys(txt_UnitGroup);
			
	    }
		
		public void Employeeoutsource(String txt_Employeeoutsource)
	    {
			//CaseStagePageObject.fill_Remarks.click();
			CaseStagePageObject.txt_Employeeoutsource.sendKeys(txt_Employeeoutsource);
			
	    }
		
		public void Position(String txt_Position)
	    {
			//CaseStagePageObject.fill_Remarks.click();
			CaseStagePageObject.txt_Position.sendKeys(txt_Position);
			
	    }
		
		public void ActionTaken(String txt_ActionTaken)
	    {
			//CaseStagePageObject.fill_Remarks.click();
			CaseStagePageObject.txt_ActionTaken.sendKeys(txt_ActionTaken);
			
	    }
		
		public void OtherAction(String txt_OtherAction)
	    {
			//CaseStagePageObject.fill_Remarks.click();
			CaseStagePageObject.txt_OtherAction.sendKeys(txt_OtherAction);
			
	    }
		
	
		
		public void SourceAccountNumber(String txt_SourceAccountNumber)
	    {
			//CaseStagePageObject.fill_Remarks.click();
			CaseStagePageObject.txt_SourceAccountNumber.sendKeys(txt_SourceAccountNumber);
			
	    }
		
		
		public void DestinatuionAccountNumber(String txt_DestinatuionAccountNumber)
	    {
			//CaseStagePageObject.fill_Remarks.click();
			CaseStagePageObject.txt_DestinatuionAccountNumber.sendKeys(txt_DestinatuionAccountNumber);
			
	    }
		
		public void TaxExemptionStatus(String Sel_TaxExemptionStatus)
	    {
			//CaseStagePageObject.fill_Remarks.click();
			CaseStagePageObject.Sel_TaxExemptionStatus.sendKeys(Sel_TaxExemptionStatus);
			
	    }
		
		
		public void ValidityTagging(String ValidityTagging) throws InterruptedException
	    {
			Select SelValidityTagging = new Select(CaseStagePageObject.Sel_ValidityTagging);
		    Thread.sleep(2000);
		    SelValidityTagging.selectByVisibleText(ValidityTagging);
		    System.out.println("Validity");
		    Thread.sleep(2000);
	    }
		
		
		public void UpdateCRRSC(String UpdateCRRSC)
	    {
			//CaseStagePageObject.fill_Remarks.click();
			CaseStagePageObject.Sel_UpdateCRRSC.sendKeys(UpdateCRRSC);
			
	    }

		
		
		public void ContactInformationactipntype(String ContactInformationactipntype) throws InterruptedException
	    {
			Select ContactInformationact = new Select(CaseStagePageObject.sel_ContactInformationactipntype);
		    Thread.sleep(2000);
		    ContactInformationact.selectByVisibleText(ContactInformationactipntype);
		    System.out.println("ContactInformationactipntype");
		    Thread.sleep(2000);
	    }
		
		public void CaseCustomerType(String CustomerType) throws InterruptedException
	    {
			Select CustomerType1 = new Select(CaseStagePageObject.sel_CustomerType);
		    Thread.sleep(2000);
		    CustomerType1.selectByVisibleText(CustomerType);
		    System.out.println("CustomerType");
		    Thread.sleep(2000);
	    }
		
		public void casecountry(String country) throws InterruptedException
	    {
		/*	Select CustomerType1 = new Select(CaseStagePageObject.pic_Country);
		    Thread.sleep(2000);
		    CustomerType1.selectByVisibleText(country);
		    System.out.println("country");
		    Thread.sleep(2000);*/
		    
		    
		    WebElement eco = CaseStagePageObject.pic_Country;
	    	eco.sendKeys(country);
	    	Thread.sleep(1000);
			eco.sendKeys(Keys.DOWN);
	    	eco.sendKeys(Keys.ENTER);
	    	Thread.sleep(1000);
	    	
	    	
	    	
	    }

		
		public void CaseHosueNumber()
	    {
			Random r = new Random();
			 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

			    final int N = 6;
			    StringBuilder sb = new StringBuilder();
			    for (int i = 0; i < N; i++) {
			        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
			    }
			    String firstname = sb.toString();			    
			    CaseStagePageObject.ent_HouseNumber.sendKeys(firstname);
			
	    }

		
		public void caseStreet()
	    {
			Random r = new Random();
			 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

			    final int N = 6;
			    StringBuilder sb = new StringBuilder();
			    for (int i = 0; i < N; i++) {
			        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
			    }
			    String firstname = sb.toString();			    
			    CaseStagePageObject.ent_Street.sendKeys(firstname);
			
	    }
		
		public void casemobile()
	    {
	    	
	Random rand = new Random();
    int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
    int num2 = rand.nextInt(743);
    int num3 = rand.nextInt(10000);

    DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
    DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

    String mnumbername = df3.format(num1) + df3.format(num2)  + df4.format(num3);
    //SDmobilenumber=mnumbername;
    CaseStagePageObject.ent_Mobile.sendKeys(mnumbername);
			
	    }
		
		
		
		public void CaseTypeofRequest(String TypeofRequest) throws InterruptedException
	    {
			Select Request = new Select(CaseStagePageObject.sel_TypeofRequest);
		    Thread.sleep(2000);
		    Request.selectByVisibleText(TypeofRequest);
		    System.out.println("TypeofRequest");
		    Thread.sleep(2000);
	    }
		
}