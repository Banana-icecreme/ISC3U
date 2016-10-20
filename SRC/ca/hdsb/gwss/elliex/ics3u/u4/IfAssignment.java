/*
 * Ellie Xu 
 * Oct 19, 2016
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
            System.out.println("ACIDIC RAIN");
            System.out.println("Acid rain is an environmental problem. This program determines if the pH level in water is safe for fish.");
            System.out.println("");
            System.out.println("What is the pH level?");
            double ph = input.nextDouble();
            final double lowPh = 6.45;
            final double highPh = 7.45;
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

            if (a > 0 && b > 0 && c > 0) {
                if (a >= b && a >= c) {
                    if (a < b + c) {
                        System.out.println("These sides can make a triangle");
                    } else {
                        System.out.println("These sides cannot make a triangle");
                    }
                } else if (b >= a && b >= c) {
                    if (b < a + c) {
                        System.out.println("These sides can make a triangle");
                    } else {
                        System.out.println("These sides cannot make a triangle");
                    }
                } else if (c >= a && c >= b) {
                    if (c < b + a) {
                        System.out.println("These sides can make a triangle");
                    } else {
                        System.out.println("These sides cannot make a triangle");
                    }
                }
            } else {
                System.out.println("BAD DATA");
            }
        } else if (answer == 3) {
            //Is this a Right-Angled Triangle?
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

            if (a > 0 && b > 0 && c > 0) {
                if (a >= b && a >= c) {
                    if (b * b + c * c == a * a) {
                        System.out.println("These sides will make a right angle triangle.");
                    } else {
                        System.out.println("These sides will not make a right angle triangle.");
                        if (a >= b + c) {
                            System.out.println("These won't make any triangles.");
                        }
                    }
                } else if (b >= a && b >= c) {
                    if (a * a + c * c == b * b) {
                        System.out.println("These sides will make a right angle triangle.");
                    } else {
                        System.out.println("These sides will not make a right angle triangle.");
                        if (b >= a + c) {
                            System.out.println("These won't make any triangles.");
                        }
                    }
                } else if (c >= a && c >= b) {
                    if (a * a + b * b == c * c) {
                        System.out.println("These sides will make a right angle triangle.");
                    } else {
                        System.out.println("These sides will not make a right angle triangle.");
                        if (c >= b + a) {
                            System.out.println("These won't make any triangles.");
                        }
                    }
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
            System.out.println("BMI");
            System.out.println("");

            System.out.println("What is your height in meters/inches?");
            double height = input.nextDouble();
            System.out.println("What is your weight in kg/lbs?");
            double weight = input.nextDouble();
            System.out.println("");
            System.out.println("Type 1 for imperial system; type 2 for metric system.");
            int ans = input.nextInt();

            if (ans == 1) {
                NumberFormat number
                    = NumberFormat.getIntegerInstance();
                double bmi = (weight * 703) / (height * height);
                System.out.println("Your BMI is: " + number.format(bmi));
                if (weight >= 0 && height >= 0 && weight < 1000 && height < 110) {
                    if (bmi < 16) {
                        System.out.println("Starvation");
                    } else if (bmi >= 16 && bmi < 18) {
                        System.out.println("Underweight");
                    } else if (bmi >= 18 && bmi <= 24) {
                        System.out.println("Ideal");
                        System.out.println("Yayyyyyyyy. You're ideal!!!");
                    } else if (bmi >= 24 && bmi <= 30) {
                        System.out.println("Overweight");
                    } else if (bmi > 30 && bmi <= 40) {
                        System.out.println("Obese");
                    } else if (bmi < 40 && bmi <= 55) {
                        System.out.println("Morbidly Obese");
                    } else {
                        System.out.println("BAD DATA");
                    }
                } else {
                    System.out.println("BAD DATA");
                }
            } else if (ans == 2) {
                NumberFormat number
                    = NumberFormat.getIntegerInstance();
                double bmi = weight / (height * height);
                System.out.println("Your BMI is: "+ number.format(bmi));
                if (weight >= 0 && height >= 0 && weight < 500 && height < 3) {
                    if (bmi < 16 && bmi >= 0 && weight >= 0 && height >= 0) {
                        System.out.println("Starvation");
                    } else if (bmi >= 16 && bmi < 18) {
                        System.out.println("Underweight");
                    } else if (bmi >= 18 && bmi <= 24) {
                        System.out.println("Ideal");
                        System.out.println("Yayyyyyyyy. You're ideal!!!");
                    } else if (bmi >= 24 && bmi <= 30) {
                        System.out.println("Overweight");
                    } else if (bmi > 30 && bmi <= 40) {
                        System.out.println("Obese");
                    } else if (bmi < 40 && bmi <= 55) {
                        System.out.println("Morbidly Obese");
                    } else {
                        System.out.println("BAD DATA");
                    }
                } else {
                    System.out.println("BAD DATA");
                }

            } else {
                System.out.println("I think you have a typo.");
            }

        }

        else if (answer == 5) {
            //Canada Post
            System.out.println("Canada Post");
            System.out.println("This program will calculate the cost of sending"
                    + " a first class or second class letter depending on the mass "
                    + "of the letter.");
            System.out.println("");
            System.out.println("Enter letter class: 1 for first class; 2 for second class");
            int cass = input.nextInt();
            System.out.println("Enter the mass of the letter (in grams).");
            double mass = input.nextDouble();
            NumberFormat currency
                    = NumberFormat.getCurrencyInstance();

            if (cass == 1) {
                System.out.println("The Cost of sending a letter is: ");
                if (mass >= 0 && mass <= 30) {
                    final double price = 0.4;
                    System.out.println(currency.format(price));

                } else if (mass > 30 && mass <= 50) {
                    final double price = 0.6;
                    System.out.println(currency.format(price));
                } else if (mass > 50) {
                    final double price = 0.8;
                    if (mass <= 100) {
                        System.out.println(currency.format(price));
                    }
                    if (mass > 100) {
                        double cost2 = price + Math.floor((mass - 100) / 50) * 0.29;
                        System.out.println(currency.format(cost2));
                    }
                } else {
                    System.out.println("BAD DATA");
                }
            } else if (cass == 2) {
                System.out.println("The Cost of sending a letter is: ");
                if (mass >= 0 && mass <= 30) {
                    final double price = 0.3;
                    System.out.println(currency.format(price));

                } else if (mass > 30 && mass <= 50) {
                    final double price = 0.5;
                    System.out.println(currency.format(price));
                } else if (mass > 50) {
                    final double price = 0.6;
                    if (mass <= 100) {
                        System.out.println(currency.format(price));
                    }
                    if (mass > 100) {
                        double cost2 = price + Math.floor((mass - 100) / 50) * 0.19;
                        System.out.println(currency.format(cost2));
                    }
                } else {
                    System.out.println("BAD DATA");
                }
            } else {
                System.out.println("There is no such class.");
            }

        } else {
            System.out.println("There is no such program... yet.");
        }
    }
}
