package com.TestNGPractise;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGMainAnnotations  {
	@AfterTest
	public void teardown() {
		
		
		System.out.println("This is my @AfterTest");
	}
	
	@Test
	public void forsale() {
		
		System.out.println("this is my @test for dress");
	}
	
	
	@BeforeTest
	public void setup() 
	{
		
		System.out.println("This is @BeforeTest");
	}
	
	
}
