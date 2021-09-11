package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{
    public static void main( String[] args )
    {
        //Inputs and Outputs
        Scanner in = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String firstNum = in.nextLine();
        System.out.print("What is the second number? ");
        String secondNum = in.nextLine();

        //Numerical Conversions
        int num1 = Integer.parseInt(firstNum);
        int num2 = Integer.parseInt(secondNum);
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        System.out.print(num1 + " + " + num2 + " = " + sum + "\n" + num1 + " - " + num2 + " = " + difference + "\n" + num1 + " * " + num2 + " = " + product + "\n" + num1 + " / " + num2 + " = " + quotient);
    }
}
