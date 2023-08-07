package org.wipro.test;
/*
Create PIN using three given input numbers"Secure Assets Private Ltd", a small company that deals with lockers has recently started manufacturing digital locks which can be locked and unlocked using PINS (passwords). You have been asked to work on the module that is expected togenerate PINs using three imput numbers. Assumptions: The three given input numbers will always consist of four digits eachie each of them will be in the range >=1000 and <=99991000 input1 9999 1000 input2-99991000 input3-9999Below are the rules for generating the PINThe PIN should be made up of 4 digits The thousands position of the PIN should be the smallest digit across the threeinput numbersThe hundreds position of the PIN should be the largest digit across the three input numbersThe tens position of the PIN should be the digit with minimum frequency i.e. the digit that occurs the least number of times across the three input numbers. If there are more than one digit that occur with min frequency, choose the smallestof themThe unit (ones) position of the PIN should be the digit with maximum frequency ie the digit that occurs the most number of times across the three input numbers there are more than one digit that occur with max frequency. choose the largest of themExample 1input1 = 1274input2 5283 input3 = 1937then, PIN 1947Explanation: Below is an explanation of how the PIN has been formed in this example.-the smallest digit across the three input numbers is '1', so 1 occupies thethousands position of the pin the largest digit across the three input numbers is '9', so 9 occupies thehundreds position of the pin There are four digits 4, 5, 8' and '9' that occur once each. The smallest outof them is '4', so 4 occupies the tens position of the pin There are four digits '1', '2', '3' and '7' that occur two times each. The largest out of them is 7, so 7 occupies the units position of the pinExample 2- input1 8530input2 5620input3 7532 then, PIN= 0865.



 */
public class GeneratePin {
        public static void main(String[] args) {
            int input1 = 1274;
            int input2 = 5283;
            int input3 = 1937;
            System.out.println("Generated PIN: " + generatePIN(input1, input2, input3));

            int input4 = 8530;
            int input5 = 5620;
            int input6 = 7532;
            System.out.println("Generated PIN: " + generatePIN(input4, input5, input6));
        }

        public static int generatePIN(int input1, int input2, int input3) {
            int[] digitsCount = new int[10];

            countDigits(input1, digitsCount);
            countDigits(input2, digitsCount);
            countDigits(input3, digitsCount);

            int thousands = getSmallestDigit(digitsCount);
            int hundreds = getLargestDigit(digitsCount);
            int tens = getMinFrequencyDigit(digitsCount);
            int units = getMaxFrequencyDigit(digitsCount);

            return thousands * 1000 + hundreds * 100 + tens * 10 + units;
        }

        public static void countDigits(int num, int[] digitsCount) {
            while (num > 0) {
                int digit = num % 10;
                digitsCount[digit]++;
                num /= 10;
            }
        }

        public static int getSmallestDigit(int[] digitsCount) {
            for (int i = 0; i < 10; i++) {
                if (digitsCount[i] > 0) {
                    return i;
                }
            }
            return 0; // Default value if no digit is found (shouldn't happen)
        }

        public static int getLargestDigit(int[] digitsCount) {
            for (int i = 9; i >= 0; i--) {
                if (digitsCount[i] > 0) {
                    return i;
                }
            }
            return 0; // Default value if no digit is found (shouldn't happen)
        }

        public static int getMinFrequencyDigit(int[] digitsCount) {
            int minFrequency = Integer.MAX_VALUE;
            int minFrequencyDigit = 0;

            for (int i = 0; i < 10; i++) {
                if (digitsCount[i] > 0 && digitsCount[i] < minFrequency) {
                    minFrequency = digitsCount[i];
                    minFrequencyDigit = i;
                }
            }

            return minFrequencyDigit;
        }

        public static int getMaxFrequencyDigit(int[] digitsCount) {
            int maxFrequency = 0;
            int maxFrequencyDigit = 0;

            for (int i = 0; i < 10; i++) {
                if (digitsCount[i] >= maxFrequency) {
                    maxFrequency = digitsCount[i];
                    maxFrequencyDigit = i;
                }
            }

            return maxFrequencyDigit;
        }
    }
