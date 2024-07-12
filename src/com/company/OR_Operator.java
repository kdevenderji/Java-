package com.company;
import java.util.Scanner;
public class OR_Operator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);


        String Organization="KMCLU" ;
        sc.close();
        if ( Organization ==  "KMCLU" | Organization == "LU"){

            System.out.println("Student allow to attend Event");
        }
        else {
            System.out.println("Students Not_Allow");
        }


    }
}
