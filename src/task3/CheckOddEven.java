package task3;

public class CheckOddEven {
    public static void main(String[] args) {

        // condition  if..else if

//        int number1 = 13;
//        int number2 = 8;
//
//        if (number1 % 2 == 0) {
//            System.out.println("BYE Odd Number");
//        } else if (number2 % 2 == 0) {
//            System.out.println(" BYE Even Number");
//        }


        // ternary

        int number = 5;

        String result;
        result = number % 2 == 0 ? "BYE Even Number" : "BYE Odd Number" ;
        System.out.println(result);




    }
}
