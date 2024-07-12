package com.company;
import java.util.Scanner;
public class Count_D_No {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long digits = 0;
        while ( num>0){
            num/= 10;
            digits++;
        }
        System.out.println(digits);
    }
}
