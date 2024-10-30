//
//2. Count Vowels and Digits
//
//This code counts vowels and digits in a user-inputted string, and calculates the percentages.

import java.util.Scanner;
public class CountVowelsDigits {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        int vowelCount = 0;
        int digitCount = 0;

        for (char c : input.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vowelCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        double vowelPercentage = (vowelCount / (double) input.length()) * 100;
        double digitPercentage = (digitCount / (double) input.length()) * 100;

        System.out.printf("Number of vowels: %d (%.2f%%)\n", vowelCount, vowelPercentage);
        System.out.printf("Number of digits: %d (%.2f%%)\n", digitCount, digitPercentage);
        scanner.close();
    
    }
    
}
