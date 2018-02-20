package com.yj.m1;

public class StudentView {
	// 학생들의 정보를 출력
	// 메서드명 view
	// 학생들의 
	
	public void view(Student [] student) {
		
		for(int i=0;i<student.length;i++) {
			System.out.println("이름 : " + student[i].name);
			System.out.println("번호 : " + student[i].num);
			System.out.println("국어 : " + student[i].kor);
			System.out.println("영어 : " + student[i].eng);
			System.out.println("수학 : " + student[i].math);
			System.out.println("총점 : " + student[i].total);
			System.out.println("평균 : " + student[i].math);

		}
		
		
		
	}

}
