package com.nopCommerce.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopCommerence.pageobjects.AddCustomerPage2;
import com.nopCommerence.pageobjects.LoginPage;

public class AddCustomer extends BaseCLass
{

@Test
public void AddnewCustomer() throws IOException
{
	
	driver.get(url);
	
	LoginPage lp=new LoginPage(driver);
	
	lp.setuname(username);
	lp.setpwd(password);
	lp.clicklogin();
	
	AddCustomerPage2  customer = new AddCustomerPage2(driver);
	
	customer.clicklnkcustomer();
	customer.clicklnkcustomermenu();
	customer.addcustomer();
	
	String email = randomestring()+"@gmail.com";
	customer.setemail(email);
	customer.setPassword(password);
	customer.setroles();
	customer.setvendor("Vendor 2");
	customer.setgender("Male");
	customer.setfirstname("han");
	customer.setlastname("maher");
	customer.setdobe("7/05/1985");
	customer.setcompany("kjhuukh");
	customer.setcomment("klhsdikhdkhwdhw");
	
	customer.savecustomer();
	
	//validation
	
	String msg = driver.findElement(By.tagName("body")).getText();
	if (msg.contains("successfully"))
	{
		Assert.assertTrue(true);
	}
	else 
	{
		Assert.assertTrue(false);
		captureScreen(driver, "AddnewCustomer");
	}
}
	
}
