package com.masai.qustion1;

public class Student {
	private int rool;
	private String name;
	private int mark;
	private char grade;
	
	

	public int getRool() {
		return rool;
	}



	public void setRool(int rool) {
		this.rool = rool;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMark() {
		return mark;
	}



	public void setMark(int mark) {
		this.mark = mark;
	}



	public char getGrade() {
		return grade;
	}



	public void setGrade(char grade) {
		this.grade = grade;
	}



	Student() {

	}

	public void displayDetails() {
		System.out.println("Your Grade is "+" "+getGrade());
		
	}

	public Student(int rool, String name, int mark, char grade) {
		this.rool = rool;
		this.name = name;
		this.mark = mark;
		this.grade = grade;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "StudentBean{" +
				"rool=" + rool +
				", name=" + name +
				", mark=" + mark +
				", grade=" + grade +
				'}';
	}
}
