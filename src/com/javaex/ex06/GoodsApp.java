package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods("니콘", 400000);
	System.out.println(camera.getCount());
	
		Goods cup = new Goods("머그컵", 2000);
		System.out.println(camera.getCount());
	}

}
