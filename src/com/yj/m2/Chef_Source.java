package com.yj.m2;

public class Chef_Source {
	public Food_Source makeSource(int sel) {
		Food_Source source = new Food_Source();
		switch(sel) {
		case 1 :
			source.oilName = "Olive";
			source.spiceName = "Hub";
			break;
		case 2 :
			source.oilName = "Milk";
			source.spiceName = "Cheese";
			break;
		default :

		}
		return source;
	}


}