package com.TestNGPractise;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGEnable_DisableAnyTest {

	WebDriver driver;

	@BeforeTest
	public void setup() throws Throwable {
		System.out.println("This before test = setup");
	}
	@Test()
	public void getLogin() {
		System.out.println("This my login test");
	}
	@Test()
	public void ForSale() {
		System.out.println("This is for Sale selection test");
	}
	@Test(enabled = false)
	public void HousePrices () {//do not run or disable or stop
		System.out.println("This is my House Price Selection test");
	}
	@Test()
	public void FindAgency() {
		System.out.println("This is my agency finder test");
	}
	@AfterTest
	public void teardown() {
		System.out.println("After Test = any thing close");
	}
}
