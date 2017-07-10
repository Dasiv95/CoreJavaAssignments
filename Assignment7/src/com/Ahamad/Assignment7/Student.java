package com.Ahamad.Assignment7;

public class Student {

	String id;
	String name;
	int marks;
	double fees;
	
	Student(String id,String name,int marks,double fees){
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.fees = fees;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFee() {
		return fees;
	}
	public void setFee(double fee) {
		this.fees = fees;
	}
}
