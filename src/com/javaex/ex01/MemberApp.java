package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member jws = new Member();
		Member yjs = new Member();
		Member lhr = new Member();
		
		jws.setId("jws");
		yjs.setId("yjs");
		lhr.setId("lhr");
		
		jws.setName("정우성");
		yjs.setName("유재석");
		lhr.setName("이효리");
		
		jws.setPoint(50000);
		yjs.setPoint(30000);
		lhr.setPoint(40000);
		
		jws.showInfo();
		yjs.showInfo();
		lhr.showInfo();
		
	}

}
