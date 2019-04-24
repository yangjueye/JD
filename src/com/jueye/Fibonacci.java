package com.jueye;

import java.util.Scanner;

public class Fibonacci {

    public static long fib(long  n){
        if(n==1 || n==2){
            return 1;
        }
        else {return fib(n-1)+fib(n-2);}
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
int n=Integer.parseInt(sc.nextLine());
        long startTime=System.currentTimeMillis();   //获取开始时间
        System.out.println(fib(n));
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
    }


}
