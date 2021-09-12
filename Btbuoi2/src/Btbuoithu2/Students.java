package Btbuoithu2;

import java.util.Scanner;

public class Students {
	private String name;
	private int age;
	private String lop;
	private int Math, Literature, English;
	
	public Students (String name, String lop, int age, int Math, int Literature, int English) {
		this.Math = Math;
		this.Literature = Literature;
		this.English = English;
		this.age = age;
		this.lop = lop;
		this.name = name;
	}
	public double ĐTB(){
		return (Math+Literature+English)/3;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName(String name) {
		return this.name;
	}
	public void setLop(String lop) {
		this.lop=lop;
	}
	public String getLop(String  lop) {
		return this.lop;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge(int age) {
		return this.age;
	}
	public void setToan(int Math) {
		this.Math = Math;
	}
	private double getToan() {
		return this.Math;
	}
	public void setVan(int Literature) {
		this.Literature = Literature;
	}
	private double getVan() {
		return this.Literature;
	}
	public void setTAnh(int English) {
		this.English = English;
	}
	private double getTAnh() {
		return this.English;
	}

}
