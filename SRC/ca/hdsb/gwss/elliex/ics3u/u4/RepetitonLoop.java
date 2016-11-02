/*
 * Ellie Xu 
 * Started on halloween, and finished on the second day of november.
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

            System.out.println("\nType 1 for Ounce & Grams \nType 2 for Compund Interest\nType 3 for "
                    + "Closer to Two\n"
                    + "Type 4 for the Fibonacci Sequence\n"
                    + "Type 5 for Lab Animals\n"
                    + "Type 6 for Erosion");

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
                case 6:
                    Erosion();
                    break;
                default:
                    System.out.println("There is no such program.");
            }
            System.out.println("\nWould you like to start over?\nType 1 for yes.\nType any other number to exit.");
            over = input.nextInt();

        } while (over == 1);
    }

    public static void ouncesToGrams() {
        //objects
        NumberFormat number = NumberFormat.getIntegerInstance();
        Scanner input = new Scanner(System.in);
        //vari
        double gram;
        //output
        System.out.println("\nThis program will print out a titled table that can \n"
                + "be used to convert ounces to grams, for values from 1 to 15. \n"
                + "(1 ounce = 28.35 grams)\n");
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
System.out.println ("\nThis program will print out a title table that will display \n"
        + "the amount of a yearly investment over a period of up to 15 years.\n");
        System.out.print("How many years?");
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
        long demoniator = 1;
        double b = 0;
        System.out.println("\n This program demonstrates that the result of adding \n"
                + "the numbers 1, 1/2, 1/4, 1/16, ... and so on gets closer to 2 \n"
                + "without becoming 2.\n ");

        while (b < 2) {
            System.out.print(b + "+" + "1/" + demoniator + " = ");
            b += 1.0/demoniator;
            System.out.println(b);
            demoniator *= 2; 
        }
    }

    public static void FibonacciSequence() {
        //vari 
        int a = 1;
        int b = 0;
        int c;

        System.out.println("\nThis program will print the first twenty terms of the Fibonacci Series.\n");
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

        System.out.println("\nAt present there are X animals in the lab and enough \n"
                + "food for Y animals. At the end of every hour the population \n"
                + "doubles, and enough food is added to support Z more animals. \n"
                + "During any hour the animals will eat enough food for only \n"
                + "themselves. The program will determine when the population \n"
                + "will outgrow the food supply.\n");
        //objects
        Scanner input = new Scanner(System.in);
        System.out.print("Intial supply of food: ");
        food = input.nextInt();
        System.out.print("Intial population: ");
        population = input.nextInt();

        if (population > 0 && food > 0 && population <= food) {
            System.out.format("%5s %15s %15s \n", "hour", "population at end", "food at end");
            while ( population <= food){
            food += (4000 - population);
                System.out.format("%5s %15s %15s \n", hour, population, food);
                population *= 2;
                hour++;
            }
        } else {
            System.out.println("BAD DATA");
        }
    }

    public static void Erosion() {
        //vari
        double soil = 30;
        int year;

        System.out.println("\nCareless land management causes approximately 1\n"
                + "percent of the topsoil to erode each year. It is then lost\n"
                + "forever, since it takes nature approximately 500 years to\n"
                + "produce 2.5 cm of topsoil. At 9 cm the topsoil is so shallow\n"
                + "that crops cannot be grown on a large scale. If Canada has\n"
                + "about 30 cm of topsoil, how many years will it take for\n"
                + "the depth to be reduced to 9 cm?\n");
        for (year = 0; soil > 9; year++) {
            soil = soil - (soil * 0.01) + 0.005;
        }
        System.out.println("It will take " + year + " years for the soil to erode to a depth such that crops will not grow.");
    }
}
