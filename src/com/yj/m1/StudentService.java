package com.yj.m1;

import java.util.Scanner;

public class StudentService {
	
	// 학생 추가 메서드
	// 메서드명 addStudent
	// 학생의 인원수를 입력하세요
	// 학생 수 만큼
	// 이름입력
	// 번호입력
	
	public Student [] addStudent() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하시오");
		int number = sc.nextInt();
		Student [] student = new Student[number];
		for(int i=0;i<number;i++) {
			Student s = new Student();
			System.out.println(i+1+"번 학생의 이름을 입력하시오");
			s.name = sc.next();
			System.out.println(i+1+"번 학생의 번호를 입력하시오");
			s.num = sc.nextInt();
			student[i] = s;
			
		}
		return student;
		
		
		
	}

}
