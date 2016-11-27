/* Ellie Xu             
 * 11. 16. 2016.
 * creating new Methods. 
 * Version 10. 
 */
package ca.hdsb.gwss.elliex.ics3u.u5;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sop;
import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import java.util.Scanner;
import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sop;
import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;

/**
 *
 * @author 1xuell
 */
public class NumbersToWords2 {
//global variables

    public static double distance, time;
    public static int num;
    public static String num1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in a numner between 1 and 999.");
        num = input.nextInt();

        //int num2 = num;
        //while (num2 < 1000) {
        num1 = Integer.toString(num);
        if (num < 10 && num > -1) {
            ones(num1);
        } else if (num > 9 && num < 20) {
            teens(num1);
        } else if (num > 19 && num < 100) {
            tens(num1);
        } else if (num > 99 && num < 1000) {
            ones(num1);
            sop(" ");
            hundreds();
            sop(" ");
            tens(num1);
        } else {
            System.out.println("Nope, chose a number between 0 and 999.");
        }
        sopl("");
        // num2++;
        // num = num2;
        //}
    }

    public static void teens(String num1) {
        //variables
        int length, a;

        length = num1.length() - 2;
        switch (num1.substring(length)) {
            case "10":
                System.out.print("TEN");
                break;
            case "11":
                System.out.print("ELEVEN");
                break;
            case "12":
                System.out.print("TWELVE");
                break;
            case "13":
                System.out.print("THIRTEEN");
                break;
            case "15":
                System.out.print("FIFTEEN");
                break;
            case "18":
                System.out.print("EIGHTEEN");
                break;
            case "14":
            case "16":
            case "17":
            case "19":
                if (num > 99) {
                    a = Integer.parseInt(num1.charAt(num1.length() - 3) + "");
                    num = num - (a * 100);
                }
                ones(num1);
                System.out.print("TEEN");
        }
    }

    public static void hundreds() {
        System.out.print("HUNDRED");
    }

    public static void tens(String num1) {
        //Variables
        int a;

        switch (num1.charAt(num1.length() - 2)) {
            case '1':
                teens(num1);
                break;
            case '2':
                System.out.print("TWENTY ");
                break;
            case '3':
                System.out.print("THIRTY ");
                break;
            case '4':
                System.out.print("FOURTY ");
                break;
            case '5':
                System.out.print("FIFTY ");
                break;
            case '6':
                System.out.print("SIXTY ");
                break;
            case '7':
                System.out.print("SEVENTY ");
                break;
            case '8':
                System.out.print("EIGHTY ");
                break;
            case '9':
                System.out.print("NINETY ");
        }
        if (num > 99) {
            a = Integer.parseInt(num1.charAt(num1.length() - 3) + "");
            num = num - (a * 100);
        }
        if (num1.charAt(num1.length() - 2) != '1') {
            ones(num1);
        }
    }

    public static void ones(String num1) {
        //varibales
        int number;

        if (num < 100) {
            number = 1;
        } else {
            number = 3;
        }

        switch (num1.charAt(num1.length() - number)) {
            case '1':
                System.out.print("ONE");
                break;
            case '2':
                System.out.print("TWO");
                break;
            case '3':
                System.out.print("THREE");
                break;
            case '4':
                System.out.print("FOUR");
                break;
            case '5':
                System.out.print("FIVE");
                break;
            case '6':
                System.out.print("SIX");
                break;
            case '7':
                System.out.print("SEVEN");
                break;
            case '8':
                System.out.print("EIGHT");
                break;
            case '9':
                System.out.print("NINE");
        }
    }
}
