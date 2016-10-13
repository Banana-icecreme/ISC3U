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
public class IfAlien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*TroyMartian, who has at least 3 antenna and at most 4 eyes;
        * VladSaturnian, who has at most 6 antenna and at least 2 eyes;
        * GraemeMercurian, who has at most 2 antenna and at most 3 eyes.
         */

        //data collection
        Scanner input = new Scanner(System.in);
        System.out.println("How many antenna(s) does the alien have?");
        int an = input.nextInt();
        System.out.println("How many eye(s) does the alien have?");
        int eye = input.nextInt();

        //calculation
        if (an >= 3 && eye <= 4 && eye >= 0) {
            System.out.println("TroyMartian");
        }
        if (an <= 6 && an >= 0 && eye >= 2) {
            System.out.println("VladSaturnian");
        }
        if (an <= 2 && an >= 0 && eye <= 3 && eye >= 0) {
            System.out.println("GraemeMercurian");
        } 
        else if (!(an >= 3 && eye <= 4 && eye >= 0)||
                !(an <= 6 && an >= 0 && eye >= 2) && eye >= 3 &&
                an >= 2 ) {
            System.out.println("Unkown species.");
        }
        else {
            System.out.println("That's impossible");
        }

    }

}
