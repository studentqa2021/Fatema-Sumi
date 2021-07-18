package com.TestNGPractise;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGMethodProblemSolutions {

	WebDriver driver;

	@BeforeTest
	public void setup() throws Throwable {
		System.out.println("This before test login");
	}
	@Test()// do nothing
	public void ForSale() {
		System.out.println("This my for Sale selection test");
	}
	@Test(dependsOnMethods = {"For Sale"})
	public void HousePrices() {
		System.out.println("This is my House Prices test");
	}
	@Test(dependsOnMethods = {"House Prices"})
	public void FindAgency() {
		System.out.println("This is my agency finder test");
	}
	@AfterTest
	public void teardown() {
		System.out.println("After Test = any thing close");
	}
}
