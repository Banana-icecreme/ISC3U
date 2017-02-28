/*
 * Ellie X.
 * Sept. 30, 2016
 * Version 1.0
 * Questions & Answers, and money stuff
 */
package ca.hdsb.gwss.elliex.ics3u.u3;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1xuell
 */
public class QuestionsAndAnswers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Questions and Answers
        String name;
        int age = 16;
        ///Objects
        Scanner input = new Scanner(System.in);
        ///Example
        System.out.println("What it your name?");
        name = input.nextLine();
        System.out.println("Hi " + name);
        System.out.println(" ");
        System.out.println("How old are you?");
        age = input.nextInt();
        System.out.println(age + " cool");

        //money
        double a = 232132;
        //Objects
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(1);
        decimal.setMaximumFractionDigits(5);
        System.out.println(" ");
        System.out.println(currency.format(a));

    }

}
