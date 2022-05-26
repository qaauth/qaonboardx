package com.onboardx.pageobject;

import java.awt.Robot;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.onboardx.utilities.JavaScriptManuplator;

public class PendingSubmissionSummary {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Robot rbt;

	public PendingSubmissionSummary(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// OnBoardX : Case Initiation
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[1]/a[1]/div[1]/div[1]")
	@CacheLookup
	WebElement clickOnMenuBar;

	@FindBy(xpath = "//span[contains(text(),'Initiate New Case')]")
	@CacheLookup
	WebElement clickOnInitiateNewCase;

	@FindBy(xpath = "//span[contains(text(),'Initiate Case(s) Individually')]")
	@CacheLookup
	WebElement clickOnInitiateCaseIndividually;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[2]")
	@CacheLookup
	WebElement clickOnSelectPkg;

	@FindBy(xpath = "//button[@id='pacakgeSubmitForm']")
	@CacheLookup
	WebElement clickOnPackSubmitBtn;

	// Add Vendor Information
	@FindBy(xpath = "//input[@id='first-name']")
	@CacheLookup
	WebElement txtCompanyName;

	@FindBy(xpath = "//input[@id='spoc-name']")
	@CacheLookup
	WebElement txtSpocName;

	@FindBy(xpath = "//input[@id='email-address']")
	@CacheLookup
	WebElement txtEamilId;

	@FindBy(xpath = "//input[@id='mobile-no']")
	@CacheLookup
	WebElement txtMobileNumber;

	@FindBy(xpath = "//input[@id='spoc-department']")
	@CacheLookup
	WebElement txtSpocDepartment;

	@FindBy(xpath = "//input[@id='spoc-designation']")
	@CacheLookup
	WebElement txtSpocDesignation;

	// Additional Field(s)
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement selectLocationName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtVendorCode;

	@FindBy(css = "#caseflexfielddata-2")
	@CacheLookup
	WebElement selectVendorNeeds;

	@FindBy(css = "#caseflexfielddata-3")
	@CacheLookup
	WebElement selectContractualVendor;

	@FindBy(xpath = "//button[@id='addCandidate']")
	@CacheLookup
	WebElement clickOnAddCandidateBtn;

	// Duplicate/Matching Record(s) Found!
	@FindBy(xpath = "//label[contains(text(),'Duplicate/Matching Record(s) Found!')]")
	@CacheLookup
	WebElement verifyDuplicateRecodText;

	@FindBy(xpath = "//a[contains(text(),'Ignore Duplicate(s)')]")
	@CacheLookup
	WebElement clickOnIngnoreDuplicateBtn;

	// Vendor information saved successfully
	@FindBy(xpath = "//div[contains(text(),'Vendor information saved successfully')]")
	@CacheLookup
	WebElement verifyVendorInformationSavedSuccess;

	@FindBy(xpath = "//a[@id='continueBtn']")
	@CacheLookup
	WebElement clickOnVendorCountinueBtn;

	@FindBy(xpath = "//a[@id='initiateBtn']")
	@CacheLookup
	WebElement clickOnInitiateButton;

	// Verify Congratulations
	@FindBy(xpath = "//label[contains(text(),'Congratulations!')]")
	@CacheLookup
	WebElement verifyCongratulationsMessage;

	// Case(s) Pending Submission Bucket Summary
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[1]/a[1]/div[1]/div[1]")
	@CacheLookup
	WebElement clickOnMenuBarExpand;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/span[1]")
	@CacheLookup
	WebElement clickOnCaseSummary;

	@FindBy(xpath = "//a[contains(text(),'Pending Submission')]")
	@CacheLookup
	WebElement clickOnPendingSubmissionBucket;

	// Pending Submission
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]/div[2]/div[2]/label[1]")
	@CacheLookup
	WebElement verifyCaseEmailId;

