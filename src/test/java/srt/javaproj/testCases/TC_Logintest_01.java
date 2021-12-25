package srt.javaproj.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import srt.javaproj.pageObjects.BaseClass;
import srt.javaproj.pageObjects.LoginPage;

public class TC_Logintest_01 extends BaseClass {
	
    @Test
	public void loginTest() {
		
    	driver.get(baseURL);
    	maximize();
    	logger.info("url opened");
    	LoginPage lp = new LoginPage(driver);
    	
    	lp.setUserName(username);
    	logger.info("Entered username");
    	lp.setPassword(password);
    	logger.info("Entered password");
    	Wait();
    	lp.clickLogin();
    	
    	String facebook_Title= driver.getTitle();
    	Assert.assertTrue(facebook_Title.contains("Facebook"));
    	System.out.println(facebook_Title);
    	logger.info("Login test passed");
    	Wait();
   
    	
	}
} 