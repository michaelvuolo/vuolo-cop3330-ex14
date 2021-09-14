/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // record values
        System.out.print("What is the order amount? ");
        double order_amount = Double.parseDouble(input.nextLine());
        System.out.print("What is the state? ");
        String state = input.nextLine();

        // output
        System.out.print("The subtotal is $" + String.format("%.2f", order_amount) + ".");

        // calculate total
        double tax = order_amount * (.01 * 5.5);
        double total = order_amount + tax;

        // calculate total
        if (state.toUpperCase().equals("WI")) System.out.print("\n" + "The tax is $" + tax + "." + "\n" + "The total is $" + total + ".");
    }
}
