package com.onboardx.testcases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.testng.annotations.Test;
import com.onboardx.pageobject.InitiateCaseIndividually;
import com.onboardx.pageobject.OnBoardXLoginPage;
import com.onboardx.pageobject.PendingSubmissionSummary;
import com.onboardx.pageobject.VendorEmailVerification;
import com.onboardx.utilities.RandomStrings;

import junit.framework.Assert;

public class TC_InitiateCaseIndividually_03 extends BaseClass {
	String fullName;
	String email;

	// Verify Case case initiation
	@Test(enabled = true, testName = "Verify Case initiation", priority = 1)
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

	// Vendor Email Verification On Mailinator
	@Test(enabled = true, testName = "Vendor Email Verification", priority = 3, dependsOnMethods = {
			"verifyPendingSubmissionBucket" })
	public void candidateEmailVerification() throws IOException, InterruptedException {
		String randomString = new String(Files.readAllBytes(Paths.get("RandomMail.txt")));
		String mailinatorUrl = "https://www.mailinator.com/v3/index.jsp?zone=public&query=" + randomString
				+ "#/#inboxpane";
		driver.get(mailinatorUrl);
		logger.info("Mailinator Mail URL has Successfully!");
		VendorEmailVerification verification = new VendorEmailVerification(driver);
		if (verification.verifyMailinatorMailSubject().contains("JSPL - Vendor Registration Form")) {
			Assert.assertTrue(true);
			logger.info("Mailinator Mail Subject has got successfully!");
		} else {
			logger.info("Mailinator Mail Subject has Not got successfully!");
			captureScreen(driver, "verifyMailinatorMailSubject");
			Assert.assertTrue(false);
		}

		verification.mailinatorVerificationMail();
		logger.info("Mailinator Mail has Verified Successfully!");

		verification.getUserNameAndPassword();
		logger.info("Get Username and Password!");
	}

