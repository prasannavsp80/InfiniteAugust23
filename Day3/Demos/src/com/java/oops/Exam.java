package com.java.oops;

public class Exam {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Abhishek Mukherje");
		
		GoogleForum forum = new GoogleForum();
		forum.setName(student1.getName());
		forum.mcqTest(student1.getName());
		forum.questions();
		
		Hackthon hackthon = new Hackthon();
		hackthon.setLanguage(student1.getName());
		hackthon.setLimit();
	}
}
