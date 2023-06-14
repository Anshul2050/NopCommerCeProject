package com.nop.testLayer;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.nop.baseTest4.BaseTest4;

public class BrokenLinkTest extends BaseTest4 {
	
	@Test
	public void test() {
		SoftAssert a = new SoftAssert();
		
		uc.ScrollBy(4000);
		
		ArrayList<Integer> codes = links_obj.getResponseCode();
		
		for(int i = 0; i<codes.size();i++ ) {
			
			
			a.assertTrue(codes.get(i)<400,"The link number "+i+ " with Text is broken with code " +codes.get(i));
	
		}
		a.assertAll();
	}

	@Test
	public void test2()
	{
		
		Assert.assertFalse(driver.findElement(By.xpath("gh")).isEnabled());
		
		
	}
	
}
