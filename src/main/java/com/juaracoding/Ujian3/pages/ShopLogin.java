package com.juaracoding.Ujian3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.Ujian3.driver.ShopDriverSingleton;

public class ShopLogin {
	
	private WebDriver driver;
	
	public ShopLogin() {
		this.driver = ShopDriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='username']")
	private WebElement username;
	
	@FindBy(xpath = "//*[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id='rememberme']")
	private WebElement btnLogin1;
	
	@FindBy(xpath = "//*[@id='customer_login']/div[1]/form/p[3]/button")
	private WebElement btnLogin2;	
	
	
	public void login(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		btnLogin1.click();
		btnLogin2.click();
		
	}

}
