package com.onboardx.testcases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.onboardx.pageobject.CaseCompletion;
import com.onboardx.pageobject.OnBoardXLoginPage;

public class TC_CaseCompletion_04 extends BaseClass {
	// Checks Summary (Close By Client)-- Case Summary Details
	@Test(enabled = true, testName = "Verify Checks Summary Close By Client", priority = 1)
	public void checksSummaryClosedByClient() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		OnBoardXLoginPage bridgeLogin = new OnBoardXLoginPage(driver);
		bridgeLogin.loginBridgeAccount(catRoleUsername, catRolePassword);
		logger.info("Bridge account has Logged successfully!");

		CaseCompletion checksSummaryClosedByClient = new CaseCompletion(driver);
		String data = new String(Files.readAllBytes(Paths.get("CaseArsNumber.txt")));
		String arsNumber[] = data.split(" ");
		checksSummaryClosedByClient.userAdminChecksSummaryClosedByClient(arsNumber[0], arsNumber[0], arsNumber[0],
				arsNumber[0], arsNumber[0], arsNumber[0], arsNumber[0], arsNumber[0], arsNumber[0], arsNumber[0],
				arsNumber[0], arsNumber[0], arsNumber[0], arsNumber[0], arsNumber[0], arsNumber[0], arsNumber[0],
				arsNumber[0], arsNumber[0], arsNumber[0], arsNumber[0], arsNumber[0], arsNumber[0], arsNumber[0]);
		logger.info("Check is successfully marked as Closed by Client.!");

		if (checksSummaryClosedByClient.verifyVisualDocumentValidationClosedByClient()
				.contains("Visual Document Validation ( Closed by Client )")) {
			Assert.assertTrue(true);
			logger.info("All Checks Summary are successfully marked as Closed by Client.!");
		} else {
			logger.info("All Checks Summary are not successfully marked as Closed by Client.!");
			captureScreen(driver, "verifyVisualDocumentValidationClosedByClient");
			Assert.assertTrue(false);
		}

		// Cat Role Account Has logged Out Successfully.
		checksSummaryClosedByClient.logoutBridgeCatUserAccount();
		logger.info("Bridge Account Logged Out has Successfully!");
	}

	// Verification Quality Allocator Process --Check List - Search Result - (14 records)
	@Test(enabled = true, testName = "Verify Verification Quality Allocator Process--Check List", priority = 2, dependsOnMethods = {
			"checksSummaryClosedByClient" })
	public void verificationQualityAllocator() throws IOException, InterruptedException {
		CaseCompletion verificationQualityAllocator = new CaseCompletion(driver);
		String data = new String(Files.readAllBytes(Paths.get("CaseArsNumber.txt")));
		String arsNumber[] = data.split(" ");
		verificationQualityAllocator.superAdminVerificationQualityAllocator(arsNumber[0],
				"Verification Quality Allocator Comments are good");
		logger.info("Verification Quality Allocator details has been filled Successfully!");

		if (verificationQualityAllocator.verificationQualityAllocatorSuccessfullyMsg()
				.contains("The selected checks were successfully released for report.")) {
			Assert.assertTrue(true);
			logger.info("Checks are successfully allocated to Shariq Abbas.!");
		} else {
			logger.info("Checks are Not successfully allocated to Shariq Abbas.!");
			captureScreen(driver, "verificationQualityAllocatorSuccessfullyMsg");
			Assert.assertTrue(false);
		}
	}

	// Reports Manager Process-- Search Report
	@Test(enabled = true, testName = "Verify Reports Manager Search Report", priority = 4, dependsOnMethods = {
			"verificationQualityAllocator" })
	public void verifyReportsManager() throws InterruptedException, IOException {
		// driver.get(bridgeURL);
		// logger.info("Bridge Url is opened");
		// BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		// bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		CaseCompletion reportManager = new CaseCompletion(driver);
		String data = new String(Files.readAllBytes(Paths.get("CaseArsNumber.txt")));
		String arsNumber[] = data.split(" ");
		reportManager.superAdminReportsManager(arsNumber[0]);
		logger.info("Manager Reports details have been filled Successfully!");

		/*if (reportManager.verifyReportSuccessReviewedMsg().contains("Report Successfully Reviewed.")) {
			Assert.assertTrue(true);
			logger.info("The Report has been Reviewed Successfully!");
		} else {
			logger.info("The Report has Not been Reviewed Successfully!");
			captureScreen(driver, "verifyReportSuccessfullyReviewedMsg");
			Assert.assertTrue(false);
		}*/
	}
}
