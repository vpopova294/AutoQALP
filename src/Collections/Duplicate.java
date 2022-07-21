package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicate {


    public static void main(String[] args) {

        List<Integer> duplicatenumbers = new ArrayList<>();

        duplicatenumbers.add(31);
        duplicatenumbers.add(12);
        duplicatenumbers.add(12);
        duplicatenumbers.add(149);
        duplicatenumbers.add(59);
        duplicatenumbers.add(59);

        duplicatenumbers.add(525);
        duplicatenumbers.add(90);
        duplicatenumbers.add(61);
        duplicatenumbers.add(525);
        duplicatenumbers.add(90);
        duplicatenumbers.add(59);

        System.out.println("List " + duplicatenumbers);

         // way 1
         Set<Integer> set = new LinkedHashSet(duplicatenumbers);

        List<Integer> listWithoutDuplicates = new ArrayList<>(set);

        System.out.println("Deletion duplicates 1 " +  listWithoutDuplicates);


        //way2

        List<Integer> list1 = duplicatenumbers.stream()
                .collect(Collectors.toSet())
                .stream()
                .collect(Collectors.toList());
        System.out.println("Deletion duplicates 2" + list1);


        Map<Object, Integer> frequency = duplicatenumbers.stream()
                        .collect(Collectors.toMap(
                                e -> e,
                                e -> 1,
                                Integer::sum));

        frequency.forEach((k,v) -> System.out.println("Duplicate quantity for " + k + ": " + v));


    }
}


