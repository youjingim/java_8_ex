package com.yj.m2;

import java.util.Scanner;

public class Menu {
	
	public void order() {
		System.out.println("1.안심스테이크");
		System.out.println("2.등심스테이크");
		System.out.println("3.립스테이크");
		System.out.println("4.크림파스타");
		System.out.println("5.로제파스타");
		System.out.println("6.알리올리오");
		Scanner sc = new Scanner(System.in);
		Chef_Steak steak = new Chef_Steak();
		Chef_pasta pasta = new Chef_pasta();
		Bill bill = new Bill();
		int sel = sc.nextInt();
		
		switch(sel) {
		case 1:
		case 2:
		case 3:
			Food_Steak steak1 = steak.makeSteak(sel);
			bill.billSteak(steak1);
			break;
		case 4:
		case 5:
		case 6:
			Food_Pasta pasta1 = pasta.makePasta(sel-3);
			bill.billPasta(pasta1);


			break;
			
			
		}
		
		
	}

}
