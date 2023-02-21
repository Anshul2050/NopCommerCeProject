package com.nop.pageLayer4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nop.utilities4.UtilClass4;

public class LoginPage extends UtilClass4 {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	@FindBy(id = "Email")
	private WebElement user_email;

	@FindBy(id = "Password")
	private WebElement user_Pwd;

	@FindBy(id = "RememberMe")
	private WebElement remenbr_check_box;
	
	@FindBy(css = ".buttons .button-1.login-button")
	private WebElement login_btn;

	public void login_Email(String email) {
		user_email.sendKeys(email);
	}

	public void login_pwd(String pwd) {
		user_Pwd.sendKeys(pwd);
	}

	public void click_login_btn() {
		login_btn.click();
	}
	
	public void click_remember_chck_Box() {
		remenbr_check_box.click();
	}
	
	public void login_general(String email,String pwd) {
		user_email.sendKeys(email);
		user_Pwd.sendKeys(pwd);
		remenbr_check_box.click();
		login_btn.click();
		
		
	} 

}
