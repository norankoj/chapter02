package com.javaex.ex04;

public class Song {

	private String title;
	private String artist;
	private String ablum;
	private String composer;
	private String track;
	private int year;
	
	public Song() {
		
	}
	
	public Song(String artist,String ablum,String title, int year,  String track, String composer ) {
		this.title=title;
		this.artist=artist;
		this.ablum=ablum;
		this.composer=composer;
		this.year=year;
		this.track=track;
	}
	
	
//	public void set1 (String title) {
//		this.title= title;
//	}
//	public String get1 () {
//		return title;
//	}
//	public void set2 (String artist) {
//		this.artist= artist;
//	}
//	public String get2 () {
//		return artist;
//	}
//	public void set3 (String ablum) {
//		this.ablum= ablum;
//	}
//	public String get3 () {
//		return ablum;
//	}
//	public void set4 (String composer) {
//		this.composer= composer;
//	}
//	public String get4 () {
//		return composer;
//	}
//	public void set5 (int year) {
//		this.year= year;
//	}
//	public int get5 () {
//		return year;
//	}
//	public void set6 (int track) {
//		this.track= track;
//	}
//	public int get6 () {
//		return track;
	
	
	public void showinfo() {   //방법3
		System.out.println(artist+","+ablum+"("+title+year+","+track+","+composer+")");
		
	}
}
