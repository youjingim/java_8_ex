package com.yj.m1;

import java.util.Scanner;

public class SchoolController {
	
	//메서드명은 start
	//리턴은 x
	//내용은
	//1. 학생등록
	//2. 성적입력
	//3. 성적조회
	//4. 전체조회
	//5. 프로그램종료
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int sel;
		while (check) {
			System.out.println("1. 학생 등록");
			System.out.println("2. 성적 입력");
			System.out.println("3. 성적 조회");
			System.out.println("4. 전체 조회");
			System.out.println("5. 프로그램 종료");

			sel = sc.nextInt();
			
			switch(sel) {
			case 1 : 
				System.out.println("학생 등록");
				break;
			case 2 : 
				System.out.println("성적 입력");
				break;
			case 3 :
				System.out.println("성적 조회");
				break;
			case 4 : 
				System.out.println("전체 조회");
				break;
			case 5 : 
				System.out.println("프로그램 종료");
				check = false;
				break;
				default : 
					System.out.println("정상입력이 아닙니다.");
					
			} // switch 문의 끝
			
			
			
		} // while 문의 끝
		
		
	} // 메소드의 끝

} // 클레스의 끝
