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
public class IfAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // age and year
        Scanner input = new Scanner(System.in);
        System.out.println("When were you born?");
        int born = input.nextInt();
        System.out.println("What yeat is it right now?");
        int year = input.nextInt();
        
        //calculation
        if (born > year) {
            int age = 100 - born + year;
            System.out.println("Your age is: " + age);
        }
        else if ( born == year){
            System.out.println("You are either 100 or 0 years old.");
        }
        else {
            int age = year - born;
            System.out.println("Your age is: " + age);
        }
       
    }
    
}
