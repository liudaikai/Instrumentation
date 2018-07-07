package com.lk.javaAgent;

public class TestMainInJar {
    public static void main(String[] args) throws InterruptedException { 
        System.out.println(new TransClass().getNumber()); 
        int count = 0;
        TransClass transClass = new TransClass();
        while (true) { 
            Thread.sleep(2000);
            count++;
            int sum=transClass.sum(1,2);
            System.out.println(sum);
            if (count >= 100) {
                break; 
            } 
        } 
    } 
 }