/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.elliex.ics3u.u3;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1XUELL
 */
public class QuestionAndAnswer {
    //Question and Answer
        int age = 16;
        String name;
        ///objects
        Scanner input = new Scanner (System.in);
        ///Example 
        System.out.println(" ");
        System.out.println("What is your name");
        name = input.nextLine();
        System.out.println("hi "+name);
        System.out.println(" ");
        System.out.println("What is your age");
        age = input.nextInt();
        System.out.println(age + ", cool");        
                
         //money
        double subtotal = 232.2323223;
        ///Objects
        NumberFormat currency
                = NumberFormat.getCurrencyInstance();
        NumberFormat decimal
                = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(1);
        decimal.setMaximumFractionDigits(5);
        System.out.println(" ");
        System.out.println(currency.format(subtotal));        
              
                
}
