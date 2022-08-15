package com.juaracoding.Ujian3.main;

import org.openqa.selenium.WebDriver;

import com.juaracoding.Ujian3.driver.ShopDriverSingleton;
import com.juaracoding.Ujian3.pages.ShopLogin;
import com.juaracoding.Ujian3.pages.ShopRegister;

public class MainShop {
	
	public static void main(String[] args) {
		
		ShopDriverSingleton.getInstance("Chrome");
		WebDriver driver = ShopDriverSingleton.getDriver();
		String url = "https://shop.demoqa.com/my-account/";
		driver.get(url);
		
		ShopRegister shopRegister = new ShopRegister();
		shopRegister.register("Girang", "girang123@gmail.com", "girang123");
		
		delay(10);
		
		ShopLogin shopLogin = new ShopLogin();
		shopLogin.login("Girang","girang123");
		
		delay(15);
		driver.quit();
	}
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
