/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.elliex.ics3u.u4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1xuell
 */
public class RepetitonLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int program;
        int over;

        //objects 
        Scanner input = new Scanner(System.in);

        do {

            System.out.println("Type 1 for Ounce & Grams \nType 2 for Compund Interest\n"
                    + "");
            program = input.nextInt();

            switch (program) {
                case 1:
                    ouncesToGrams();
                    break;
                case 2:
                    compoundInterest();
                    break;
            }
            System.out.println("\nWould you like to start over?\nType 1 for yes.\nType any other number to exit.");
            over = input.nextInt();

        } while (over == 1);

    }

    public static void ouncesToGrams() {
        NumberFormat number = NumberFormat.getIntegerInstance();
        Scanner input = new Scanner(System.in);
        double gram;
        System.out.format("%10s %10s\n", "Ounces", "Grams");
        for (int o = 0; o <= 15; o++) {
            gram = o * 28.35;
            System.out.format("%10s %10s\n", o, number.format(gram));
        }
    }

    public static void compoundInterest() {
        Scanner input = new Scanner(System.in);
        int year;
        double interest;
        double invest;
        NumberFormat number = NumberFormat.getIntegerInstance();

        System.out.println("How many years?");
        year = input.nextInt();
        System.out.println("How much money invested?");
        invest = input.nextDouble();
        System.out.println("What is the interest per year in percentage.");
        interest = input.nextDouble();

        System.out.format("%5s %10s %10s %10s \n", "Year", "$ Invested", "Interest", "Total");
        for (int m = 1; m <= year; m++) {
            double interest1 = invest * (interest / 100);
            double total = interest1 + invest;
            System.out.format("%5s %10s %10s %10s \n", m, number.format(invest), number.format(interest1), number.format(total));
            invest = total;
        }
    }

}
