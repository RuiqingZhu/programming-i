package session6;

import jdk.swing.interop.SwingInterOpUtils;

public class Example1 {
    public static void main(String[] args) {
        //loop structure
        //for loop
        //for (//initialization, condition, increment/decrement){
        //      }

        System.out.println("Ascending");
        for (int i = 0; i < 6; i++) {
            System.out.println("This is new! ascending! " + i);

        }

        System.out.println("Descending");
        for (int i = 6; i > 0; i--) {
            System.out.println("This is new descending! " + i);
        }

        System.out.println("odd numbers");
        for (int i = 1; i < 50; i = i + 2) {
            System.out.printf("%d is an odd number! %n", i);
        }


        //while loop
        //while (conditions){
        //      }
        //while is used for doing an action that meets the condition in the while loop
        int counter = 0;
        while (counter < 20) {
            System.out.printf("%d is the index %n", counter);
            counter++;
        }

        //below is the wrong code! infinite loop. will stay at counter2 = 0 which is always < 20, and will keep printing 0
//        int counter2 = 0;
//        while (counter2 < 20){
//            System.out.printf("%d is the index %n", counter2 );
//        }


        //do while
//        do{
//
//        }while(//condition)
        int counter3 = 0; // variable counter3 starts at 0;
        do{
            System.out.printf("this will run at least once, index is %d%n", counter3); //this line will be run before anything below so this output will always run at least once;
            counter3 ++; // after running the previous line, run this line which is to add 1 to the counter3 variable;
        }while(counter3 < 20); // then cycle the variable counter3 by adding 1 each time until it reaches 20
    }
}
