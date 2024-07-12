package com.company;
import java.util.Scanner;

//import java.util.Scanner;
//import java.util.SortedMap;
//
//public class Main{
//    public static void main (String[]args){
//        Scanner sc = new Scanner(System.in);
////        int x= sc.nextInt();
////        System.out.println(x*x);
////        byte b= sc.nextByte();
////        long l= sc.nextLong();
////        short s = sc.nextShort();
//
//
//
//        String str1 = sc.nextLine();
//        System.out.println(str1);
//
//    }
//}
import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the three sides of the triangle: ");

        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();

        sc.close();

        if (p + q <= r || p + r <= q || q + r <= p) {
            System.out.println("Invalid Triangle");
        }
        else {
            System.out.println("Valid Triangle");
        }
    }
}
