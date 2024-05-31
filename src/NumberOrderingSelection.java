import java.util.Arrays;
import java.util.Random;

public class NumberOrderingSelection {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int counter = 0;
        int[] array = new int[100];
        Random random = new Random(100);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

            System.out.println(Arrays.toString(array));

            for (int j = 0; j < array.length; j++) {

                int min = array[j];
                int index = j;

                for (int i = j; i < array.length; i++) {
                    if (array[i] < min) {
                        min = array[i];
                        index = i;
                    }
                }
                int temp = array[j];
                array[j] = array[index];
                array[index] = temp;
                counter++;

            }
            System.out.println(Arrays.toString(array));
            System.out.println(counter);
            long endTime = System.currentTimeMillis();
            long timeElapsed = endTime - startTime;
            System.out.println(timeElapsed);
        }

    }







