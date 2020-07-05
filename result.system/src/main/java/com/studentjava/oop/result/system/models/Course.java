package com.studentjava.oop.result.system.models;

public class Course {

	public String code;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getCreditHr() {
		return CreditHr;
	}
	public void setCreditHr(int creditHr) {
		CreditHr = creditHr;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public int CreditHr;
	public String grade;
	public String name;
	public double score;
}
