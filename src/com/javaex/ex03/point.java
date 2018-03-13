package com.javaex.ex03;

public class point {
	
	private int X;
	private int Y;
	
	public point() {
		
	}
	
	public point (int X, int Y) {
		this.X=X;
		this.Y=Y;
	}
	
//	public void setNum (int X) {
//		this.X=X;
//	}
//	
//	public int getNum () {
//		return X;
//
//	}
//	
//	public void setNumber (int Y) {
//		this.Y=Y;
//	}
//	
//	public int getNumber () {
//		return Y;
//
//	}
//	
	public void draw() {
		System.out.println("점[x="+X+",y="+Y+"]을 그렸습니다.");
	}
	public void draw(int on) {
		if(on==1) {
		System.out.println("점[x="+X+",y="+Y+"]을 지웠습니다.");
	}
	}


}
