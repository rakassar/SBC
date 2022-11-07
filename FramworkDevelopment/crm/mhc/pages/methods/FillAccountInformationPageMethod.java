package crm.mhc.pages.methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import crm.mhc.pages.objects.CRRSCLeadPageObject;
import crm.mhc.pages.objects.CollectDocsLeadPageObject;
import crm.mhc.pages.objects.FillAccountInformationPageObject;

public class FillAccountInformationPageMethod  extends HomePageMethod{

	//Customer Customer Profile Section
	
	public void RequestType(String requestType)
    {
    	Select sel=new Select(FillAccountInformationPageObject.sel_RequestTypef);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(requestType);
    }
	public void Purposeofaccountopening(String Purposeofaccountopening)
    {
    	Select sel=new Select(FillAccountInformationPageObject.sel_Purposeofaccountopening);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(Purposeofaccountopening);
    }
    
	public void PromsEmail(String PromsEmail)
    {
    	Select sel=new Select(FillAccountInformationPageObject.sel_PromsEmail);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(PromsEmail);
    }
    
	public void sel_PromsSMS(String PromsSMS)
    {
    	Select sel=new Select(FillAccountInformationPageObject.sel_PromsSMS);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(PromsSMS);
    }
    
	public void TransactionalEmail(String TransactionalEmail)
    {
    	Select sel=new Select(FillAccountInformationPageObject.sel_TransactionalEmail);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(TransactionalEmail);
    }
    
	public void TransactionalSMS(String TransactionalSMS)
    {
    	Select sel=new Select(FillAccountInformationPageObject.sel_TransactionalSMS);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(TransactionalSMS);
    }
    
	
	public void ADBRequired(String ADBRequired)
    {
    //CRRSCLeadPageObject.ent_RemarksRRSC.click();
		FillAccountInformationPageObject.ent_ADBRequired.sendKeys(ADBRequired);
    
     }
	
	public void ClickFillAccountInformation()
    {
		FillAccountInformationPageObject.clk_FillAccountInformation.click();
    }
	
	
}
