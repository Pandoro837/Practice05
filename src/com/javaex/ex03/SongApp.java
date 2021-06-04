package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args){
		//Song(파라미터 5개) 이후 Song(파라미터 6개)가 출력된다
		//파라미터 6개의 생성자가 이전 5개의 파라미터를 파라미터 5개 생성자로
		//보내어 입력하고 파라미터 5개가 출력된 이후에 다시 파라미터 6개 생성자에서
		//트랙을 입력한 후에 파라미터 6개를 출력해야 생성자의 과정이 종료된다
		Song s1 = new Song("좋은날", "아이유", "Real", "이민수", "2010", 3);
	}

}


