package com.company;
import java.util.Scanner;
public class And_LogicalOperator {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);

    int age= sc.nextInt();
    String citizenship = "Indian";
//    if(age>=18 & citizenship == "Indian")   { // AND (&) Operator.
      if(age>=18 && citizenship == ("Indian")){    // Logical short circuit AND (&&)
        System.out.println("Persion May Vote");
    }else {
        System.out.println("Persion cannot vote");
    }
}
    }
