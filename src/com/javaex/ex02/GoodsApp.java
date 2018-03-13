package com.javaex.ex02;


public class GoodsApp {

	public static void main(String[] args) {
		
		
	

		Goods lg =new Goods("LG그램", 400000);
		Goods cup =new Goods("머그컵",2000);
//		
//		lg.setName("LG그램"); //이건 인스턴트로 생성한거,,,?위에께 인스턴스인가
//		lg.setPrice(400000);
//		
//		cup.setName("머그컵");
//		cup.setPrice(2000);
//		
		
	/*	lg.name="LG그램";
		lg.price=900000;
		
		cup.name="머그컵";
		cup.price=2000;
		
		System.out.println(lg.name);
		System.out.println(lg.price);
		System.out.println(cup.name);
		System.out.println(cup.price);*/
		
//		
		lg.showinfo();
		cup.showinfo();
	}

}
