package com.javaex.ex03;

public class pointApp {

	public static void main(String[] args) {

		point p1 =new point(5,5);
		point p2 =new point(10,23);
		
//		
//		p1.setNum(5);
//		p1.setNumber(5);
//		
//		p2.setNum(10);
//		p2.setNumber(23);
//		
		p1.draw();
		p2.draw();
		p1.draw(1);
		p2.draw(1);
		
	}

}
