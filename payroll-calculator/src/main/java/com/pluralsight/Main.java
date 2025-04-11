package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a name:");
            String name = scanner.nextLine();

            System.out.println("Enter hours worked:");
            double hoursWorked = scanner.nextDouble();

            System.out.println("Enter pay rate:");
            double payRate = scanner.nextDouble();

            if (hoursWorked < 0 || payRate < 0) {
                throw new IllegalArgumentException("Hours worked and pay rate must be non-negative.");
            }

            if (hoursWorked >= 40) {
                payRate = payRate * 1.5;
            }

            double pay = hoursWorked * payRate;
            System.out.printf("Name: %s, Gross Pay: $%.2f%n", name, pay);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}