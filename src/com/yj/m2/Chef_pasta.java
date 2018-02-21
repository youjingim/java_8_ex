package com.yj.m2;

public class Chef_pasta {
	
	//메서드명 makePasta
	//1. 크림파스타 , 15000 , 2번 소스
	//2. 로제파스타 , 20000 , 1번 소스
	//3. 알리올리오 , 30000 , 1번 소스
	
	public Food_Pasta makePasta(int sel) {
		
		Food_Pasta pasta = new Food_Pasta();
		Chef_Source source = new Chef_Source();
		switch(sel) {
		case 1: 
			pasta.name = "크림파스타";
			pasta.price = 15000;
			pasta.source = source.makeSource(2);
			break;
		case 2: 
			pasta.name = "로제파스타";
			pasta.price = 20000;
			pasta.source = source.makeSource(1);
			break;
		case 3:
			pasta.name = "알리올리오";
			pasta.price = 30000;
			pasta.source = source.makeSource(1);
			break;
			default :
				
		}
		
		return pasta;
		
	}

}
