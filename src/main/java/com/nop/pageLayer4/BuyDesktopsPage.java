package com.nop.pageLayer4;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nop.utilities4.UtilClass4;

public class BuyDesktopsPage extends UtilClass4 {

	public WebDriver driver;

	public BuyDesktopsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(css = ".top-menu.notmobile li:nth-child(1) ul a")
	private WebElement computers_dd;
	
	

	@FindBy(css = ".top-menu.notmobile li:nth-child(1):nth-child(1) [href='/computers']")
	WebElement hover_On_Computers;

	@FindBy(id = "FirstName")
	WebElement fn;

	@FindBy(id = "LastName")
	WebElement ln;

	@FindBy(xpath = "//select[@name = 'DateOfBirthDay']")
	WebElement select_date;

	public void hoverToComputers_dd() {

		action_moveToElement(hover_On_Computers);

	}

	public void click_on_Desktops() {

		
		List<WebElement> computer_list = driver.findElements(By.cssSelector(".top-menu.notmobile li:nth-child(1) ul a"));
		System.out.println(computer_list);
		for(WebElement ele :computer_list ) {
			
			System.out.println(ele.getText());
		
		}

	}
}
