package task3;

public class IsoscelesTriangle {
    public static void main(String[] args) {


        int a = 10;
        int b = 5;
        int c = 9;

        if (a == b || b == c || a == c) {
            System.out.println("it's an isosceles triangle");
        } else {
            System.out.println("it is not an isosceles triangle");
        }
    }
}

