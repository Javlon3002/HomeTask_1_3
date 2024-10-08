package com.example.project;

import java.text.DecimalFormat;

public class Division {

    public static void main(String[] args) {
        // You can test the divide method here
        divide(1, 1);  // Example: should print 0.33
        divide(13, 4); // Example: should print 3.25
    }

    public static void divide(int numerator, int denominator) {
        double result = (double) numerator / denominator;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(result));
    }
}
