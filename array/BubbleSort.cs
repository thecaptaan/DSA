using System;
namespace Array{
    class BubbleSort{
        static void Main(string[] args){
            Console.WriteLine("Bubble Sort Started");
            int[] arr = {23, 45, 67, 12, 89, 34, 56, 78, 90, 11, 54, 32, 76, 98, 65, 43, 21, 87, 30, 69};
            for (int i = 0; i < arr.Length; i++){
                bool swapped = false;
                for (int j = 0; j < arr.Length- i - 1; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
                if(!swapped){
                    break;
                }
            }
            Console.WriteLine("Sorted Array:");
            foreach (int num in arr){
                Console.Write(num + " ");
            }
            Console.WriteLine("");
            Console.WriteLine("Bubble Sort Ended");
        }
    }
}