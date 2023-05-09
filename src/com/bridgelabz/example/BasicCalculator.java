package com.bridgelabz.example;// Java program for simple calculator


import java.lang.*;

import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args)
    {
        // stores two numbers
        double num1;
        double num2;
        // Take input from the user
        Scanner sc = new Scanner(System.in);
        BasicCalculator b = new BasicCalculator();

        System.out.println("Enter the numbers");

        // take the inputs
        num1 = sc.nextDouble();

        num2 = sc.nextDouble();

        System.out.println("Enter the operator (+)");

        char op = sc.next().charAt(0);

        double result = 0;

        switch (op) {

            // case to add two numbers
            case '+':

                result = num1 + num2;

                break;




            default:

                System.out.println("You enter wrong input");


        }

        System.out.println("The final result:");

        System.out.println();

        // print the final result
        System.out.println(num1 + " " + op + " " + num2
                + " = " + result);
    }
}
