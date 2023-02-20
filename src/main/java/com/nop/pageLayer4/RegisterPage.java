package com.nop.pageLayer4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nop.utilities4.UtilClass4;

public class RegisterPage extends UtilClass4 {

	public WebDriver driver;

	public RegisterPage(WebDriver driver) {
        super(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	@FindBy(id = "gender-male")
	WebElement radio_Male;

	@FindBy(id = "gender-female")
	WebElement radio_Female;

	@FindBy(id = "FirstName")
	WebElement fn;

	@FindBy(id = "LastName")
	WebElement ln;

	@FindBy(xpath = "//select[@name = 'DateOfBirthDay']")
	WebElement select_date;

	@FindBy(xpath = "//select[@name = 'DateOfBirthMonth']")
	WebElement select_month;

	@FindBy(xpath = "//select[@name = 'DateOfBirthYear']")
	WebElement select_year;

	@FindBy(xpath = "(//input[@type = 'email'])[1]")
	WebElement user_email;

	@FindBy(id = "Company")
	WebElement user_company;

	@FindBy(id = "Newsletter")
	WebElement newsLetter_chkbox;

	@FindBy(id = "Password")
	WebElement pwd;

	@FindBy(id = "ConfirmPassword")
	WebElement confm_pwd;

	@FindBy(id = "register-button")
	WebElement reg_btn;
	
	@FindBy (css = ".ico-register")
	WebElement reg_page_link;

	public void input_user_basic_details(String fname, String lname, String date, String month, String year,String email) {
		radio_Male.click();
		fn.sendKeys(fname);
		ln.sendKeys(lname);
		select_date.sendKeys(date);
		select_month.sendKeys(month);
		select_year.sendKeys(year);
		ScrollInto(user_email);
		user_email.sendKeys(email);
	    

	}
	public void company(String company) {
		user_company.sendKeys(company);
		newsLetter_chkbox.click();
		
	}
	
	
	public void password(String password) {
		ScrollInto(pwd);
		pwd.sendKeys(password);
		
		
	}
	
	public void confm_password(String conf_password) {
		confm_pwd.sendKeys(conf_password);
		
	}
	
	public void clickOnRegBttn(){
		reg_btn.click();
	}

   
}
