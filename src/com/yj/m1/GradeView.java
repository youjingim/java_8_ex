package com.yj.m1;

import java.util.Scanner;

public class GradeView {

	public void view1(Student [] student) {
		Scanner sc = new Scanner(System.in);
		int sel;
		boolean check = true;
		while(check) {
			System.out.println("번호를 입력하시오 : ");
			sel = sc.nextInt();
			for(int i=0;i<student.length;i++)
				if(sel == student[i].num) {
					System.out.println("이름 : " + student[i].name);
					System.out.println("번호 : " + student[i].num);
					System.out.println("국어 : " + student[i].kor);
					System.out.println("영어 : " + student[i].eng);
					System.out.println("수학 : " + student[i].math);
					System.out.println("총점 : " + student[i].total);
					System.out.println("평균 : " + student[i].math);
					check = false;
					i=10;
				}

			System.out.println("찾으시는 번호가 없습니다.");

		}



	}

}
