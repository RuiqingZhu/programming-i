package session8.example;

public class ArraysExample {
    // the array, which stores a fixed-size sequential collection of elements of
    //the same type
    public static void main(String[] args) {
        //elementType[] nameOftheArray
        double[] numbers = new double[10]; // allocation of size

        numbers[0] = 1;
        numbers[1] = 18.3;
        numbers[2] = 15.7;
        numbers[3] = 13.4;
        numbers[4] = 1;
        numbers[5] = 44.3;
        numbers[6] = 13.5;
        numbers[7] = 1;
        numbers[8] = 1;
        //numbers[9] = 1;
        //numbers[10] = 1; don't forget !!! -> array starts from 0 index and will finish length - 1

        //Iterate into the array
        for(int i =0 ; i< numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        //System.out.println(numbers[7]);

        int[] intArray = new int[2];
        for(int i =0 ; i< intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        boolean[] booleanArray = new boolean[4];
        for(int i =0 ; i< booleanArray.length; i++){
            System.out.print(booleanArray[i] + " ");
        }

        //enhanced for loop
        for(boolean element: booleanArray){

        }

        // initializig the array
        // elementType[] arrRefVar = {Value0, Value1, Value2,....}
        double[] myprocList = {1.2, 2.4, 5.7, 4.9};
//        double[] myList2 = new double[4];
//        myList2[0] = 1.2;
//        myList2[1] = 2.4;
//        myList2[2] = 5.7;
//        myList2[3] = 4.9;

    }
}
