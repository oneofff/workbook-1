package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String name = getName();
        double hoursWorked = getHoursWorked();
        double payRate = getPayRate();

        payRate = calculatePayRate(payRate, hoursWorked);

        double pay = hoursWorked * payRate;

        printGrossPay(name, pay);
    }

    private static void printGrossPay(String name, double pay) {
        System.out.printf("Name: %s, Gross Pay: $%.2f%n", name, pay);
    }

    private static double calculatePayRate(double payRate, double hoursWorked) {
        payRate = hoursWorked > 40 ? payRate * 1.5 : payRate;
        return payRate;
    }

    private static double getHoursWorked() {
        System.out.println("Enter hours worked:");
        double hoursWorked = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked must be non-negative.");
        }
        return hoursWorked;
    }

    private static double getPayRate() {
        System.out.println("Enter pay rate:");
        double payRate = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        if (payRate < 0) {
            throw new IllegalArgumentException("Pay rate must be non-negative.");
        }
        return payRate;
    }

    private static String getName() {
        System.out.println("Enter a name:");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        return name;
    }
}