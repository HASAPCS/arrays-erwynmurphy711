package com.example;

public class ArrayOperations {

    public static void main(String[] args) {
        String[] words = args;
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        // Exercise 1: Initialize and Print an Array
        // TODO: Initialize an array of integers and print its contents.
    }

    // Exercise 2: Find the Maximum Value in an Array
    public static int findMaximumValue(int[] array) {
        int[] numbers = array;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int dummy = numbers[i];
                numbers[i + 1] = numbers[i];
                numbers[i] = dummy;
            }
        }

        // TODO: Implement the logic to find the maximum value in the array.
        return numbers[numbers.length - 1]; // Placeholder return value
    }

    // Exercise 3: Check for a Specific Value
    public static boolean containsValue(int[] array, int value) {
        int[] numbers = array;
        int specified = value;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == specified) {
                return true;
            }
        }
        // TODO: Implement the logic to check if the array contains the specified value.
        return false; // Placeholder return value
    }

    // Exercise 4: Calculate the Average of Array Elements
    public static double calculateAverage(int[] array) {
        int[] numbers = array;
        int count = 0;
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            count += numbers[i];
        }
        average = count / numbers.length;
        // TODO: Implement the logic to calculate the average of the array elements.
        return average; // Placeholder return value
    }

    // Exercise 5: Reverse an Array
    public static int[] reverseArray(int[] array) {
        int[] numbers = array;
        int[] reverse = new int[numbers.length];
        int j = 0;
        for (int i = numbers.length - 1; i > -1; i--) {
            reverse[j] = numbers[i];
            System.out.println(reverse[j]);
            System.out.println("i" + i + ",j" + j);
            j++;
            System.out.println("i" + i);

        }

        // TODO: Implement the logic to reverse the array.
        return reverse;
    }

    // Exercise 6: Sort an Array
    public static void sortArray(int[] array) {
        int[] numbers = array;
        int dummy = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    dummy = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = dummy;
                }
            }
        }
    }
}
