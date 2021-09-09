package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        String pri = se.nextLine();
        double principal = Double.parseDouble(pri);

        System.out.print("Enter the rate of interest: ");
        String inter = se.nextLine();
        double rate = Double.parseDouble(inter);

        System.out.print("Enter the number of years: ");
        String years = se.nextLine();
        int numYears = Integer.parseInt(years);

        double amount = principal * (1 + ((rate / 100) * numYears));

        System.out.println("After " + numYears + " years at " + rate + "%, the investment will be worth $" + String.format("%.2f", amount));
    }
}