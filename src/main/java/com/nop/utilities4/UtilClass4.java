package com.nop.utilities4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.nop.baseTest4.BaseTest4;

public class UtilClass4 extends BaseTest4 {

	public WebDriver driver;

	public UtilClass4(WebDriver driver) {
		this.driver = driver;

	}

	JavascriptExecutor js;

	public void ScrollBy( int pixels) {

		 js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + pixels + ")");

	}

	public void ScrollInto(WebElement element) {
		try {
			js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			logger.info("scrollIntoView operation has been performed for the locator : " + String.valueOf(element));
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error encountered i.e : " + " while performing scrollIntoView on the element : " + element);
		}
	}

	public void getElementById() {

	}

	public void jsClickByXpath(String element) {
		driver.findElement(By.xpath("Xpath_OF_Element"));

		js.executeScript("arguments[0].click();", element);
	}

	public String jsGetUrl() {
		js = (JavascriptExecutor) driver;
		String url = js.executeScript("return document.URL;").toString();
		return url;

	}

	public String jsGetTitle() {

		js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title;").toString();
		return title;

	}

	public String jsGetDomain() {
		js = (JavascriptExecutor) driver;
		String domain = js.executeScript("return document.domain;").toString();
		return domain;

	}

	public void dd_SelectByName(WebElement element, String date, String month, String year) {

		Select s = new Select(element);
		s.selectByVisibleText(date);
		s.selectByVisibleText(month);
		s.selectByVisibleText(year);
	}

	public void selectByName_Generic(WebElement element, String value) {

		Select s = new Select(element);
		s.selectByVisibleText(value);
		
	}

	public void goToRegiterPage() {

		driver.findElement(By.cssSelector(".ico-register")).click();

	}

	public void goToLoginPage() {

		driver.findElement(By.cssSelector(".ico-login")).click();

	}

	public void goToWishListPage() {

		driver.findElement(By.cssSelector("ico-wishlist")).click();

	}

	public void action_moveToElement(WebElement element) {

		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}

}
