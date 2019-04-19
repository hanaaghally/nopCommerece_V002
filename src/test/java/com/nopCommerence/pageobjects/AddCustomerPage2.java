package com.nopCommerence.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage2 
{
public WebDriver ldriver;
 
 public AddCustomerPage2(WebDriver rdriver)
 {
	 ldriver=rdriver;
	 PageFactory.initElements(ldriver,  this);
 }
 
 By lnkcustomers=By.xpath("/html/body/div[3]/div[2]/div/ul/li[4]/a/span");
 By lnkcustomers_menuitem= By.xpath("/html/body/div[3]/div[2]/div/ul/li[4]/ul/li[1]/a/span");
 By btnaddcustomer= By.xpath("/html/body/div[3]/div[3]/div/form[1]/div[1]/div/a");
 
 By txtemail= By.id("Email");
 By txtpwd= By.id("Password");
 
 By lstroles = By.xpath("//*[@id=\"tab-info\"]/div/div/div/div[3]/div[2]/div/div[1]/div");
 
 By lstitem1= By.xpath("//*[@id=\"SelectedCustomerRoleIds\"]/option[1]");
 By lstitem2= By.xpath("//*[@id=\"SelectedCustomerRoleIds\"]/option[2]");
 By lstitem3= By.xpath("//*[@id=\"SelectedCustomerRoleIds\"]/option[3]");
 By lstitem4= By.xpath("//*[@id=\"SelectedCustomerRoleIds\"]/option[4]");
 By lstitem5= By.xpath("//*[@id=\"SelectedCustomerRoleIds\"]/option[5]");
 
 By lstvendor= By.id("VendorId");

 By rdmale = By.id("Gender_Male");
 By rdfemale = By.id("Gender_Female");
 
 By txtfname = By.id("FirstName");
 By txtlname = By.id("LastName");
 By txtdob= By.id("DateOfBirth");
 By txtcompany = By.id("Company");
 By txtcomment = By.id("AdminComment");
 
 By chactive = By.id("Active");
 
By btnSave=By.xpath("//button[@name='save']");
 
public void clicklnkcustomer()
{
	ldriver.findElement(lnkcustomers).click();
}
 
public void clicklnkcustomermenu()
{
	ldriver.findElement(lnkcustomers).click();
}
 
public void addcustomer()
{
	ldriver.findElement(btnaddcustomer).click();
}
 
public void setemail( String email)
{
	ldriver.findElement(txtemail).sendKeys(email);
}
 
public void setPassword(String password)
{
	ldriver.findElement(txtpwd).sendKeys(password);
}

public void setroles()
{
	ldriver.findElement(lstroles).click();
	ldriver.findElement(By.xpath("//*[@id=\\\"SelectedCustomerRoleIds\\\"]/option[1]")).click();
}

public void setvendor(String value)
{
	
	Select vendor = new Select (ldriver.findElement(lstvendor));
	vendor.selectByVisibleText(value);
	
}

public void setgender(String gen)
{
	
	if (gen.equals("Male"))
	{
		ldriver.findElement(rdmale).click();
	}
	else if (gen.equals("Female"))
	{
		ldriver.findElement(rdfemale).click();
	}
	else 
	{
		ldriver.findElement(rdmale).click();
	}
}

public void setfirstname(String fname)
{
	ldriver.findElement(txtfname).sendKeys(fname);
}

public void setlastname(String lname)
{
	ldriver.findElement(txtlname).sendKeys(lname);
}
 

public void setdobe(String dob)
{
	ldriver.findElement(txtdob).sendKeys(dob);
}

public void setcompany(String company)
{
	ldriver.findElement(txtcompany).sendKeys(company);
}

public void setcomment(String comment)
{
	ldriver.findElement(txtcomment).sendKeys(comment);
}

public void savecustomer()
{
	ldriver.findElement(btnSave).click();
}
























}