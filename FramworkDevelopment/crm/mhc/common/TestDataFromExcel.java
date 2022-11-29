package crm.mhc.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataFromExcel {
	
	public static String UserName_CA;
	public static String Password;
	public static String UserName_CCGInboundTeamLeader_Pro;
	public static String UserName_CCGVendorCoordinator_Pro;
	public static String UserName_CCGVendorCoordinator_Sup;
	public static String UserName_CallCenterThirdPartyTeamLeader_Sup;
	

	
	
	
	
	public static String SalutationID;
	public static String ProductCategory;
	public static String Product;
	public static String dobmonth;
	public static String dobdate;
	public static String dobyear;
	public static String Gender;
	public static String CustomerType;
	public static String CivilStatus;
	public static String CustomerContact;
	public static String BusinnesSegment;
	public static String ClientSegment;
	public static String SoleOwner;
	public static String Employeetype;
	public static String SourceoffundsEmp;
	public static String SourceoffundsUnemp;
	public static String SourceoffundsSelemp;
	
	public static String occupation;
	public static String IncomeRange;
	public static String workingsincemonth;
	public static String workingsinceyear;
	public static String EconomicActivity;
	public static String Industry_Classification;
	public static String NatureOfWork;
	public static String forEmployment;
	public static String IDPrrof;
	public static String AoCode;
	public static String Zipcode;
	public static String mailingaddress;
	public static String BBN;
	public static String PermanentAddresssameasPresentAddress;
	
	public static String Ofac;

	
	
//CRSC
	public static String AmlcUnJmf;
	public static String BankInternalChecklist;
	public static String AllegedPerdsonf;
	public static String HPIOrJoint;
	public static String BenifOFW;
	public static String ForeignNational;
	public static String NeumberAccount;
	public static String EmploymentTypeCRRSC;
	public static String IndustryCRRSC;
	public static String EconmicactivityeCRRSC;
	public static String managerialCRRSC;
	public static String DirectDealingCRRSC;
	public static String customerdeclaredCRRSC;
	
	
	
	public static String CityCRRSC;
	public static String ProvinceCRRSC;
	public static String RiskCRRSC;
	public static String vicinityRRSC;
	public static String intialdepositeRRSC;
	public static String InwprdOutwordRRSC;
	public static String ComfortableInformationRRSC;
	public static String ComfortableDocumentsRRSC;
 
	//Fill Account Information
	
	public static String RequestTypef;
	public static String Purposeofaccountopening;
	public static String ADBRequired;
	public static String PromsEmail;
	public static String PromsSMS;
	public static String TransactionalEmail;
	public static String TransactionalSMS;
	
	
	
public static void DataRead() throws IOException {

//public static void main (String [] args) throws IOException{
		
FileInputStream fs = new FileInputStream("D:\\Rizwan\\Automation\\lib\\SBC\\SBC_Datafromexcel.xlsx");
//Creating a workbook
XSSFWorkbook workbook = new XSSFWorkbook(fs);
XSSFSheet sheet = workbook.getSheetAt(0);
XSSFSheet sheet1 = workbook.getSheetAt(1);
XSSFSheet sheet2 = workbook.getSheetAt(2);
XSSFSheet sheet3 = workbook.getSheetAt(3);


UserName_CA=sheet3.getRow(0).getCell(1).getStringCellValue();
Password=sheet3.getRow(1).getCell(1).getStringCellValue();
UserName_CCGInboundTeamLeader_Pro=sheet3.getRow(2).getCell(1).getStringCellValue();
UserName_CCGVendorCoordinator_Pro=sheet3.getRow(3).getCell(1).getStringCellValue();
UserName_CCGVendorCoordinator_Sup=sheet3.getRow(4).getCell(1).getStringCellValue();
UserName_CallCenterThirdPartyTeamLeader_Sup=sheet3.getRow(5).getCell(1).getStringCellValue();



SalutationID=sheet.getRow(2).getCell(1).getStringCellValue();
ProductCategory=sheet.getRow(3).getCell(1).getStringCellValue();
Product=sheet.getRow(4).getCell(1).getStringCellValue();
dobmonth=sheet.getRow(5).getCell(1).getStringCellValue();
dobdate=sheet.getRow(6).getCell(1).getStringCellValue();
dobyear=sheet.getRow(7).getCell(1).getStringCellValue();
Gender=sheet.getRow(8).getCell(1).getStringCellValue();
CustomerType=sheet.getRow(9).getCell(1).getStringCellValue();
CivilStatus=sheet.getRow(10).getCell(1).getStringCellValue();
CustomerContact=sheet.getRow(11).getCell(1).getStringCellValue();
BusinnesSegment=sheet.getRow(12).getCell(1).getStringCellValue();
ClientSegment=sheet.getRow(13).getCell(1).getStringCellValue();
SoleOwner=sheet.getRow(14).getCell(1).getStringCellValue();
Employeetype=sheet.getRow(15).getCell(1).getStringCellValue();
SourceoffundsEmp=sheet.getRow(16).getCell(1).getStringCellValue();
occupation=sheet.getRow(17).getCell(1).getStringCellValue();
IncomeRange=sheet.getRow(18).getCell(1).getStringCellValue();
workingsincemonth=sheet.getRow(19).getCell(1).getStringCellValue();
workingsinceyear=sheet.getRow(20).getCell(1).getStringCellValue();
EconomicActivity=sheet.getRow(21).getCell(1).getStringCellValue();
Industry_Classification=sheet.getRow(22).getCell(1).getStringCellValue();
NatureOfWork=sheet.getRow(23).getCell(1).getStringCellValue();
forEmployment=sheet.getRow(24).getCell(1).getStringCellValue();
IDPrrof=sheet.getRow(25).getCell(1).getStringCellValue();
AoCode=sheet.getRow(26).getCell(1).getStringCellValue();
Zipcode=sheet.getRow(27).getCell(1).getStringCellValue();
mailingaddress=sheet.getRow(28).getCell(1).getStringCellValue();
SourceoffundsUnemp=sheet.getRow(29).getCell(1).getStringCellValue();
SourceoffundsSelemp=sheet.getRow(30).getCell(1).getStringCellValue();
BBN=sheet.getRow(31).getCell(1).getStringCellValue();
PermanentAddresssameasPresentAddress=sheet.getRow(32).getCell(1).getStringCellValue();
Ofac=sheet.getRow(33).getCell(1).getStringCellValue();



//CRRSC
AmlcUnJmf=sheet1.getRow(0).getCell(1).getStringCellValue();
BankInternalChecklist=sheet1.getRow(1).getCell(1).getStringCellValue();
AllegedPerdsonf=sheet1.getRow(2).getCell(1).getStringCellValue();
HPIOrJoint=sheet1.getRow(3).getCell(1).getStringCellValue();
BenifOFW=sheet1.getRow(4).getCell(1).getStringCellValue();
ForeignNational=sheet1.getRow(5).getCell(1).getStringCellValue();
NeumberAccount=sheet1.getRow(6).getCell(1).getStringCellValue();
EmploymentTypeCRRSC=sheet1.getRow(7).getCell(1).getStringCellValue();
CityCRRSC=sheet1.getRow(8).getCell(1).getStringCellValue();
ProvinceCRRSC=sheet1.getRow(9).getCell(1).getStringCellValue();
RiskCRRSC=sheet1.getRow(10).getCell(1).getStringCellValue();
vicinityRRSC=sheet1.getRow(11).getCell(1).getStringCellValue();
intialdepositeRRSC=sheet1.getRow(12).getCell(1).getStringCellValue();
InwprdOutwordRRSC=sheet1.getRow(13).getCell(1).getStringCellValue();
ComfortableInformationRRSC=sheet1.getRow(14).getCell(1).getStringCellValue();
ComfortableDocumentsRRSC=sheet1.getRow(15).getCell(1).getStringCellValue();
IndustryCRRSC=sheet1.getRow(16).getCell(1).getStringCellValue();
EconmicactivityeCRRSC=sheet1.getRow(17).getCell(1).getStringCellValue();
managerialCRRSC=sheet1.getRow(18).getCell(1).getStringCellValue();
DirectDealingCRRSC=sheet1.getRow(19).getCell(1).getStringCellValue();
customerdeclaredCRRSC=sheet1.getRow(20).getCell(1).getStringCellValue();



  
  RequestTypef=sheet2.getRow(0).getCell(1).getStringCellValue();
  Purposeofaccountopening=sheet2.getRow(1).getCell(1).getStringCellValue();
  ADBRequired=sheet2.getRow(2).getCell(1).getStringCellValue();
  PromsEmail=sheet2.getRow(3).getCell(1).getStringCellValue();
  PromsSMS=sheet2.getRow(4).getCell(1).getStringCellValue();
  TransactionalEmail=sheet2.getRow(5).getCell(1).getStringCellValue();
  TransactionalSMS=sheet2.getRow(6).getCell(1).getStringCellValue();
 



Row row1 = sheet.getRow(1);
Cell cell1 = row1.getCell(1);
System.out.println(sheet.getRow(0).getCell(1));
Row row2 = sheet.getRow(1);
Cell cell2 = row2.getCell(1);
System.out.println(sheet.getRow(1).getCell(0));
Row row3 = sheet.getRow(1);
Cell cell3 = row3.getCell(1);
System.out.println(UserName_CA);
System.out.println(Password);


	
		
	}

}
