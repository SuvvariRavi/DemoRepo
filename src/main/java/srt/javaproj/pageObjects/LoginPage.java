package srt.javaproj.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "email")
	WebElement txtuserName;

	@FindBy(name = "pass")
	WebElement txtPassword;

	@FindBy(css = "#u_0_b")
	WebElement btnLogin;

	public void setUserName(String uname) {

		txtuserName.sendKeys(uname);
	  }

	public void setPassword(String pwd) {

		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {

		btnLogin.click();
	}

}
