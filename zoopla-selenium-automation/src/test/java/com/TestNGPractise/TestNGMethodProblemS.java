package com.TestNGPractise;

import org.testng.annotations.Test;

public class TestNGMethodProblemS {

	//dependsOnMethods = {"for sale"}
	@Test
	public void login() {
		System.out.println("This my login test");
	}

	@Test
	public void ForSale() {
		System.out.println("This my For sale selection test");
	}
	@Test
	public void HousePrices() {
		System.out.println("This is my House Prices test");
	}
	@Test
	public void AgencyFinder() {
		System.out.println("This is my agency finder test");
	}
	
	
}
