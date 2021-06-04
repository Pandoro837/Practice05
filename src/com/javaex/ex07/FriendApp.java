package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);
       
        
        
        System.out.println("친구를 3명 등록해 주세요");
   
        for(int i = 0; i < friendArray.length; i ++) {
        	System.out.print("이름: ");
        	String name = sc.nextLine();
        	
        	System.out.print("핸드폰: ");
        	String hp = sc.nextLine();
        	
        	System.out.print("학교: ");
        	String school = sc.nextLine();
        	
        	System.out.println("---------------------------");
        	
        	Friend friend = new Friend();
        	friend.setName(name);
        	friend.setHp(hp);
        	friend.setSchool(school);
        	
        	friendArray[i] = friend;
        	
        }

        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            friendArray[i].showInfo();//친구정보 출력 메소드 호출
        }

        sc.close();
    }

}
