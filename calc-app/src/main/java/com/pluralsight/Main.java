package com.pluralsight;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        double[] numbers;
        String action;
        double result = 0;
        String continueCalculation = "Y";
        while (continueCalculation.equalsIgnoreCase("Y")) {
            numbers = askNumbers();
            firstNumber = numbers[0];
            secondNumber = numbers[1];

            printMenu();
            action = askAction();

            result = performAction(action, firstNumber, secondNumber);
            System.out.printf("The result is: %.5f%n", result);
            System.out.println("Would you like to perform another calculation? (Y/N)");
            continueCalculation = scanner.nextLine().trim();
        }
    }

    public static double[] askNumbers() {
        while (true) {
            try {
                System.out.println("Please enter first number:");
                double firstNumber = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character
                System.out.println("Please enter second number:");
                double secondNumber = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character
                return new double[]{firstNumber, secondNumber};
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter valid numbers.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
    }

    public static void printMenu() {
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select an option:");
    }

    public static String askAction() {
        String action = scanner.nextLine().trim();
        //add validation to check if the action is one of the options
        while (!action.equalsIgnoreCase("A")
                && !action.equalsIgnoreCase("S")
                && !action.equalsIgnoreCase("M")
                && !action.equalsIgnoreCase("D")) {
            System.out.println("Invalid option. Please select a valid action:");
            action = scanner.nextLine().trim();
        }
        return action;
    }

    public static double performAction(String action, double firstNumber, double secondNumber) {
        double result = 0;
        switch (action.toUpperCase()) {
            case "A":
                result = firstNumber + secondNumber;
                break;
            case "S":
                result = firstNumber - secondNumber;
                break;
            case "M":
                result = firstNumber * secondNumber;
                break;
            case "D":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    result = Double.NaN;
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid action.");
        }
        return result;
    }
}