package com.nop.testLayer;

import org.testng.annotations.Test;

import com.nop.baseTest4.BaseTest4;

public class BuyProductFunctionalityTest extends BaseTest4 {
	
	
	
	
	
	@Test
	public void buyDeskTop() throws InterruptedException {
		uc.goToLoginPage();
		login_obj.login_general("tinkubadyan@gmail.com", "12345678");
		
		
		bdp_obj.hoverToComputers_dd();
		Thread.sleep(2000);
		bdp_obj.click_on_Desktops();
		
	}
	
	

}
