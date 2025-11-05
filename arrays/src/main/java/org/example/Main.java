package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers; // declaration
        numbers = new int[3]; // allocation

        int[] primes = new int[4]; // declaration + allocation
        primes[1] = 99;

        String[] vehicles = new String[2]; // declaration + allocation
        vehicles[0] = "Ford";
        vehicles[1] = "BMW";

        int[] odds = {1, 3, 5, 7, 9}; // declaration + initialization

        String[] names = {"John, Snow, Arya"}; // declaration + initialization

        System.out.println("Length of numbers array: " + numbers.length);
        printAllElements(numbers);
        System.out.println("\n");

        System.out.println("Length of primes array: " + primes.length);
        printAllElements(primes);
        System.out.println("\n");

        System.out.println("Length of odds array: " + odds.length);
        printAllElements(odds);
        System.out.println("\n");

        System.out.println("Length of names array: " + names.length);
        printAllElements(names);
        System.out.println("\n");

        System.out.println("Length of names array: " + vehicles.length);
        printAllElements(vehicles);
        System.out.println("\n");
    }
    
    public static void printAllElements(int[] numbers) {
        for (int i: numbers) {
            System.out.print(i + ", ");
        }
    }

    public static void printAllElements(String[] numbers) {
        for (String i: numbers) {
            System.out.print(i + ", ");
        }
    }
}