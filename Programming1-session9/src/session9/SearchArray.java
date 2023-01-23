package session9;

import java.util.Arrays;

public class SearchArray {
    public static void main(String[] args) {
        int[] arrNums = {11,21,23,14,50,16,70,18,90};

        //look for a number -> 5;
        //look for all the elements one by one to find the number

        //performance and complexity
        //Linear search
        for (int number : arrNums) {
            if (number == 5) {
                System.out.println("found");
            }
        }
        //Binary Search
        System.out.println(Arrays.binarySearch(arrNums, 50));

//        Arrays.sort(arrNums);
        for (int num : arrNums){
            System.out.print(num + " ");
        }
        System.out.println();
        //bubble sort
        int n = arrNums.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arrNums[j] > arrNums[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arrNums[j];
                    arrNums[j] = arrNums[j + 1];
                    arrNums[j + 1] = temp;
                }

        for (int num : arrNums){
            System.out.print(num + " ");
        }
        System.out.println();
        //selection sort
        //quick sort
        //pivot sort

    }
}
