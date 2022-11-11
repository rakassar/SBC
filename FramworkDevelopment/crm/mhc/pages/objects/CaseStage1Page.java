package crm.mhc.pages.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CaseStage1Page extends LoginPageObject{
	
public CaseStage1Page (WebDriver driver)

{
	super(driver);
	
}


//***********End*************Fill the Info Stage1 process case Journey*****************************-------------//





@FindBy(xpath="//*[@data-autoid='cust_878_ctrl']")
public static WebElement fill_DetailsInConcern;


@FindBy(xpath="//*[@data-autoid='cust_1896_ctrl']")
public static WebElement ComputationRequest;

@FindBy(xpath="//textarea[@placeholder='Please post your comments here']")
public static WebElement fill_Remarks;

@FindBy(xpath="//a[@data-autoid='FlowNext']") 
public static WebElement clk_NextOnCasePage;


}


