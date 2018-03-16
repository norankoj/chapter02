package com.javaex.ex10;

public class Rectangle extends Shape implements Drawable {

	private int width;
	private int heighth;
	
	
	public Rectangle() {
	}
	public Rectangle(String lineColor, String fillColor,int width, int heighth) {
		super(lineColor,fillColor);
		this.width = width;
		this.heighth = heighth;
	}
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHighth() {
		return heighth;
	}


	public void setHighth(int highth) {
		this.heighth = highth;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", heighth=" + heighth + ", lineColor=" + lineColor + ", fillColor="
				+ fillColor + "]";
	}

	public void draw() {
		System.out.println("Lcolor="+lineColor+" Fcolor="+fillColor+" 가로="+width+" 세로="+heighth+" 사각형을 그렸습니다.");
	}
	public double area(){
		
		return width*heighth;
		
	}

	
	
}
