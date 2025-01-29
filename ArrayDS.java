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
            System.err.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        int[] myArray = { 21, 3, 3, 8, 5, 5 };
        reverseArray(myArray, 0, (myArray.length - 1));

        printArray(myArray);
    }

}
