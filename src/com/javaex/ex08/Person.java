package com.javaex.ex08;

public class Person {

	private String name;
	private int age;
	
	
	
	public Person() {
		System.out.println("Person()");

	}
	public Person(String name, int age) {

		this.name = name;
		this.age = age;
		System.out.println("Person(2)");

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
		}
	public void showinfo() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("=================");
	}
	
}
