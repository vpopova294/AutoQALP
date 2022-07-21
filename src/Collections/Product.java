package Collections;


import java.util.Comparator;

public class Product implements Comparable<Product> {

    String name;
    int quantity;
    int price;


    Product(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }



    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }

    @Override
    public int compareTo(Product o) {
        //if (this.price > o.price ) return 1;
        // if (this.price < o.price ) return -1;
        return this.price - o.getPrice();
    }



     @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", quantity='" + quantity + '\'' +
                ", price=" + price;

     }

    Comparator<Product> comparator = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}
