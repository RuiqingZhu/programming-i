package session8;

public class Arrays {
    // array, which stores a fixed-size sequential collection of elements of the same type
    public static void main(String[] args) {
        //elementType[] nameOfTheArray
        // double[] numbers; //by running this alone, it won't do anything since the array is not instantiated. we need below:
        double[] numbers = new double[10]; // [10] here is allocation of size

        numbers[0] = 1;
        numbers[1] = 18.3;
        numbers[2] = 15.7;
        numbers[3] = 13.4;
        numbers[4] = 1;
        numbers[5] = 44.3;
        numbers[6] = 13.5;
        numbers[7] = 1;
        numbers[8] = 1;
        // numbers[9] = 1; If we don't assign a value to an element in an array, it will be considered as having its default value, in this case for this line is 0.0
        // numbers[10] = 1; This will be wrong. Don't forget --> Arrays start from 0 index and will finish at length - 1. So when we instantiated the array to be [10], it will be from 0 to 9 therefore 10 won't be allowed.

        // Iterate into the array
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();

        int[] intArray = new int[2];
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
        System.out.println();

        boolean[] booleanArray = new boolean[4];
        for (int i = 0; i < booleanArray.length; i++){
            System.out.println(booleanArray[i]);
        }

        // initializing the array
        // elementType[] arrRefVar = {Value0, Value1, Value2, ...}
        double[] myList = {1.2, 2.4, 5.7, 4.9};
//        double[] myList2 = new double[4];
//        myList2[0] = 1.2;
//        myList2[1] = 2.4;
//        myList2[2] = 5.7;
//        myList2[3] = 4.9;


        /**
         * processing Array
         * double[] myList = new double[10];
         * 1- Initializing arrays with input values: Ask user to enter value into the array
         * 2- Initializing arrays with random values
         * 3- Displaying arrays
         * 4- Summing all elements
         * 5- Finding the last element
         */

    }
}
