/*
 * Ellie Xu 
 * 299th day of 2016
 * verison 1.0
 * Calculator that can calculate numbers
 */
package ca.hdsb.gwss.elliex.ics3u.u4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1xuell
 */
public class CASESwitchCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variabels
        double a, b, c, num;
        //objects
        Scanner input = new Scanner(System.in);
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);

        System.out.println("Input 'a' value");
        a = input.nextDouble();
        System.out.println("Input 'b' value");
        b = input.nextDouble();
        System.out.println(" Type 1 for Addition\n Type 2 for Subtraction\n Type 3 for Multiplication"
                + "\n Type 4 for Division\n Type 5 to Exit");
        num = input.nextInt();
        switch ((int) num) {
            case 1:
                c = a + b;
                System.out.println(a + " + " + b + " = " + nej.format(c));
                break;
            case 2:
                c = a - b;
                System.out.println(a + " - " + b + " = " + nej.format(c));
                break;
            case 3:
                c = a * b;
                System.out.println(a + " x " + b + " = " + nej.format(c));
                break;
            case 4:
                c = a / b;
                System.out.println(a + " / " + b + " = " + nej.format(c));
                break;
            case 5:
                System.out.println("exit");
                break;
            default:
                System.out.println("Invalid Entry");
        }

    }
}
