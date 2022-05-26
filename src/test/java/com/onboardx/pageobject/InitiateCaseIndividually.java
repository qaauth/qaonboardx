package com.onboardx.pageobject;

import java.awt.Robot;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.onboardx.utilities.JavaScriptManuplator;

public class InitiateCaseIndividually {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Robot rbt;

	public InitiateCaseIndividually(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// OnBoardX : Step 3 - Vendor Authorization
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]")
	@CacheLookup
	WebElement verifyDataSavedSuccessfully;

	@FindBy(xpath = "//b[contains(text(),'Drag and hover the mouse over the box above to app')]")
	@CacheLookup
	WebElement verifyDragAndHoverMouse;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/label[1]/input[2]")
	@CacheLookup
	WebElement checkConcentCheckBox;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[2]/label[1]/input[2]")
	@CacheLookup
	WebElement checkAgreeCheckBox;

	@FindBy(xpath = "//div[@id='signatureparent']")
	@CacheLookup
	WebElement signatureParent;

	@FindBy(name = "continue")
	@CacheLookup
	WebElement clickOnContinueBtn;

	// BUSINESS DETAILS
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement selectSourceReference;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/select[1]")
	@CacheLookup
	WebElement selectTypeOfOrganization;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/select[1]")
	@CacheLookup
	WebElement selectTypeOfBusiness;

	@FindBy(css = "#registered-business-place-pincode")
	@CacheLookup
	WebElement txtBusinessPinCode;

