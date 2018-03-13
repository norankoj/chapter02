package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera =new Goods(); //카메라라는 변수에 담을 꺼예요 
		
		camera.name="nikon";
		camera.price=400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
	}

}
