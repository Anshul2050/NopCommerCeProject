package com.nop.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nop.baseTest4.BaseTest4;

public class LoginFunctionalityTest extends BaseTest4 {

	
    @Test
    public void checkTest() throws InterruptedException
    {
       uc.goToLoginPage();
       login_obj.login_Email("tinkubadyan@gmail.com");
       login_obj.login_pwd("12345678");
       login_obj.click_remember_chck_Box();
       login_obj.click_login_btn();
    	
    }
	
    @Test
    public void checkTest2() throws InterruptedException
    {
       uc.goToLoginPage();
       login_obj.login_Email("tinkubadyan@gmail.com");
       login_obj.login_pwd("123");
       login_obj.click_remember_chck_Box();
       login_obj.click_login_btn();
    	
    }
	

}
