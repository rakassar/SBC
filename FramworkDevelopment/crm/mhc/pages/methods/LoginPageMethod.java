package crm.mhc.pages.methods;
import org.testng.Reporter;

import crm.mhc.common.BrowserStart;
import crm.mhc.pages.objects.LoginPageObject;


public abstract class LoginPageMethod extends BrowserStart
{
 public void EnterUserName(String username)
 { 
	
	
	LoginPageObject.txt_userName.clear();
	LoginPageObject.txt_userName.sendKeys(username);
	Reporter.log("Enter UserName");
	
 }
 

 public void EnterPassword(String Password)
 {   
	 LoginPageObject.txt_password.clear();
	 LoginPageObject.txt_password.sendKeys(Password);
	 Reporter.log("Enter Password");
 }
 public void LoginButtonClick()
 {
	 LoginPageObject.btn_loginButton.click();
 }
 
 public void LogoutButtonClick()
 {
	 LoginPageObject.clk_ProfileImage_header.click();
	 LoginPageObject.clk_logoutButton.click();
	 
 }
 
}
