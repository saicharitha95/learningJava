package org.greekForGeeks;

public class MathGame {
    public static int findPIN(int input1, int input2, int input3, int input4) {
        int evenSum = 0;
        int oddSum = 0;

        // Calculate the sum of even and odd digits in input1, input2, and input3
        evenSum += sumOfEvenDigits(input1);
        evenSum += sumOfEvenDigits(input2);
        evenSum += sumOfEvenDigits(input3);
        oddSum += sumOfOddDigits(input1);
        oddSum += sumOfOddDigits(input2);
        oddSum += sumOfOddDigits(input3);

        // Calculate the PIN based on the value of input4
        if (input4 % 2 == 0) {
            return evenSum;
        } else {
            return oddSum;
        }
    }

    private static int sumOfEvenDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String args[]) {
    }
    private static int sumOfOddDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }


    }

