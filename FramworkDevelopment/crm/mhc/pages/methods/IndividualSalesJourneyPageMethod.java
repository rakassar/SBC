package crm.mhc.pages.methods;

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import crm.mhc.pages.objects.CustomerCareExecutiveObjects;
import crm.mhc.pages.objects.CustomerSearchPageObject;
import crm.mhc.pages.objects.HomePageObject;
import crm.mhc.pages.objects.IndividualSalesJourneyPageObject;

import org.openqa.selenium.support.ui.WebDriverWait;

public class IndividualSalesJourneyPageMethod extends HomePageMethod {

	String SDmobilenumber;
	public static String leadid;

//************************Fill the Info for new lead process*****************************-------------//

	public void SalutationID(String Salute) {
		Select sal = new Select(IndividualSalesJourneyPageObject.sel_ldSalutation);
		// sal.selectByValue(Salute);
		sal.selectByVisibleText(Salute);
	}

	public void EnterFirstName() {
		Random r = new Random();
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		final int N = 6;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
		}
		String firstname = sb.toString();

		IndividualSalesJourneyPageObject.ent_ldfirstname.sendKeys(firstname);
	}

	public void EnterlastName() {
		Random r = new Random();
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		final int N = 6;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
		}
		String lastname = sb.toString();

		IndividualSalesJourneyPageObject.ent_ldlastname.sendKeys(lastname);
	}

	public void EntermiddleName() {
		Random r = new Random();
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		final int N = 6;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
		}
		String middlename = sb.toString();

		IndividualSalesJourneyPageObject.ent_ldmiddlename.sendKeys(middlename);
	}

	public void EnterMobile() {
		Random rand = new Random();
		int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
		int num2 = rand.nextInt(743);
		int num3 = rand.nextInt(10000);

		DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
		DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

		String mnumbername = df3.format(num1) + df3.format(num2) + df4.format(num3);
		SDmobilenumber = mnumbername;
		IndividualSalesJourneyPageObject.ent_ldmobile.sendKeys(mnumbername);
	}

	public void NTBJourneynext1()

	{
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

		IndividualSalesJourneyPageObject.clk_NTBONBourneynext1.click();
	}

	public void NTBJourneyBirthDate(String date)

	{

		String month, day, year;
		String date_dd_MM_yyyy[] = (date.split("/"));
		day = date_dd_MM_yyyy[0];
		month = date_dd_MM_yyyy[1];
		year = date_dd_MM_yyyy[2];

		Select sel = new Select(IndividualSalesJourneyPageObject.sel_lddobmonth);

		sel.selectByValue(month);

		Select sel1 = new Select(IndividualSalesJourneyPageObject.sel_lddobday);

		sel1.selectByValue(day);

		Select sel2 = new Select(IndividualSalesJourneyPageObject.sel_lddobyear);

		sel2.selectByValue(year);
	}

	public void ProductCategory(String ProductCategory) {
		Select sel = new Select(IndividualSalesJourneyPageObject.sel_ldProductCategory);
		// sel.selectByValue(Product);
		sel.selectByVisibleText(ProductCategory);
	}

	public void Product(String Product) {
		Select sel = new Select(IndividualSalesJourneyPageObject.sel_ldProduct);
		// sel.selectByValue(Product);
		sel.selectByVisibleText(Product);
	}

	public void NTBJourneynext2() throws InterruptedException
	
  	{

   
	  IndividualSalesJourneyPageObject.clk_NTBONBourneynext2.click();
	  Thread.sleep(1000);
	  System.out.println("Click on Next");	
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  try {
		  
          // check visibility with isDisplayed()
          if (IndividualSalesJourneyPageObject.clk_ignoreandcreate.isDisplayed()){
             System.out.println("Lead is dulplicated !");
             IndividualSalesJourneyPageObject.clk_ignoreandcreate.click();
       }
	  }
       catch(Exception n)   {
          System.out.println("Lead is not dulplicated !");
       }
       
  	
  	}

	public void LeadRating(String leadrating)

	{
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		Select sel = new Select(IndividualSalesJourneyPageObject.sel_LeadRating);
		// sel.selectByValue(Product);
		sel.selectByVisibleText(leadrating);
	}

	public void NTBignoreandCreate()

	{
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

		IndividualSalesJourneyPageObject.clk_ignoreandcreate.click();
	}

