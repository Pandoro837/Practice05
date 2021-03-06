package com.javaex.ex10;

public class Book {
    
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;

//	생성자
	
	Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1;
	}
	
//	메소드 겟터셋터
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
//	메소드 일반
	
	public void rent() {
		this.stateCode = 0;
		System.out.println(this.title + "이(가) 대여 됐습니다.");
	}
	
	public void print() {
		String rent;
		if(this.stateCode == 1) {
			rent = "재고 있음";
		} else {
			rent = "대여중";
		}
		System.out.println(this.bookNo + " 책 제목: " + this.title + ", 작가: " + this.author + ", 대여 유무: " + rent);
	}
    
    
    
}
