package com.javaex.ex02;

public class Goods {

	private String name;//방법1(그렇지만 안전하지 않음)
	private int price;
	
	public Goods(){
		
	}
	public Goods(String name) {
		this.name=name;
	}
	public Goods(String name, int price) {
		this(name);
		this.price=price;
	}
	
	//private 때문에 다르게 사용.. 여러사람이 많이 사용하다보면
	//안전하게 사용해야하기때문에 안정장치이다.
//	public void setName (String name) { //방법2 많이이용 그래서 이름도 있다 (setter,getter)
//            this.name=name;
//	}
//	
//	public String getName () {
//		return name;
//	}
//	public void setPrice(int p) {
//		price=p;
//	}
//	public int getPrice() {
//		return price;
//	}
	
	public void showinfo() {   //방법3
		System.out.println(name);
		System.out.println(price);
		System.out.println("============");
	}
	
}
