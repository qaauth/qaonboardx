package com.onboardx.pageobject;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.onboardx.utilities.JavaScriptManuplator;

public class VendorEmailVerification {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;
	public VendorEmailVerification(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Candidate Email Verification
	@FindBy(xpath = "//a[contains(text(),'JSPL - Vendor Registration Form')]")
	@CacheLookup
	WebElement verifyJSPLVendorRegistrationForm;

	@FindBy(xpath = "//a[contains(text(),'JSPL - Vendor Registration Form')]")
	@CacheLookup
	WebElement clickJSPLVendorRegistrationForm;

	@FindBy(tagName = "tagName")
	@CacheLookup
	WebElement clickOnIframe;

	// Action Methods for the Mailinator
	public String verifyMailinatorMailSubject() {
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyJSPLVendorRegistrationForm, 120);
		return verifyJSPLVendorRegistrationForm.getText();	
	}
	public void mailinatorVerificationMail() throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, clickJSPLVendorRegistrationForm, 120);
		clickJSPLVendorRegistrationForm.click();
		Thread.sleep(1000);
	}

	public void getUserNameAndPassword() {
		
		ldriver.switchTo().frame(ldriver.findElement(By.tagName("iframe")));

		List<WebElement> lst = ldriver.findElements(By.tagName("p"));
		String[] usernameAndPassword = new String[2];

		for (int i = 0; i < lst.size(); i++) {
			JavascriptExecutor js = (JavascriptExecutor) ldriver;
			js.executeScript("arguments[0].scrollIntoView(true);", ((WebElement) lst.get(i)));
			if (lst.get(i).getText().contains("_")) {
				usernameAndPassword[0] = lst.get(i).getText();
				usernameAndPassword[1] = lst.get(i + 2).getText();
				System.out.print(usernameAndPassword);
				try {
		        	File output = new File("UsernameAndPassword.txt");
		        	FileWriter writer = new FileWriter(output);
		        	writer.write(lst.get(i).getText()+" "+lst.get(i+2).getText());
		        	writer.flush();
		        	writer.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}

