package com.onboardx.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.onboardx.pageobject.OnBoardXLoginPage;
import com.onboardx.pageobject.PendingSubmissionSummary;
import com.onboardx.utilities.RandomStrings;

import junit.framework.Assert;

public class TC_CasePendingSubmission_02 extends BaseClass {
	String fullName;
	String email;

	// Verify Client case Initiation
	@Test(enabled = true, testName = "Verify Client case Initiation", priority = 1)
	public void vendorCaseInitiation() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("OnBoardx Url is opened");
		OnBoardXLoginPage onBoardxLogin = new OnBoardXLoginPage(driver);
		onBoardxLogin.loginOnBoardXAccount(username, password);
		onBoardxLogin.getCaptchaCode();
		logger.info("Captcha code has Entered successfully!");
		logger.info("Onboardx account has logged successfully!");
		PendingSubmissionSummary casePendingSubmission = new PendingSubmissionSummary(driver);
		casePendingSubmission.initiationPendingSubmission();
		logger.info("Case Initiation has Started Successfully!");
		fullName = RandomStrings.randomeStringVendorFullName();
		casePendingSubmission.addVendorSpocName(fullName);
		email = RandomStrings.randomeStringEmailAddress() + "@mailinator.com";
		casePendingSubmission.addVendorEmailId(email);
		logger.info("Entered Vendor information!");
		Thread.sleep(1000);
		casePendingSubmission.AddVendorInformation("");
		logger.info("Add Vendor Information have added successfully!");
		casePendingSubmission.addToQueueBtn();
		logger.info("Clicked on add To Queue Byutton successfully!");
		if (casePendingSubmission.verifyCongratulationsMsg().contains("CONGRATULATIONS!")) {
			Assert.assertTrue(true);
			logger.info("Case Initiated has successfully.!");
		} else

		{
			logger.info("Case Initiated has Not successfully.!");
			captureScreen(driver, "verifyCongratulationsMsg");
			Assert.assertTrue(false);
		}
	}

	// Verify Case land in pending submission bucket or Not
	@Test(enabled = true, testName = "Verify case land in pending submission Bucket Or not", priority = 2, dependsOnMethods = {
			"vendorCaseInitiation" })
	public void verifyPendingSubmissionBucket() throws InterruptedException, IOException {
		PendingSubmissionSummary pendingSubmissionBucket = new PendingSubmissionSummary(driver);
		pendingSubmissionBucket.casePendingSubmissionBucket();
		logger.info("Clicked On Pending submission bucket");
		if (pendingSubmissionBucket.pendingSubmissionBucket().contains(email)) {
			Assert.assertTrue(true);
			logger.info("Case Initiated has successfully and email verified.!");
		} else

		{
			logger.info("Case Initiated has Not successfully and email verified.!");
			captureScreen(driver, "pendingSubmissionBucket");
			Assert.assertTrue(false);
		}
	}

}
