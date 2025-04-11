package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
    }


    public static void question1() {
        int bobSalary = 100_000;
        int garySalary = 120_000;
        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("🔹 Question 1: Comparing Salaries");
        System.out.println("   The highest salary is: $" + highestSalary);
        System.out.println("---------------------------------------------------\n");
    }

    public static void question2() {
        int carPrice = 10_000;
        int truckPrice = 322_200;
        int lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("🔹 Question 2: Finding the Lower Price");
        System.out.println("   The lowest price is: $" + lowestPrice);
        System.out.println("---------------------------------------------------\n");
    }

    public static void question3() {
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("🔹 Question 3: Area of a Circle");
        System.out.printf("   Radius: %.2f%n", radius);
        System.out.printf("   Area: %.2f%n", area);
        System.out.println("---------------------------------------------------\n");
    }

    public static void question4() {
        int x = 5;
        double sqrtX = Math.sqrt(x);

        System.out.println("🔹 Question 4: Square Root");
        System.out.printf("   The square root of %d is: %.3f%n", x, sqrtX);
        System.out.println("---------------------------------------------------\n");
    }

    public static void question5() {
        double x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("🔹 Question 5: Distance Between Two Points");
        System.out.printf("   Distance from (%.1f, %.1f) to (%.1f, %.1f): %.2f%n", x1, y1, x2, y2, distance);
        System.out.println("---------------------------------------------------\n");
    }

    public static void question6() {
        double x = -3.8;
        double modulus = Math.abs(x);

        System.out.println("🔹 Question 6: Absolute Value");
        System.out.printf("   The absolute value of %.2f is: %.2f%n", x, modulus);
        System.out.println("---------------------------------------------------\n");
    }

    public static void question7() {
        double randomNumber = Math.random();

        System.out.println("🔹 Question 7: Random Number Generator");
        System.out.printf("   Here’s a random number between 0 and 1: %.5f%n", randomNumber);
        System.out.println("---------------------------------------------------\n");
    }

}