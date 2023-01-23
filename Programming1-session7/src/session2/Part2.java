package session2;

public class Part2 {
    public static void main(String[] args) {

        char ch = 'A';
        System.out.println(ch);
        System.out.println((int)ch); // cast the value of A into the ascii

        ch = 'a';
        System.out.println(ch);
        System.out.println((int)ch); // cast the value of A into the ascii

        boolean flag; // intialization
        //TRUE or FALSE
        flag = true;
        flag = false;
        flag = 3<5; //conditons < > ==

        System.out.println(flag);

        String s1 = new String("Who let the dogs out?"); //constructor
        String s2 = "Who who who who!";
        String s3 = s1 + s2;
        //sout
        System.out.println(s3);

//        int result = 12 + (15 * 19);
        int result = 12 + 15 * 19;
        System.out.println(result);
        //precedence of operators
        result = (12 + 15) * 19;
        System.out.println(result);

        //++ --
        int counter = 12;
        //counter = counter + 1;
        counter = ++counter;
        System.out.println(counter);


    }
}
