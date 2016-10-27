/*
 * Ellie T. Xu
 * October something of 2016. Nvm, it's the 26th
 * Version numero une point une.
 * A system to repeat a mathmatical action over and over again. Aka a math loop. 
 */
package ca.hdsb.gwss.elliex.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1xuell
 */
public class Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // loop
        int a, b, c;
        double d, d2;
        String e;

        Scanner input = new Scanner(System.in);
        System.out.println("Start number");
        a = Integer.parseInt(input.nextLine());
        System.out.println("The loop is bigger and equal to: ");
        b = Integer.parseInt(input.nextLine());
        System.out.println("The loop is smaller and equal to: ");
        c = Integer.parseInt(input.nextLine());
        System.out.println("Value for the assignment statement:");
        d = Integer.parseInt(input.nextLine());
        System.out.println("Assignment Statment:");
        e = input.nextLine();

        if (e.equals("+") || e.equals("-")) {
            if (e.equals("-")) {
                d2 = d * -1;
            } else {
                d2 = d;
            }
            for (; a >= b && a <= c; a += d2) {
                System.out.println(a);
            }
        } else if (e.equals("/")) {
            if (a == 0 || d == 0) {
                System.out.println("0\n0");
            } else {
                for (; a >= b && a <= c; a /= d) {
                    System.out.println(a);
                }
            }
        } else if (e.equals("*")) {

            if (a == 0 || d == 0) {
                System.out.println("0\n0");
            } else {
                for (; a >= b && a <= c; a *= d) {
                    System.out.println(a);
                }

            }
        } else {
            System.out.println("There is no such assignment statement.");
        }
    }
}
