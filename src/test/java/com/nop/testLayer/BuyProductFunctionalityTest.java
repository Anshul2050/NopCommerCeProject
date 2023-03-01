package com.nop.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nop.baseTest4.BaseTest4;

public class BuyProductFunctionalityTest extends BaseTest4 {
	
	
	@Test
	public void buyDeskTop() throws InterruptedException {
		uc.goToLoginPage();
		login_obj.login_general("tinku@gmail.com", "12345678");
		
		
		bdp_obj.hoverToComputers_dd();
		
		bdp_obj.click_on_Desktops();
		bdp_obj.click_AddToCart();
		
		
		bdp_obj.selectRAM("4GB [+$20.00]");
		
		bdp_obj.select_HDD_320GB();
		bdp_obj.select_OS_Vista_premium();
		bdp_obj.select_Software_Ms_office();
		
		bdp_obj.click_AddToCart();
		System.out.println(bdp_obj.getSuccessMessage());
		
		Assert.assertEquals(bdp_obj.getSuccessMessage(), "The product has been added to your shopping cart");
		
	
	}
	
	

}
