package com.javaex.ex10;

public class ShapeApp {

	public static void main(String[] args) {

//		
//		Shape[] sArray= new Shape [3];
//		Shape s01= new Rectangle ("빨강","빨강",7,7);		
//		Shape s02= new Triangle ("하늘","하늘",12,12);
//		Shape s03= new Circle ("노랑","노랑",10);
		
		
		//이럴떄는 shape만 읽힌다고 했죠 자식클래스 메모리는 갖고있는체로 
		//배열을 shape형으로 만들꺼예요 
//		
//		sArray[0]=s01;
//		sArray[1]=s02;
//		sArray[2]=s03;
//		
//		for(int i=0;i<sArray.length;i++) {
//			sArray[i].draw();
//			
//		}
//		for(int i=0;i<sArray.length;i++) {
//			System.out.println(sArray[i].area());
//			
//		}
		//형변환으로도 할 수 있는데 형변환을 하면 일이 커져요 삼각형에있는 메소드를 쓸껀지
		//사각형에 있는 메소드를 쓸껀지 또 구분해야되서.. 그래서 간단하고 편리하게 오버라이딩을 했습니다.
		Drawable[] dArray= new Drawable [4];
		Drawable d01= new Rectangle ("빨강","빨강",7,7);		
		Drawable d02= new Triangle ("하늘","하늘",10,10);		
		Drawable d03= new Circle ("노랑","노랑",11);
		Drawable d04= new Point (11,12);
		
		
		dArray[0]=d01;
		dArray[1]=d02;
		dArray[2]=d03;
		dArray[3]=d04;
		
		for(int i=0;i<dArray.length;i++) {
			dArray[i].draw();
		}
		for(int i=0;i<dArray.length;i++) {
			if(dArray[i] instanceof Shape) {
				System.out.println(((Shape)dArray[i]).area());
			}
		}
		
	}

}
