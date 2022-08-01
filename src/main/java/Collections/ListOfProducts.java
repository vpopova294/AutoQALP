package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfProducts {
    public static void main(String[] args) {



        List<Product> list = new ArrayList<>();
                list.add(new Product("Bread", 1, 31));
                list.add(new Product("Milk", 5, 12));
                list.add(new Product("Cheese", 1, 149));
                list.add(new Product("Oranges", 4, 92));
                list.add(new Product("Cookie", 2, 58));





        for (Product product: list) {
            System.out.println("Unsorted list: " + product.name + ", quantity: " + product.quantity + ", price: " + product.price);
        }


        Collections.sort(list);
        System.out.println("Sorted list by price: " + list);


        list.sort(Comparator.comparing(Product::getName));
        System.out.println("Sorted list by name: " + list);
//        for (Product list1: list){
//            System.out.println(list1);


    }


}

