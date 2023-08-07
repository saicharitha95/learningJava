package org.wipro.test;
/*
A prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself. In other words, a prime number is a whole number greater than 1, whose only two whole-number factors are 1 and itself. The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29.
Given an array with 'N' elements, you are expected to find the sum of the values that are present in non-prime indexes of the array. Note that the array index starts with ie, the position (index) of the first array element is 0, the position of the bext array element is 1, and so on.
Example. If the array elements are (10, 20, 30, 40, 50, 60, 70, 80, 90, 100), then.
the values at the non-prime index are 10,20,50,70,90,100 and their sum is 340.
Example 2. If the array elements are (-1, -2, -3, 3, 4, -7), then the values at the non-
prime index are-1,-2, 4 and their sum is 1.
Example: If the array elements are (-4, -2), the values at the non-prime index are
A-2 and their sum is -6.
The function prototype should be as below-
int sumOfNonPrimelndexValues(int input1], int input2); where inputt is the given array, and input2 is the no of elements in the array
 */
public class SumOfIsNotPrime {

        public static void main(String[] args) {
            int[] array1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int[] array2 = {-1, -2, -3, 3, 4, -7};
            int[] array3 = {-4, -2};

            System.out.println(sumOfNonPrimeIndexValues(array1));
            System.out.println(sumOfNonPrimeIndexValues(array2));
            System.out.println(sumOfNonPrimeIndexValues(array3));
        }

        public static boolean isPrime(int n) {
            if (n <= 1) return false;
            if (n <= 3) return true;
            if (n % 2 == 0 || n % 3 == 0) return false;

            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) return false;
            }

            return true;
        }

        public static int sumOfNonPrimeIndexValues(int[] input1) {
            int sum = 0;

            for (int i = 0; i < input1.length; i++) {
                if (!isPrime(i)) {
                    sum += input1[i];
                }
            }

            return sum;
        }
    }
