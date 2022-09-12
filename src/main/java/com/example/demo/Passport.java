package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
@Entity
@Data
public class Passport {
@Id
private int id;
private String number;
@OneToOne(cascade = CascadeType.ALL)
private Student student;
public Passport() {
	//TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public Passport(String number, Student student) {
	super();
	this.number = number;
	this.student = student;
}
}

