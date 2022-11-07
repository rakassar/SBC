package crm.mhc.pages.methods;

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import crm.mhc.pages.objects.CaseJourneyPageObject;
import crm.mhc.pages.objects.CustomerCareExecutiveObjects;
import crm.mhc.pages.objects.CustomerSearchPageObject;
import crm.mhc.pages.objects.HomePageObject;
import crm.mhc.pages.objects.IndividualSalesJourneyPageObject;

import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseJourneyPageMethod extends HomePageMethod {

	String SDmobilenumber;
	public static String leadid;

//************************Fill the Info for new lead process*****************************-------------//

	public void IndividualCaseJorney()

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
	             CaseJourneyPageObject.clk_IndividualCaseJorney.click();
	             driver.switchTo().window(mainWindowHandle);
	 }
	

}
	  
	}
}