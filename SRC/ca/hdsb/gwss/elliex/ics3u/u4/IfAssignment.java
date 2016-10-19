/*
 * Ellie Xu 
 * Oct 19, 2016
 * Version 1.0
 * Unit four assignment due Tuesday 
 */
package ca.hdsb.gwss.elliex.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1xuell
 */
public class IfAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Type 1 for Acidic rain");
        System.out.println("Type 2 for Is This A Triangle?");
        System.out.println("Type 3 for Is this a Right-Angled Triangle?");
        int answer = input.nextInt();
        //Acid rain 
        if (answer == 1) {
            System.out.println("ACIDIC RAIN");
            System.out.println("Acid rain is an environmental problem. This program determines if the pH level in water is safe for fish.");
            System.out.println("");
            System.out.println("What is the pH level?");
            double ph = input.nextDouble(); 
            final double lowPh = 6.45; 
            final double highPh = 7.45;
            if (ph <= highPh && ph >= lowPh) {
                System.out.println("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
            }
            else if (ph >= 0 && ph < lowPh ) {
                System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
            }
            else if (ph > highPh && ph <= 14) {
                System.out.println("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
            }
            else if (ph <0 ) {
                System.out.println("BAD DATA");
                System.out.println("If something that acidic ever come into being, please "
                        + "don't drink it.");
                
            }
            else {
                System.out.println("BAD DATA");
            }
        }
        //is this a triangle
        else if (answer == 2) {
            System.out.println("Triangle");
            System.out.println("Three numbers represent the sides of a triangle when the sum of "
                    + "any two sides is greater than the third side. This program has the user enter three"
                    + "lengths of sides and determines whether the figure is a triangle or not.");
            System.out.println("");
            System.out.println("Enter length of side a: ");
            double a = input.nextDouble();
            System.out.println("Enter length of side b: ");
            double b = input.nextDouble();
            System.out.println("Enter length of side c: ");
            double c = input.nextDouble();
            
            if (a>0 && b> 0 && c> 0) {
            if (a>b && a>c){
                if (a < b + c) {
                    System.out.println("These sides can make a triangle");
                }
                else {
                    System.out.println("These sides cannot make a triangle");
                }
            }
            else if (b>a && b>c) {
                if (b < a+c) {
                    System.out.println("These sides can make a triangle");
                }
                else {
                    System.out.println("These sides cannot make a triangle");
                }
            }
            else if (c>a && c>b) {
                if (c < b+a) {
                    System.out.println("These sides can make a triangle");
                }
                else {
                    System.out.println("These sides cannot make a triangle");
                }
            }
            }
            else {
                System.out.println("BAD DATA");
            }
        }
        
        //Is this a Right-Angled Triangle?
        else if (answer == 3) {
            System.out.println("Right Triangle");
            System.out.println("A right-angled triangle has the property that when the values of the lengths of the sides are squared, the sum of two smaller"
                    + "values is equal to the larger value. This program asks the user to enter three values and then determines wether the triangle "
                    + "created is a right-triangle or not.");
            System.out.println("");
            System.out.println("Enter length of side a: ");
            double a = input.nextDouble();
            System.out.println("Enter length of side b: ");
            double b = input.nextDouble();
            System.out.println("Enter length of side c: ");
            double c = input.nextDouble();
            
            
        }
        
        else {
            System.out.println("There is no such program... yet.");
        }
        
    }
    
}
