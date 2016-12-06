/* Ellie Xu             
 * 11. 16. 2016.
 * Converting numbers to words. 
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.u5;

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
        sopl("Type in a numner between 1 and 999.");
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
            sopl("Nope, chose a number between 0 and 999.");
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
                sop("TEN");
                break;
            case "11":
                sop("ELEVEN");
                break;
            case "12":
                sop("TWELVE");
                break;
            case "13":
                sop("THIRTEEN");
                break;
            case "15":
                sop("FIFTEEN");
                break;
            case "18":
                sop("EIGHTEEN");
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
                sop("TEEN");
        }
    }

    public static void hundreds() {
        sop("HUNDRED");
    }

    public static void tens(String num1) {
        //Variables
        int a;

        switch (num1.charAt(num1.length() - 2)) {
            case '1':
                teens(num1);
                break;
            case '2':
                sop("TWENTY ");
                break;
            case '3':
                sop("THIRTY ");
                break;
            case '4':
                sop("FOURTY ");
                break;
            case '5':
                sop("FIFTY ");
                break;
            case '6':
                sop("SIXTY ");
                break;
            case '7':
                sop("SEVENTY ");
                break;
            case '8':
                sop("EIGHTY ");
                break;
            case '9':
                sop("NINETY ");
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
                sop("ONE");
                break;
            case '2':
                sop("TWO");
                break;
            case '3':
                sop("THREE");
                break;
            case '4':
                sop("FOUR");
                break;
            case '5':
                sop("FIVE");
                break;
            case '6':
                sop("SIX");
                break;
            case '7':
                sop("SEVEN");
                break;
            case '8':
                sop("EIGHT");
                break;
            case '9':
                sop("NINE");
        }
    }
}
