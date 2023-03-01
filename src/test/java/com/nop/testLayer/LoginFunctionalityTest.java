package com.nop.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nop.baseTest4.BaseTest4;

public class LoginFunctionalityTest extends BaseTest4 {

	
    @Test(dataProviderClass=com.nop.utilities4.ExcelInuse.class ,dataProvider="dp")
    public void checkTest(String email ,String password) throws InterruptedException
    {
       uc.goToLoginPage();
       login_obj.login_Email(email);
       login_obj.login_pwd(password);
       login_obj.click_remember_chck_Box();
       login_obj.click_login_btn();
    	
    }
	
   
	

}
