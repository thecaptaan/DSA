package search;

public class LinearSearch {

    public static void main(String[] args) {
        int findNo = 12;
        int arr[] = { 18, 12, 9, 44, 77, 50, 7 };
        boolean isMatched = linearSearch(arr, arr.length, findNo);
        if(isMatched){
            System.out.println(findNo + " is exist in array");
        }else{
            System.out.println(findNo + " didn't exist in array");
        }
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
}
