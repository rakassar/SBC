package crm.mhc.pages.methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import crm.mhc.pages.objects.CaseJourneyPageObject;
import crm.mhc.pages.objects.CaseStagePageObject;
import crm.mhc.pages.objects.CustomerSearchPageObject;
import crm.mhc.pages.objects.HomePageObject;
import crm.mhc.pages.objects.LoginPageObject;

public class HomePageMethod extends LoginPageMethod{

	//quick link and sales widget
   public void ClickOnsaleswidget()
	
	{
		Actions quick = new Actions(driver);
		quick.moveToElement(HomePageObject.clk_leadpanesaleswidget).perform();
		
	}
   
   public void clk_leadobject() throws InterruptedException

	{
		
		   Actions quick1 = new Actions(driver);
		   quick1.moveToElement(HomePageObject.clk_salesObject).perform();
		   Thread.sleep(150);
		   HomePageObject.clk_leadobject.click();
	       
	       //CaseStagePageObject.clk_caseobject4.click();
	}
   
   
   
 
   
 //quick link and sales journey option
   public void ClickOnsalesJouney()
	
  	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   HomePageObject.clk_leadpanesalesjourney.click();	
  	}
   
   public void ClickOnCaseJouney()
	
  	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   HomePageObject.clk_leadpaneCasejourney.click();	
  	}
   public void scrolldown()



   {
    // scroll down by 500 pixels with Javascript Executor
       JavascriptExecutor js = (JavascriptExecutor) driver;
      // js.executeScript("window.scrollBy(0,500)");
       // identify element
       System.out.println("scrolling down:");
       // scroll down up 500 pixels with Javascript Executor
      // js.executeScript("window.scrollBy(0,500)");
       
       
       //till page end
       js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
       }
   

   public void scrollup()



   {
    // scroll down by 500 pixels with Javascript Executor
       JavascriptExecutor js = (JavascriptExecutor) driver;
      // js.executeScript("window.scrollBy(0,500)");
       // identify element
       System.out.println("scrolling down:");
       // scroll down up 500 pixels with Javascript Executor
       //js.executeScript("window.scrollBy(0,500)");
       
      //till page end
       js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
       }
   
  
   public void CheckRole() throws InterruptedException
   {
	   HomePageObject.Clk_CheckRole.click();
	   Thread.sleep(1500);
  	 
  	 
   }
   


public void scrollBy()



   {
    // scroll down by 500 pixels with Javascript Executor
       JavascriptExecutor js = (JavascriptExecutor) driver;
      // js.executeScript("window.scrollBy(0,500)");
       // identify element
       System.out.println("scrolling by down:");
       // scroll down up 500 pixels with Javascript Executor
       js.executeScript("window.scrollBy(0,500)");
       
       
       //till page end
       //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
       }
 
   
}