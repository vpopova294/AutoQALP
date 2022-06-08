package task3;

public class PrintMonthInWord {
    public static void main(String[] args) {


    // if..else if

        int month = 10;

        if (month == 1) {
            System.out.println("JAN");
        } else if (month == 2) {
            System.out.println("FEB");
        } else if (month == 3) {
            System.out.println("MAR");
        } else if (month == 4) {
            System.out.println("APR");
        } else if (month == 5) {
            System.out.println("MAY");
        } else if (month == 6) {
            System.out.println("JUN");
        } else if (month == 7) {
            System.out.println("JUL");
        } else if (month == 8) {
            System.out.println("AUG");
        } else if (month == 9) {
            System.out.println("SEP");
        } else if (month == 10) {
            System.out.println("OCT");
        } else if (month == 11) {
            System.out.println("NOV");
        } else if (month == 12) {
            System.out.println("DEC");
        } else
        System.out.println("Not a valid month");

// switch-case

        int month1 = 32;

        switch (month1) {
            case 1:
                System.out.println("JAN");
                break;
            case 2:
                System.out.println("FEB");
                break;
            case 3:
                System.out.println("MAR");
            case 4:
                System.out.println("APR");
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUN");
            case 7:
                System.out.println("JUL");
            case 8:
                System.out.println("AUG");
            case 9:
                System.out.println("SEP");
            case 10:
                System.out.println("OCT");
            case 11:
                System.out.println("NOV");
            case 12:
                System.out.println("DEC");
            case 13:
                System.out.println("Not a valid month");
            default:
                System.out.println("incorrect month value");

        }
    }

}

