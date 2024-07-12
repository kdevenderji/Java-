package com.company;
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

//        int num = sc.nextInt();

/*
        String ans;
        if(num%2 ==0){
            ans = "even";
            }
        else{
            ans= "odd";
        }
        System.out.println(ans);


     ->>>>>  There is Another method to write this code in 1 line instant of 4 lines of code by using Ternary Operator

*/
//        This is the code:
        int num = sc.nextInt();

        String ans = num % 2 ==0? "even": "odd"; // This is condition

        System.out.println(ans);


    }
}
