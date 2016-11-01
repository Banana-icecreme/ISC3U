/*
 * Ellie Xu 
 * first day of november 2016.
 * the one and only version of this program. Aka version 1.0
 * Reptition loop assignment of for and while loops. 
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
        int over = 0;

        //objects 
        Scanner input = new Scanner(System.in);

        do {

            System.out.println("Type 1 for Ounce & Grams \nType 2 for Compund Interest\nType 3 for "
                    + "Closer to Two\n"
                    + "Type 4 for the Fibonacci Sequence\n"
                    + "Type 5 for Lab Animals\n");

            program = input.nextInt();
            switch (program) {
                case 1:
                    ouncesToGrams();
                    break;
                case 2:
                    compoundInterest();
                    break;
                case 3:
                    CloserToTwo();
                    break;
                case 4:
                    FibonacciSequence();
                    break;
                case 5:
                    LabAnimals();
                    break;
                default:
                    System.out.println("There is no such program.");
            }
//            System.out.println("\nWould you like to start over?\nType 1 for yes.\nType any other number to exit.");
//            over = input.nextInt();

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
        NumberFormat number = NumberFormat.getCurrencyInstance();

        System.out.print("How many years? Max of 15 years.");
        year = input.nextInt();
        System.out.print("How much money invested?");
        invest = input.nextDouble();
        System.out.print("What is the interest per year in percentage?");
        interest = input.nextDouble();

        if (year >= 0 && year <= 15) {
            System.out.format("%5s %15s %15s %15s \n", "Year", "$ Invested", "Interest", "Total");
            for (int m = 1; m <= year; m++) {
                double interest1 = invest * (interest / 100);
                double total = interest1 + invest;
                System.out.format("%5s %10s %10s %10s \n", m, number.format(invest), number.format(interest1), number.format(total));
                invest = total;
            }
        } else {
            System.out.println("BAD DATA");
        }
    }

    public static void CloserToTwo() {
        double a = 2;
        double b = 0;
        double c;
        System.out.println(" ");

        while (b < 2) {
            a /= 2;
            System.out.print(b + "+" + a + " = ");
            b += a;
            System.out.print(b + "\n");

        }
    }

    public static void FibonacciSequence() {
        //vari 
        int a = 1;
        int b = 0;
        int c;

        System.out.print("\n");
        for (int term = 1; term <= 18; term++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

    public static void LabAnimals() {
        //vari
        int food;
        int population;
        int hour = 0;
        
        //objects
        Scanner input = new Scanner (System.in);
        System.out.print("Intial supply of food: ");
        food = input.nextInt();
        System.out.print("Intial population: ");
        population = input.nextInt();

        for (;food >= population; food += (4000-population)) {
            System.out.println(hour +""+ population +""+ food);
            population *= 2;
            hour ++;
        }
    }
}
