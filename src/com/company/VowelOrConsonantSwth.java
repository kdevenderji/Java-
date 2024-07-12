package com.company;
import java.util.Scanner;
public class VowelOrConsonantSwth {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        char ch= sc.next().charAt(0);
//        switch (ch){
//            case 'a', 'e', 'i', 'o', 'u':
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':c
//
//                System.out.println("vowel");
//                break;
//            default:
//                System.out.println("consonant");
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' ->
                    System.out.println("vowel");
            default -> System.out.println("consonant");
        }
    }
}
