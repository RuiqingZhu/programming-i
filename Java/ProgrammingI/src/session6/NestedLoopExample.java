package session6;

public class NestedLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <=3; i++){ //variable i starts at 1, goes to the next line
            for (int j = 1; j <=3; j++){ // while/when i is at 1, variable j starts at 1, goes to the next line
                System.out.println(i + " " + j); // print i and j, then go to the next line which loops back to the start of inner loop line 6. variable is then set at 2, goes to the next line, until after j is set at 3, then this inner loop is closed, then will go back to line 5 and increment the i variable to set i at 2, then run the inner loop with variable j again, so on and so forth, until after i = 3 is finished.
            }
        }
    }
}
