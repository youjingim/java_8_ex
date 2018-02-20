package com.yj.m1;

public class GradeView {
	
	public void view1(Student [] student) {
		
		for(int i=0;i<student.length;i++) {
		System.out.println(i+1+"번 학생 국어 성적 : " + student[i].kor);
		System.out.println(i+1+"번 학생 영어 성적 : " + student[i].eng);
		System.out.println(i+1+"번 학생 수학 성적 : " + student[i].math);
		}
		
		
	}

}
