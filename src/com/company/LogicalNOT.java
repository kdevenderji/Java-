//package com.company;
//
//public class LogicalNOT {
////    public
//}
import java.util.*;

class LogicalNOT{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int q = sc.nextInt();

        sc.close();

        // Let's display the variables.
        System.out.println("p = " + p);
        System.out.println("q = " + q);

        // Implementing the NOT operator here.
        System.out.println("!(p < q) = " + !(p < q));
        System.out.println("!(p > q) = " + !(p > q));
    }
}
