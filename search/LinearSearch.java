package search;

import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {

        // Find Number in array using linear search
        int findNo = 12;
        int arr[] = { 18, 12, 9, 44, 77, 50, 7 };
        boolean isMatched = linearSearch(arr, arr.length, findNo);
        if (isMatched) {
            System.out.println(findNo + " is exist in array");
        } else {
            System.out.println(findNo + " didn't exist in array");
        }

        // Find Char in String using linear search
        String name = "Ayush";
        char target = 'd';
        boolean isStringMatched = linearSearchString(name, target, name.length());
        if (isStringMatched) {
            System.out.println(target + " is exist in string");
        } else {
            System.out.println(target + " didn't exist in string");
        }

        // Find Min in array of int
        int minNO = findMin(arr, arr.length);
        System.out.println(minNO + " is min no in array");

        int[][] new2DArr = {
                { 10, 34, 56, 74, 36 },
                { 39, 24, 19, 65, 89 },
                { 1, 45, 69, 71, 99 }
        };
        int[] ans2DMatched = find2DLinearSearch(new2DArr, 1, new2DArr.length);
        System.out.println(Arrays.toString(ans2DMatched) + " index");

        // Leet Code
        System.out.println(countEvenDigits(arr, arr.length) + " no of even digits");
    }

    // Find whether a no exists in array or not.
    public static boolean linearSearch(int arr[], int length, int findN) {
        for (int x = 0; x < length; x++) {
            if (findN == arr[x]) {
                return true;
            }
        }
        return false;
    }

    // Find whether a char exists in string or not.
    public static boolean linearSearchString(String str, char target, int length) {
        for (int x = 0; x < length; x++) {
            if (str.charAt(x) == target) {
                return true;
            }
        }
        return false;
    }

    // Find Min in array of numbers
    public static int findMin(int[] arr, int length) {
        int minNO = arr[0];
        for (int i = 0; i < length; i++) {
            if (arr[i] < minNO) {
                minNO = arr[i];
            }
        }
        return minNO;
    }

    // Search in 2D array
    public static int[] find2DLinearSearch(int[][] arr, int target, int length) {
        for (int row = 0; row < length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    // Leet Code
    // Given an array nums of integers, return how many of them contain an even
    // number of digits
    public static int countEvenDigits(int[] arr, int length) {
        // Explanation
        // Math.log10() gives the logarithm base 10 of num
        // Math.log10(1000) = 3
        int count = 0;
        for (int num : arr) {
            int digits = (int) Math.log10(num) + 1;
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
