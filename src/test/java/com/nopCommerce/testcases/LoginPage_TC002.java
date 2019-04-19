package com.nopCommerce.testcases;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.nopCommerece.utilites.XLUtils;
import com.nopCommerence.pageobjects.LoginPage;

public class LoginPage_TC002 extends BaseCLass
{

	

	@Test(dataProvider  ="LoginData")
	public void logintest(String user, String pwd) throws IOException
	{
	logger.info("*********TC Started**********************");
	driver.get(url);
	
	LoginPage lp=new LoginPage(driver);
	logger.info("*********Login info**********************");
	lp.setuname(user);
	lp.setpwd(pwd);
	lp.clicklogin();
	
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
	
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/TestData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);
			}
		}
		
		return logindata;
		
	}



	
}
