package session2;

public class Part3 {

        //constant
    //using static outside of the class

    // final static PI_NUMBER = 3.14; //static means this constant can be used in all different methods in this class. final means it's an unchangeable constant.
    final static double PI_NUMBER = 3.14; //if you don't use "final", double PI_NUMBER = 3.14 is then defining a variable whose value can then change. With "final" the value will not change
// when the static/constant is defined outside/before the method like below, it can then be used/referenced in the method and be recognized.
    public static void main(String[] args) {
        System.out.println(PI_NUMBER);

        final byte dayOfTheWeek = 5;
      //if write   dayOfTheWeek = 7;   this will be wrong since we are trying to redefine the dayOfTheWeek variable to be 7 instead of the final constant of 5
        //using final keyword prevents the variable to be changed.

    }
}
