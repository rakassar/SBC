package crm.mhc.pages.methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import crm.mhc.pages.objects.CustomerSearchPageObject;


public class CustomerSerachPageMethod extends HomePageMethod {

	
public void ClickOnOnBoardingJourneynext()
	
  	{
  	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

  	 CustomerSearchPageObject.clk_salesonbaordingjourneynext.click();
  	}


public void ClickOnOnBoardingJourneynext2()

	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	 CustomerSearchPageObject.clk_salesonbaordingjourneynext2.click();
	}

public void BBNFillForCustomerSearch(String BBN)

	{
	 CustomerSearchPageObject.ent_fillBBNnumber.click();
	 CustomerSearchPageObject.ent_fillBBNnumber.sendKeys(BBN);
	 
	}

public void ChooseBBNfromList()

{
 CustomerSearchPageObject.clk_topBBN.click();
  
}

public void clickonredbutton()

{
 CustomerSearchPageObject.btn_redbutton.click();
 
}
public void clickstartjourney()

{
 CustomerSearchPageObject.btn_clickstartjourney.click();
 
}

public void ETBIndividualSalesJorney()

{
	String mainWindowHandle = driver.getWindowHandle();
	System.out.println("Main Window"+mainWindowHandle);
	Set<String> multiplewindows=driver.getWindowHandles();
	Iterator<String> iterator = multiplewindows.iterator();
  while (iterator.hasNext()) {
             String ChildWindow = iterator.next();
             if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
             System.out.println("Child Window"+ ChildWindow);	 
             driver.switchTo().window(ChildWindow);
             CustomerSearchPageObject.btn_ETBIndividualSalesJorney.click();
             driver.switchTo().window(mainWindowHandle);
 }
}
  

}
}