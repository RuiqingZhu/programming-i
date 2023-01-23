package session2;

public class Part3 {

    //constant
    //using static outside of the class
    final static double PI_NUMBER = 3.14;
    final static String YEAR = "2022";

    public static void main(String[] args) {
        System.out.println(PI_NUMBER);

        //using final keyword prevents the variable to be changed
//        final byte daysOfTheWeek = 5;
//        daysOfTheWeek = 7;
        System.out.println("Welcome to " + YEAR);

        method1();
        method2();

        double piNumber = 3.14;


    }

    public static void method1(){
        //YEAR = "2021";
    }

    public static void method2(){
        System.out.println(YEAR);
    }
}
