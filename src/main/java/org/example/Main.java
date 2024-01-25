package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Step 1
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int number : numbers) {
            System.out.println(number);
        }

        // Step 2 add every number in the array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
             sum += numbers[i];
        }
        System.out.println("Die Summe aller Zahlen im Array ist: " + sum);

        // step 3 find the largest number in the array
        int largestNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestNumber){
                largestNumber = numbers[i];
            }
        }
        System.out.println("Die größte Zahl im Array ist: " + largestNumber);

        // step 4
        int[] moreNumbers = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // step 5 add array1 and array2 together and save the sum in a new array
        int[] newNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i] + moreNumbers[i];
        }
        System.out.println("Das Ergebis der Addition beider Arrays ist: ");
        for (int value : newNumbers) {
            System.out.println(value + " ");
        }

        // bonus
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib einen Text ein: ");
        String userInput = scanner.nextLine();
        scanner.close();

        System.out.println("Die Buchstaben einzeln: ");

        for (int i = 0; i < userInput.length(); i++) {
            char letter = userInput.charAt(i);
            System.out.print(letter + " ");
        }
    }
}