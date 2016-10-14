/*
 * Ellie 
 * Oct. 13, 2016
 * V.1.0
 * If statments
 */
package ca.hdsb.gwss.elliex.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author elli
 */
public class If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type 1 for 'Y2K PROBLEM DETECTOR'.");
        System.out.println("Type 2 for 'WHICH ALIEN'.");
        System.out.println("Type 3 for 'THE CELL SELL'.");
        int answer = input.nextInt();
        if (answer == 1) {
            //Y2K PROBLEM DETECTOR
            // age and year
            System.out.println("When were you born?");
            int born = input.nextInt();
            System.out.println("What yeat is it right now?");
            int year = input.nextInt();

            //calculation
            if (born > year && year < 100 && born < 100 && year >= 0 && born >= 0) {
                int age = 100 - born + year;
                System.out.println("Your age is: " + age);
            } else if (born == year && year < 100 && born < 100 && year >= 0 && born >= 0) {
                System.out.println("You are either 100 or 0 years old.");
            } else if (year >= born && year < 100 && born < 100 && year >= 0 && born >= 0) {
                int age = year - born;
                System.out.println("Your age is: " + age);
            } else {
                System.out.println("Invalid data.");
            }
        }
        if (answer == 2) {
            //WHICH ALIEN
            //data collection
            System.out.println("How many antenna(s) does the alien have?");
            int an = input.nextInt();
            System.out.println("How many eye(s) does the alien have?");
            int eye = input.nextInt();

            //result
            if (an >= 0 && eye >= 0) {
                System.out.println("The alien can be: ");
                if (an >= 3 && eye <= 4 && eye >= 0) {
                    System.out.println("TroyMartian");
                }
                if (an <= 2 && an >= 0 && eye <= 3 && eye >= 0) {
                    System.out.println("GraemeMercurian");
                }
                if (an <= 6 && an >= 0 && eye >= 2) {
                    System.out.println("VladSaturnian");
                } else if ((an < 3 && eye > 4) || eye >= 3 && an >= 2) {
                    System.out.println("Unkown species.");
                }
            } else {
                System.out.println("INVALID DATA");
            }
        }

        if (answer == 3) {
            //THE CELL SELL
            //data collection

            System.out.println("Number of day time minutes?");
            double day = input.nextDouble();
            System.out.println("Number of evening minutes?");
            double eve = input.nextDouble();
            System.out.println("Number of weekend minutes?");
            double wkend = input.nextDouble();

            //results
            double daym = (day - 100) * 0.25;
            double evem = eve * 0.15;
            double wkendm = wkend * 0.2;
            double total = daym + evem + wkendm;
            System.out.println("Plan A costs " + total);

            double daym2 = (day - 250) * 0.45;
            double evem2 = eve * 0.35;
            double wkendm2 = wkend * 0.25;
            double total2 = daym2 + evem2 + wkendm2;
            System.out.println("Plan B costs " + total2);
            if (total < total2) {
                System.out.println("Plan A is cheaper.");
            }
            if (total > total2){
                System.out.println("Plan B is cheaper.");
            }
        } else {
            System.out.println("There is no such program... yet.");
        }
    }
}
