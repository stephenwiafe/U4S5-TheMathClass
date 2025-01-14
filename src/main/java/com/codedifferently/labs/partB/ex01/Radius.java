package com.codedifferently.labs.partB.ex01;
import java.util.Scanner;
public class Radius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        double radius = in.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of a circle is " + area);
    }
}
