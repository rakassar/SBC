package crm.mhc.pages.methods;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import crm.mhc.pages.objects.CRRSCLeadPageObject;
import crm.mhc.pages.objects.CaseStagePageObject;
import crm.mhc.pages.objects.CollectDocsLeadPageObject;
import crm.mhc.pages.objects.CustomerSearchPageObject;
import crm.mhc.pages.objects.HomePageObject;
import crm.mhc.pages.objects.LeadObjectPageObject;
import crm.mhc.pages.objects.IndividualSalesJourneyPageObject;

public class LeadObjectPageMethod extends HomePageMethod{

   public static String leadid;
   
   public void ClickOnOnBoardingJourney()
	
	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   LeadObjectPageObject.clk_salesonbaordingjourney.click();
	}
   
   
   public void categoryview(String Leadcategoryview) throws InterruptedException

	{
	        Select bucket2 = new Select(LeadObjectPageObject.sel_leadView);
          bucket2.selectByVisibleText(Leadcategoryview);
	}
		    
   public void selfassignlead(String Leadview) throws InterruptedException

	{
	        
		    JavascriptExecutor js =(JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,1100)", " ");
		    Select View = new Select(LeadObjectPageObject.clk_selectview);
		    View.selectByVisibleText(Leadview);
		    Thread.sleep(1000);
		    LeadObjectPageObject.clk_arrorw.click(); 
		    Thread.sleep(1000);
		    LeadObjectPageObject.clk_selectlead.click(); 
			Thread.sleep(1000);
			LeadObjectPageObject.clk_selfassignlead.click();
		    Thread.sleep(1000);
			LeadObjectPageObject.clk_closeProcessApplicationPopup.click();
 
		    Thread.sleep(1000);
	}
		    
		    
		    public void leadview(String leadview) throws InterruptedException

			{
				    JavascriptExecutor js =(JavascriptExecutor)driver;
				    js.executeScript("window.scrollBy(0,1100)", " ");
				    Select View = new Select(LeadObjectPageObject.clk_selectview);
				    View.selectByVisibleText(leadview);
				    Thread.sleep(1000);
				    LeadObjectPageObject.clk_arrorw.click(); 
			}
	
   
   public void onMyBucketlead() throws InterruptedException

	{
		
	   LeadObjectPageObject.clk_selectthelead.click();
		    
	}
  
   public void saveAndProceed()
	
 	{
 	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	  LeadObjectPageObject.clk_saveandproceed.click();
 	}
   public void ClickOnCRRSCtab()
	
	{
	   LeadObjectPageObject.clk_CRRSCtab.click();
		
	}
   
   public void ClickOnAddresstab()
	
	{
	   LeadObjectPageObject.clk_Addresstab.click();
		
	}

//Click on Activities tab on lead detail page
public void ClickOnActivitiestab()
	
	{
	LeadObjectPageObject.clk_Activitiestab.click();
		
	}
   
   
   public void ProcessApplication()
	
 	{
 	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   LeadObjectPageObject.clk_ProcessApplication.click();
	   
	   
 	}
   public void update360() throws InterruptedException
	
	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   LeadObjectPageObject.clk_update360.click();
	   Thread.sleep(1000);
	   LeadObjectPageObject.clk_closeProcessApplicationPopup.click();
	   

	   
	}
   
   public void BmApproveButtonclk() throws InterruptedException
	
	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   LeadObjectPageObject.clk_BmApproveBttn.click();
	   Thread.sleep(1000);
	}
   
   
   
   public void SwitchToSecondaryWindow()

   {	
   	//String mainWindowHandle = driver.getWindowHandle();
       //System.out.println("Main Window"+mainWindowHandle);
       Set<String> multiplewindows=driver.getWindowHandles();
       Iterator<String> iterator = multiplewindows.iterator();
       String mainWindow = iterator.next();
       System.out.println("Main Window"+mainWindow);
       String ChildWindow = iterator.next();
       System.out.println("Child Window"+ ChildWindow);
       driver.switchTo().window(ChildWindow);      

   }
   
   public void SwitchToParentWindow()

   {	
   	//String mainWindowHandle = driver.getWindowHandle();
       //System.out.println("Main Window"+mainWindowHandle);
       Set<String> multiplewindows=driver.getWindowHandles();
       Iterator<String> iterator = multiplewindows.iterator();
       String mainWindow = iterator.next();
       driver.switchTo().window(mainWindow);      

   }
   
   public void BmApproveComments(String BmComment) throws InterruptedException
   {
	   LeadObjectPageObject.clk_BmComments.sendKeys(BmComment);;
	     
	}
   
   public void BmApproveUpdate() throws InterruptedException
   {
	   LeadObjectPageObject.clk_update360.click();
	   Thread.sleep(1000);
	   LeadObjectPageObject.clk_closeProcessApplicationPopup.click();	     
	}
   
   
   
   public void popupdate360(String popupdt360)
   
   {
   	Select sel1=new Select(LeadObjectPageObject.Sel_popupdt360);
   	sel1.selectByVisibleText(popupdt360);
   }
   
   public void ProcessApplicationPopUpClose()
	
	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   LeadObjectPageObject.clk_closeProcessApplicationPopup.click();
	   
	   
	}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  
	public void ClickPlusSign()
	
	{
		LeadObjectPageObject.clk_plussign.click();
	}
	
	public void ClickSavingAndDepositeLink() throws InterruptedException
	
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", LeadObjectPageObject.link_SavingsandDeposits);
		
	}
	
	
public void ClickOnSaveAndProceed() throws InterruptedException
	
	{		
	JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", LeadObjectPageObject.btn_SaveandProceed);
            
	}

public void ClickOnSaveAndProceedEdit() throws InterruptedException
	
	{		HomePageObject.btn_SaveandProceed_edit.click();
            
	}
	
public void ClickCorporateLoanLink() throws InterruptedException

{
	LeadObjectPageObject.link_CorporateLoan.click();

}

public void ClickOnEditButton()

{
	LeadObjectPageObject.btn_ClickOnEditButton.click();
}
public void ClickOnUpdtButton()

{
	LeadObjectPageObject.btn_ClickOnUpdtButton.click();
}


public void Clicksearchaftertype()

{
	LeadObjectPageObject.btn_Clickleadsearch.click();
}



public void ClickOnAdvancesearched() throws InterruptedException

{
	//JavascriptExecutor executor = (JavascriptExecutor)driver;
    //executor.executeScript("arguments[0].click();", HomePageObject.btn_Advancesearched);
 HomePageObject.btn_Advancesearched.click();

}

public String ExtractLeadid()

{
	leadid =LeadObjectPageObject.extra_Leadid.getText();
	return leadid;
}
public void ClickOnOnBoardingJourneyNonIndi()

{
   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	driver.findElements(By.id("1")).get(2).click(); 
  // LeadObjectPageObject.clk_salesonbaordingjourney.get(2).click();;
}

}
