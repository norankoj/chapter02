package com.javaex.ex08;

public class PersonApp {

	public static void main(String[] args) {

		/*Person p1 =new Person("정우성",45);
		p1.showinfo();
		
		Student s1= new Student("서울고등학교");
		s1.showinfo();*/
		//상속관계니까 암묵적으로 부모의 생성자를 호출해요 그런데 딱히 써준게 없으니까 
		//부모생성자에 기본생성자를 작동시킵니다. 그래서 Person()
		//그런데 강제로 부모쪽에  있는 거를 받아오고 싶어요 
		//그러면 그때쓰는게 super !! 이걸 student(1)가 있는 메쏘드첫줄에 씁니당
		//super("노나연",26);나는 이렇게 썼음 
		
		Student s2=new Student();
		s2.setName("이정재");
		s2.setAge(45);
		s2.setSchoolName("서울고등학교");
		
		s2.showinfo();//그냥 이렇게만 출력하면 3개가 다 출력이 안되요 그래서 고쳐줘야되요 자식클래스를 고칩시다.
		
		Student s3=new Student("이효리",40,"제주고등학교");
		s3.showinfo();
		
	}

}
