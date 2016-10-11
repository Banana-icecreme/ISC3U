/*
 * Ellie Xu
 * Oct. 11, 2016
 * Version 1.0 
 * Gates of Logic
 */
package ca.hdsb.gwss.elliex.ics3u.u3;

/**
 *
 * @author 1xuell
 */
public class LogicGates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        boolean a, b;
        //and table
        System.out.println("AND TABLE");
        System.out.format("%6s, %6s | %6s \n", "a", "b", "a.b" );
        
        a = false;
        b = true;       
        System.out.format("%6s, %6s | %6s \n", a, b, a&&b );
        
        a = false;
        b = false;       
        System.out.format("%6s, %6s | %6s \n", a, b, a&&b );
        
        a = true;
        b = true;       
        System.out.format("%6s, %6s | %6s \n", a, b, a&&b );

        a = true;
        b = false;       
        System.out.format("%6s, %6s | %6s \n", a, b, a&&b );
        
        //or table
        System.out.println("OR TABLE");
        
        a = false;
        b = true;
        System.out.format("%6s, %6s | %6s \n", a, b, a||b );
        
        a = false;
        b = false;       
        System.out.format("%6s, %6s | %6s \n", a, b, a||b );
        
        a = true;
        b = true;       
        System.out.format("%6s, %6s | %6s \n", a, b, a||b );
        
        a = true;
        b = false;       
        System.out.format("%6s, %6s | %6s \n", a, b, a||b );
      
        //not table
        System.out.println("NOT TABLE");
        
        a = false;
        b = true; 
        System.out.format("%6s, | %6s, %6s | %6s \n", "a", "not a", "b", "not b" );
        System.out.format("%6s, | %6s, %6s | %6s \n", a, b, !a, !b); 
        
        a = false;
        b = false;
        System.out.format("%6s, | %6s, %6s | %6s \n", a, b, !a, !b); 
             
        a = true;
        b = true;
        System.out.format("%6s, | %6s, %6s | %6s \n", a, b, !a, !b); 
        
        a = true;
        b = false;
        System.out.format("%6s, | %6s, %6s | %6s \n", a, b, !a, !b);         

    }

}
