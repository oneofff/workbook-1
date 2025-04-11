package com.pluralsight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String name = getName();
        double hoursWorked = getHoursWorked();
        double payRate = getPayRate();

        double pay = calculateGrossPay(payRate, hoursWorked);

        printGrossPay(name, pay);
        scanner.close();
    }

    private static void printGrossPay(String name, double pay) {
        System.out.printf("Name: %s, Gross Pay: $%.2f%n", name, pay);
    }

    private static double calculateGrossPay(double payRate, double hoursWorked) {
        double grossPay;
        if (hoursWorked > 40) {
            grossPay = (40 * payRate) + ((hoursWorked - 40) * payRate * 1.5);
        } else {
            grossPay = hoursWorked * payRate;
        }
        return grossPay;
    }

    private static String getName() {
        String name;
        while (true) {
            System.out.println("Enter a name:");
            name = scanner.nextLine().trim();
            if (!name.isEmpty()) {
                break;
            } else {
                System.out.println("Name cannot be empty.");
            }
        }
        return name;
    }

    private static double getHoursWorked() {
        System.out.println("Enter hours worked:");
        return getPositiveDouble();
    }

    private static double getPayRate() {
        System.out.println("Enter pay rate:");
        return getPositiveDouble();
    }

    public static double getPositiveDouble() {
        double value;
        while (true) {
            try {
                value = scanner.nextDouble();
                if (value <= 0) {
                    System.out.println("Invalid input. Value should be greater than 0.");
                    continue;
                }
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value greater than 0.");
                scanner.nextLine();
            }
        }
    }
}