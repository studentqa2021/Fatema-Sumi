package com.TestNGPractise;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.BaseLogin;
import com.generic.DriverManager;
import com.generic.MasterPageFactory;

public class SmokeTestforTestNG {

	WebDriver driver;
	MasterPageFactory obj;

	@BeforeTest
	public void getDriverSetup() throws Throwable {
		System.out.println("SetUp");
	}

	@Test(priority=0)
	public void getLogin() throws Throwable {

		System.out.println("Login");
	}

	@Test(priority=3)
	public void forSale() throws Throwable {
System.out.println("For Sale");
	}

@Test(priority=4)
public void ToRent() throws Throwable {
	System.out.println("To Rent");	
}
@Test (priority=2)
public void HousePrices() throws Throwable{
	System.out.println(" House Prices");
}
	
	@AfterTest
	public void teardown() {
		System.out.println("Close");

	}

}
