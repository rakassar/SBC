package crm.mhc.pages.methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import crm.mhc.pages.objects.CustomerCareExecutiveObjects;
import crm.mhc.pages.objects.ExecutiveAssistantSalesObjects_ea_sales;
import crm.mhc.pages.objects.HomePageObject;

public class ExecutiveAssistantSalesMethods_ea_sales extends HomePageMethod {

	
public void DocumentsPresentDocsPending()
{
	Select sel=new Select(ExecutiveAssistantSalesObjects_ea_sales.sel_SDdocuments);
	sel.selectByValue("No");
}

public void SD_ClkOnAdreProf()  throws InterruptedException
{
	ExecutiveAssistantSalesObjects_ea_sales.Clk_SDProofOfAddress.click();
	Thread.sleep(5000);
	Set<String> s=driver.getWindowHandles();
	Iterator<String> i=s.iterator();
	String ChildWindow=i.next();
	String snd=i.next();
	driver.switchTo().window(snd);
	System.out.println(ChildWindow);	
    System.out.println(snd);
    Thread.sleep(5000);
	
}


public void SD_StorageType() throws InterruptedException

{ 
	//driver.switchTo().frame("Form_44_1");
     // Thread.sleep(4550);
	//Form_44_1
	Select sel=new Select(ExecutiveAssistantSalesObjects_ea_sales.Sel_SDStorageIdConfigId);
	sel.selectByValue("1_0");
	
}


public void SD_ClickOnImageUpload() 

{


	//JavascriptExecutor executor = (JavascriptExecutor)driver;
    //executor.executeScript("arguments[0].click();", ExecutiveAssistantSalesObjects_ea_sales.Clk_SDImageUpload);

	ExecutiveAssistantSalesObjects_ea_sales.Clk_SDImageUpload.sendKeys("C:\\Users\\Rizwan Ahmad\\Desktop\\image001.png");
	//ExecutiveAssistantSalesObjects_ea_sales.Clk_SDImageUpload.click();
	//driver.switchTo().activeElement();
	//ExecutiveAssistantSalesObjects_ea_sales.Clk_SDImageUploadLoc.sendKeys("‪C:\\Users\\Rizwan Ahmad\\Downloads\\1.png");
	

	
}



public void ClkOnProofIdenity()
{
	ExecutiveAssistantSalesObjects_ea_sales.Clk_SDProofOfIdenity.click();
	
}

public void ClKOnBirthCertificate()
{
	ExecutiveAssistantSalesObjects_ea_sales.Clk_SDBirthCertifcate.click();
}

public void DocumentsPresentDocsSubmitted()
{
	Select sel=new Select(ExecutiveAssistantSalesObjects_ea_sales.sel_SDdocuments);
	sel.selectByValue("Yes");
}


}
