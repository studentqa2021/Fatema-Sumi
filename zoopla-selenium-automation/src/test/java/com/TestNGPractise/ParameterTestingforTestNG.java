package com.TestNGPractise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestingforTestNG {

	@Test
	@Parameters("browser") 
	public void getbrowser(String browserValue) {
		
		System.out.println("parameter value found ="+browserValue);

	}

}
