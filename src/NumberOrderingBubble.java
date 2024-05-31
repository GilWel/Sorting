import java.util.Arrays;
import java.util.Random;


public class NumberOrderingBubble {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int counter = 0;
        int[] array = new int[100];
        Random random = new Random(100);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.print(Arrays.toString(array));

        for (int j = 0; j < array.length - 1; j++) {

            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    counter++;

                }
            }
            System.out.println(Arrays.toString(array));
            System.out.println(counter);

        }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed);
    }
}