	// JSPL - Vendor Registration Form Verification
	@Test(enabled = true, testName = "Vendor Registration Form Verification", priority = 4, dependsOnMethods = {
			"candidateEmailVerification" })
	public void verifyVendorRegistrationForm() throws IOException, InterruptedException {
		driver.get(baseURL);
		logger.info("OnBoardx Url is opened");
		OnBoardXLoginPage onBoardxLogin = new OnBoardXLoginPage(driver);
		onBoardxLogin.logoutOnBoardXAccount();
		logger.info("Onboardx Account Has logged Out successfully!");
		String data = new String(Files.readAllBytes(Paths.get("UsernameAndPassword.txt")));
		String userAndPassword[] = data.split(" ");
		System.out.println(userAndPassword[0] + "===" + userAndPassword[1]);
		onBoardxLogin.loginOnBoardXAccount(userAndPassword[0], userAndPassword[1]);
		logger.info("Entered User Id and Password!");
		onBoardxLogin.getVendorCaptchaCode();
		logger.info("Captcha code has Entered successfully!");
		InitiateCaseIndividually vendorRegistration = new InitiateCaseIndividually(driver);
		vendorRegistration.candidateAuthorization();
		logger.info("Authorization Details has filled Successfully!");
		vendorRegistration.vendorBusinessInformationDetails((System.getProperty("user.dir") + "/documents/Ashish.jpg"),
				(System.getProperty("user.dir") + "/documents/Rahul.jpg"),
				(System.getProperty("user.dir") + "/documents/Subham.jpg"),
				(System.getProperty("user.dir") + "/documents/Joyoti.jpg"));
		logger.info("Vendor Business Information have addeded Sucessfully!");
		vendorRegistration.vendorGstTaxInformationDeatils((System.getProperty("user.dir") + "/documents/Ashish.jpg"),
				(System.getProperty("user.dir") + "/documents/Joyoti.jpg"),
				(System.getProperty("user.dir") + "/documents/Rahul.jpg"),
				(System.getProperty("user.dir") + "/documents/Sanchita.jpg"),
				(System.getProperty("user.dir") + "/documents/Subham.jpg"),
				(System.getProperty("user.dir") + "/documents/Rahul.jpg"),
				(System.getProperty("user.dir") + "/documents/Ashish.jpg"),
				(System.getProperty("user.dir") + "/documents/Joyoti.jpg"),
				(System.getProperty("user.dir") + "/documents/Subham.jpg"),
				(System.getProperty("user.dir") + "/documents/Ashish.jpg"));
		logger.info("Vendor Gst Tax Information Details have saved Successfully!");
		vendorRegistration.vendorAddressInformationDetails();
		logger.info("Vendor Shipping Information have added Successfully!");
		vendorRegistration.vendorProductQualityInformationDetails(
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Vendor Product and Quality Information Details have added successfully!");
		vendorRegistration.vendorFinancialAndBankInfoDetails((System.getProperty("user.dir") + "/documents/Ashish.jpg"),
				(System.getProperty("user.dir") + "/documents/Ashish.jpg"),
				(System.getProperty("user.dir") + "/documents/Ashish.jpg"),
				(System.getProperty("user.dir") + "/documents/Ashish.jpg"),
				(System.getProperty("user.dir") + "/documents/Ashish.jpg"),
				(System.getProperty("user.dir") + "/documents/Ashish.jpg"),
				(System.getProperty("user.dir") + "/documents/Ashish.jpg"),
				(System.getProperty("user.dir") + "/documents/Ashish.jpg"),
				(System.getProperty("user.dir") + "/documents/Ashish.jpg"));
		logger.info("Vendor Financial And Bank Information Details have saved successfully!");
		vendorRegistration.vendorAdditionalInfoDeatils();
		logger.info("Vendor Additional Details have filled Successfully!");
		vendorRegistration.vendorReviewScreenAndProceed();
		logger.info("Please review the screen before you proceed");

		// vendorRegistration.vendorMakePaymentDetails();
		// logger.info("Vendor Due amount have paid Successfully!");
		// vendorRegistration.vendorDuePayment();
		// logger.info("Vendor Due make Payment Details Have Successfully!");
		if (vendorRegistration.verifyVendorRegistrationThankYouMsg().contains("THANK YOU!")) {
			Assert.assertTrue(true);
			logger.info("Vendor Registration have filled and Got Thank You Message successfully.!");
		} else {
			logger.info("Vendor Registration have Not filled and Got Thank You Message successfully.!");
			captureScreen(driver, "verifyVendorRegistrationThankYouMsg");
			Assert.assertTrue(false);
		}
	}

	// Case(s) Submission Summary--(Submitted for Verification) Process
	@Test(enabled = true, testName = "Verify case Submitted for Verification Bucket", priority = 5, dependsOnMethods = {
			"verifyVendorRegistrationForm" })
	public void verifySubmittedForVerificationBucket() throws IOException, InterruptedException {
		OnBoardXLoginPage onBoardxLogin = new OnBoardXLoginPage(driver);
		onBoardxLogin.loginOnBoardXAccount(username, password);
		onBoardxLogin.getCaptchaCode();
		logger.info("Captcha code has Entered successfully!");
		logger.info("Onboardx account has logged successfully!");
		PendingSubmissionSummary subForVerification = new PendingSubmissionSummary(driver);
		subForVerification.verifySubmittedForVerificationBucket();
		logger.info("The Case has verified successfully in Submitted for Verification Bucket!");

		if (subForVerification.verifySubmittedForVerificationCase().contains(email)) {
			Assert.assertTrue(true);
			logger.info("Case email Submitted For Verification' list has Verified Successfully!");
		} else {
			logger.info("Case email 'Submitted For Verification' list Has Not Verified Successfully!");
			captureScreen(driver, "verifySubmittedForVerificationCase");
			Assert.assertTrue(false);
		}
	}

	// Verify WIP Cases in Submitted Case(s) Tracker
	@Test(enabled = true, testName = "Verify Case in WIP bucket", priority = 6, dependsOnMethods = {
			"verifySubmittedForVerificationBucket" })
	public void submittedCasesTrackerWipCases() throws InterruptedException, IOException {
		PendingSubmissionSummary wipBucket = new PendingSubmissionSummary(driver);
		wipBucket.verifyEyeIconOfCase();
		logger.info("Clicked on Eye Icon Button Successfully!");
		if (wipBucket.verifyVendorInformationEmail().contains(email)) {
			Assert.assertTrue(true);
			logger.info("WIP Vendor Information Email Has Verified Successfully!");
		} else {
			logger.info("WIP Vendor Information Email Has Not Verified Successfully!");
			captureScreen(driver, "verifyVendorInformationEmail");
			Assert.assertTrue(false);
		}
		wipBucket.getArsNumberFromWipBucket();
		logger.info("The Wip Case ARS number has Got Successfully!");
	}

	// Verify Ars Number in Bridge Portal
	@Test(enabled = true, testName = "Verify Client Ars Number in Case List", priority = 7, dependsOnMethods = {
			"submittedCasesTrackerWipCases" })
	public void searchClientArsNoCaseList() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url has opened Successfully");
		OnBoardXLoginPage bridgeLogin = new OnBoardXLoginPage(driver);
		bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		logger.info("Bridge Account Logged In successfully!");

		String data = new String(Files.readAllBytes(Paths.get("CaseArsNumber.txt")));
		String arsNumber[] = data.split(" ");
		System.out.println(arsNumber[0]);
		bridgeLogin.arsNumberSearch(arsNumber[0]);
		logger.info("Client Case List shown successfully!");

		if (bridgeLogin.verifyCaseArsNumber().contains(arsNumber[0])) {
			Assert.assertTrue(true);
			logger.info("Case Ars Number has Verified Successfully in the Case List - Search Result!");
		} else {
			logger.info("Case Ars Number has Not Verified Successfully in the Case List - Search Result!");
			captureScreen(driver, "verifyCaseArsNumber");
			Assert.assertTrue(false);
		}
	}

	// Verify Allocator Process-- Bridge Portal
	@Test(enabled = true, testName = "Verify Case Allocation", priority = 10, dependsOnMethods = {
			"searchClientArsNoCaseList" })
	public void verifyInsufficientAllocator() throws IOException, InterruptedException {
		InitiateCaseIndividually verifyAllocator = new InitiateCaseIndividually(driver);
		String data = new String(Files.readAllBytes(Paths.get("CaseArsNumber.txt")));
		String arsNumber[] = data.split(" ");
		verifyAllocator.superAdminAllocator(arsNumber[0], "Allocator check Comments has entered successfully");
		if (verifyAllocator.verifyChecksSuccessfullyMsg()
				.contains("Checks are successfully allocated to Prateek Shah")) {
			Assert.assertTrue(true);
			logger.info("Checks are successfully allocated to Prateek Shah!");
		} else {
			logger.info("Checks are Not successfully allocated to Prateek Shah!");
			captureScreen(driver, "verifyChecksSuccessfullyMsg");
			Assert.assertTrue(false);
		}
	}

}
