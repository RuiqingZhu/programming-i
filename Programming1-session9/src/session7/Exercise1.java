package session7;

/**
 * Use the isPrime Method)  provide
 *  * the isPrime(int number) method for testing whether a number is prime.
 *  * Use this method to find the number of prime numbers less than 10000.
 */
public class Exercise1 {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        while (number < 10000){
            if(isPrime(number) ){
                System.out.print(number + "  ");
                count ++;
            }
            number ++;
        }
        System.out.println("the count of prime number less than 10000 " + count);

//        checkMe(); I can't call a non-static method within a static method
    }

    static boolean isPrime(int number){
        for(int div=2; div <= number /2 ; div++){
            if (number % div == 0){
                return false; // it means don't continue the execute
            }
        }
        return true;
    }

    public void checkMe(){
        System.out.println("check");
    }
}
