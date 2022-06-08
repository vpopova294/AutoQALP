package task3;

public class NumbersMagnitude {
    public static void main(String[] args) {
        int number1 = -10;
        int number2 = 4;


        if (number1 < number2) {
            System.out.println(Math.abs(number2) + " has less magnitude");
        } else if (number1 > number2) {
            System.out.println(Math.abs(number2) + " has more magnitude");
        } else
            System.out.println("the same ones");
    }
}
