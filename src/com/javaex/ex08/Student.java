package com.javaex.ex08;

public class Student extends Person {
	private String schoolName;
	
	

	public Student() {
		System.out.println("Student()");
	}

	public Student(String schoolName) {
//		super("노나연",26); 
		this.schoolName = schoolName;
		System.out.println("Student(1)");
		
	}
	
	public Student(String name, int age, String schoolName) {
		super(name,age);//부모에 이미 있어서 이렇게 썻어요
		/*super.name=name;//부모꺼에 이름을 넣어줄꺼예요 
		super.age=age;*/
		this.schoolName=schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public void showinfo() {
//		System.out.println("학교명: "+schoolName);
		/*System.out.println("이름: "+getName());
		System.out.println("나이: "+getAge());//private로 잠겨서 이렇게썻어요 야박 
		System.out.println("학교명: "+schoolName);*/
		//이때 이렇게 안쓰고 그냥 쓰는법 protected !!!!!! 이래서 부모 private를 protected로 바꿔요 

		//그럼그냥 name 이라고 쓸쑤 있음
		/*System.out.println("이름: "+name);
		System.out.println("나이: "+age);*///private로 잠겨서 이렇게썻어요 야박 
		System.out.println("학교명: "+schoolName);
		super.showinfo();
}
}