package crm.mhc.pages.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLeadAppointmentPageObject extends LoginPageObject{
	
public CreateLeadAppointmentPageObject (WebDriver driver)

{
	super(driver);
	
}


//Fill the all textbox type info//

@FindBy(id="1")
public static WebElement clk_statuscodeappointment;

//@FindBy(xpath="//*[contains(@placeholder,'MM/DD/YYYY')]")
@FindBy(xpath="//a[contains(@title,'Today') and @data-autoid='cust_192_today']")//added this one to choose today;s date
public static WebElement clk_ldPreferredDay;

//@FindBy(css="div[class='timepickerContainer']")
@FindBy(xpath="//input[@mask='11:11 aa']") //added this one to click on time field
public static WebElement clk_ldPreferredTime;

@FindBy(xpath="//div[@class='timepickerContainer']/div[1]/ul[1]/li[2]")
public static WebElement snd_ldPreferredTime;


}