/*
 * Ellie Xu 
 * Oct 21, 2016
 * Version 1.0
 * Unit four assignment due Tuesday 
 */
package ca.hdsb.gwss.elliex.ics3u.u4;

import java.text.NumberFormat;
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
        System.out.println("Type 1 for Acidic rain.");
        System.out.println("Type 2 for Is This A Triangle?");
        System.out.println("Type 3 for Is this a Right-Angled Triangle?");
        System.out.println("Type 4 for BMI.");
        System.out.println("Type 5 for Canada Post.");
        int answer = input.nextInt();

        if (answer == 1) {
            //Acid rain 
            // To see if the rain is suitable for fish.
            //variable
            final double lowPh;
            double ph;
            final double highPh;
            System.out.println("ACIDIC RAIN");
            System.out.println("Acid rain is an environmental problem. This program determines if the pH level in water is safe for fish.");
            System.out.println("");
            System.out.println("What is the pH level?");
            ph = input.nextDouble();
            lowPh = 6.45;
            highPh = 7.45;

            if (ph <= highPh && ph >= lowPh) {
                System.out.println("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
            } else if (ph >= 0 && ph < lowPh) {
                System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
            } else if (ph > highPh && ph <= 14) {
                System.out.println("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
            } else if (ph < 0) {
                System.out.println("BAD DATA");
                System.out.println("If something that acidic ever come into being, please "
                        + "don't drink it.");

            } else {
                System.out.println("BAD DATA");
            }

        } else if (answer == 2) {
            //Is this a triangle?
            //variables
            double a;
            double b;
            double c;

            System.out.println("Triangle");
            System.out.println("Three numbers represent the sides of a triangle when the sum of "
                    + "any two sides is greater than the third side. This program has the user enter three"
                    + "lengths of sides and determines whether the figure is a triangle or not.");
            System.out.println("");
            System.out.println("Enter length of side a: ");
            a = input.nextDouble();
            System.out.println("Enter length of side b: ");
            b = input.nextDouble();
            System.out.println("Enter length of side c: ");
            c = input.nextDouble();

            if (a > 0 && b > 0 && c > 0) {
                if (a >= b + c || b >= a + c || c >= b + a) {
                    System.out.println("These won't make any triangles.");
                } else {
                    System.out.println("These sides will make a triangle.");
                }

            } else {
                System.out.println("BAD DATA");
            }

        } else if (answer == 3) {
            //Is this a Right-Angeled Triangle?

            //Variables
            double a;
            double b;
            double c;
            
            System.out.println("Right Triangle");
            System.out.println("A right-angled triangle has the property that when the values of the lengths of the sides are squared, the sum of two smaller"
                    + "values is equal to the larger value. This program asks the user to enter three values and then determines wether the triangle "
                    + "created is a right-triangle or not.");
            System.out.println("");
            System.out.println("Enter length of side a: ");
            a = input.nextDouble();
            System.out.println("Enter length of side b: ");
            b = input.nextDouble();
            System.out.println("Enter length of side c: ");
            c = input.nextDouble();

            if (a > 0 && b > 0 && c > 0) {
                if (a >= b + c || b >= a + c || c >= b + a) {
                    System.out.println("These won't make any triangles.");
                } else if (b * b + c * c == a * a || a * a + c * c == b * b || a * a + b * b == c * c) {
                    System.out.println("These sides will make a right angle triangle.");
                } else {
                    System.out.println("These sides will not make a right angle triangle.");
                }

            } else if ((a == 0 || b == 0 || c == 0) && a + b + c > 0) {
                System.out.println("Dude, that's not even a triangle. That's a line.");
            } else {
                System.out.println("BAD DATA");
            }

        } else if (answer == 4) {
            //BMI 
            /*Measure of  the weight of a 
        * person scaled according to their height. 
        * BMI is defined as the individual's body weight divided by the square 
        * of their height. It is almost always expressed in the unit kg/m2.
             */
            // VARIABLES
            double bmi;
            int ans;
            double height;
            double weight;
            // OBJECTS
            NumberFormat number = NumberFormat.getIntegerInstance();

            System.out.println("BMI");
            System.out.println("");
            System.out.println("What is your height in meters/inches?");
            height = input.nextDouble();
            System.out.println("What is your weight in kg/lbs?");
            weight = input.nextDouble();
            System.out.println("");
            System.out.println("Type 1 for imperial system; type 2 for metric system.");
            ans = input.nextInt();

            // IF metric vs imperial
            if (ans == 1) {
                bmi = (weight * 703) / (height * height);
                System.out.println("Your BMI is: " + number.format(bmi));
            } else if (ans == 2) {
                bmi = weight / (height * height);
                System.out.println("Your BMI is: " + number.format(bmi));
            } else {
                bmi = 0;
                System.out.println("I think you have a typo.");
            }

            if ((ans == 1 || ans == 2) && bmi > 0) {
                if (weight > 0 && height > 0 && weight < 1000 && height < 110) {
                    if (bmi < 16) {
                        System.out.println("Starvation");
                    } else if (bmi < 18) {
                        System.out.println("Underweight");
                    } else if (bmi <= 24) {
                        System.out.println("Ideal");
                        System.out.println("Yayyyyyyyy. You're ideal!!!");
                    } else if (bmi <= 30) {
                        System.out.println("Overweight");
                    } else if (bmi <= 40) {
                        System.out.println("Obese");
                    } else if (bmi <= 55) {
                        System.out.println("Morbidly Obese");
                    } else {
                        System.out.println("BAD DATA");
                    }
                } else {
                    System.out.println("BAD DATA");
                }
            }

        } else if (answer == 5) {
            //Canada Post
            //variables
            int cass;
            double mass;
            double a;
            double b;
            double c;
            double d;
            //objects
            NumberFormat currency = NumberFormat.getCurrencyInstance();

            System.out.println("Canada Post");
            System.out.println("This program will calculate the cost of sending"
                    + " a first class or second class letter depending on the mass "
                    + "of the letter.");
            System.out.println("");
            System.out.println("Enter letter class: 1 for first class; 2 for second class");
            cass = input.nextInt();
            System.out.println("Enter the mass of the letter (in grams).");
            mass = input.nextDouble();

            if (cass == 1) {
                //variables 
                a = 0.4;
                b = 0.6;
                c = 0.8;
                d = 0.29;
            } else if (cass == 2) {
                //variables 
                a = 0.3;
                b = 0.5;
                c = 0.6;
                d = 0.19;
            } else {
                a = 0;
                b = 0;
                c = 0;
                d = 0;
                System.out.println("There is no such class.");
            }
            if ((cass == 1 || cass == 2) && a > 0) {
                System.out.println("The Cost of sending a letter is: ");
                if (mass >= 0 && mass <= 30) {
                    System.out.println(currency.format(a));

                } else if (mass > 30 && mass <= 50) {
                    System.out.println(currency.format(b));
                } else if (mass > 50) {
                    if (mass <= 100) {
                        System.out.println(currency.format(c));
                    }
                    if (mass > 100) {
                        double cost = c + Math.floor((mass - 100) / 50) * d;
                        System.out.println(currency.format(cost));
                    }
                } else {
                    System.out.println("BAD DATA");
                }
            }
        } else {
            System.out.println("There is no such program... yet.");
        }
    }
}
