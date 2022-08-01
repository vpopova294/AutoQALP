package task4;

import java.util.Arrays;
import java.util.Random;

public class NumberAverage {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i= 0; i<array.length;i++) {
            array[i] = getRandomValue();
        }
        System.out.println( "random array: " + Arrays.toString(array));

        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i] ;
        }

        System.out.println("average: " + average / array.length);

    }

    private static int getRandomValue()
    {
        Random random = new Random();
        return random.nextInt( 10);
    }

}