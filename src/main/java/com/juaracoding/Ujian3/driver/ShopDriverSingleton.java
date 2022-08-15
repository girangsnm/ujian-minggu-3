package com.juaracoding.Ujian3.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.juaracoding.Ujian3.drivers.strategie.ShopDriverStrategy;
import com.juaracoding.Ujian3.drivers.strategie.ShopDriverStrategyImplementer;
public class ShopDriverSingleton {
	
	private static ShopDriverSingleton instance = null;
	private static WebDriver driver;
	
	private ShopDriverSingleton(String driver) {
		instantiate(driver);
	}
	
	public WebDriver instantiate(String strategy) {
		ShopDriverStrategy shopDriverStrategy = ShopDriverStrategyImplementer.chooseStrategy(strategy);
		driver = shopDriverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	public static ShopDriverSingleton getInstance(String driver) {
		if(instance == null) {
			instance = new ShopDriverSingleton(driver);
		}
		
		return instance;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	
}
