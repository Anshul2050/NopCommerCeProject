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
	private List<WebElement> computers_dd;

	@FindBy(xpath = "((//dl//ul)[1]//input)[1]")
	private WebElement select_HDD_320GB;
	@FindBy(xpath = "((//dl//ul)[1]//input)[2]")
	private WebElement select_HDD_400GB;

	@FindBy(xpath = "((//dl//ul)[2]//input)[1]")
	private WebElement select_OS_Vista_Home;
	@FindBy(xpath = "((//dl//ul)[2]//input)[2]")
	private WebElement select_OS_Vista_premium;

	@FindBy(xpath = "((//dl//ul)[3]//input)[1]")
	private WebElement select_Software_Ms_office;
	@FindBy(xpath = "((//dl//ul)[3]//input)[2]")
	private WebElement select_Software_Acrobat_Reader;
	@FindBy(xpath = "((//dl//ul)[3]//input)[3]")
	private WebElement select_Software_Total_cdr;

	@FindBy(id = "product_attribute_1")
	private WebElement select_Processor;

	@FindBy(id = "product_attribute_2")
	private WebElement select_RAM;

	@FindBy(css = ".top-menu.notmobile li:nth-child(1):nth-child(1) [href='/computers']")
	WebElement hover_On_Computers;

	@FindBy(xpath = "(//button[contains(text(),'Add to cart')])[1]")
	WebElement add_to_Cart;

	@FindBy(css = ".bar-notification.success p")
	WebElement sucessMessage;

	public void hoverToComputers_dd() {

		action_moveToElement(hover_On_Computers);

	}

	public void click_on_Desktops() {

		List<WebElement> computer_list = computers_dd;
		System.out.println(computer_list);
		for (WebElement ele : computer_list) {

			if (ele.getText().equals("Desktops")) {

				System.out.println(ele.getText().toLowerCase());
				ele.click();
				break;
			}
		}

	}

	public void click_AddToCart() {
		ScrollInto(add_to_Cart);
		add_to_Cart.click();

	}

	public void selectProcessor(String value) {

		ScrollBy(100);
		select_Processor.click();

		selectByName_Generic(select_Processor, value);

	}

	public void selectRAM(String value) {

		ScrollBy(50);
		select_RAM.click();

		selectByName_Generic(select_RAM, value);

	}

	public void select_HDD_320GB() {
		select_HDD_320GB.click();
	}

	public void select_OS_Vista_premium() {
		select_OS_Vista_premium.click();
	}

	public void select_Software_Ms_office() {
		select_Software_Ms_office.click();
	}

	public String getSuccessMessage() {
		return sucessMessage.getText();
	}

}
