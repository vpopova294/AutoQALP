package task4;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberGeneration {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i= 0; i<array.length;i++) {
            array[i] = getRandomValue();
        }
        System.out.println( "the first array: " + Arrays.toString(array));

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0){
                    array[i] = 0;
                }
        }

        System.out.println("the second array: " + Arrays.toString(array));

    }

    private static int getRandomValue()
    {
        Random random = new Random();
        return random.nextInt( 100);
    }

}
