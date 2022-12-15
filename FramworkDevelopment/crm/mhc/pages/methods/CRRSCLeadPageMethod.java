package crm.mhc.pages.methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import crm.mhc.pages.objects.CRRSCLeadPageObject;
import crm.mhc.pages.objects.CollectDocsLeadPageObject;
import crm.mhc.pages.objects.HomePageObject;

public class CRRSCLeadPageMethod  extends HomePageMethod{

	//new CRRSC fields
	public void PrpsOfAccntOpning(String PrpsOfAccntOpning)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_PrpsOfAccntOpning);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(PrpsOfAccntOpning);
    }	
	public void Sbol(String Sbol)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_Sbol);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(Sbol);
    }	
	public void OtherRskFctr(String OtherRskFctr)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_OtherRskFctr);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(OtherRskFctr);
    }	
	
	
	
	
	
	
	//OLD Customer Customer Profile Section
	
	public void AmlcUnJmf(String AmlcUnJmf)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_AmlcUnJmf);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(AmlcUnJmf);
    }
	public void BankInternalChecklist(String BankInternalChecklist)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_BankInternalChecklist);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(BankInternalChecklist);
    }



	public void AllegedPerdsonf(String AllegedPerdsonf)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_AllegedPerdsonf);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(AllegedPerdsonf);
    }
    
	public void HPIOrJoint(String HPIOrJoint)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_HPIOrJoint);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(HPIOrJoint);
    }
    
	public void BenifOFW(String BenifOFW)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_BenifOFW);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(BenifOFW);
    }
    
	public void ForeignNational(String ForeignNational)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_ForeignNational);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(ForeignNational);
    }
    
	public void NumberAccount(String NumberAccount)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_NumberAccount);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(NumberAccount);
    }
 

	//Customer Details
	public void EmploymentTypeCRRSC(String EmploymentTypeCRRSC)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_EmploymentTypeCRRSC);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(EmploymentTypeCRRSC);
    	
    }
	
	public void IndustryCRRSC(String IndustryCRRSC) throws InterruptedException
    {
    	WebElement Industry_Classification = CRRSCLeadPageObject.sel_IndustryCRRSC;
		Industry_Classification.sendKeys(IndustryCRRSC);
		Thread.sleep(1000);
		Industry_Classification.sendKeys(Keys.DOWN);
		Thread.sleep(500);

		Industry_Classification.sendKeys(Keys.ENTER);
    }
    	
    
    
	public void EconomicActivityCRRSC(String EconmicactivityeCRRSC)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_EconmicactivityeCRRSC);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(EconmicactivityeCRRSC);
    	
    }
    
	public void ManagerialCRRSC(String managerialCRRSC)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_managerialCRRSC);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(managerialCRRSC);
    	
    }
    
	public void DirectDealingCRRSC(String DirectDealingCRRSC)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_DirectDealingCRRSC);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(DirectDealingCRRSC);
    	
    }
	
    
	//Geographical risk
	public void CityCRRSC(String CityCRRSC) throws InterruptedException
    {
    	WebElement CityCRRSC1 = CRRSCLeadPageObject.sel_CityCRRSC;
    	CityCRRSC1.sendKeys(CityCRRSC);
    	Thread.sleep(1000);
    	CityCRRSC1.sendKeys(Keys.DOWN);
		Thread.sleep(500);

		CityCRRSC1.sendKeys(Keys.ENTER);
		Thread.sleep(500);
				
		
    }
	public void CityCRRSCNonIndi(String CityCRRSC) throws InterruptedException
    {
    	WebElement CityCRRSC1 = CRRSCLeadPageObject.sel_CityCRRSCNonIndi;
    	CityCRRSC1.sendKeys(CityCRRSC);
    	Thread.sleep(1000);
    	CityCRRSC1.sendKeys(Keys.DOWN);
		Thread.sleep(500);

		CityCRRSC1.sendKeys(Keys.ENTER);
		Thread.sleep(500);
				
		
    }
	public void ProvinceCRRSC(String ProvinceCRRSC) throws InterruptedException
    {
    	
    	WebElement ProvinceCRRSC1 = CRRSCLeadPageObject.sel_ProvinceCRRSC;
    	ProvinceCRRSC1.sendKeys(ProvinceCRRSC);
    	ProvinceCRRSC1.sendKeys(Keys.DOWN);
    	ProvinceCRRSC1.sendKeys(Keys.ENTER);
    	  Thread.sleep(1000);
				
    }
	public void RiskCRRSC(String RiskCRRSC)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_RiskCRRSC);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(RiskCRRSC);
    }
	public void vicinityRRSC(String vicinityRRSC)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_vicinityRRSC);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(vicinityRRSC);
    }
	
	//Special KYC Question
	
	
	public void intialdepositeRRSC(String intialdepositeRRSC)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_intialdepositeRRSC);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(intialdepositeRRSC);
    }
	
	public void InwprdOutwordRRSC(String InwprdOutwordRRSC)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_InwprdOutwordRRSC);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(InwprdOutwordRRSC);
    }
	
	
	public void customerdeclaredCRRSC(String customerdeclaredCRRSC)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_CCustomerDeclaredCRRSC);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(customerdeclaredCRRSC);
    }
	
	public void ComfortableInformationRRSC(String ComfortableInformationRRSC)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_ComfortableInformationRRSC);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(ComfortableInformationRRSC);
    }
	
	public void ComfortableDocumentsRRSC(String ComfortableDocumentsRRSC)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_ComfortableDocumentsRRSC);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(ComfortableDocumentsRRSC);
    }
	
	public void customersdeclaredsRRSC(String customersdeclaredsRRSC)
    {
    	Select sel=new Select(CRRSCLeadPageObject.sel_customersdeclaredsRRSC);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(customersdeclaredsRRSC);
    }
	
	//Remarks
	
	
	public void RemarksCRRSC(String remaks)
    {
    //CRRSCLeadPageObject.ent_RemarksRRSC.click();
    CRRSCLeadPageObject.ent_RemarksRRSC.sendKeys(remaks);
    
     }
	
	public void Finish()
    {
    CRRSCLeadPageObject.clk_Finish.click();
    }
	
	
}
