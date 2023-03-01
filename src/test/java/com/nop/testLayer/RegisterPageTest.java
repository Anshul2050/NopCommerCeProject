package com.nop.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nop.baseTest4.BaseTest4;
import com.nop.utilities4.ExcelInuse;

public class RegisterPageTest extends BaseTest4 {
	
	
	@Test
	public void registerWithValidPwd(){
		
		uc.goToRegiterPage();
		System.out.println(uc.jsGetTitle());
		
		rp_obj.input_user_basic_details("tinku", "dubey","10", "July", "1992", "tinkuabc@gmail.com");
		rp_obj.company("infosys");
		rp_obj.password("12345678");
		rp_obj.confm_password("12345678");
		rp_obj.clickOnRegBttn();
		
		Assert.assertEquals(rp_obj.getSuccessMessage(), "Your registration completed");
		
		ExcelInuse.writedata("tinku", "dubey","tinkuabc@gmail.com","infosys","12345678","12345678");
		System.out.println(rp_obj.getSuccessMessage());
		
		
		
	}
	
	@Test
	public void registerWithValidPwd2(){
		
		uc.goToRegiterPage();
		System.out.println(uc.jsGetTitle());
		
		rp_obj.input_user_basic_details("tinku", "dubey","10", "July", "1992", "tinkubadgaiyyan@gmail.com");
		rp_obj.company("infosys");
		rp_obj.password("12345678");
		rp_obj.confm_password("12345678");
		rp_obj.clickOnRegBttn();
		
		
		
		
		
	}
	
	

}
