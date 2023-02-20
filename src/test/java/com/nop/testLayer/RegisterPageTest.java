package com.nop.testLayer;

import org.testng.annotations.Test;

import com.nop.baseTest4.BaseTest4;

public class RegisterPageTest extends BaseTest4 {
	
	
	@Test
	public void registerWithValidPwd(){
		
		uc.goToRegiterPage();
		System.out.println(uc.jsGetTitle());
		
		rp_obj.input_user_basic_details("tinku", "dubey","10", "July", "1992", "tinku@gmail.com");
		rp_obj.company("infosys");
		rp_obj.password("12345678");
		rp_obj.confm_password("12345678");
		rp_obj.clickOnRegBttn();
		
		
		
		
		
	}
	
	

}
