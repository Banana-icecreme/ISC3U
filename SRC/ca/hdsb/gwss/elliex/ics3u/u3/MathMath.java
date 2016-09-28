/*
 * Ellie
 * Sept. 28, 2016
 * V. 1.0
 * More math stuff
 */
package ca.hdsb.gwss.elliex.ics3u.u3;

/**
 *
 * @author 1xuell
 */
public class MathMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Arithmetic
        int a = 5;
        int b = 1; 
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = Math.abs(a);
        int g = Math.abs(b);
        
        System.out.println(" ");
        System.out.println("Arithmetic");
        System.out.println("a = " + a + " b = " + b);
        System.out.println("a + b = " + c);
        System.out.println("a - b = " + d);
        System.out.println("a * b = " + e);
        System.out.println("Absolute values: " + "a = " + f + " b = " + g);
        
        
        //Perimeter
        double W = 2;
        double L = 4;
        double A = W * L;
        double P = 2*(W + L);
        
        System.out.println(" ");
        System.out.println("Perimeter and Area"); 
        System.out.println("Width: " + W + " Length: " + L);
        System.out.println("Perimeter = " + P);
        System.out.println("Area = " + A);
        
        
        //Restaurant Tab
        double food = 200;
        double tip = food * 0.1;
        double tax = food * 0.13;
        double total = tax + tip + food;
        
        System.out.println(" ");
        System.out.println("Restaurant Tab");
        System.out.println("Food Money: " + food);
        System.out.println("Tip: " + tip);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);
        
        //Change
        int change = 555; 
        int quarters = change/25;
        int Q = Math.round(quarters);
        int dimes = (change-Q*25)/10;
        int D = Math.round(dimes);
        int nickels = (change-D*10-Q*25)/5; 
        int N = Math.round(nickels);
        int cents = change-D*10-Q*25-N*5;
        int C = Math.round(cents);
        
        System.out.println(" ");
        System.out.println("Change in cents: " + change);
        System.out.println("Quarters: "+Q);
        System.out.println("Dimes: "+D);
        System.out.println("Nickels: " + N);
        System.out.println("Cents: " + C);
                
                
                
                
                
              
                
    }
    
}
