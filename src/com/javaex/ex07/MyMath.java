package com.javaex.ex07;

public class MyMath {
	

	private static final double PI=3.14;//static 으로 바쭤줌 final은 고정시키려고 그냥
	
	public static int plus(int a,int b) {
		return a+b;
	}
	public static double plus (double a, double b) {
		return a+b;
	}
	
	public static double area(int radius) {
		return radius*radius*PI;
		//pi못쓰는 이유 위에있는 static이 올라올때 없어서 pi앞 static고쳐줘~ 
	}
}
