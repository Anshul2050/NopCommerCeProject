package com.nop.utilities4;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.nop.baseTest4.BaseTest4;

public class General extends BaseTest4 {
	
	 

	
	 
//	@Test
	public void test() throws InterruptedException {
		
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		Thread.sleep(3000);
		System.out.println("Hello");
		System.out.println(uc.jsGetUrl());
		System.out.println("World");
	}
}
