package com.javaex.ex10;

public class Triangle extends Shape implements Drawable{
	
	private int width;
	private int heighth;
	
	public Triangle() {
	}

	public Triangle(String lineColor, String fillColor,int width, int heighth) {
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

	public int getHeighth() {
		return heighth;
	}

	public void setHeighth(int heighth) {
		this.heighth = heighth;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", heighth=" + heighth + ", lineColor=" + lineColor + ", fillColor="
				+ fillColor + "]";
	}
	
	public void draw() {
		System.out.println("Lcolor="+lineColor+" Fcolor="+fillColor+" 가로="+width+" 세로="+heighth+" 삼각형을 그렸습니다.");
	}
	

	public double area(){
		
		return width*heighth;
		
	}
}
