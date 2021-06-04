package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account() {
    	
    }
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    }
    //필요한 메소드 작성
    public void deposit(int money) {
    	this.balance = balance + money;
    }
    public void withdraw(int money) {
    	if(balance - money > 0) {
    		this.balance = balance - money;
    	} else {
    		System.out.println("잔액이 부족합니다.");
    	}
    	
    }
    public void showBalance() {
    	System.out.println(this.balance);
    }
    
    

}
