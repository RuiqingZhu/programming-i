package session9;

public class Example {
    public static void main(String... args) {
        //variable-length Argument list
        int[] myArr = {1,2,3,4,5};
        printMax(myArr);
        printMax(3, 5, 6, 7, 7, 8, 9, 9, 9, 0, 0, 0, 20, 22, 2000);

//        if(args.length > 0){
//            System.out.print("the values I get from terminal ");
//        }
//        for(String arg: args){
//            //%d -> for digits
//            //%.2f -> for decimals
//            //%s -> for string
//            //%b -< boolean
//            System.out.printf("%s ", arg);
//        }
//        System.out.println();

        //informative
        //decision making
        //....
        System.out.println("this system is running with this serial number" +  args[0]);
        //Jmeter -> takes some values from user in the terminal


        myMethod("A", "B");
        myMethod("A", "B", "C");
        myMethod("A", "B", "C", "D");
    }

    public static void printMax(int...numbers){
        for(int number: numbers){

        }
    }

    private static void myMethod(String name1, String name2){
        System.out.println(name1);
        System.out.println(name2);
        System.out.println();
    }

    private static void myMethod(String name1, String name2, String name3){
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println();
    }

    private static void myMethod(String... names) {
        //for each String name as x in my collection do this :
        for(String x: names){
            //do whatever with x
        }

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }
}
