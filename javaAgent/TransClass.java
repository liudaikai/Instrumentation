package com.lk.javaAgent;

public class TransClass {

    public int age;

    public TransClass(){
        age=20;
    }

	 public int getNumber() { 
	    return age;
    }

    public int sum(int a, int b){
        int sum=a+b;
        return sum;

    }

 }