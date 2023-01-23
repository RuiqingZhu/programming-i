package session7;

public class Example2 {
    public static void main(String[] args) {
        int a = 12;
        int b = 30;
        System.out.println("a before swap " + a);
        System.out.println("b before swap " + b);
        swap(a, b);

        System.out.println("a after swap in the main " + a);
        System.out.println("b after swap in the main " + b);

        String college= "JAC";
        doSomeChange(college);
        System.out.println(college);

        String changed  = doSomeChange(college, true);
        System.out.println(changed);
    }

    static void swap(int a, int b){
        System.out.println("a in the body " + a);
        System.out.println("b in the body " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("a after swap " + a);
        System.out.println("b after swap " + b);

    }

    static void doSomeChange(String str){
        str = str.toLowerCase();
        System.out.println(str);
    }
    //overloading
    static String doSomeChange(String str, boolean flag){
        str = str.toLowerCase();
        return str;
    }
}
