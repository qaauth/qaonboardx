package com.onboardx.pageobject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.onboardx.utilities.JavaScriptManuplator;

public class CaseCompletion {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public CaseCompletion(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// CAT-- (Super Admin) Bridge
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectUserCurrentRoleCat;

	// Click on Dashboard Module
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	@CacheLookup
	WebElement clickOnDashboard;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Notification Alerts - Cases Status')]")
	WebElement verifyNotificationAlertsCasesStatus;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtCompleteSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/button[1]")
	WebElement clickOnCompleteSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnArsNumber;

	// Bank Account Verification --Checks Summary -- Case Summary Details
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Bank Account Verification')]")
	WebElement clickOnBankAccountVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectBankCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectBankAccountCategory;// As per client instruction

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyBankAccountClosedByClientSuccessfullyMsg;

	// Company Verification --Checks Summary -- Case Summary Details
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtCompanySearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnCompanySearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnCompanyArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Company Verification')]")
	WebElement clickOnCompanyVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectCompanyCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectCompanyCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtCompanySpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnCompanyClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyCompanySuccessfullyMsg;

	// Credit Rating Check Verification --Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtCreditSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnCreditSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnCreditArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Credit Rating Check')]")
	WebElement clickOnCreditVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectCreditCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectCreditCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtCreditSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnCreditClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyCreditSuccessfullyMsg;

	// Details Validation Check --Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtDetailsCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnDetailsCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnDetailsCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Details Validation Check')]")
	WebElement clickOnDetailsCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectDetailsCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectDetailsCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtDetailsCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnDetailsCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyDetailsCheckSuccessfullyMsg;

	// EPFO Registration Check --Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtEPFOCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnEPFOCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnEPFOCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Details Validation Check')]")
	WebElement clickOnEPFOCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectEPFOCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectEPFOCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtEPFOCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnEPFOCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyEPFOCheckSuccessfullyMsg;

	// ESIC Registration Check --Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtESICCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnESICCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnESICCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'ESIC Registration Check')]")
	WebElement clickOnESICCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectESICCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectESICCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtESICCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnESICCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyESICCheckSuccessfullyMsg;

	// Global Regulatory Compliance and Debarment Database Verification (1) --Checks
	// Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtGlobalOneCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnGlobalOneCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnGlobalOneCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[7]/td[1]/a[1]")
	WebElement clickOnGlobalOneCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectGlobalOneCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectGlobalOneCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtGlobalOneCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnGlobalOneCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyGlobalOneCheckSuccessfullyMsg;

	// Global Regulatory Compliance and Debarment Database Verification (2) --Checks
	// Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtGlobalTwoCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnGlobalTwoCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnGlobalTwoCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[8]/td[1]/a[1]")
	WebElement clickOnGlobalTwoCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectGlobalTwoCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectGlobalTwoCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtGlobalTwoCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnGlobalTwoCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyGlobalTwoCheckSuccessfullyMsg;

	// Global Regulatory Compliance and Debarment Database Verification (3) --Checks
	// Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtGlobalThreeCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnGlobalThreeCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnGlobalThreeCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[9]/td[1]/a[1]")
	WebElement clickOnGlobalThreeCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectGlobalThreeCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectGlobalThreeCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtGlobalThreeCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnGlobalThreeCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyGlobalThreeCheckSuccessfullyMsg;

	// GSTIN (1) --Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtGSTINOneCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnGSTINOneCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnGSTINOneCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'GSTIN (1)')]")
	WebElement clickOnGSTINOneCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectGSTINOneCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectGSTINOneCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtGSTINOneCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnGSTINOneCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyGSTINOneCheckSuccessfullyMsg;

	// GSTIN (2) --Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtGSTINTwoCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnGSTINTwoCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnGSTINTwoCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'GSTIN (2)')]")
	WebElement clickOnGSTINTwoCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectGSTINTwoCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectGSTINTwoCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtGSTINTwoCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnGSTINTwoCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyGSTINTwoCheckSuccessfullyMsg;

	// GSTIN (3) --Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtGSTINThreeCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnGSTINThreeCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnGSTINThreeCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'GSTIN (3)')]")
	WebElement clickOnGSTINThreeCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectGSTINThreeCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectGSTINThreeCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtGSTINThreeCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnGSTINThreeCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyGSTINThreeCheckSuccessfullyMsg;

	// India Advanced Web and Media Searches (1) --Check Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtIndiaAdvancedCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnIndiaAdvancedCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnIndiaAdvancedCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Advanced Web and Media Searches (1)')]")
	WebElement clickOnIndiaAdvancedCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectIndiaAdvancedCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectIndiaAdvancedCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtIndiaAdvancedCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnIndiaAdvancedCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyIndiaAdvancedCheckSuccessfullyMsg;

	// India Advanced Web and Media Searches (2) --Check Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtIndiaAdvancedTwoCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnIndiaAdvancedTwoCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnIndiaAdvancedTwoCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Advanced Web and Media Searches (2)')]")
	WebElement clickOnIndiaAdvancedTwoCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectIndiaAdvancedTwoCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectIndiaAdvancedTwoCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtIndiaAdvancedTwoCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnIndiaAdvancedTwoCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyIndiaAdvancedTwoCheckSuccessfullyMsg;

	// India Advanced Web and Media Searches (3) --Check Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtIndiaAdvancedThreeCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnIndiaAdvancedThreeCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnIndiaAdvancedThreeCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Advanced Web and Media Searches (3)')]")
	WebElement clickOnIndiaAdvancedThreeCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectIndiaAdvancedThreeCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectIndiaAdvancedThreeCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtIndiaAdvancedThreeCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnIndiaAdvancedThreeCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyIndiaAdvancedThreeCheckSuccessfullyMsg;

	// India Court Record Database Check (1)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtIndiaCourtOneCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnIndiaCourtOneCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnIndiaCourtOneCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Court Record Database Check (1)')]")
	WebElement clickOnIndiaCourtOneCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectIndiaCourtOneCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectIndiaCourtOneCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtIndiaCourtOneCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnIndiaCourtOneCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyIndiaCourtOneCheckSuccessfullyMsg;

	// India Court Record Database Check (2)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtIndiaCourtTwoCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnIndiaCourtTwoCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnIndiaCourtTwoCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Court Record Database Check (2)')]")
	WebElement clickOnIndiaCourtTwoCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectIndiaCourtTwoCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectIndiaCourtTwoCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtIndiaCourtTwoCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnIndiaCourtTwoCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyIndiaCourtTwoCheckSuccessfullyMsg;

	// India Court Record Database Check (3)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtIndiaCourtThreeCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnIndiaCourtThreeCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnIndiaCourtThreeCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Court Record Database Check (3)')]")
	WebElement clickOnIndiaCourtThreeCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectIndiaCourtThreeCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectIndiaCourtThreeCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtIndiaCourtThreeCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnIndiaCourtThreeCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyIndiaCourtThreeCheckSuccessfullyMsg;

	// India Crime Watch List Database Check (1)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtIndiaCrimeOneCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnIndiaCrimeOneCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnIndiaCrimeOneCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Crime Watch List Database Check (1)')]")
	WebElement clickOnIndiaCrimeOneCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectIndiaCrimeOneCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectIndiaCrimeOneCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtIndiaCrimeOneCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnIndiaCrimeOneCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyIndiaCrimeOneCheckSuccessfullyMsg;

	// India Crime Watch List Database Check (2)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtIndiaCrimeTwoCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnIndiaCrimeTwoCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnIndiaCrimeTwoCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Crime Watch List Database Check (2)')]")
	WebElement clickOnIndiaCrimeTwoCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectIndiaCrimeTwoCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectIndiaCrimeTwoCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtIndiaCrimeTwoCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnIndiaCrimeTwoCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyIndiaCrimeTwoCheckSuccessfullyMsg;

	// PAN No Verification (1)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtPanNoOneCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnPanNoOneCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnPanNoOneCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'PAN No Verification (1)')]")
	WebElement clickOnPanNoOneCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectPanNoOneCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectPanNoOneCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtPanNoOneCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnPanNoOneCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyPanNoOneCheckSuccessfullyMsg;

	// PAN No Verification (2)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtPanNoTwoCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnPanNoTwoCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnPanNoTwoCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'PAN No Verification (2)')]")
	WebElement clickOnPanNoTwoCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectPanNoTwoCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectPanNoTwoCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtPanNoTwoCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnPanNoTwoCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyPanNoTwoCheckSuccessfullyMsg;

	// PAN No Verification (3)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtPanNoThreeCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnPanNoThreeCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnPanNoThreeCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'PAN No Verification (3)')]")
	WebElement clickOnPanNoThreeCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectPanNoThreeCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectPanNoThreeCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtPanNoThreeCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnPanNoThreeCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyPanNoThreeCheckSuccessfullyMsg;

	// Visual Document Validation
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtVisualDocumentCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnVisualDocumentCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnPVisualDocumentCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Visual Document Validation')]")
	WebElement clickOnVisualDocumentCheckVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectVisualDocumentCheckCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectVisualDocumentCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtVisualDocumentCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnVisualDocumentCheckClosedByClientBtn;

	// Check is successfully marked as "Closed by Client".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyVisualDocumentCheckSuccessfullyMsg;

	// Visual Document Validation ( Closed by Client )
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyVisualDocumentClosedByClientMsg;

	// Logout -- Cat Role
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	WebElement logoutBridgeCatUserAccount;

	// You are successfully logged out.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]")
	WebElement verifyCatUserLoggedOutSuccessfully;

	// Verification Quality Allocator--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectUserRoleVerificationQualityAllocator;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Notification Alerts')]")
	WebElement verifyNotificationAlerts;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtEnterArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnArsNoSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr/td[11]/a")
	WebElement clickOnVerifiedCountNumber;

	// Check List - Search Result - (14 records)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/thead[1]/tr[1]/th[1]/input[2]")
	WebElement checkOnCheckBoxCheckListAll;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckBULKACTIONTAKEN']")
	WebElement selectActionAllocateToVqc;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='ddlChecksAssignedToRelease']")
	WebElement selectTeamMemberName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='check_comments']")
	WebElement txtCheckComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnGo']")
	WebElement clickOnGoBtn;

	// Verification Quality Allocator Successfully Message--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyQualityAllocatorSuccessMsg;
	
	// Reports Manager -- Search Report
		@CacheLookup
		@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
		WebElement selectUserRoleReportsManager;

		@CacheLookup
		@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Notification Alerts - Reports Status')]")
		WebElement verifyNotificationAlertsReportsStatus;

		@CacheLookup
		@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]")
		WebElement clickOnReportsManagerReports;

		@CacheLookup
		@FindBy(how = How.XPATH, using = "//input[@id='CaseReportCASEARSNO']")
		WebElement txtArsNumber;

		@CacheLookup
		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Search Report')]")
		WebElement clickOnSearchReportBtn;	
		
		// Report List - Search Result -- Single Window Review Report
		@CacheLookup
		@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[14]/select[1]")
		WebElement selectActionWindowReviewReport;
	

	// Checks Summary (Close By Client)-- Case Summary Details
	@SuppressWarnings("deprecation")
	public void userAdminChecksSummaryClosedByClient(String bankCheckArsNumber, String companyArsNo,
			String creditSearchNo, String detailsCheckSearchNo, String EPFOCheckSearchNo, String ESICCheckSearchNo,
			String GlobalOneCheckSearchNo, String GlobalTwoCheckSearchNo, String GlobalThreeCheckSearchNo,
			String GSTINOneCheckSearchNo, String GSTINTwoCheckSearchNo, String GSTINThreeCheckSearchNo,
			String IndiaAdvancedCheckSearchNo, String IndiaAdvancedTwoCheckSearchNo,
			String IndiaAdvancedThreeCheckSearchNo, String IndiaCourtOneCheckSearchNo,
			String IndiaCourtTwoCheckSearchNo, String IndiaCourtThreeCheckSearchNo, String IndiaCrimeOneCheckSearchNo,
			String IndiaCrimeTwoCheckSearchNo, String PanNoOneCheckSearchNo, String PanNoTwoCheckSearchNo,
			String PanNoThreeCheckSearchNo, String VisualDocumentCheckSearchNo)
			throws InterruptedException, IOException {
		wait = new WebDriverWait(ldriver, 300);
		wait.until(ExpectedConditions.visibilityOf(selectUserCurrentRoleCat));
		JavaScriptManuplator.selectOptionFromDropDown(selectUserCurrentRoleCat, "CAT");
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 420);
		wait.until(ExpectedConditions.visibilityOf(verifyNotificationAlertsCasesStatus));
		txtCompleteSearchNo.sendKeys(bankCheckArsNumber);
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCompleteSearchBtn);
		//clickOnCompleteSearchBtn.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnArsNumber);
		//clickOnArsNumber.click();

		// Bank Account Verification --Checks Summary -- Case Summary Details
		wait = new WebDriverWait(ldriver, 300);
		wait.until(ExpectedConditions.visibilityOf(clickOnBankAccountVerification));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnBankAccountVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnBankAccountVerification));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnBankAccountVerification);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectBankCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectBankCloseByClient));
		// Select caseCheckVerification = new Select(selectBankCloseByClient);
		// caseCheckVerification.selectByIndex(4);
		JavaScriptManuplator.selectOptionFromDropDown(selectBankCloseByClient, "Close By Client");

		// Closed By Client--
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectBankAccountCategory));
		// Select caseCheckCommentCategory = new Select(selectBankAccountCategory);
		// caseCheckCommentCategory.selectByIndex(1);
		JavaScriptManuplator.selectOptionFromDropDown(selectBankAccountCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtSpecialComments, "arguments[0].value='Comments Are Good'", ldriver);
		// txtSpecialComments.sendKeys(txtSpecialComments);
		clickOnClosedByClientBtn.click();

		// Company Verification --Checks Summary -- Case Summary Details
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyBankAccountClosedByClientSuccessfullyMsg));
		txtCompanySearchNo.sendKeys(companyArsNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCompanySearchBtn);
		//clickOnCompanySearchBtn.click();
		clickOnCompanyArsNumber.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCompanyVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCompanyVerification));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCompanyVerification);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectCompanyCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCompanyCloseByClient));
		// Select criminalCaseCheckVerification = new
		// Select(selectCriminalRecordsCloseByClient);
		// criminalCaseCheckVerification.selectByIndex(4);
		JavaScriptManuplator.selectOptionFromDropDown(selectCompanyCloseByClient, "Close By Client");
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCompanyCategory));
		// Select criminalCaseCheckCommentCategory = new
		// Select(selectCriminalCommentCategory);
		// criminalCaseCheckCommentCategory.selectByIndex(1);
		JavaScriptManuplator.selectOptionFromDropDown(selectCompanyCategory, "As per client instruction");
		// txtCompanySpecialComments.sendKeys(criminalComments);
		JavaScriptManuplator.javaScriptExecutor(txtSpecialComments, "arguments[0].value='Comments Are Good'", ldriver);
		clickOnCompanyClosedByClientBtn.click();

		// Credit Rating Check Verification --Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCompanySuccessfullyMsg));
		txtCreditSearchNo.sendKeys(creditSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCreditSearchBtn);
		//clickOnCreditSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCreditArsNumber));
		clickOnCreditArsNumber.click();
		JavaScriptManuplator.javaScriptExecutor(clickOnCreditVerification, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCreditVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnCreditVerification, "arguments[0].click()", ldriver);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectCreditCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCreditCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectCreditCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectCreditCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCreditCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectCreditCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtCreditSpecialComments, "arguments[0].value='Comments Are Good'",
				ldriver);
		clickOnCreditClosedByClientBtn.click();

		// Details Validation Check --Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCreditSuccessfullyMsg));
		txtDetailsCheckSearchNo.sendKeys(detailsCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDetailsCheckSearchBtn);
		//clickOnDetailsCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnDetailsCheckArsNumber));
		clickOnDetailsCheckArsNumber.click();
		JavaScriptManuplator.javaScriptExecutor(clickOnDetailsCheckVerification, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnDetailsCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnDetailsCheckVerification, "arguments[0].click()", ldriver);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectDetailsCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectDetailsCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectDetailsCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectDetailsCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectDetailsCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectDetailsCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtDetailsCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnDetailsCheckClosedByClientBtn.click();

		// EPFO Registration Check --Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyDetailsCheckSuccessfullyMsg));
		txtEPFOCheckSearchNo.sendKeys(EPFOCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnEPFOCheckSearchBtn);
		//clickOnEPFOCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnEPFOCheckArsNumber));
		//clickOnEPFOCheckArsNumber.click();
		JavaScriptManuplator.javaScriptExecutor(clickOnEPFOCheckArsNumber, "arguments[0].click()", ldriver);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnEPFOCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnEPFOCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnEPFOCheckVerification, "arguments[0].click()", ldriver);
		//clickOnEPFOCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectEPFOCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectEPFOCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectEPFOCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectEPFOCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectEPFOCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectEPFOCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtEPFOCheckSpecialComments, "arguments[0].value='Comments Are Good'",
				ldriver);
		clickOnEPFOCheckClosedByClientBtn.click();

		// ESIC Registration Check --Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyEPFOCheckSuccessfullyMsg));
		txtESICCheckSearchNo.sendKeys(ESICCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnESICCheckSearchBtn);
		//clickOnESICCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnESICCheckArsNumber));
		clickOnESICCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnESICCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnESICCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnESICCheckVerification, "arguments[0].click()", ldriver);
		//clickOnESICCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectESICCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectESICCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectESICCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectESICCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectESICCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectESICCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtESICCheckSpecialComments, "arguments[0].value='Comments Are Good'",
				ldriver);
		clickOnESICCheckClosedByClientBtn.click();

		// Global Regulatory Compliance and Debarment Database Verification (1) --Checks
		// Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyESICCheckSuccessfullyMsg));
		txtGlobalOneCheckSearchNo.sendKeys(GlobalOneCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnGlobalOneCheckSearchBtn);
		//clickOnGlobalOneCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGlobalOneCheckArsNumber));
		clickOnGlobalOneCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnGlobalOneCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGlobalOneCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnGlobalOneCheckVerification, "arguments[0].click()", ldriver);
		//clickOnGlobalOneCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectGlobalOneCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectGlobalOneCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectGlobalOneCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectGlobalOneCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectGlobalOneCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectGlobalOneCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtGlobalOneCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnGlobalOneCheckClosedByClientBtn.click();

		// Global Regulatory Compliance and Debarment Database Verification (2) --Checks
		// Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyGlobalOneCheckSuccessfullyMsg));
		txtGlobalTwoCheckSearchNo.sendKeys(GlobalTwoCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnGlobalTwoCheckSearchBtn);
		//clickOnGlobalTwoCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGlobalTwoCheckArsNumber));
		clickOnGlobalTwoCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnGlobalTwoCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGlobalTwoCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnGlobalTwoCheckVerification, "arguments[0].click()", ldriver);
		//clickOnGlobalTwoCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectGlobalTwoCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectGlobalTwoCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectGlobalTwoCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectGlobalTwoCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectGlobalTwoCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectGlobalTwoCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtGlobalTwoCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnGlobalTwoCheckClosedByClientBtn.click();

		// Global Regulatory Compliance and Debarment Database Verification (3) --Checks
		// Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyGlobalTwoCheckSuccessfullyMsg));
		txtGlobalThreeCheckSearchNo.sendKeys(GlobalThreeCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnGlobalThreeCheckSearchBtn);
		//clickOnGlobalThreeCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGlobalThreeCheckArsNumber));
		clickOnGlobalThreeCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnGlobalThreeCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGlobalThreeCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnGlobalThreeCheckVerification, "arguments[0].click()", ldriver);
		//clickOnGlobalThreeCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectGlobalThreeCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectGlobalThreeCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectGlobalThreeCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectGlobalThreeCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectGlobalThreeCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectGlobalThreeCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtGlobalThreeCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnGlobalThreeCheckClosedByClientBtn.click();

		// GSTIN (1) --Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyGlobalThreeCheckSuccessfullyMsg));
		txtGSTINOneCheckSearchNo.sendKeys(GSTINOneCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnGSTINOneCheckSearchBtn);
		//clickOnGSTINOneCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGSTINOneCheckArsNumber));
		clickOnGSTINOneCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnGSTINOneCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGSTINOneCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnGSTINOneCheckVerification, "arguments[0].click()", ldriver);
		//clickOnGSTINOneCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectGSTINOneCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectGSTINOneCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectGSTINOneCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectGSTINOneCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectGSTINOneCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectGSTINOneCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtGSTINOneCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnGSTINOneCheckClosedByClientBtn.click();

		// GSTIN (2) --Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyGSTINOneCheckSuccessfullyMsg));
		txtGSTINTwoCheckSearchNo.sendKeys(GSTINTwoCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnGSTINTwoCheckSearchBtn);
		//clickOnGSTINTwoCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGSTINTwoCheckArsNumber));
		clickOnGSTINTwoCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnGSTINTwoCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGSTINTwoCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnGSTINTwoCheckVerification, "arguments[0].click()", ldriver);
		//clickOnGSTINTwoCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectGSTINTwoCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectGSTINTwoCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectGSTINTwoCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectGSTINTwoCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectGSTINTwoCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectGSTINTwoCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtGSTINTwoCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnGSTINTwoCheckClosedByClientBtn.click();

		// GSTIN (3) --Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyGSTINTwoCheckSuccessfullyMsg));
		txtGSTINThreeCheckSearchNo.sendKeys(GSTINThreeCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnGSTINThreeCheckSearchBtn);
		//clickOnGSTINThreeCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGSTINThreeCheckArsNumber));
		clickOnGSTINThreeCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnGSTINThreeCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGSTINThreeCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnGSTINThreeCheckVerification, "arguments[0].click()", ldriver);
		//clickOnGSTINThreeCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectGSTINThreeCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectGSTINThreeCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectGSTINThreeCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectGSTINThreeCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectGSTINThreeCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectGSTINThreeCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtGSTINThreeCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnGSTINThreeCheckClosedByClientBtn.click();

		// India Advanced Web and Media Searches (1) --Check Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyGSTINThreeCheckSuccessfullyMsg));
		txtIndiaAdvancedCheckSearchNo.sendKeys(IndiaAdvancedCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaAdvancedCheckSearchBtn);
		//clickOnIndiaAdvancedCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaAdvancedCheckArsNumber));
		clickOnIndiaAdvancedCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaAdvancedCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaAdvancedCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnIndiaAdvancedCheckVerification, "arguments[0].click()", ldriver);
		//clickOnIndiaAdvancedCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaAdvancedCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaAdvancedCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaAdvancedCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaAdvancedCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaAdvancedCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaAdvancedCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtIndiaAdvancedCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnIndiaAdvancedCheckClosedByClientBtn.click();

		// India Advanced Web and Media Searches (2) --Check Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyIndiaAdvancedCheckSuccessfullyMsg));
		txtIndiaAdvancedTwoCheckSearchNo.sendKeys(IndiaAdvancedTwoCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaAdvancedTwoCheckSearchBtn);
		//clickOnIndiaAdvancedTwoCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaAdvancedTwoCheckArsNumber));
		clickOnIndiaAdvancedTwoCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaAdvancedTwoCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaAdvancedTwoCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnIndiaAdvancedTwoCheckVerification, "arguments[0].click()", ldriver);
		//clickOnIndiaAdvancedTwoCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaAdvancedTwoCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaAdvancedTwoCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaAdvancedTwoCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaAdvancedTwoCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaAdvancedTwoCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaAdvancedTwoCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtIndiaAdvancedTwoCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnIndiaAdvancedTwoCheckClosedByClientBtn.click();

		// India Advanced Web and Media Searches (3) --Check Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyIndiaAdvancedTwoCheckSuccessfullyMsg));
		txtIndiaAdvancedThreeCheckSearchNo.sendKeys(IndiaAdvancedThreeCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaAdvancedThreeCheckSearchBtn);
		//clickOnIndiaAdvancedThreeCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaAdvancedThreeCheckArsNumber));
		clickOnIndiaAdvancedThreeCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaAdvancedThreeCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaAdvancedThreeCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnIndiaAdvancedThreeCheckVerification, "arguments[0].click()", ldriver);
		//clickOnIndiaAdvancedThreeCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaAdvancedThreeCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaAdvancedThreeCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaAdvancedThreeCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaAdvancedThreeCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaAdvancedThreeCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaAdvancedThreeCheckCategory,
				"As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtIndiaAdvancedThreeCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnIndiaAdvancedThreeCheckClosedByClientBtn.click();

		// India Court Record Database Check (1)
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyIndiaAdvancedThreeCheckSuccessfullyMsg));
		txtIndiaCourtOneCheckSearchNo.sendKeys(IndiaCourtOneCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCourtOneCheckSearchBtn);
		//clickOnIndiaCourtOneCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtOneCheckArsNumber));
		clickOnIndiaCourtOneCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCourtOneCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtOneCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnIndiaCourtOneCheckVerification, "arguments[0].click()", ldriver);
		//clickOnIndiaCourtOneCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaCourtOneCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCourtOneCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaCourtOneCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaCourtOneCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCourtOneCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaCourtOneCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtIndiaCourtOneCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnIndiaCourtOneCheckClosedByClientBtn.click();

		// India Court Record Database Check (2)
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyIndiaCourtOneCheckSuccessfullyMsg));
		txtIndiaCourtTwoCheckSearchNo.sendKeys(IndiaCourtTwoCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCourtTwoCheckSearchBtn);
		//clickOnIndiaCourtTwoCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtTwoCheckArsNumber));
		clickOnIndiaCourtTwoCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCourtTwoCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtTwoCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnIndiaCourtTwoCheckVerification, "arguments[0].click()", ldriver);
		//clickOnIndiaCourtTwoCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaCourtTwoCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCourtTwoCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaCourtTwoCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaCourtTwoCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCourtTwoCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaCourtTwoCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtIndiaCourtTwoCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnIndiaCourtTwoCheckClosedByClientBtn.click();

		// India Court Record Database Check (3)
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyIndiaCourtTwoCheckSuccessfullyMsg));
		txtIndiaCourtThreeCheckSearchNo.sendKeys(IndiaCourtThreeCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCourtThreeCheckSearchBtn);
		//clickOnIndiaCourtThreeCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtThreeCheckArsNumber));
		clickOnIndiaCourtThreeCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCourtThreeCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtThreeCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnIndiaCourtThreeCheckVerification, "arguments[0].click()", ldriver);
		//clickOnIndiaCourtThreeCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaCourtThreeCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCourtThreeCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaCourtThreeCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaCourtThreeCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCourtThreeCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaCourtThreeCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtIndiaCourtThreeCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnIndiaCourtThreeCheckClosedByClientBtn.click();

		// India Crime Watch List Database Check (1)
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyIndiaCourtThreeCheckSuccessfullyMsg));
		txtIndiaCrimeOneCheckSearchNo.sendKeys(IndiaCrimeOneCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCrimeOneCheckSearchBtn);
		//clickOnIndiaCrimeOneCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCrimeOneCheckArsNumber));
		clickOnIndiaCrimeOneCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCrimeOneCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCrimeOneCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnIndiaCrimeOneCheckVerification, "arguments[0].click()", ldriver);
		//clickOnIndiaCrimeOneCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaCrimeOneCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCrimeOneCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaCrimeOneCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaCrimeOneCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCrimeOneCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaCrimeOneCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtIndiaCrimeOneCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnIndiaCrimeOneCheckClosedByClientBtn.click();

		// India Crime Watch List Database Check (2)
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyIndiaCrimeOneCheckSuccessfullyMsg));
		txtIndiaCrimeTwoCheckSearchNo.sendKeys(IndiaCrimeTwoCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCrimeTwoCheckSearchBtn);
		//clickOnIndiaCrimeTwoCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCrimeTwoCheckArsNumber));
		clickOnIndiaCrimeTwoCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCrimeTwoCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCrimeTwoCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnIndiaCrimeTwoCheckVerification, "arguments[0].click()", ldriver);
		//clickOnIndiaCrimeTwoCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaCrimeTwoCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCrimeTwoCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaCrimeTwoCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaCrimeTwoCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCrimeTwoCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaCrimeTwoCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtIndiaCrimeTwoCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnIndiaCrimeTwoCheckClosedByClientBtn.click();

		/*
		 * // PAN No Verification (1) wait = new WebDriverWait(ldriver, 60);
		 * wait.until(ExpectedConditions.visibilityOf(
		 * verifyIndiaCrimeTwoCheckSuccessfullyMsg));
		 * txtPanNoOneCheckSearchNo.sendKeys(PanNoOneCheckSearchNo);
		 * js = (JavascriptExecutor) ldriver;
		 * js.executeScript("arguments[0].click()", clickOnPanNoOneCheckSearchBtn);
		 * clickOnPanNoOneCheckSearchBtn.click(); wait = new WebDriverWait(ldriver, 60);
		 * wait.until(ExpectedConditions.visibilityOf(clickOnPanNoOneCheckArsNumber));
		 * clickOnPanNoOneCheckArsNumber.click();
		 * 
		 * js = (JavascriptExecutor) ldriver;
		 * js.executeScript("arguments[0].scrollIntoView(true);",
		 * clickOnPanNoOneCheckVerification); wait = new WebDriverWait(ldriver, 60);
		 * wait.until(ExpectedConditions.visibilityOf(clickOnPanNoOneCheckVerification))
		 * ; 
		 * JavaScriptManuplator.javaScriptExecutor(clickOnPanNoOneCheckVerification, "arguments[0].click()", ldriver);
		 * //clickOnPanNoOneCheckVerification.click();
		 * 
		 * js = (JavascriptExecutor) ldriver;
		 * js.executeScript("arguments[0].scrollIntoView(true);",
		 * selectPanNoOneCheckCloseByClient); wait = new WebDriverWait(ldriver, 60);
		 * wait.until(ExpectedConditions.visibilityOf(selectPanNoOneCheckCloseByClient))
		 * ; JavaScriptManuplator.selectOptionFromDropDown(
		 * selectPanNoOneCheckCloseByClient, "Close By Client");
		 * 
		 * js = (JavascriptExecutor) ldriver;
		 * js.executeScript("arguments[0].scrollIntoView(true);",
		 * selectPanNoOneCheckCategory); wait = new WebDriverWait(ldriver, 60);
		 * wait.until(ExpectedConditions.visibilityOf(selectPanNoOneCheckCategory));
		 * JavaScriptManuplator.selectOptionFromDropDown(selectPanNoOneCheckCategory,
		 * "As per client instruction");
		 * JavaScriptManuplator.javaScriptExecutor(txtPanNoOneCheckSpecialComments,
		 * "arguments[0].value='Comments Are Good'", ldriver);
		 * clickOnPanNoOneCheckClosedByClientBtn.click();
		 */

		// PAN No Verification (2)
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyPanNoOneCheckSuccessfullyMsg));
		txtPanNoTwoCheckSearchNo.sendKeys(PanNoTwoCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPanNoTwoCheckSearchBtn);
		//clickOnPanNoTwoCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPanNoTwoCheckArsNumber));
		clickOnPanNoTwoCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPanNoTwoCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPanNoTwoCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnPanNoTwoCheckVerification, "arguments[0].click()", ldriver);
		//clickOnPanNoTwoCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectPanNoTwoCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPanNoTwoCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectPanNoTwoCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectPanNoTwoCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPanNoTwoCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectPanNoTwoCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtPanNoTwoCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnPanNoTwoCheckClosedByClientBtn.click();

		// PAN No Verification (3)
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyPanNoTwoCheckSuccessfullyMsg));
		txtPanNoThreeCheckSearchNo.sendKeys(PanNoThreeCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPanNoThreeCheckSearchBtn);
		//clickOnPanNoThreeCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPanNoThreeCheckArsNumber));
		clickOnPanNoThreeCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPanNoThreeCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPanNoThreeCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnPanNoThreeCheckVerification, "arguments[0].click()", ldriver);
		//clickOnPanNoThreeCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectPanNoThreeCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPanNoThreeCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectPanNoThreeCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectPanNoThreeCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPanNoThreeCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectPanNoThreeCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtPanNoThreeCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnPanNoThreeCheckClosedByClientBtn.click();

		// Visual Document Validation
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyPanNoThreeCheckSuccessfullyMsg));
		txtVisualDocumentCheckSearchNo.sendKeys(VisualDocumentCheckSearchNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnVisualDocumentCheckSearchBtn);
		//clickOnVisualDocumentCheckSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPVisualDocumentCheckArsNumber));
		clickOnPVisualDocumentCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnVisualDocumentCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnVisualDocumentCheckVerification));
		JavaScriptManuplator.javaScriptExecutor(clickOnVisualDocumentCheckVerification, "arguments[0].click()", ldriver);
		//clickOnVisualDocumentCheckVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectVisualDocumentCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectVisualDocumentCheckCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectVisualDocumentCheckCloseByClient, "Close By Client");

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectVisualDocumentCheckCategory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectVisualDocumentCheckCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectVisualDocumentCheckCategory, "As per client instruction");
		JavaScriptManuplator.javaScriptExecutor(txtVisualDocumentCheckSpecialComments,
				"arguments[0].value='Comments Are Good'", ldriver);
		clickOnVisualDocumentCheckClosedByClientBtn.click();
		Thread.sleep(1000);
	}

	// Visual Document Validation ( Closed by Client )
	@SuppressWarnings("deprecation")
	public String verifyVisualDocumentValidationClosedByClient() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyVisualDocumentClosedByClientMsg));
		return verifyVisualDocumentClosedByClientMsg.getText();
	}

	// Logout -- Cat Role
	@SuppressWarnings("deprecation")
	public void logoutBridgeCatUserAccount() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(logoutBridgeCatUserAccount));
		logoutBridgeCatUserAccount.click();
		// You are successfully logged out.
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCatUserLoggedOutSuccessfully));
	}

	// Verification Quality Allocator--Check List - Search Result - (14 records)
	@SuppressWarnings("deprecation")
	public void superAdminVerificationQualityAllocator(String enterArsNo, String checkComments)
			throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectUserRoleVerificationQualityAllocator));
		JavaScriptManuplator.selectOptionFromDropDown(selectUserRoleVerificationQualityAllocator, "Verification Quality Allocator");
		//Select userRoleVerificationQualityAllocator = new Select(selectUserRoleVerificationQualityAllocator);
		//userRoleVerificationQualityAllocator.selectByIndex(64);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(verifyNotificationAlerts));
		txtEnterArsNumber.sendKeys(enterArsNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnArsNoSearchBtn);
		// clickOnArsNoSearchBtn.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnVerifiedCountNumber);
		// clickOnVerifiedCountNumber.click();

		// Check List - Search Result - (14 records)
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkOnCheckBoxCheckListAll));
		checkOnCheckBoxCheckListAll.click();

		Select actionAllocateToVqc = new Select(selectActionAllocateToVqc);
		actionAllocateToVqc.selectByIndex(1);

		// Select teamMemberName = new Select(selectTeamMemberName);
		// teamMemberName.selectByIndex(4);
		txtCheckComments.sendKeys(checkComments);
		clickOnGoBtn.click();

		WebElement element = ldriver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
	}

	// The selected checks were successfully released for report.
	@SuppressWarnings("deprecation")
	public String verificationQualityAllocatorSuccessfullyMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyQualityAllocatorSuccessMsg));
		return verifyQualityAllocatorSuccessMsg.getText();
	}
	
	// Reports Manager -- Search Report
		@SuppressWarnings("deprecation")
		public void superAdminReportsManager(String enterArsNo) throws InterruptedException {
			wait = new WebDriverWait(ldriver, 180);
			wait.until(ExpectedConditions.visibilityOf(selectUserRoleReportsManager));
			Select userRoleReportsManager = new Select(selectUserRoleReportsManager);
			userRoleReportsManager.selectByIndex(50);
			Thread.sleep(3000);
			js = (JavascriptExecutor) ldriver;
			js.executeScript("arguments[0].click()", clickOnDashboard);
			wait = new WebDriverWait(ldriver, 240);
			wait.until(ExpectedConditions.visibilityOf(verifyNotificationAlertsReportsStatus));
			js = (JavascriptExecutor) ldriver;
			js.executeScript("arguments[0].click()", clickOnReportsManagerReports);
			// clickOnReportsManagerReports.click();
			WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'Search Report')]"));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(element).click().perform();

			wait = new WebDriverWait(ldriver, 60);
			wait.until(ExpectedConditions.visibilityOf(txtArsNumber));
			txtArsNumber.sendKeys(enterArsNo);
			clickOnSearchReportBtn.click();

			// Report List - Search Result -- Single Window Review Report
			wait = new WebDriverWait(ldriver, 60);
			wait.until(ExpectedConditions.visibilityOf(selectActionWindowReviewReport));
			Select actionWindowReviewReport = new Select(selectActionWindowReviewReport);
			actionWindowReviewReport.selectByIndex(3);

			// Do you wish to continue with the action "Single Window Review Report"?
			WebElement ele = ldriver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
			Actions act = new Actions(ldriver);
			act.moveToElement(ele).click().perform();

			// Criminal Records Verification
		}
}
