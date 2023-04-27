package edu.guilford;

import java.util.Random;

public class Rational {
    //Two integers attributes for numerator and denominator
    private int numerator;
    private int denominator;

    private int gcd(int numerator2, int denominator2) {
        return 0;
    }


    //Constructor that sets the numerator to 0 and denominator to 1
    public Rational() {
        Random rand = new Random();
        numerator = rand.nextInt(-100,100) ;
        denominator = rand.nextInt(-100,100);
    }
    //Add a second Construcctor that takes two aruments and uses them to initialize the attributs
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    //Add a toString method that displays a Rational object in a reasonable format
    public String toString() {
        return numerator + "/" + denominator;
    }
    //Add a method called negate that reverses the sign of ratuonal number
    public void negate() {
        numerator = -numerator;
    }
    //Write a method called invert that inverts the number by swapping the numerator and denominator
    public void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }
    //Write a method called toDouble that converts the rational number to a double and returns the result
    public double toDouble() {
        return (double) numerator / denominator;
    }
    //Write a method called reduce that reduces the rational number to lowest terms, find the greatest common divisor
    public void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }
    //Write a method called add that takes a rational number as an argument and adds it to the current rational number
    public void add(Rational r) {
        numerator = numerator * r.denominator + r.numerator * denominator;
        denominator = denominator * r.denominator;
        reduce();
    }



}
