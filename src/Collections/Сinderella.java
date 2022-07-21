package Collections;

import java.util.*;
import java.util.List;

public class Сinderella {
    public static void main(String[] args) {

        List<Integer> integerListMain = new ArrayList<>();
        Random random = new Random();
        for (int x = 0; x < 19; x++) {
            integerListMain.add(random.nextInt(100));
//            System.out.println(integerListMain);
//        for (int x = 0; x < 20; x++ ){
//            integerListMain.add(x);
            // System.out.println(integerListMain);
        }
        List<Integer> integerListThree = new ArrayList<>();
        List<Integer> integerListTwo = new ArrayList<>();
        List<Integer> integerListNeither = new ArrayList<>();



        for (int i : integerListMain) {

            if (i % 3 == 0 && i % 2 == 0) {
                integerListThree.add(i);
                integerListTwo.add(i);
            } else if (i % 3 == 0) {
                integerListThree.add(i);
            } else if (i % 2 == 0) {
                integerListTwo.add(i);
            } else {
                integerListNeither.add(i);
            }

        }
        printList(integerListThree);
        System.out.println("List of numbers 3 " + integerListThree);
        printList(integerListTwo);
        System.out.println("List of numbers 2 " + integerListTwo);
        printList(integerListNeither);
        System.out.println("List neither " + integerListNeither);

    }
    public static void printList(List<Integer> integerListMain) {
        for (int k: integerListMain)
            System.out.println( "Main list " + k);
    }
}
