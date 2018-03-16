package com.javaex.ex10;

public abstract class Shape {

	
	protected String lineColor;
	protected String fillColor;
	
	
	public Shape() {
	}

	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
	public abstract double area(); 
//	public abstract void draw(); 
//	{
//		System.out.println("Lcolor="+lineColor+" Fcolor="+fillColor+" 그렸습니다.");
//	}//어차피 자식클래스에서 재정의 되요 이게 오버라이딩 !!
	//오버라이딩 안까먹게하려고 abstract를 만들었어요 ! 
	
	
}
