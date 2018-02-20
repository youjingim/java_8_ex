package com.yj.m1;

import java.util.Scanner;

public class StudentGrade {
	
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

}
