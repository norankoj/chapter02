package com.javaex.ex09;

public class ShapeApp {

	public static void main(String[] args) {

		
		Triangle []tArray = new Triangle[3];
		
		Triangle t1 = new Triangle("빨강","빨강",3,3);
		Triangle t2 = new Triangle("파랑","파랑",5,5);
		Triangle t3 = new Triangle("초록","초록",10,10);
		
		tArray[0]=t1;
		tArray[1]=t2;
		tArray[2]=t3;
		
	
//		
//		System.out.println(t1);
//		System.out.println(t2.toString());
		/*t1.draw();
		t2.draw();
		t3.draw(); //이렇게 안그릴려고 배열을 쓴거예요 우리는 for문으로 한번에 출력할 수 있어요 
		*/
		
		for (int i=0;i<tArray.length;i++) {
			tArray[i].draw();
		}
		
		Rectangle []rArray = new Rectangle [3];
		
		Rectangle r1 = new Rectangle("하늘","하늘",4,4);
		Rectangle r2 = new Rectangle("분홍","분홍",11,11);
		Rectangle r3 = new Rectangle("주황","주황",9,9);
		
		rArray[0]=r1;
		rArray[1]=r2;
		rArray[2]=r3;
		for (int i=0;i<rArray.length;i++) {
			rArray[i].draw();
		}
		
	}

}
