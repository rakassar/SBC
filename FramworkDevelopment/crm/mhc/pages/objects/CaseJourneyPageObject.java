package crm.mhc.pages.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CaseJourneyPageObject extends LoginPageObject{
	
public CaseJourneyPageObject (WebDriver driver)

{
	super(driver);
	
}


//***********End*************Fill the Info for  Indivdual process*****************************-------------//




@FindBy(xpath="//*[@id=\"2\"]")
public static WebElement clk_IndividualCaseJorney;
}


