/*
 * Ellie
 * Sept. 27,2016
 * version 1.0
 * ShortFall; Double Jeopardy; Character Assassination; Payroll; 
 */
package ca.hdsb.gwss.elliex.ics3u.u3;

/**
 *
 * @author 1xuell
 */
public class ShortfallAndEtc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//
        //ShortFall
        int value = 3556656;
        System.out.println(" ");
        System.out.println("ShortFall: " + value);
      
        //Double Jeopardy
        double a = 321;
        System.out.println(" ");
        System.out.println("Double Jeopardy: " + a);

        //Character Assassination
        char s = 'a';
        System.out.println(" ");
        System.out.println("Character Assassination: " + a);

        //Payroll
        long hoursWorked = 20;
        double payRate = 10.0, taxRate = 0.10;
        double payAmount = hoursWorked * payRate;
        double taxAmount = hoursWorked * payRate * taxRate;
        
        System.out.println(" ");
        System.out.println("Payroll:");
        System.out.format("%-15s|%s|%-5s\n","Hours Worked", "> ", hoursWorked);
        System.out.format("%-15s|%s|%-5s\n","pay Amount",   "> ", payAmount);
        System.out.format("%-15s|%s|%-5s\n","tax Amount",   "> ", taxAmount);

        //Value of a Quadratic
        double X = 5.1;
        double answer = 3*X*X - 8*X + 4;
        
        System.out.println(" ");
        System.out.println("Value of a Quadratic");
        System.out.println("At x" + " = " + X + " the value is " + answer);
    }

}
