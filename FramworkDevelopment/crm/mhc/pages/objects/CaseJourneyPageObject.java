package crm.mhc.pages.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CaseJourneyPageObject extends LoginPageObject{
	
public CaseJourneyPageObject (WebDriver driver)

{
	super(driver);
	
}


//***********End*************Fill the Info for  Indivdual process*****************************-------------//




@FindBy(className="firstchar")
public static WebElement clk_IndividualCaseJorney;

@FindBy(xpath="//input[@name='CASE_SUBCATEGORY1']")
public static WebElement fillSSC;

@FindBy(xpath="//a[@data-autoid='CASE_PRDHOLDINGNUMBER_srch']")
public static WebElement fillcardproduct;

@FindBy(xpath="//div[contains(@data-autoid,'Name')]")
public static List<WebElement> fillcreditcardproduct;

@FindBy(xpath="//a[@data-autoid='FlowNext']") 
public static WebElement clk_NextOnCasePage;

@FindBy(css="a[data-autoid='FlowNext']")
public static WebElement clk_casesaveandproceed ;





}
