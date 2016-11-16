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
                NumbersToWords();
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

    public static void NumbersToWords() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nType in a numner between 10 and 999.");
        num = input.nextInt();
        if (num > 9 && num < 20) {
            teens();
        } else if (num > 19 && num < 100) {
            tens();
        }
    }

    public static void teens() {
        switch (num) {
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
            default:
                System.out.println("NINETEEN");
        }
    }

    public static void tens() {
        String num1 = Integer.toString(num);
        switch (num1.charAt(0)) {
            case '2':
                System.out.println("TWENTY");
                break;
            case '3':
                System.out.println("THIRTY");
                break;
            case '4':
                System.out.println("FOURTY");
                break;
            case '5':
                System.out.println("FIFTY");
                break;
            case '6':
                System.out.println("SIXTY");
                break;
            case '7':
                System.out.println("SEVENTY");
                break;
            case '8':
                System.out.println("EIGHTY");
                break;
            default:
                System.out.println("NINETY");
                break;
        }
        ones();
    }

    public static void ones() {

    }
}
