package com.onboardx.pageobject;

import java.awt.Robot;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.onboardx.utilities.JavaScriptManuplator;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class OnBoardXLoginPage {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Robot rbt;

	public OnBoardXLoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// OnBoardX : Login Details
	@FindBy(xpath = "//input[@id='username']")
	@CacheLookup
	WebElement txtUsername;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//img[@id='captcha_image']")
	@CacheLookup
	WebElement txtCaptchaImage;

	@FindBy(xpath = "//input[@id='captcha']")
	@CacheLookup
	WebElement txtCaptchaCode;

	@FindBy(xpath = "//button[@id='submitBtn']")
	@CacheLookup
	WebElement clickOnSubmitBtn;

	@FindBy(xpath = "//*[@id='instruction-popup']/div/div/div[1]/button/img")
	@CacheLookup
	WebElement clickOnInstructionPopupCrossBtn;

	@FindBy(xpath = "//h3[contains(text(),'Case Submission Summary')]")
	@CacheLookup
	WebElement verifyCaseSubmissionSummaryText;

	// Logout OnBoardX Account
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[4]/a[1]/span[1]")
	@CacheLookup
	WebElement clickOnProfile;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[4]/ul[1]/li[2]/a[1]")
	@CacheLookup
	WebElement clickOnLogoutBtn;

	// Login functionalities of the Bridge Portal
	@FindBy(xpath = "//input[@id='login_email']")
	@CacheLookup
	WebElement txtBridgeUserName;

	@FindBy(xpath = "//input[@id='login_password']")
	@CacheLookup
	WebElement txtBridgePassword;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	@CacheLookup
	WebElement clickOnBridgeLogInBtn;

	// Verify LogOut Button
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/ul[1]/li[12]/a[1]")
	@CacheLookup
	WebElement verifyLogOutBtn;
	
	@FindBy(xpath = "//select[@id='user_current_role']")
	@CacheLookup
	WebElement selectSuperAdminRole;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	@CacheLookup
	WebElement clickOnDashboardModule;
	
	@FindBy(xpath = "//input[@id='complete_search_no']")
	@CacheLookup
	WebElement txtArsNumberInSearch;

	@FindBy(xpath = "//button[@id='complete_search']")
	@CacheLookup
	WebElement clickOnSearchBtn;

	// Case List - Search Result
	@FindBy(xpath = "//h4[contains(text(),'Case List - Search Result')]")
	@CacheLookup
	WebElement verifyCaseListSearchResult;

	// Verify Case Ars Number
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	@CacheLookup
	WebElement verifyCaseArsNumber;

	public void loginOnBoardXAccount(String username, String password) throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, txtUsername, 120);
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);
		Thread.sleep(1000);
	}

	@SuppressWarnings("deprecation")
	public void getCaptchaCode() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtUsername));
		try {
			Thread.sleep(2000);
			File src = ldriver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/img[1]"))
					.getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir") + "/Screenshots/CaptchaCode.png";
			FileHandler.copy(src, new File(path));
			ITesseract image = new Tesseract();
			String imageText = image.doOCR(new File(path));
			String[] splitStr = imageText.trim().split("\\s+");
			System.out.println("Final Captcha is:" + splitStr);
			Thread.sleep(5000);
			ldriver.findElement(By.xpath("//input[@id='captcha']")).sendKeys(splitStr);
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Exception Cautch: " + e.getMessage());
		}
		Thread.sleep(2000);
		clickOnSubmitBtn.click();
		Thread.sleep(1000);
	}

	public void getVendorCaptchaCode() throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, txtUsername, 120);
		try {
			Thread.sleep(2000);
			File src = ldriver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/img[1]"))
					.getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir") + "/Screenshots/CaptchaCode.png";
			FileHandler.copy(src, new File(path));
			ITesseract image = new Tesseract();
			String imageText = image.doOCR(new File(path));
			String[] splitStr = imageText.trim().split("\\s+");
			System.out.println("Final Captcha is:" + splitStr);
			Thread.sleep(5000);
			ldriver.findElement(By.xpath("//input[@id='captcha']")).sendKeys(splitStr);
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Exception Cautch: " + e.getMessage());
		}
		Thread.sleep(2000);
		clickOnSubmitBtn.click();
		Thread.sleep(1000);
		try {
			Thread.sleep(1000);
			clickOnInstructionPopupCrossBtn.click();
		} catch (Exception e) {

		}
	}

	public String verifyCaseSubmissionSummaryMsg() {
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyCaseSubmissionSummaryText, 120);
		return verifyCaseSubmissionSummaryText.getText();
	}

	// Logout OnBoardX Account
	public void logoutOnBoardXAccount() {
		JavaScriptManuplator.waitForElementPresent(ldriver, clickOnProfile, 120);
		clickOnProfile.click();
		WebElement element = ldriver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[4]/ul[1]/li[2]/a[1]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
	}

	// Login functionalities of the Bridge Portal
	public void loginBridgeAccount(String username, String password) {
		JavaScriptManuplator.waitForElementPresent(ldriver, txtBridgeUserName, 120);
		txtBridgeUserName.sendKeys(username);
		txtBridgePassword.sendKeys(password);
		clickOnBridgeLogInBtn.click();
	}

	// Verify LogOut Button
	public String verifyLogOutBtn() {
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyLogOutBtn, 120);
		return verifyLogOutBtn.getText();
	}

	public void arsNumberSearch(String arsNumer) throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, selectSuperAdminRole, 120);
		JavaScriptManuplator.selectOptionFromDropDown(selectSuperAdminRole, "Super Admin");
		//Thread.sleep(3000);
		//clickOnDashboardModule.click();
		JavaScriptManuplator.waitForElementPresent(ldriver, txtArsNumberInSearch, 120);
		txtArsNumberInSearch.sendKeys(arsNumer);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnSearchBtn);
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyCaseListSearchResult, 120);
		Thread.sleep(1000);
	}

	// Case List - Search Result
	public String verifyCaseArsNumber() {
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyCaseArsNumber, 120);
		return verifyCaseArsNumber.getText();
	}

}
