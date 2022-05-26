package com.onboardx.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.onboardx.pageobject.OnBoardXLoginPage;
import junit.framework.Assert;

public class TC_OnBoardXLoginPage_01 extends BaseClass {
	// Verify JSPL Client Login Details
	@Test(enabled = true, testName = "Verify JSPL Client Login Details", priority = 1)
	public void verifyJsplLoginDetails() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("OnBoardx Url is opened");
		OnBoardXLoginPage onBoardxLogin = new OnBoardXLoginPage(driver);
		onBoardxLogin.loginOnBoardXAccount(username, password);
		onBoardxLogin.getCaptchaCode();
		logger.info("Captcha code has Entered successfully!");
		logger.info("Onboardx account has logged successfully!");
		if (onBoardxLogin.verifyCaseSubmissionSummaryMsg().contains("CASE SUBMISSION SUMMARY")) {
			Assert.assertTrue(true);
			logger.info("JSPL Client Login Details Have Verified Successfully!.");
		} else {
			logger.info("JSPL Client Login Details Have Not Verified Successfully!.");
			captureScreen(driver, "verifyCaseSubmissionSummaryMsg");
			Assert.assertTrue(false);
		}
	}
}
