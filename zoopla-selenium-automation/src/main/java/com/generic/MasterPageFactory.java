package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver)	{
	PageFactory.initElements(driver,this);	
		}

@FindBy (xpath = "(//*[contains(text(),'Accept all cookies')])[2]")
private WebElement acceptAllCookiesBtn;


@FindBy (xpath = "(//*[@class='css-1rwrl3a e1niaah1'])[1]")
private WebElement firstSigninBtn;


@FindBy (xpath = "//*[@name='email']")
private WebElement email;


@FindBy (xpath = "//*[@name='password'] ")
private WebElement password;


@FindBy (xpath = "(//*[contains(text(),'Sign in') ])[10]")
private WebElement secondSigninBtn;


@FindBy (xpath = "(//*[@class='css-18ufi8 e1niaah3'])[1]")
private WebElement MyZooplaBtn;


@FindBy (xpath = "(//*[@class='esdwd6d0 css-wxwl91-StyledLink-Link e33dvwd0'])[5]")
private WebElement SignOutBtn;


public WebElement getAcceptAllCookiesBtn() {
	return acceptAllCookiesBtn;
}


public WebElement getFirstSigninBtn() {
	return firstSigninBtn;
}


public WebElement getEmail() {
	return email;
}


public WebElement getPassword() {
	return password;
}


public WebElement getSecondSigninBtn() {
	return secondSigninBtn;
}

public WebElement getMyZooplaBtn() {
	return MyZooplaBtn;
}


public WebElement getSignOutBtn() {
	return SignOutBtn;
}	

}
