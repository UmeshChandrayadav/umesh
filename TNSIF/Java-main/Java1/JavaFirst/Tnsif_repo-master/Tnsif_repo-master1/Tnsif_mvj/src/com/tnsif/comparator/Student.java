package com.tnsif.comparator;

public class Student {
	int rollno;
	String name,adress;
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", adress=" + adress + "]";
	}
	public Student(int rollno, String name, String adress) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.adress = adress;
	}
	

}