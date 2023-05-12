package com.hrms.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hrms.pageobject.EmployeesDirectoryPageObject;

public class EmployeesDirectoryActions {

	private WebDriver driver;
	private EmployeesDirectoryPageObject employeesdirectorypageObject;

	public EmployeesDirectoryActions(WebDriver driver) {
		this.driver = driver;
		this.employeesdirectorypageObject = new EmployeesDirectoryPageObject(driver);
	}

	public void employeeDirectoryPageVisible() {
		
		employeesdirectorypageObject.employeeDirectorypageVisible();
	}

	public void employeesDirectoryClick() {
		employeesdirectorypageObject.employeesDirectoryClick();

	}
	public void employeeDirectoryGetCurrentUrl() {
		employeesdirectorypageObject.getCurrentUrlToCrossVerify();
	}

	public void createEmployeeManually() {
		employeesdirectorypageObject.createNewBtnClick();
		employeesdirectorypageObject.addManuallyClick();
	}

	public void formOfmanuallyEmployeeCreate() {

//		employeesdirectorypageObject.selectEntityEmployeeCreationFormDd();

//		first section -->"personal detail"  employee creation form field
		employeesdirectorypageObject.employeeCreationFormFullNameInput();
		employeesdirectorypageObject.employeeCreationFormGenderDd();
		employeesdirectorypageObject.employeeCreationFormJoiningDateCalendar();
		employeesdirectorypageObject.employeeCreationFormMaritalStatusDd();
		employeesdirectorypageObject.employeeCreationFormDateOfMarriagecalendar();
		employeesdirectorypageObject.employeeCreationFormDateOfBirthCalendar();
		employeesdirectorypageObject.employeeCreationFormNationalityDd();
		employeesdirectorypageObject.employeeCreationFormMOBILENUMBEREnter();
		employeesdirectorypageObject.employeeCreationFormPersonalEmailIDEnter();
		employeesdirectorypageObject.employeeCreationFormAadharCardEnter();
		employeesdirectorypageObject.employeeCreationFormBloodGroupDd();

		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		second section -->"detail" employee creation form field
		employeesdirectorypageObject.employeeCreationFormdetailEmployeeCodeInput();
		employeesdirectorypageObject.employeeCreationFormdetailLeaveRuleDd();
		employeesdirectorypageObject.employeeCreationFormdetailReportingManagerDd();
		employeesdirectorypageObject.employeeCreationFormdetailShiftDd();
		employeesdirectorypageObject.employeeCreationFormdetailDepartmentDd();
		employeesdirectorypageObject.employeeCreationFormdetailDesignationDd();
		employeesdirectorypageObject.employeeCreationFormdetailEmployeeTypeDd();
		employeesdirectorypageObject.employeeCreationFormdetailLocation_Dd();
		employeesdirectorypageObject.employeeCreationFormdetailOfficial_Email_ID_Input();
		employeesdirectorypageObject.employeeCreationFormdetailEmployeeStatusDd();
		employeesdirectorypageObject.employeeCreationFormDetailCompanyDd();

		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//	 third section -->"Address" employee creation form field

		employeesdirectorypageObject.employeeCreationFormAddressCurrentAddress1Text();
		employeesdirectorypageObject.employeeCreationFormAddressCurrentAddress2Text();
		employeesdirectorypageObject.employeeCreationFormAddressCountryDd();
		employeesdirectorypageObject.employeeCreationFormAddressStateDd();
		employeesdirectorypageObject.employeeCreationFormAddressCityDd();
		employeesdirectorypageObject.employeeCreationFormAddressZipInput();
		employeesdirectorypageObject.employeeCreationFormAddressSameAsCurrentCb();

		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		four section -->"Bank Name" employee creation form field 

		employeesdirectorypageObject.employeeCreationFormBankNamePaymentTypeDd();
		employeesdirectorypageObject.employeeCreationFormBankNameText();
		employeesdirectorypageObject.employeeCreationFormBankNameAccountNoText();
		employeesdirectorypageObject.employeeCreationFormBankNameIFSCcodeText();
		employeesdirectorypageObject.employeeCreationFormBankNameAccountHolderNameText();

		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		five section -->"Emergency Detail" employee creation form field

		employeesdirectorypageObject.employeeCreationFormEmergencyNameText();
		employeesdirectorypageObject.employeeCreationFormEmergencyRelationshipText();
		employeesdirectorypageObject.employeeCreationFormEmergencyAddressText();
		employeesdirectorypageObject.employeeCreationFormEmergencyEmailText();
		employeesdirectorypageObject.employeeCreationFormEmergencyMobileNoText();

		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		six section -->"Qualification" employee creation form field 

		employeesdirectorypageObject.employeeCreationFormQualificationDiplomaNameDd();
		employeesdirectorypageObject.employeeCreationFormQualificationInstitutionNameText();
		employeesdirectorypageObject.employeeCreationFormQualificationPassingYearText();
		employeesdirectorypageObject.employeeCreationFormQualificationPercentageText();

		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		seven section -->"Work Experience" employee creation form field 

		employeesdirectorypageObject.employeeCreationFormWEPreviousCompanyNameTxt();
		employeesdirectorypageObject.employeeCreationFormWEJobTitleTxt();
		employeesdirectorypageObject.employeeCreationFormWEFromDateCalendar();
		employeesdirectorypageObject.employeeCreationFormWETODateCalendar();

		employeesdirectorypageObject.saveBtnEmployeeCreationFormDd();

	}

}