	// Case(s) SUBMITTED FOR VERIFICATION Bucket Summary
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/ul[1]/li[3]/div[1]/a[1]")
	@CacheLookup
	WebElement clickOnSubmittedForSubmissionBucket;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]/div[1]/div[2]/label[1]")
	@CacheLookup
	WebElement verifySubmittedForVerMail;

	//
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]/div[2]/a[1]/i[1]")
	@CacheLookup
	WebElement clickOnEyeIconCase;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	@CacheLookup
	WebElement verifyVendorEmailWipBucket;

	// Get ARS Number of the Case from Wip Bucket
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[2]/p[1]/span[1]")
	@CacheLookup
	WebElement getArsNumberFromWipBucket;

	// OnBoardX : Case Initiation
	public void initiationPendingSubmission() throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, clickOnMenuBar, 120);
		clickOnMenuBar.click();
		JavaScriptManuplator.waitForElementPresent(ldriver, clickOnInitiateNewCase, 120);
		clickOnInitiateNewCase.click();
		JavaScriptManuplator.waitForElementPresent(ldriver, clickOnInitiateCaseIndividually, 120);
		clickOnInitiateCaseIndividually.click();
		JavaScriptManuplator.waitForElementPresent(ldriver, clickOnSelectPkg, 120);
		clickOnSelectPkg.click();
		Thread.sleep(2000);
		clickOnPackSubmitBtn.click();
	}

	// Add Vendor Information
	public void addVendorSpocName(String fullName) {
		JavaScriptManuplator.waitForElementPresent(ldriver, txtSpocName, 120);
		txtSpocName.sendKeys(fullName);
	}

	public void addVendorEmailId(String emailId) throws InterruptedException {
		Thread.sleep(1000);
		txtEamilId.sendKeys(emailId);
	}

	public void AddVendorInformation(String companyName) throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, txtCompanyName, 120);
		Thread.sleep(10000);
		/*WebElement vendorCompanyName = ldriver.findElement(By.xpath("//input[@id='first-name']"));
		vendorCompanyName.sendKeys("AUTHB");
		Thread.sleep(3000);
		vendorCompanyName.sendKeys("RI");
		Thread.sleep(2000);
		vendorCompanyName.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		vendorCompanyName.sendKeys(Keys.SPACE);
		String text;
		do {
			vendorCompanyName.sendKeys(Keys.ARROW_DOWN);
			text = vendorCompanyName.getAttribute("value");
			if (text.equals("AUTHBRIDGE RESEARCH SERVICES PRIVATE LIMITED")) {
				vendorCompanyName.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(2000);
		} while (!text.isEmpty());*/
		Thread.sleep(5000);
		txtMobileNumber.sendKeys(Keys.TAB);
		txtMobileNumber.sendKeys(Keys.ENTER);
		JavaScriptManuplator.javaScriptExecutor(txtMobileNumber, "arguments[0].value='7042718794'", ldriver);
		txtSpocDepartment.sendKeys(Keys.TAB);
		txtSpocDepartment.sendKeys(Keys.ENTER);
		JavaScriptManuplator.javaScriptExecutor(txtSpocDepartment, "arguments[0].value='Automation Engineering Dept'",
				ldriver);
		txtSpocDesignation.sendKeys(Keys.TAB);
		txtSpocDesignation.sendKeys(Keys.ENTER);
		JavaScriptManuplator.javaScriptExecutor(txtSpocDesignation, "arguments[0].value='Senior Quality'", ldriver);
		// Additional Field(s)
		JavaScriptManuplator.javaScriptExecutor(selectContractualVendor, "arguments[0].scrollIntoView(true);", ldriver);
		JavaScriptManuplator.selectOptionFromDropDown(selectLocationName, "New Delhi");
		txtVendorCode.sendKeys(Keys.TAB);
		txtVendorCode.sendKeys(Keys.ENTER);
		JavaScriptManuplator.javaScriptExecutor(txtVendorCode, "arguments[0].value='9098'", ldriver);
		JavaScriptManuplator.selectOptionFromDropDown(selectVendorNeeds, "No");
		JavaScriptManuplator.selectOptionFromDropDown(selectContractualVendor, "No");
		Thread.sleep(1000);
	}

	public void addToQueueBtn() throws InterruptedException {
		// ADD TO QUEUE
		List<WebElement> tag = ldriver.findElements(By.tagName("button"));
		for (int i = 0; i < tag.size(); i++) {
			// System.out.println(tag.get(i).getAttribute("id"));
			if (tag.get(i).getAttribute("id").equals("addCandidate")) {
				// tag.get(i).click();
				JavascriptExecutor executor = (JavascriptExecutor) ldriver;
				executor.executeScript("arguments[0].click();", tag.get(i));
				break;
			}
		}

		// Duplicate/Matching Record(s) Found!
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyDuplicateRecodText, 120);
		JavaScriptManuplator.javaScriptExecutor(clickOnIngnoreDuplicateBtn, "arguments[0].scrollIntoView(true);",
				ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnIngnoreDuplicateBtn, "arguments[0].click()", ldriver);
		// Vendor information saved successfully
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyVendorInformationSavedSuccess, 120);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnVendorCountinueBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.waitForElementPresent(ldriver, clickOnInitiateButton, 120);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnInitiateButton, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Verify Congratulations
	public String verifyCongratulationsMsg() {
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyCongratulationsMessage, 120);
		return verifyCongratulationsMessage.getText();
	}

	// Case(s) Pending Submission Bucket Summary
	public void casePendingSubmissionBucket() throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, clickOnMenuBarExpand, 120);
		clickOnMenuBarExpand.click();
		JavaScriptManuplator.waitForElementPresent(ldriver, clickOnCaseSummary, 120);
		clickOnCaseSummary.click();
		JavaScriptManuplator.waitForElementPresent(ldriver, clickOnPendingSubmissionBucket, 120);
		clickOnPendingSubmissionBucket.click();
		Thread.sleep(1000);
	}

	// Pending Submission Case
	public String pendingSubmissionBucket() {
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyCaseEmailId, 120);
		return verifyCaseEmailId.getText();
	}

	// Case(s) Submitted For Verification Bucket Summary
	public void verifySubmittedForVerificationBucket() throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, clickOnMenuBarExpand, 120);
		clickOnMenuBarExpand.click();
		JavaScriptManuplator.waitForElementPresent(ldriver, clickOnCaseSummary, 120);
		clickOnCaseSummary.click();
		JavaScriptManuplator.waitForElementPresent(ldriver, clickOnSubmittedForSubmissionBucket, 120);
		clickOnSubmittedForSubmissionBucket.click();
		Thread.sleep(1000);
	}

	// Submitted For Verification Case
	public String verifySubmittedForVerificationCase() {
		JavaScriptManuplator.waitForElementPresent(ldriver, verifySubmittedForVerMail, 120);
		return verifySubmittedForVerMail.getText();
	}

	// WIP CASE-- // Get ARS Number of the Case from Wip Bucket
	public void verifyEyeIconOfCase() throws InterruptedException {
		Thread.sleep(3000);
		clickOnEyeIconCase.click();
		Thread.sleep(1000);
	}

	// Verify Vendor Information Email
	public String verifyVendorInformationEmail() {
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyVendorEmailWipBucket, 120);
		return verifyVendorEmailWipBucket.getText();
	}

	public void getArsNumberFromWipBucket() throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, getArsNumberFromWipBucket, 120);
		getArsNumberFromWipBucket.getText();
		Thread.sleep(1000);
		try {
			File output = new File("CaseArsNumber.txt");
			FileWriter writer = new FileWriter(output);
			writer.write(getArsNumberFromWipBucket.getText());
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
