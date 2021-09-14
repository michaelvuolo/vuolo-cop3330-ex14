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

        // record new values
        System.out.print("What is the principle amount? ");
        int principle = input.nextInt();
        System.out.print("What is the rate? ");
        double rate = input.nextDouble();
        System.out.print("What is the number of years? ");
        int years = input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int times = input.nextInt();

        // calculate
        double compounded_interest = principle * Math.pow(1 + ((rate / 100) / times), times * years);

        // output compounded interest
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.", principle, rate, years, times, compounded_interest);
    }
}
