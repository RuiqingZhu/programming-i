package finaltest;

public class Answer3 {
    public static void main(String[] args) {

        int[] count = new int[10];

        for (int i = 0; i < 100; i++) {
            int randomNumber = generate();
            count[randomNumber]++;
        }

        printArray(count);
    }

    private static int generate() {
        return (int) (Math.random() * 10);
    }

    private static void printArray(int[] array) {
        for (int i = 0, size = array.length; i < size; i++) {
            System.out.println(array[i] + " counts of " + i);
        }
    }

}
