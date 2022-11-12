package crm.mhc.pages.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CaseStage2PageObject extends LoginPageObject{
	
public CaseStage2PageObject (WebDriver driver)

{
	super(driver);
	
}


//***********End*************Fill the Info for  Indivdual process*****************************-------------//




@FindBy(className="icon-service")
public static WebElement clk_caseobject;

@FindBy(xpath="/html/body/div[2]/div[1]/div/ul/li[4]/div/div[2]/ul/li[1]/a/span")
public static WebElement clk_caseobject2;

@FindBy(name="QueryCategoryId")
public static WebElement clk_caseobject3;

/*
 * @FindBy(xpath="//*[@id=\\\"js-vnav\\\"]/li[2]/div/div[1]/a[1]") 
 * public static WebElement clk_caseobject4;
 */

@FindBy(xpath="//select[@name='QueryViewId']") 
public static WebElement clk_selectview;

@FindBy(xpath="//option[@value='55']")
public static WebElement clk_selectrecord ;

@FindBy(xpath="//a[@class='filterGroup__button acid-btn acid-btn--outline-brand']")
public static WebElement clk_arrorw ;

@FindBy(xpath="//label[@for='checkbox0']")
public static WebElement clk_selectcase ;

@FindBy(xpath="//i[@title='Self Assign Cases']")
public static WebElement clk_selfassigncase ;

@FindBy(xpath="//button[normalize-space()='Ok']")
public static WebElement clk_okbutton ;

@FindBy(xpath="//option[@value='56']")
public static WebElement clk_selectmycaseview ;

@FindBy(css="#home-page > div.react-form.form > div > div > div > div > div:nth-child(2) > div > div > div > div > div > div > div.tableWrapper.overflow-y-hidden.flex > div > div.customViewGrid.crm-table__body.overflow-auto.scroll.grid-without-actions > div:nth-child(1) > div > div.react-grid-Main > div > div:nth-child(2) > div > div > div:nth-child(2) > div:nth-child(1) > div.react-grid-Row.react-grid-Row--even > div:nth-child(1) > div > div > span > a > span")
 public static WebElement clk_selectthecase ;

@FindBy(xpath="//i[@class='icon icon-edit']")
public static WebElement clk_editthecase ;

@FindBy(xpath="//select[@name='cust_512']")
public static WebElement clk_dropdownacceptvalue ;

@FindBy(xpath="//textarea[@placeholder='Please post your comments here']")
public static WebElement clk_RemarksbyProcessor ;





}
