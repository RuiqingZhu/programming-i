package session3.examples;

import java.util.Date;

public class PrintfExample {
    public static void main(String[] args) {
//        https://www.baeldung.com/java-printstream-printf
        System.out.printf("Hi %s!%n", "World");
        System.out.printf("'%15s' %n", "Jac");

        System.out.printf("'%-10s' %n", "baeldung");

//        System.out.printf("%2.2s", "Hi there!");

        System.out.printf("'%5.2f'%n", 5.1473);

        Date date = new Date(); //instantiate an object of class Date
        System.out.printf("%tT%n", date); //%tT

        //%tH, %tM , %tS
        System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);
    }
}