//***********Start*************no use Fill the Info for COL process*****************************-------------//	

	public void EnterSDemail() {

		Random r = new Random();
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		final int N = 6;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
		}

		String lastname = sb.toString();

		final int M = 3;
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < M; i++) {
			sb1.append(alphabet.charAt(r.nextInt(alphabet.length())));
		}

		String lastname1 = sb1.toString();

		String email = lastname + "@" + lastname1 + ".com";

		IndividualSalesJourneyPageObject.ent_SDemail.sendKeys(email);
	}

	public void EnterSDFax(String Fax) {

		IndividualSalesJourneyPageObject.ent_SDFax.sendKeys(Fax);
	}

	public void EnterSDPhone(String Phone) {

		IndividualSalesJourneyPageObject.ent_SDPhone.sendKeys(Phone);
	}

	public void EnterSDEmployer(String Employer) {

		IndividualSalesJourneyPageObject.ent_SDEmployer.sendKeys(Employer);
	}

	public void EnterSDOfficePhone(String OfficePhone) {

		IndividualSalesJourneyPageObject.ent_SDOfficePhone.sendKeys(OfficePhone);
	}

	public void EnterSDMonthlySalary(String MonthlySalary) {

		IndividualSalesJourneyPageObject.ent_SDMonthlySalary.sendKeys(MonthlySalary);
	}

	public void EnterSDOtherSalary(String OtherSalary) {

		IndividualSalesJourneyPageObject.ent_SDOtherSalary.sendKeys(OtherSalary);
	}

	public void EnterSDnetIncome(String NetIncome) {

		IndividualSalesJourneyPageObject.ent_SDNetAnnualIncome.sendKeys(NetIncome);
	}

	public void EnterSDDeductions(String Deductions) {

		IndividualSalesJourneyPageObject.ent_SDDeductions.sendKeys(Deductions);
	}

	public void EnterSDCommitments(String Commitments) {

		IndividualSalesJourneyPageObject.ent_SDCommitments.sendKeys(Commitments);
	}

	public void EnterSDOrignalAmount(String OrignalAmount) {

		IndividualSalesJourneyPageObject.ent_SDOriginalAmount.sendKeys(OrignalAmount);
	}

	public void EnterSDAverageMonthlyExpenses(String AverageMonthlyExpenses) {

		IndividualSalesJourneyPageObject.ent_SDAverageMonthlyExpenses.sendKeys(AverageMonthlyExpenses);
	}

	public void EnterSDPermanentAddress1(String PermanentAddress1) {

		IndividualSalesJourneyPageObject.ent_SDPermanentAddress1.sendKeys(PermanentAddress1);
	}

	public void EnterSDPermanentAddress2(String PermanentAddress2) {

		IndividualSalesJourneyPageObject.ent_SDPermanentAddress2.sendKeys(PermanentAddress2);
	}

	public void EnterSDPermanentAddress3(String PermanentAddress3) {

		IndividualSalesJourneyPageObject.ent_SDPermanentAddress3.sendKeys(PermanentAddress3);
	}

	public void EnterSDNID() {
		Random rand = new Random();
		int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
		int num2 = rand.nextInt(743);
		int num3 = rand.nextInt(10000);

		DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
		DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

		String NID = "S" + df3.format(num1) + df3.format(num2) + df4.format(num3);

		IndividualSalesJourneyPageObject.ent_NID.sendKeys(NID);
	}

	// Fill the all listtype info//

	public void SDApplicantType(String ApplicantType) {
		Select sel = new Select(IndividualSalesJourneyPageObject.sel_SDApplicantType);
		sel.selectByValue(ApplicantType);
	}

	public void SDGender(String Gender) {
		Select sel = new Select(IndividualSalesJourneyPageObject.sel_SDGender);
		sel.selectByValue(Gender);
	}

	public void SDNationality(String Nationality) {
		Select sel = new Select(IndividualSalesJourneyPageObject.sel_SDNationality);
		sel.selectByValue(Nationality);
	}

	public void SDCustomerCategory(String sel_SDCustomerCategory) {
		Select sel = new Select(IndividualSalesJourneyPageObject.sel_SDCustomerCategory);
		sel.selectByValue(sel_SDCustomerCategory);
	}

	public void SDOccupation(String Occupation) {
		Select sel = new Select(IndividualSalesJourneyPageObject.sel_SDOccupation);
		sel.selectByValue(Occupation);
	}

	public void SDMaritalStatus(String MaritalStatus) {
		Select sel = new Select(IndividualSalesJourneyPageObject.sel_SDMaritalStatus);
		sel.selectByValue(MaritalStatus);
	}

	public void SDCountry(String Country) {
		Select sel = new Select(IndividualSalesJourneyPageObject.sel_SDCountry);
		sel.selectByValue(Country);
	}

	public void SDTerritoryName(String TerritoryName) throws InterruptedException {
		IndividualSalesJourneyPageObject.ser_SDTerritoryName.sendKeys(TerritoryName);
		Thread.sleep(1000);
		IndividualSalesJourneyPageObject.ser_SDTerritoryName.sendKeys(Keys.DOWN, Keys.ENTER);
	}

	public void SDLocation(String Location) throws InterruptedException {
		IndividualSalesJourneyPageObject.ser_SDLocation.sendKeys(Location);
		// wait.until(ExpectedConditions.visibilityOfElementLocated((NTBIndividualSalesJourneyPageObject.ser_SDLocation));
		Thread.sleep(1000);
		IndividualSalesJourneyPageObject.ser_SDLocation.sendKeys(Keys.DOWN, Keys.ENTER);
	}

	// district is depended field on SDLaction
	/*
	 * public void SDDistrict(String District) throws InterruptedException {
	 * NTBIndividualSalesJourneyPageObject.ser_SDdistrict.sendKeys(District);
	 * Thread.sleep(1000);
	 * NTBIndividualSalesJourneyPageObject.ser_SDdistrict.sendKeys(Keys.DOWN,Keys.
	 * ENTER); }
	 */
	// **no value of zip code
	/*
	 * public void SDZipCode(String SDZipCode) throws InterruptedException {
	 * NTBIndividualSalesJourneyPageObject.ser_SDZipCode.sendKeys(ZipCode);
	 * Thread.sleep(1000);
	 * NTBIndividualSalesJourneyPageObject.ser_SDZipCode.sendKeys(Keys.DOWN,Keys.
	 * ENTER); }
	 */

	public void SDCampaign(String campaignname) throws InterruptedException {
		IndividualSalesJourneyPageObject.picser_SDCampaign.click();
		IndividualSalesJourneyPageObject.picsertext_SDCampaign.sendKeys(campaignname);
		IndividualSalesJourneyPageObject.picsertext_SDCampaign.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		// Actions action = new Actions(driver);
		// action.moveToElement(NTBIndividualSalesJourneyPageObject.picinser_SDCampaign).click().perform();
		// NTBIndividualSalesJourneyPageObject.picinser_Campaign.click();
		IndividualSalesJourneyPageObject.picserselect_SDCampaign.click();
	}

	public void SDAdvanceSearchByMobile() throws InterruptedException {
		HomePageObject.btn_AdvancesearchedByMobilePhone.sendKeys(SDmobilenumber);
	}

	public void SDAdvanceSearchByLeadid() throws InterruptedException {

		HomePageObject.btn_AdvancesearchedByLeadIDs.sendKeys();
	}

	public void SDAdvanceSearchByMobileManual(String SDmobilenumbermanual) throws InterruptedException {
		HomePageObject.btn_AdvancesearchedByMobilePhone.sendKeys(SDmobilenumbermanual);
	}

	public void SDAdvanceSearchByLeadidManual(String SDLeadmanual) throws InterruptedException {
		HomePageObject.btn_AdvancesearchedByLeadIDs.sendKeys(SDLeadmanual);
	}

	// ***********End*************Fill the Info for SD
	// process*****************************-------------//

	// *********Start***************Fill the Info for COL
	// process*****************************-------------//

	public void COLCompanyName(String Company) throws InterruptedException {
		IndividualSalesJourneyPageObject.picser_COLCompany.sendKeys(Company);
		Thread.sleep(1000);
		IndividualSalesJourneyPageObject.picser_COLCompany.sendKeys(Keys.DOWN, Keys.ENTER);
	}

	public void COLLeadrating(String MaritalStatus) {
		Select sel = new Select(IndividualSalesJourneyPageObject.sel_COLRatingID);
		sel.selectByValue(MaritalStatus);
	}

	public void EnterCOLFirstName() {
		Random r = new Random();
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		final int N = 6;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
		}

		String email1 = sb.toString();

		final int M = 3;
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < M; i++) {
			sb1.append(alphabet.charAt(r.nextInt(alphabet.length())));
		}

		String email2 = sb1.toString();

		String email = email1 + "@" + email2 + ".com";
		IndividualSalesJourneyPageObject.ent_COLEmail.sendKeys(email);

	}

	public void EnterCOLCompanyMobileNo() {
		Random rand = new Random();
		int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
		int num2 = rand.nextInt(743);
		int num3 = rand.nextInt(10000);

		DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
		DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

		String phoneNumber = df3.format(num1) + df3.format(num2) + df4.format(num3);
		IndividualSalesJourneyPageObject.ent_COLCompanyMobileNo.sendKeys(phoneNumber);

	}

	public void COLProduct(String productid) {
		Select sel = new Select(IndividualSalesJourneyPageObject.sel_COLProductID);
		sel.selectByValue(productid);
	}

	public void COLTerritoryName(String TerritoryName) throws InterruptedException {
		IndividualSalesJourneyPageObject.picser_COLTerritoryName.sendKeys(TerritoryName);
		Thread.sleep(1000);
		IndividualSalesJourneyPageObject.picser_COLTerritoryName.sendKeys(Keys.DOWN, Keys.ENTER);
	}

	public void COLCorporateType(String Company) {
		Select sel = new Select(IndividualSalesJourneyPageObject.sel_COLCorporateType);
		sel.selectByValue(Company);
	}

	public void COLCompanyRegistrationNumber() {
		Random rand = new Random();
		int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
		int num2 = rand.nextInt(743);
		int num3 = rand.nextInt(10000);

		DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
		DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

		String CRN = df3.format(num1) + df3.format(num2) + df4.format(num3);
		IndividualSalesJourneyPageObject.ent_COLCompanyRegistrationNumber.sendKeys(CRN);
	}

	public void COLobjectsOfCompany(String ObjectOfCompany)

	{

		IndividualSalesJourneyPageObject.ent_COLObjectsofCompany.sendKeys(ObjectOfCompany);

	}

	public void COLApplicantType(String ApplicantType) {
		Select sel = new Select(IndividualSalesJourneyPageObject.sel_COLApplicantType);
		sel.selectByValue(ApplicantType);
	}

	public void COLRegisteredAddressLine1(String RegisteredAddressLine1)

	{
		IndividualSalesJourneyPageObject.ent_COLRegisteredAddressLine1.sendKeys(RegisteredAddressLine1);
	}

	public void COLRegisteredAddressLine2(String RegisteredAddressLine2)

	{
		IndividualSalesJourneyPageObject.ent_COLRegisteredAddressLine2.sendKeys(RegisteredAddressLine2);
	}

	public void COLRegisteredAddressLine3(String RegisteredAddressLine3)

	{
		IndividualSalesJourneyPageObject.ent_COLRegisteredAddressLine3.sendKeys(RegisteredAddressLine3);
	}

	public void COLRegisteredlocation(String Registeredlocation) throws InterruptedException {
		IndividualSalesJourneyPageObject.picser_COLRegisteredlocation.sendKeys(Registeredlocation);
		Thread.sleep(1000);
		IndividualSalesJourneyPageObject.picser_COLRegisteredlocation.sendKeys(Keys.DOWN, Keys.ENTER);

	}

	public void COLBusinessRegistrationAddressLine1(String BusinessRegistrationAddressLine1) {

		IndividualSalesJourneyPageObject.ent_COLBusinessRegistrationAddressLine1
				.sendKeys(BusinessRegistrationAddressLine1);
	}

	public void COLBusinessRegistrationAddressLine2(String BusinessRegistrationAddressLine2) {
		IndividualSalesJourneyPageObject.ent_COLBusinessRegistrationAddressLine2
				.sendKeys(BusinessRegistrationAddressLine2);
	}

	public void COLBusinessRegistrationAddressLine3(String BusinessRegistrationAddressLine3) {
		IndividualSalesJourneyPageObject.ent_COLBusinessRegistrationAddressLine3
				.sendKeys(BusinessRegistrationAddressLine3);
	}

	public void COLBusinessRegistrationLocation(String BusinessRegistrationLocation) throws InterruptedException {
		IndividualSalesJourneyPageObject.picser_COLBusinessRegistrationLocation.sendKeys(BusinessRegistrationLocation);
		Thread.sleep(1000);
		IndividualSalesJourneyPageObject.picser_COLBusinessRegistrationLocation.sendKeys(Keys.DOWN, Keys.ENTER);
	}

	public void COLShareholderName1(String ShareholderName1) {
		IndividualSalesJourneyPageObject.ent_COLShareholderName1.sendKeys(ShareholderName1);
	}

	public void COLShareholderName2(String ShareholderName2) {
		IndividualSalesJourneyPageObject.ent_COLShareholderName2.sendKeys(ShareholderName2);
	}

	public void COLShareholderName3(String ShareholderName3) {
		IndividualSalesJourneyPageObject.ent_COLShareholderName3.sendKeys(ShareholderName3);
	}

	public void COLShareholderName4(String ShareholderName4) {
		IndividualSalesJourneyPageObject.ent_COLShareholderName4.sendKeys(ShareholderName4);
	}

	public void COLShareholderName5(String ShareholderName5) {
		IndividualSalesJourneyPageObject.ent_COLShareholderName5.sendKeys(ShareholderName5);
	}

	public void COLOwnedbyShareholderAssociate1(String COLOwnedbyShareholderAssociate1) {
		IndividualSalesJourneyPageObject.ent_COLOwnedbyShareholderAssociate1.sendKeys(COLOwnedbyShareholderAssociate1);
	}

	public void COLOwnedbyShareholderAssociate2(String COLOwnedbyShareholderAssociate2) {
		IndividualSalesJourneyPageObject.ent_COLOwnedbyShareholderAssociate2.sendKeys(COLOwnedbyShareholderAssociate2);
	}

	public void COLOwnedbyShareholderAssociate3(String COLOwnedbyShareholderAssociate3) {
		IndividualSalesJourneyPageObject.ent_COLOwnedbyShareholderAssociate3.sendKeys(COLOwnedbyShareholderAssociate3);
	}

	public void COLOwnedbyShareholderAssociate4(String COLOwnedbyShareholderAssociate4) {
		IndividualSalesJourneyPageObject.ent_COLOwnedbyShareholderAssociate4.sendKeys(COLOwnedbyShareholderAssociate4);
	}

	public void COLOwnedbyShareholderAssociate5(String COLOwnedbyShareholderAssociate5) {
		IndividualSalesJourneyPageObject.ent_COLOwnedbyShareholderAssociate5.sendKeys(COLOwnedbyShareholderAssociate5);
	}

	public void COLAverageMonthlyBankDepositBalance(String AMBD) {
		IndividualSalesJourneyPageObject.ent_COLAverageMonthlyBankDepositBalance.sendKeys(AMBD);
	}

	public void COLPastProjectDetail(String PPD) {
		IndividualSalesJourneyPageObject.ent_COLPastProjectDetail.sendKeys(PPD);
	}

	public void COLDirectorName(String DN) {
		IndividualSalesJourneyPageObject.ent_COLDirectorName.sendKeys(DN);
	}

	public void COLDirectorAge(String DA) {
		IndividualSalesJourneyPageObject.ent_COLDirectorAge.sendKeys(DA);
	}

	public void COLDirectorMonthlyIncome(String DMI) {
		IndividualSalesJourneyPageObject.ent_COLDirectorMonthlyIncome.sendKeys(DMI);
	}

	public void COLMandatairesName(String MN) {
		IndividualSalesJourneyPageObject.ent_COLMandatairesName.sendKeys(MN);
	}

	public void COLCampaign(String campaignname) throws InterruptedException {
		IndividualSalesJourneyPageObject.picser_COLCampaign.click();
		IndividualSalesJourneyPageObject.picsertext_COLCampaign.sendKeys(campaignname);
		IndividualSalesJourneyPageObject.picsertext_COLCampaign.sendKeys(Keys.ENTER);

		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.visibilityOf();
		Thread.sleep(2000);
		// Actions action = new Actions(driver);

		// action.moveToElement(NTBIndividualSalesJourneyPageObject.picinser_COLCampaign).click().perform();
		// NTBIndividualSalesJourneyPageObject.picinser_COLCampaign.click();
		IndividualSalesJourneyPageObject.picserselect_COLCampaign.click();
	}

	// *********end ***************Fill the Info for COL
	// process*****************************-------------//

}
