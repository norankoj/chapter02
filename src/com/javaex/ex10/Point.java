package com.javaex.ex10;

public class Point implements Drawable{
	
	
	private int x;
	private int y;
	
	public Point() {
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("X="+x+"Y="+y+"점을 그렸습니다.");
	}
	

}
