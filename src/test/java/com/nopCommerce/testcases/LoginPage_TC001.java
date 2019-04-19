package com.nopCommerce.testcases;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.nopCommerence.pageobjects.LoginPage;

public class LoginPage_TC001 extends BaseCLass
{

	@Test 
	public void logintest() throws IOException, InterruptedException
	{
	logger.info("*********TC Started**********************");
	driver.get(url);
	
	LoginPage lp=new LoginPage(driver);
	logger.info("*********Login info**********************");
	lp.setuname(username);
	lp.setpwd(password);
	lp.clicklogin();
	
	Thread.sleep(5000);
	
	if (driver.getTitle().contains("Dashboard / nopCommerce administration"))
	{
		logger.info("*********Login is successful**********************");
		Assert.assertTrue(true);
	}
	else 
	{
		logger.error("*********Login failed**********************");
		captureScreen( driver,  "logintest");
		Assert.assertTrue(false);
	}
	logger.info("*********TC completed**********************");
	}
	
}
