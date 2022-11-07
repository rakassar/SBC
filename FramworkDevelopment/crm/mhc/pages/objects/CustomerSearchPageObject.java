package crm.mhc.pages.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerSearchPageObject extends LoginPageObject{
	
public CustomerSearchPageObject (WebDriver driver)

{
	
	super(driver);
	
}

@FindBy(xpath="//*[@id=\"object-action-button\"]/div/a[1]")
public static WebElement clk_salesonbaordingjourneynext;

@FindBy(css="a[title='Next'] span")
public static WebElement clk_salesonbaordingjourneynext2;

@FindBy(css="input[name='100000012']")
public static WebElement ent_fillBBNnumber;


/*
 * //gold5.5
 * 
 * @FindBy(xpath="//a[@class='tb button-icon-text f13']/span[1]") public static
 * WebElement clk_topBBN;
 * 
 */

@FindBy(css="span[class='acd-link-text']")
public static WebElement clk_topBBN;


@FindBy(xpath="//*[@id=\\\"newobject\\\"]/div[3]/div/div")
public static WebElement btn_redbutton;

@FindBy(xpath="(//a[@title='Start Your Journey'])[1]")
public static WebElement btn_clickstartjourney;


@FindBy(css="a[id=\"1\"]")
public static WebElement btn_ETBIndividualSalesJorney;


@FindBy(xpath="//*[@id=\\\"1\\\"]")
public static WebElement btn_ETBJourney;




}
