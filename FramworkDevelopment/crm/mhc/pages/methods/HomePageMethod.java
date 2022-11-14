package crm.mhc.pages.methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import crm.mhc.pages.objects.CaseJourneyPageObject;
import crm.mhc.pages.objects.CustomerSearchPageObject;
import crm.mhc.pages.objects.HomePageObject;

public class HomePageMethod extends LoginPageMethod{

	//quick link and sales widget
   public void ClickOnsaleswidget()
	
	{
		Actions quick = new Actions(driver);
		quick.moveToElement(HomePageObject.clk_leadpanesaleswidget).perform();
		
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