package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

public class BaseLogin {

public MasterPageFactory getlogin(WebDriver driver) {
MasterPageFactory pf = new MasterPageFactory(driver);
	
Screenshot.getScreenShot(driver, "Home page");
if(pf.getAcceptAllCookiesBtn().isDisplayed()) {
	Highlighter.addColor(driver,pf.getAcceptAllCookiesBtn() );
	pf.getAcceptAllCookiesBtn().click();
	}
 pf.getFirstSigninBtn().click();
 pf.getEmail().sendKeys(new BaseConfig().getData("user"));
 pf.getPassword().sendKeys(new BaseConfig().getData("password"));
 pf.getSecondSigninBtn().click();
 try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 Actions ac = new Actions(driver);
 ac.moveToElement(pf.getMyZooplaBtn()).perform();
 
 if(pf.getSignOutBtn().isDisplayed()) {
	System.out.println("Test passed");
	Assert.assertTrue(pf.getSignOutBtn().isDisplayed());
 }
 else {System.out.println("Test failed");
	Assert.assertTrue(pf.getSignOutBtn().isDisplayed());	 
	 }
return pf;
 }
public static void main(String[] args) {
	
DriverManager dm = new DriverManager();
WebDriver driver = dm.getDriver();
BaseLogin bl = new BaseLogin();
bl.getlogin(driver);

      }
}