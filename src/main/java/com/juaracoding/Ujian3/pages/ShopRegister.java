package com.juaracoding.Ujian3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.Ujian3.driver.ShopDriverSingleton;

public class ShopRegister {
	
	private WebDriver driver;
	
	public ShopRegister() {
		this.driver = ShopDriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"reg_username\"]")
	private WebElement username;
	
	@FindBy(xpath = "//*[@id=\"reg_email\"]")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id=\"reg_password\"]")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")
	private WebElement btnRegister;
	
	public void register(String username, String email, String password) {
		this.username.sendKeys(username);
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		btnRegister.click();
	}

}
