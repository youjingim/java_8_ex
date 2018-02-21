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
	public void grade(Student [] student) {
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<student.length;i++) {
			System.out.println(i+1 + "번 학생 국어 성적을 입력하세요");
			student[i].kor = sc.nextInt();
			System.out.println(i+1 + "번 학생 영어 성적을 입력하세요");
			student[i].eng = sc.nextInt();
			System.out.println(i+1 + "번 학생 수학 성적을 입력하세요");
			student[i].math = sc.nextInt();
			student[i].total = student[i].kor + student[i].eng + student[i].math;
			student[i].avg = student[i].total / 3.0;
		}


	}
	public int search(Student [] student1) {
		Scanner sc = new Scanner(System.in);
		int sel;
		boolean check = true;
		int i=0;
		while(check) {
			System.out.println("번호를 입력하시오 : ");
			sel = sc.nextInt();
			for(i=0;i<student1.length;i++) {
				if(sel == student1[i].num) {
					check=false;
					break;
					
				}
			}
			
		}
		return i;
	}



}


