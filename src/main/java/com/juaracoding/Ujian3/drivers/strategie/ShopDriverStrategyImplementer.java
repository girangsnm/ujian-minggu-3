package com.juaracoding.Ujian3.drivers.strategie;

public class ShopDriverStrategyImplementer {
	
	public static ShopDriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case "Chrome":
			return new Chrome();
			
		case "Firefox":
			return new Firefox();
						
		default:
			return null;
		}
	}

}
