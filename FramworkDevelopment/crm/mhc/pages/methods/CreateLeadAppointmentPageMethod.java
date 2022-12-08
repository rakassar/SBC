package crm.mhc.pages.methods;

import java.text.DecimalFormat;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import crm.mhc.pages.objects.CollectDocsLeadPageObject;
import crm.mhc.pages.objects.CreateLeadAppointmentPageObject;
import crm.mhc.pages.objects.CustomerCareExecutiveObjects;
import crm.mhc.pages.objects.CustomerSearchPageObject;
import crm.mhc.pages.objects.HomePageObject;
import crm.mhc.pages.objects.IndividualSalesJourneyPageObject;

import org.openqa.selenium.support.ui.WebDriverWait;
public class CreateLeadAppointmentPageMethod extends HomePageMethod{

	String SDmobilenumber;
	public static String leadid;
	
//************************Fill the Info for new lead process*****************************-------------//
	
	
	public void selectstatuscodeappointment()
	{

		CreateLeadAppointmentPageObject.clk_statuscodeappointment.click();
	
	}
	
	public void PreferredDayTime(String time)
	{

		
		  CreateLeadAppointmentPageObject.clk_ldPreferredDay.click();
		  //CreateLeadAppointmentPageObject.clk_ldPreferredDay.sendKeys();
		 
		
		//CreateLeadAppointmentPageObject.clk_ldPreferredTime.click();
	    CreateLeadAppointmentPageObject.clk_ldPreferredTime.sendKeys(time);

		//CreateLeadAppointmentPageObject.snd_ldPreferredTime.sendKeys(time);
		
	
		 //Select sal=new Select(CreateLeadAppointmentPageObject.snd_ldPreferredTime);
	
		 //sal.selectByVisibleText(time);
		
		
	}
	
}