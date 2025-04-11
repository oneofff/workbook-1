package com.pluralsight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public enum SandwichType {
        REGULAR(5.45),
        LARGE(8.95);

        public final double price;

        SandwichType(double price) {
            this.price = price;
        }
    }

    public enum Discount {
        NONE(0),
        STUDENT(0.1),
        SENIORS(0.2);

        public final double rate;

        Discount(double price) {
            this.rate = price;
        }
    }

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        printMenu();
        SandwichType type = getSandwichType();
        int age = getAge();
        Discount discount = getDiscount(age);
        double price = calcSandwichPrice(discount, type);
        printOrder(age, discount, price);
        scanner.close();
    }

    public static void printOrder(int age, Discount discount, double price) {
        System.out.printf("Order for %d y.o. with %.2f%% discount — final price: %.2f%n", age, discount * 100, price);
    }

    public static Discount getDiscount(int age) {
        if (age <= 17) return Discount.STUDENT;
        if (age >= 65) return Discount.SENIORS;
        return Discount.NONE;
    }

    public static SandwichType getSandwichType() {
        while (true) {
            int choice = getPositiveInt();
            switch (choice) {
                case 1:
                    return SandwichType.REGULAR;
                case 2:
                    return SandwichType.LARGE;
                default:
                    System.out.println("Invalid option. Please select 1 or 2.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Choose your sandwich:");
        System.out.println("1. Regular sandwich ($5.45)");
        System.out.println("2. Large sandwich ($8.95)");
    }

    public static int getAge() {
        System.out.println("Enter your age:");
        return getPositiveInt();
    }

    public static double calcSandwichPrice(Discount discount, SandwichType type) {
        return type.price - type.price * discount.rate;
    }

    public static int getPositiveInt() {
        int value;
        while (true) {
            try {
                value = scanner.nextInt();
                if (value <= 0) {
                    System.out.println("Invalid input. Value should be greater than 0.");
                    continue;
                }
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer value greater than 0.");
                scanner.nextLine();
            }
        }
    }
}