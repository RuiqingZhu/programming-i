package session6.examples;

public class Example1 {
    public static void main(String[] args) {

//        System.out.println("This is new ");
//        System.out.println("This is new");
//        System.out.println("This is new");
//        System.out.println("This is new");
//        System.out.println("This is new");
//        System.out.println("This is new");

        //LOOP structure
        //FOR LOOP
        //for //init; conditon;inc or dec)

//        for(int i=0; i<6; i = i++){
//            System.out.println("This is new " + i);
//        }
//        System.out.println("descending");
//        for(int i=5; i>=0 ; i--){
//            System.out.println("This is new " + i);
//        }

//        for (int i=1 ; i< 50; i= i+ 2){
//            System.out.printf("%d is an odd number%n", i);
//        }
//        for (double i=60 ; i>= 50; i= i- 0.2){
//            System.out.printf("%.2f is an odd number%n", i);
//        }

        //While LOOP
//        while(//condition){
//        }
        //while is used for doing an action that meets the condition in the while
        int counter = 0;
        while(counter < 20){
            System.out.printf("%d is the index%n", counter);
            counter ++;
        }

        //wrong code !!!
//        int counter2 = 0;
//        while(counter2 < 20){
//            System.out.printf("%d is the index%n", counter2);
//        }

        int counter3 = 0;
        //do while
        do{
            System.out.printf("it is happening at least 1 time, I am in index %d%n", counter3);
            counter3 ++;
        }while(counter3 < 20);
    }
}
