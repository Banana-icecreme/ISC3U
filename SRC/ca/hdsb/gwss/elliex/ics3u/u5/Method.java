/* Ellie Xu             
 * 11. 16. 2016.
 * creating new Methods. 
 * Version 10. 
 */
package ca.hdsb.gwss.elliex.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1xuell
 */
public class Method {
//global variables

    public static double distance, time;
    public static int num;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int program;
        Scanner input = new Scanner(System.in);
        System.out.println("\nType 1 for Velocity.\nType 2 for Numbers to Words.");
        program = input.nextInt();
        switch (program) {
            case 1:
                Velocity();
                break;
            case 2:
                NumbersToWords2();
                break;
            default:
                System.out.println("There is no such program.");
        }
    }

    public static void Velocity() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nType in the distance in meters.");
        distance = input.nextDouble();
        System.out.println("\nType in the time in seconds.");
        time = input.nextDouble();
        VelocityCal();
    }

    public static void VelocityCal() {
        System.out.println(distance / time);
    }

    public static void NumbersToWords2() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nType in a numner between 0 and 999.");
        num = input.nextInt();
        if (num < 10 && num > -1) {
            ones();
        } else if (num > 9 && num < 20) {
            teens();
        } else if (num > 19 && num < 100) {
            tens();
        } else if (num > 99 && num < 1000) {
            ones();
            hundreds();
            tens();
        } else {
            System.out.println("Nope, chose a number between 0 and 999.");
        }
    }

    public static void teens() {
        String num1 = Integer.toString(num);
        int length = num1.length() - 2;
        switch (num.substring(length)) {
            case 10:
                System.out.println("TEN");
                break;
            case 11:
                System.out.println("ELEVEN");
                break;
            case 12:
                System.out.println("TWELVE");
                break;
            case 13:
                System.out.println("THIRTEEN");
                break;
            case 14:
                System.out.println("FOURTEEN");
                break;
            case 15:
                System.out.println("FIFTEEN");
                break;
            case 16:
                System.out.println("SIXTEEN");
                break;
            case 17:
                System.out.println("SEVENTEEN");
                break;
            case 18:
                System.out.println("EIGHTEEN");
                break;
            case 19:
                System.out.println("NINETEEN");
        }
    }

    public static void hundreds() {
        System.out.print("HUNDRED ");
    }

    public static void tens() {
        String num1 = Integer.toString(num);
        switch (num1.charAt(num1.length() - 2)) {
            case '1':
                teens();
                break;
            case '2':
                System.out.print("TWENTY");
                break;
            case '3':
                System.out.print("THIRTY");
                break;
            case '4':
                System.out.print("FOURTY");
                break;
            case '5':
                System.out.print("FIFTY");
                break;
            case '6':
                System.out.print("SIXTY");
                break;
            case '7':
                System.out.print("SEVENTY");
                break;
            case '8':
                System.out.print("EIGHTY");
                break;
            case '9':
                System.out.print("NINETY");
        }
        if (num > 100) {
            String a = num1.charAt(num1.length() - 3) + "";
            int aasint = Integer.parseInt(a);
            num = num - aasint * 100;
        }
        ones();
    }

    public static void ones() {
        String num1 = Integer.toString(num);
        int number;
        if (num < 100) {
            number = 1;
        } else {
            number = 3;
        }

        switch (num1.charAt(num1.length() - number)) {
            case '0':
                if (num < 10) {
                    System.out.println(" ZERO");
                }
                break;
            case '1':
                System.out.print(" ONE ");
            case '2':
                System.out.print(" TWO ");
                break;
            case '3':
                System.out.print(" THREE ");
                break;
            case '4':
                System.out.print(" FOUR ");
                break;
            case '5':
                System.out.print(" FIVE ");
                break;
            case '6':
                System.out.print(" SIX ");
                break;
            case '7':
                System.out.print(" SEVEN ");
                break;
            case '8':
                System.out.print(" EIGHT ");
                break;
            default:
                System.out.print(" NINE ");
        }
    }
}