	@FindBy(xpath = "//label[contains(text(),\"Company's Official Contact Details\")]")
	@CacheLookup
	WebElement clickOnCompanyDetails;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]")
	@CacheLookup
	WebElement txtBusinessStateCode;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[3]/div[1]")
	@CacheLookup
	WebElement txtBusinessCityCode;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[4]/div[1]")
	@CacheLookup
	WebElement txtBusinessDistricCode;

	@FindBy(xpath = "//input[@id='std-code']")
	@CacheLookup
	WebElement txtBusinessStdCode;

	@FindBy(xpath = "//input[@id='telephone-number']")
	@CacheLookup
	WebElement txtBusinessTelephoneNumber;

	@FindBy(xpath = "//input[@id='mobile-number']")
	@CacheLookup
	WebElement txtBusinessMobileNumber;

	@FindBy(xpath = "//input[@id='company-email-address']")
	@CacheLookup
	WebElement txtBusinessEmail;

	@FindBy(xpath = "//input[@id='website']")
	@CacheLookup
	WebElement txtBusinessWebsiteAddress;

	// Director Details
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtDirectorPanNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtDirectorDob;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtDirectorFatherName;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtAddressLine;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtDirectorPinCode;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/label[1]")
	@CacheLookup
	WebElement clickOnStateName;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadDirectorPan;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[5]/div[2]/div[2]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyDirectorPanDeleteBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement checkIsActiveBox;

	// DIRECTOR 2
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[8]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtDirectorTwoPan;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[8]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtDirectorTwoDob;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtDirectorTwoFatherName;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[9]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtDirectorTwoAddressLine;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtDirectorTwoPinCode;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[11]/div[1]/div[1]/label[1]")
	@CacheLookup
	WebElement clickOnStatePanTwo;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[11]/div[1]/div[1]/label[1]")
	@CacheLookup
	WebElement clickDirectorPanNoText;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[11]/div[2]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadDirectorTwoPan;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[11]/div[2]/div[2]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyDirectorTwoPanDeleteBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[12]/div[1]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement clickOnIsActiveBox;

	// Upload Document(s)
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadComapnyPanCard;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyComapnyPanCardDeleteBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadMoaDocument;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyMoaDocumentDeletebtn;

	@FindBy(xpath = "//button[@id='Bussinesssubmitbtn']")
	@CacheLookup
	WebElement clickOnBusinessCountinueBtn;

	// GST/TAX DETAILS
	// GST Details (Select only one GSTIN for registration with JSPL)
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadGstDocument;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyGstDeleteBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadGstNumberTwoDoc;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyGstNumberTwoDeleteBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement clickOnCheckBoxGstNumberThree;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadGstNumberThreeDoc;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/a[1]")
	@CacheLookup
	WebElement verifyGstNumberThreeDeleteBtn;

	// ESIC Details
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement checkEsicYesRadioBtn;

	@FindBy(xpath = "//input[@id='esic-pincode']")
	@CacheLookup
	WebElement txtPincodeEsic;

	@FindBy(xpath = "//input[@id='esic-state']")
	@CacheLookup
	WebElement txtStateRegisteredEsic;

	@FindBy(xpath = "//input[@id='esic-district']")
	@CacheLookup
	WebElement txtEsicDistrictEsic;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadEsicRegistrationLatter;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyRegistrationLatterDeleteBtn;

	// Do you have PF number?
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement checkYesRadioPfBtn;

	@FindBy(xpath = "//input[@id='pf-number']")
	@CacheLookup
	WebElement txtEstablishmentCode;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadEpfoCopyRegistration;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[4]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyEpfoCopyDeleteBtn;

	// Do you have labour license number?*
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement checkLabourRadioYesbtn;

	@FindBy(xpath = "//input[@id='labour-license-number']")
	@CacheLookup
	WebElement txtLabourLicNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[3]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadDocumentLabour;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[4]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyDocumentLabourDeleteBtn;

	// Do you have VAT/L.S.T number?
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement checkVatYesRadioBtn;

	@FindBy(xpath = "//input[@id='vat-lst-number']")
	@CacheLookup
	WebElement txtVatNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[3]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadVatDocuments;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[4]/div[1]/a[1]")
	@CacheLookup
	WebElement verifyVatDocDeleteBtn;

	// Do you have Udyog Aadhaar number
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement checkUdyogAdharRadioBtn;

	@FindBy(xpath = "//input[@id='udyog-aadhaar-number']")
	@CacheLookup
	WebElement txtUdyogAdharNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[3]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadUdyogNumberDoc;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[4]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyUdyogAdharNumberDeletebtn;

	// MSME Details
	// Registered under MSME?*
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement checkMsmeRadioBtn;

	@FindBy(xpath = "//*[@id=\"mCSB_1_container\"]/div/div[8]/div/div/div[1]/div[2]/div/select")
	@CacheLookup
	WebElement selectMsmeType;

	@FindBy(xpath = "//input[@id='msme-registration-no']")
	@CacheLookup
	WebElement txtMsmeRegistatrationNumber;

	@FindBy(xpath = "//input[@id='msme-registration-date']")
	@CacheLookup
	WebElement txtMsmeDate;

	@FindBy(xpath = "//input[@id='msme-certificate-date']")
	@CacheLookup
	WebElement txtMsmeReceviedDate;

	// No
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/label[2]/input[1]")
	@CacheLookup
	WebElement checkMsmeNoRadioBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadMsmeDocument;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[3]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyMsmeDocDeleteBtn;

	// Excise Details
	// Are you registered with Excise?*
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement checkYesRadioBtn;

	@FindBy(xpath = "//input[@id='state-ecc-number']")
	@CacheLookup
	WebElement txtExciseControlCode;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtExciseRegistrationNumber;

	@FindBy(xpath = "//input[@id='excise-division-code']")
	@CacheLookup
	WebElement txtExciseDivisionCode;

	@FindBy(xpath = "//input[@id='excise-commissionerate-code']")
	@CacheLookup
	WebElement txtExciseCommissionerateCode;

	@FindBy(xpath = "//input[@id='excise-location-code']")
	@CacheLookup
	WebElement txtExciseLocationCode;

	@FindBy(xpath = "//input[@id='excise-status']")
	@CacheLookup
	WebElement txtExciseStatus;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadExciseDocument;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyExciseDeleteBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]")
	@CacheLookup
	WebElement clickOnGstDetailsCountinueBtn;

	// Address Details --Shipping/Billing Details
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement checkAddressCheckBox;

	// Contact Person Details
	@FindBy(xpath = "//input[@id='contact-person-telephone']")
	@CacheLookup
	WebElement txtContactTelePhone;

	@FindBy(xpath = "//button[@id='Addrsubmitbtn']")
	@CacheLookup
	WebElement clickOnAddressCountinueBtn;

	// PRODUCT & QUALITY DETAILS
	// Certificate Details
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement checkCertificateYesRadioBtn;

	@FindBy(xpath = "//input[@id='certificate-type']")
	@CacheLookup
	WebElement txtTypeCertificate;

	@FindBy(xpath = "//input[@id='validity-of-certificate']")
	@CacheLookup
	WebElement txtValidateOfCertificate;

	@FindBy(xpath = "//input[@id='issuing-authority']")
	@CacheLookup
	WebElement txtIssusingAuthority;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement selectYearOfCertification;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadCopyOfIsoCertificate;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyCopyOfIsoCertificateDeleteBtn;

	// Product Details
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement selectTypeIndustry;

	@FindBy(xpath = "//input[@id='product-category']")
	@CacheLookup
	WebElement txtProductCategory;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtSpecifyProductDetails;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadProductCatalogueDoc;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyProductCatalogueDeletbtn;

	// Additional Information
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/textarea[1]")
	@CacheLookup
	WebElement txtListThirdPartyApprovals;

	@FindBy(xpath = "//textarea[@id='major-customers']")
	@CacheLookup
	WebElement txtListMajorCustomers;

	@FindBy(xpath = "//textarea[@id='installed-machinery-details']")
	@CacheLookup
	WebElement txtDetailsMachineryInstalled;

	@FindBy(xpath = "//input[@id='key-technical-person-detail']")
	@CacheLookup
	WebElement txtKeyTechnicalPersonDetails;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadManufacturerCertificateDoc;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[3]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyanufacturerCertificateDocDeleteBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]")
	@CacheLookup
	WebElement clickOnProductQualityContinueBtn;

	// FINANCIAL & BANK DETAILS
	// Bank Details : Please provide bank account details on which business is
	// running.
	@FindBy(xpath = "//input[@id='account-number']")
	@CacheLookup
	WebElement txtAccountNumber;

	@FindBy(xpath = "//input[@id='ifsc-code']")
	@CacheLookup
	WebElement txtIfscCode;

	@FindBy(xpath = "//small[contains(text(),'Please provide bank account details on which busin')]")
	@CacheLookup
	WebElement clickOnPleaseProvideBank;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement selectSelectAccountType;

	// Upload Document(s)
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadCopyCanceledChequeDoc;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyCopyCanceledChequeDocDeleteBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadBankStatementLastDoc;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyBanStatementDeleteBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadCopyBankDeclarationDoc;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[3]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyCopyBankDeclarationDeleteBtn;

	// Financial Details
	@FindBy(xpath = "//input[@id='avg-turnover']")
	@CacheLookup
	WebElement txtAverageAnnualTurnover;

	// Are you listed on any Stock Exchange?
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement checkStockExchangeRadioBtn;

	@FindBy(xpath = "//input[@id='stock-exchange-name']")
	@CacheLookup
	WebElement txtNameOfStockExchange;

	@FindBy(xpath = "//input[@id='stock-exchange-symbol']")
	@CacheLookup
	WebElement txtStockExchangeSymbol;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadBalanceSheetFY;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyBalanceSheetFYDeleteBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadCopyBalanceSheetFY1819;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyCopyBalanceSheetFYDeleteBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadBalanceSheetFY1718;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[3]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyBalanceSheetFY1718DeleteBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadITRFY1920;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[4]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyITRFY1920DeleteBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadCopyOfITRDeclaration;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[5]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyCopyOfITRDeclarationDeleteBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadCopyDeclarationITRFY1718;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[6]/div[3]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement verifyCopyDeclarationItrDeleteBtn;

	@FindBy(xpath = "//button[@id='continueBtn']")
	@CacheLookup
	WebElement clickOnFinacialCountinuebtn;

	// ADDITIONAL DETAILS
	// Have you ever worked with/for the JSPL or associated companies?*
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[3]")
	@CacheLookup
	WebElement verifyJSPLAssociatedCompanies;

	// Have you ever worked with/for the JSPL or associated companies?*
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement clickOnYesAssociatedCompaniesRadioBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtVendorCode;

	@FindBy(xpath = "//input[@id='name-of-jspl-company']")
	@CacheLookup
	WebElement txtJsplCompanyName;

	@FindBy(xpath = "//input[@id='po-no-date']")
	@CacheLookup
	WebElement txtPoNoDate;

	// Does any relative members of the vendor work with JSPL?
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement clickOnYesRelativeMembersRadioBtn;

	@FindBy(xpath = "//input[@id='emp-code']")
	@CacheLookup
	WebElement txtEmployeeCode;

	@FindBy(xpath = "//input[@id='emp-name']")
	@CacheLookup
	WebElement txtEmployeeName;

	@FindBy(xpath = "//input[@id='location']")
	@CacheLookup
	WebElement txtJsplLocation;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/select[1]")
	@CacheLookup
	WebElement selectCompanyName;

	// Does any director/partner/proprietor of the vendor previously employed by JSP
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement clickOnYesDirectorPerEmpJsplRadioBtn;

	@FindBy(xpath = "//input[@id='pre-emp-code']")
	@CacheLookup
	WebElement txtPreEmpCode;

	@FindBy(xpath = "//input[@id='pre-emp-name']")
	@CacheLookup
	WebElement txtPreEmpName;

	@FindBy(xpath = "//input[@id='pre-emp-location']")
	@CacheLookup
	WebElement txtPreEmpLocation;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[2]/div[1]/select[1]")
	@CacheLookup
	WebElement selectPreCompanyName;

	// Reference Details
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtReferenceCompanyName;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtReferenceName;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtReferenceDesignation;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtReferenceMobileNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtReferenceEmailId;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[3]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtReferenceLastTimeBusiness;

	@FindBy(xpath = "//button[@id='continueBtn']")
	@CacheLookup
	WebElement clickOnAdditionalDeatilsCountinueBtn;

	// Data have been saved successfully.
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]")
	@CacheLookup
	WebElement verifyDataSavedSuccessfullyMessage;

	// Step 2 - Payment Summary
	@FindBy(xpath = "//h4[contains(text(),'Payment Details')]")
	@CacheLookup
	WebElement verifyPaymentDetails;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[3]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPaymentAddressLineOne;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[3]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPaymentAddressLineTwo;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[3]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPaymentAddressLineThree;

	@FindBy(xpath = "//input[@id='pincode']")
	@CacheLookup
	WebElement txtPaymentPinCode;

	@FindBy(xpath = "//button[@id='continueBtn']")
	@CacheLookup
	WebElement clickOnMakePaymentBtn;

	// TOTAL PAYMENT DUE:
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[3]/div[2]/select[1]")
	@CacheLookup
	WebElement selectDuePaymentAddress;

	@FindBy(xpath = "//select[@id='state_id']")
	@CacheLookup
	WebElement selectDuePaymentStateName;

	@FindBy(xpath = "//button[@id='continueBtn']")
	@CacheLookup
	WebElement clickOnMakePaymentButton;
	
	// Step 3 - Vendor Detail Preview
	//Please review the screen before you proceed
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/h4[1]")
	@CacheLookup
	WebElement verifyVendorDetailPreview;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/button[1]")
	@CacheLookup
	WebElement clickOnVendorPreviewSubmitBtn;
	
	// Thank You Message
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Thank You!')]")
	WebElement verifyCaseThankYouMsg;
	
	// Allocator-- (Super Admin)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectSuperAdminAllocator;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Employment UAN')]")
	WebElement verifyEmploymentUan;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtArsNumberAllocator;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnSearchAllocatorBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr/td[10]/a")
	WebElement clickOnApplicableCountNumber;

	// Check List - Search Result - (14 records)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='check_all']")
	WebElement checkAllCheckBoxCandidate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckBULKACTIONTAKEN']")
	WebElement selectAssignToVerifier;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='ddlChecksAssignedTo']")
	WebElement selectTeamMemberName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='check_comments']")
	WebElement txtCheckComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnGo']")
	WebElement clickOnGoAllocatorBtn;

	// Checks are successfully allocated to Shariq Abbas
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]")
	WebElement verifyChecksAreSuccessfullyMsg;
	
	// Click on Dashboard Module
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	@CacheLookup
	WebElement clickOnDashboard;

	// Authorization --Step 3 - Vendor Authorization
	public void candidateAuthorization() throws InterruptedException {
		// JavaScriptManuplator.waitForElementPresent(ldriver,
		// verifyDataSavedSuccessfully, 120);
		JavaScriptManuplator.javaScriptExecutor(verifyDragAndHoverMouse, "arguments[0].scrollIntoView(true);", ldriver);
		// JavaScriptManuplator.waitForElementPresent(ldriver,
		// verifyDataSavedSuccessfully, 360);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(verifyDataSavedSuccessfully));
		checkConcentCheckBox.click();
		Thread.sleep(1000);
		checkAgreeCheckBox.click();
		Thread.sleep(1000);
		Actions actionBuilder = new Actions(ldriver);
		Action drawAction = actionBuilder.moveToElement(ldriver.findElement(By.xpath("//div[@id='signatureparent']")))
				.clickAndHold().moveByOffset(-50, 60).moveByOffset(-60, -70).moveByOffset(150, 60)
				.moveByOffset(-60, -70).doubleClick().build();
		drawAction.perform();
		Thread.sleep(1000);
		clickOnContinueBtn.click();
		Thread.sleep(1000);
	}

	// BUSINESS DETAILS
	public void vendorBusinessInformationDetails(String directorPan, String directorPanDoc, String companyPan,
			String moaDocument) throws InterruptedException, IOException {
		JavaScriptManuplator.waitForElementPresent(ldriver, selectSourceReference, 120);
		JavaScriptManuplator.selectOptionFromDropDown(selectSourceReference, "Self Introduction");
		JavaScriptManuplator.selectOptionFromDropDown(selectTypeOfOrganization, "Private Limited Company");
		JavaScriptManuplator.selectOptionFromDropDown(selectTypeOfBusiness, "Manufacturer");
		JavaScriptManuplator.javaScriptExecutor(txtBusinessPinCode, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(4000);
		txtBusinessPinCode.sendKeys("110091");
		Thread.sleep(2000);
		clickOnCompanyDetails.click();
		Thread.sleep(4000);
		JavaScriptManuplator.javaScriptExecutor(txtBusinessStdCode, "arguments[0].value='911'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(txtBusinessTelephoneNumber, "arguments[0].value='8009744341'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtBusinessMobileNumber, "arguments[0].value='7042718794'", ldriver);
		Thread.sleep(1000);
		//js = (JavascriptExecutor) ldriver;
		//js.executeScript("arguments[0].value='"+email+"'", txtCandidateEmail);
		String email = new String(Files.readAllBytes(Paths.get("RandomMail.txt")));
		String mailinatorMail[] = email.split(" ");
		JavaScriptManuplator.javaScriptExecutor(txtBusinessEmail, "arguments[0].value='"+mailinatorMail[0]+"@mailinator.com'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(txtBusinessWebsiteAddress,
				"arguments[0].value='https://www.authbridge.com'", ldriver);

		// Director Details
		JavaScriptManuplator.javaScriptExecutor(txtDirectorPanNumber, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(4000);
		JavaScriptManuplator.javaScriptExecutor(txtDirectorPanNumber, "arguments[0].value='ATRPK1830E'", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtDirectorDob, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(4000);
		JavaScriptManuplator.javaScriptExecutor(txtDirectorDob, "arguments[0].removeAttribute('readonly')", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtDirectorDob, "arguments[0].value='04-04-1972'", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtDirectorFatherName, "arguments[0].value='Anil Kumar'", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtAddressLine, "arguments[0].value='New Delhi'", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtDirectorPinCode, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(4000);
		txtDirectorPinCode.sendKeys("110012");
		Thread.sleep(3000);
		clickOnStateName.click();
		Thread.sleep(4000);
		uploadDirectorPan.sendKeys(directorPan);
		Thread.sleep(3000);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyDirectorPanDeleteBtn, 120);
		JavaScriptManuplator.javaScriptExecutor(checkIsActiveBox, "arguments[0].click()", ldriver);
		Thread.sleep(2000);

		// DIRECTOR 2
		JavaScriptManuplator.javaScriptExecutor(txtDirectorTwoPan, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(3000);
		JavaScriptManuplator.javaScriptExecutor(txtDirectorTwoPan, "arguments[0].value='GFQPS1747H'", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtDirectorTwoDob, "arguments[0].removeAttribute('readonly')", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtDirectorTwoDob, "arguments[0].value='04-03-1975'", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtDirectorTwoFatherName, "arguments[0].value='Sunil Kumar'", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtDirectorTwoAddressLine, "arguments[0].value='Mayur Vihar Delhi'",
				ldriver);
		Thread.sleep(3000);
		JavaScriptManuplator.javaScriptExecutor(txtDirectorTwoPinCode, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(4000);
		txtDirectorTwoPinCode.sendKeys("110013");
		Thread.sleep(3000);
		clickDirectorPanNoText.click();
		Thread.sleep(4000);
		uploadDirectorTwoPan.sendKeys(directorPanDoc);
		Thread.sleep(3000);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyDirectorTwoPanDeleteBtn, 120);
		JavaScriptManuplator.javaScriptExecutor(clickOnIsActiveBox, "arguments[0].click()", ldriver);

		// Upload Document(s)
		JavaScriptManuplator.javaScriptExecutor(uploadMoaDocument, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(4000);
		uploadComapnyPanCard.sendKeys(companyPan);
		Thread.sleep(3000);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyComapnyPanCardDeleteBtn, 120);
		uploadMoaDocument.sendKeys(moaDocument);
		Thread.sleep(3000);
		// JavaScriptManuplator.waitForElementPresent(ldriver,
		// verifyMoaDocumentDeletebtn, 120);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(verifyMoaDocumentDeletebtn));
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnBusinessCountinueBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// GST/TAX DETAILS
	// GST Details (Select only one GSTIN for registration with JSPL)
	public void vendorGstTaxInformationDeatils(String gstDocument, String gstNumberDoc, String gstNumberDocs,
			String esicRegistrationDoc, String epfoCopyReg, String labourDoc, String vatDocument, String udyogNumberDoc,
			String msmeDocument, String exciseDoc) throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, uploadGstDocument, 120);
		Thread.sleep(3000);
		uploadGstDocument.sendKeys(gstDocument);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyGstDeleteBtn, 120);
		Thread.sleep(2000);
		uploadGstNumberTwoDoc.sendKeys(gstNumberDoc);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyGstNumberTwoDeleteBtn, 120);
		JavaScriptManuplator.javaScriptExecutor(clickOnCheckBoxGstNumberThree, "arguments[0].click()", ldriver);
		Thread.sleep(2000);
		uploadGstNumberThreeDoc.sendKeys(gstNumberDocs);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyGstNumberThreeDeleteBtn, 120);

		// ESIC Details
		JavaScriptManuplator.javaScriptExecutor(checkEsicYesRadioBtn, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(4000);
		JavaScriptManuplator.javaScriptExecutor(checkEsicYesRadioBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPincodeEsic, "arguments[0].value='787878'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtStateRegisteredEsic, "arguments[0].value='56456'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtEsicDistrictEsic, "arguments[0].value='5656'", ldriver);
		uploadEsicRegistrationLatter.sendKeys(esicRegistrationDoc);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyRegistrationLatterDeleteBtn, 120);

		// Do you have PF number?
		JavaScriptManuplator.javaScriptExecutor(checkYesRadioPfBtn, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(4000);
		JavaScriptManuplator.javaScriptExecutor(checkYesRadioPfBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtEstablishmentCode, "arguments[0].value='5656'", ldriver);
		Thread.sleep(2000);
		uploadEpfoCopyRegistration.sendKeys(epfoCopyReg);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyEpfoCopyDeleteBtn, 120);

		// Do you have labour license number?*
		JavaScriptManuplator.javaScriptExecutor(checkLabourRadioYesbtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtLabourLicNumber, "arguments[0].value='76767'", ldriver);
		Thread.sleep(2000);
		uploadDocumentLabour.sendKeys(labourDoc);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyDocumentLabourDeleteBtn, 120);

		// Do you have VAT/L.S.T number?
		JavaScriptManuplator.javaScriptExecutor(checkVatYesRadioBtn, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(4000);
		JavaScriptManuplator.javaScriptExecutor(checkVatYesRadioBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtVatNumber, "arguments[0].value='6767'", ldriver);
		Thread.sleep(2000);
		uploadVatDocuments.sendKeys(vatDocument);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyVatDocDeleteBtn, 120);

		// Do you have Udyog Aadhaar number
		JavaScriptManuplator.javaScriptExecutor(checkUdyogAdharRadioBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtUdyogAdharNumber, "arguments[0].value='567567567'", ldriver);
		Thread.sleep(2000);
		uploadUdyogNumberDoc.sendKeys(udyogNumberDoc);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyUdyogAdharNumberDeletebtn, 120);

		// MSME Details
		// Registered under MSME?*
		JavaScriptManuplator.javaScriptExecutor(checkMsmeRadioBtn, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(4000);
		// JavaScriptManuplator.javaScriptExecutor(checkMsmeRadioBtn,
		// "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(checkMsmeNoRadioBtn, "arguments[0].click()", ldriver);
		Thread.sleep(2000);
		/*
		 * JavaScriptManuplator.selectOptionFromDropDown(selectMsmeType,
		 * "Micro Enterprise");
		 * //JavaScriptManuplator.selectOptionFromDropDown(selectMsmeType,
		 * "Micro Enterprise"); Thread.sleep(2000);
		 * JavaScriptManuplator.javaScriptExecutor(txtMsmeRegistatrationNumber,
		 * "arguments[0].value='456456'", ldriver); Thread.sleep(2000);
		 * JavaScriptManuplator.javaScriptExecutor(txtMsmeDate,
		 * "arguments[0].removeAttribute('readonly')", ldriver);
		 * //txtMsmeDate.sendKeys(Keys.TAB); //txtMsmeDate.sendKeys(Keys.ENTER);
		 * Thread.sleep(2000); JavaScriptManuplator.javaScriptExecutor(txtMsmeDate,
		 * "arguments[0].value='02-09-2021'", ldriver);
		 * //txtMsmeReceviedDate.sendKeys(Keys.TAB);
		 * //txtMsmeReceviedDate.sendKeys(Keys.ENTER); Thread.sleep(2000);
		 * JavaScriptManuplator.javaScriptExecutor(txtMsmeReceviedDate,
		 * "arguments[0].removeAttribute('readonly')", ldriver); Thread.sleep(2000);
		 * JavaScriptManuplator.javaScriptExecutor(txtMsmeReceviedDate,
		 * "arguments[0].value='08-09-2021'", ldriver); Thread.sleep(2000);
		 * uploadMsmeDocument.sendKeys(msmeDocument); Thread.sleep(3000);
		 * JavaScriptManuplator.waitForElementPresent(ldriver, verifyMsmeDocDeleteBtn,
		 * 120);
		 */

		// Excise Details
		// Are you registered with Excise?*
		JavaScriptManuplator.javaScriptExecutor(checkYesRadioBtn, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(4000);
		JavaScriptManuplator.javaScriptExecutor(checkYesRadioBtn, "arguments[0].click()", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtExciseControlCode, "arguments[0].value='567676666666666'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtExciseRegistrationNumber, "arguments[0].value='456456456'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtExciseDivisionCode, "arguments[0].value='345345'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtExciseCommissionerateCode, "arguments[0].value='345345'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtExciseLocationCode, "arguments[0].value='0454545'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtExciseStatus, "arguments[0].value='Yes'", ldriver);
		Thread.sleep(2000);
		uploadExciseDocument.sendKeys(exciseDoc);
		Thread.sleep(2000);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyExciseDeleteBtn, 120);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnGstDetailsCountinueBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Address Details --Shipping/Billing Details
	public void vendorAddressInformationDetails() throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, checkAddressCheckBox, 120);
		JavaScriptManuplator.javaScriptExecutor(checkAddressCheckBox, "arguments[0].click()", ldriver);

		// Contact Person Details
		JavaScriptManuplator.javaScriptExecutor(txtContactTelePhone, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(4000);
		JavaScriptManuplator.javaScriptExecutor(txtContactTelePhone, "arguments[0].value='8989898989'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnAddressCountinueBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// PRODUCT & QUALITY DETAILS
	// Certificate Details
	public void vendorProductQualityInformationDetails(String copyCertificate, String productCatalogue,
			String manufactureDoc) throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, checkCertificateYesRadioBtn, 120);
		JavaScriptManuplator.javaScriptExecutor(checkCertificateYesRadioBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtTypeCertificate, "arguments[0].value='TestType'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtValidateOfCertificate, "arguments[0].value='15-09-2021'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtIssusingAuthority, "arguments[0].value='Issusing'", ldriver);
		JavaScriptManuplator.selectOptionFromDropDown(selectYearOfCertification, "2020");
		Thread.sleep(2000);
		uploadCopyOfIsoCertificate.sendKeys(copyCertificate);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyCopyOfIsoCertificateDeleteBtn, 120);

		// Product Details
		JavaScriptManuplator.javaScriptExecutor(selectTypeIndustry, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(4000);
		JavaScriptManuplator.selectOptionFromDropDown(selectTypeIndustry, "ENGINEERING AND CAPITAL GOODS");
		JavaScriptManuplator.javaScriptExecutor(txtProductCategory, "arguments[0].value='Product'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtSpecifyProductDetails, "arguments[0].value='This Product is Good'",
				ldriver);
		Thread.sleep(2000);
		uploadProductCatalogueDoc.sendKeys(productCatalogue);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyProductCatalogueDeletbtn, 120);

		// Additional Information
		JavaScriptManuplator.javaScriptExecutor(txtListThirdPartyApprovals, "arguments[0].scrollIntoView(true);",
				ldriver);
		Thread.sleep(4000);
		JavaScriptManuplator.javaScriptExecutor(txtListThirdPartyApprovals, "arguments[0].value='Third party'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtListMajorCustomers, "arguments[0].value='Major Customer'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtDetailsMachineryInstalled,
				"arguments[0].value='Machinery Installed'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtKeyTechnicalPersonDetails, "arguments[0].value='Key Technical'",
				ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnProductQualityContinueBtn, "arguments[0].scrollIntoView(true);",
				ldriver);
		Thread.sleep(4000);
		uploadManufacturerCertificateDoc.sendKeys(manufactureDoc);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyanufacturerCertificateDocDeleteBtn, 120);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnProductQualityContinueBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// FINANCIAL & BANK DETAILS
	// Bank Details : Please provide bank account details on which business is
	// running.
	public void vendorFinancialAndBankInfoDetails(String copyCancelledDoc, String bankStatement,
			String bankDeclarationdoc, String balanceSheetDoc, String copyBalanceDoc, String balanceSheetFyDoc,
			String itrDoc, String copyItrDeclarationDoc, String copyDeclarationDoc) throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, txtAccountNumber, 120);
		JavaScriptManuplator.javaScriptExecutor(txtAccountNumber, "arguments[0].value='157042718794'", ldriver);
		// JavaScriptManuplator.javaScriptExecutor(txtIfscCode,
		// "arguments[0].value='INDB0000546'", ldriver);
		Thread.sleep(2000);
		txtIfscCode.sendKeys("INDB0000546");
		Thread.sleep(3000);
		clickOnPleaseProvideBank.click();
		Thread.sleep(6000);
		JavaScriptManuplator.selectOptionFromDropDown(selectSelectAccountType, "Savings");

		// Upload Document(s)
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(uploadCopyCanceledChequeDoc, "arguments[0].scrollIntoView(true);",
				ldriver);
		Thread.sleep(4000);
		uploadCopyCanceledChequeDoc.sendKeys(copyCancelledDoc);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyCopyCanceledChequeDocDeleteBtn, 120);
		Thread.sleep(2000);
		uploadBankStatementLastDoc.sendKeys(bankStatement);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyBanStatementDeleteBtn, 120);
		Thread.sleep(2000);
		uploadCopyBankDeclarationDoc.sendKeys(bankDeclarationdoc);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyCopyBankDeclarationDeleteBtn, 120);

		// Financial Details
		JavaScriptManuplator.javaScriptExecutor(txtAverageAnnualTurnover, "arguments[0].scrollIntoView(true);",
				ldriver);
		Thread.sleep(4000);
		JavaScriptManuplator.javaScriptExecutor(txtAverageAnnualTurnover, "arguments[0].value='400000'", ldriver);

		// Are you listed on any Stock Exchange?
		JavaScriptManuplator.javaScriptExecutor(checkStockExchangeRadioBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtNameOfStockExchange, "arguments[0].value='Stock Exchange'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtStockExchangeSymbol, "arguments[0].value='Stock Ticker Symbol'",
				ldriver);
		Thread.sleep(2000);
		uploadBalanceSheetFY.sendKeys(balanceSheetDoc);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyBalanceSheetFYDeleteBtn, 120);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(uploadCopyBalanceSheetFY1819, "arguments[0].scrollIntoView(true);",
				ldriver);
		Thread.sleep(4000);
		uploadCopyBalanceSheetFY1819.sendKeys(copyBalanceDoc);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyCopyBalanceSheetFYDeleteBtn, 120);
		Thread.sleep(2000);
		uploadBalanceSheetFY1718.sendKeys(balanceSheetFyDoc);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyBalanceSheetFY1718DeleteBtn, 120);
		Thread.sleep(2000);
		uploadITRFY1920.sendKeys(itrDoc);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyITRFY1920DeleteBtn, 120);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(uploadCopyOfITRDeclaration, "arguments[0].scrollIntoView(true);",
				ldriver);
		Thread.sleep(4000);
		uploadCopyOfITRDeclaration.sendKeys(copyItrDeclarationDoc);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyCopyOfITRDeclarationDeleteBtn, 120);
		Thread.sleep(2000);
		uploadCopyDeclarationITRFY1718.sendKeys(copyDeclarationDoc);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyCopyDeclarationItrDeleteBtn, 120);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnFinacialCountinuebtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// ADDITIONAL DETAILS
	// Have you ever worked with/for the JSPL or associated companies?*
	public void vendorAdditionalInfoDeatils() throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyJSPLAssociatedCompanies, 120);

		// Have you ever worked with/for the JSPL or associated companies?*
		JavaScriptManuplator.javaScriptExecutor(clickOnYesAssociatedCompaniesRadioBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtVendorCode, "arguments[0].value='6098'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtJsplCompanyName, "arguments[0].value='JSPL LIMITED'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPoNoDate, "arguments[0].value='03-09-2021'", ldriver);

		// Does any relative members of the vendor work with JSPL?
		JavaScriptManuplator.javaScriptExecutor(clickOnYesRelativeMembersRadioBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtEmployeeCode, "arguments[0].value='6098'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtEmployeeName, "arguments[0].value='Raju Yadav'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtJsplLocation, "arguments[0].value='Gurugram'", ldriver);
		JavaScriptManuplator.selectOptionFromDropDown(selectCompanyName, "Jindal Steel and Power (Mauritius) Limited");

		// Does any director/partner/proprietor of the vendor previously employed by JSP
		JavaScriptManuplator.javaScriptExecutor(clickOnYesDirectorPerEmpJsplRadioBtn,
				"arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(4000);
		JavaScriptManuplator.javaScriptExecutor(clickOnYesDirectorPerEmpJsplRadioBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreEmpCode, "arguments[0].value='3536'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreEmpName, "arguments[0].value='Raju Yadav'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreEmpLocation, "arguments[0].value='Gurugram'", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(selectPreCompanyName, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(4000);
		JavaScriptManuplator.selectOptionFromDropDown(selectPreCompanyName, "Jindal Power Limited");
		Thread.sleep(2000);

		// Reference Details
		JavaScriptManuplator.javaScriptExecutor(txtReferenceCompanyName, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(4000);
		JavaScriptManuplator.javaScriptExecutor(txtReferenceCompanyName,
				"arguments[0].value='AuthBridge Reasearch Pvt Ltd'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(txtReferenceName, "arguments[0].value='Raju Yadav'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtReferenceDesignation, "arguments[0].value='Senior QA'", ldriver);
		Thread.sleep(1000);
		txtReferenceMobileNumber.sendKeys(Keys.TAB);
		txtReferenceMobileNumber.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtReferenceMobileNumber, "arguments[0].value='7042718794'", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtReferenceEmailId, "arguments[0].value='rajuyadav@gamil.com'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtReferenceLastTimeBusiness,
				"arguments[0].value='rajuyadav@gamil.com'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnAdditionalDeatilsCountinueBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	public String verifySavedDataSuccessfullyMsg() {
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyDataSavedSuccessfullyMessage, 120);
		return verifyDataSavedSuccessfullyMessage.getText();
	}

	// Step 2 - Payment Summary
	public void vendorMakePaymentDetails() throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyPaymentDetails, 120);
		JavaScriptManuplator.javaScriptExecutor(txtPaymentAddressLineOne, "arguments[0].scrollIntoView(true);",
				ldriver);
		Thread.sleep(4000);
		JavaScriptManuplator.javaScriptExecutor(txtPaymentAddressLineOne, "arguments[0].value='TrilokPuri'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPaymentAddressLineTwo, "arguments[0].value='Gali Number Two'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPaymentAddressLineThree, "arguments[0].value='Mayur Vihar'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPaymentPinCode, "arguments[0].value='110091'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnMakePaymentBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// TOTAL PAYMENT DUE:
	public void vendorDuePayment() throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, selectDuePaymentAddress, 120);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(selectDuePaymentAddress, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(3000);
		JavaScriptManuplator.selectOptionFromDropDown(selectDuePaymentAddress,
				"646, Part 1, Sector 15, Gurgaon, Haryana, 122002");
		JavaScriptManuplator.javaScriptExecutor(selectDuePaymentStateName, "arguments[0].scrollIntoView(true);",
				ldriver);
		Thread.sleep(3000);
		JavaScriptManuplator.selectOptionFromDropDown(selectDuePaymentStateName, "Haryana");
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnMakePaymentButton, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}
	
	// Step 3 - Vendor Detail Preview
	//Please review the screen before you proceed
	public void vendorReviewScreenAndProceed() throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyVendorDetailPreview, 120);
		JavaScriptManuplator.javaScriptExecutor(clickOnVendorPreviewSubmitBtn, "arguments[0].scrollIntoView(true);",
				ldriver);
		Thread.sleep(3000);
		JavaScriptManuplator.javaScriptExecutor(clickOnVendorPreviewSubmitBtn, "arguments[0].click()", ldriver);
		Thread.sleep(3000);
		ldriver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
	
	public String verifyVendorRegistrationThankYouMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseThankYouMsg));
		return verifyCaseThankYouMsg.getText();
	}
	
	// Allocator-- (Super Admin)-- Bridge Portal
	public void superAdminAllocator(String arsNumberAllocator, String checkComments) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectSuperAdminAllocator));
		//Select superAdminAllocator = new Select(selectSuperAdminAllocator);
		//superAdminAllocator.selectByIndex(3);
		JavaScriptManuplator.selectOptionFromDropDown(selectSuperAdminAllocator, "Allocator");
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 600);
		wait.until(ExpectedConditions.visibilityOf(verifyEmploymentUan));
		txtArsNumberAllocator.sendKeys(arsNumberAllocator);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnSearchAllocatorBtn);
		// clickOnSearchAllocatorBtn.click();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnApplicableCountNumber));
		clickOnApplicableCountNumber.click();

		// Check List - Search Result - (14 records)
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(checkAllCheckBoxCandidate));
		checkAllCheckBoxCandidate.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectAssignToVerifier);
		Select assignToVerifierName = new Select(selectAssignToVerifier);
		assignToVerifierName.selectByIndex(1);

		//Select teamMemberName = new Select(selectTeamMemberName);
		//teamMemberName.selectByIndex(6);
		JavaScriptManuplator.selectOptionFromDropDown(selectTeamMemberName, "Prateek Shah");
		txtCheckComments.sendKeys(checkComments);
		Thread.sleep(1000);
		clickOnGoAllocatorBtn.click();
		Thread.sleep(1000);
	}

	public String verifyChecksSuccessfullyMsg() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyChecksAreSuccessfullyMsg));
		return verifyChecksAreSuccessfullyMsg.getText();
	}
		
}
