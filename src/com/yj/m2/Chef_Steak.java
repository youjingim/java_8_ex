package com.yj.m2;

public class Chef_Steak {
	public Food_Steak makeSteak(int sel) {
		
		//1. 안심 스테이크 , 30000 , 1
		//2. 등심 스테이크 , 40000 , 2
		//3. 립 스테이크 , 50000 , 1
		
		Food_Steak steak = new Food_Steak();
		Chef_Source c = new Chef_Source();
		switch(sel) {
		case 1 : 
			steak.name = "안심스테이크";
			steak.price = 30000;
			steak.source = c.makeSource(1);
			break;
		case 2 : 
			steak.name = "등심스테이크";
			steak.price = 40000;
			steak.source = c.makeSource(2);
			break;
		case 3 : 
			steak.name = "립스테이크";
			steak.price = 50000;
			steak.source = c.makeSource(1);
			break;
			default:
				
		}
		
		
		
		return steak;
		
		
	}

}
