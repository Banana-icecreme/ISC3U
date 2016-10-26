/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        int a, b, c, d;
        String e;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Start number");
        a = Integer.parseInt( input.nextLine() );
        System.out.println("The loop is bigger and equal to: ");
        b = Integer.parseInt( input.nextLine() );
        System.out.println("The loop is smaller and equal to: ");
        c = Integer.parseInt( input.nextLine() );
        System.out.println("Value for the assignment statement:");
        d = Integer.parseInt( input.nextLine() );
        System.out.println("Assignment Statment:");
        e = input.nextLine();
        
        if (e.equals(+) "+" || e == "-") {
            if (e == "-") {
                int d2 = d * -1;
            }
            for (; a >= b && a <= c; a += d) {
                System.out.println(a);
            }
        }
    }
}
