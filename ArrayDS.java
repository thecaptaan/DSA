public class ArrayDS {
    static void reverseArray(int numbers[], int start, int end) {
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.err.print(numbers[i] + " ");
        }
    }

    static int findMin(int[] arr, int length) {
        int min = arr[0];
        for (int i = 1; i < length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int[] removeEven(int[] arr, int length) {
        int oddCounter = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] % 2 != 0) {
                oddCounter++;
            }
        }
        int newOddCounter = 0;
        int[] newOddArr = new int[oddCounter];
        for (int i = 0; i < length; i++) {
            if (arr[i] % 2 != 0) {
                newOddArr[newOddCounter] = arr[i];
                newOddCounter++;
            }
        }
        return newOddArr;
    }

    public static void main(String[] args) {
        int[] myArray = { 21, 3, 3, 8, 5, 5 };
        reverseArray(myArray, 0, (myArray.length - 1));
        printArray(myArray);
        System.out.println(findMin(myArray, (myArray.length)));
        int[] result = removeEven(myArray, (myArray.length));
        printArray(result);
    }

}
