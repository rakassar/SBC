package crm.mhc.pages.methods;

import org.openqa.selenium.support.ui.Select;
import java.util.Calendar;
import crm.mhc.pages.objects.CustomerCareExecutiveObjects;


public class CustomerCareExecutiveMethods extends HomePageMethod {
	
public void SDBirthDate( String date)
	
	
	{
	
	  String month,day, year;
      String date_dd_MM_yyyy[] = (date.split("/"));
      day= date_dd_MM_yyyy[0];
      month= date_dd_MM_yyyy[1];
      year= date_dd_MM_yyyy[2];
	
	
		Select sel=new Select(CustomerCareExecutiveObjects.sel_SDdobmonth);
		
		sel.selectByValue(month);

		Select sel1=new Select(CustomerCareExecutiveObjects.sel_SDdobday);

		sel1.selectByValue(day);

		Select sel2=new Select(CustomerCareExecutiveObjects.sel_SDdobyear);

		sel2.selectByValue(year);
	}

public void SDZipCodeFills( String zipcode)
{
 CustomerCareExecutiveObjects.sel_SDZipCode.sendKeys(zipcode);

}
}
