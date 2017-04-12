/*
 * 3. 14. 2017.
 */
package ca.hdsb.gwss.elliex.ics3u.other;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import java.util.Scanner;

/**
 *
 * @author 1xuell
 */
public class QuadraticFormula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        quadraticFormula("1","5","3"); 
    }
    public static void quadraticFormula(double a, double b, double c){
        double step1, bsqaured;
        bsqaured = Math.pow(b, 2);
        step1 = Math.sqrt(bsqaured - (4*a*c));
        sopl("x is: ");
        sopl((-1 * b + step1)/(2*a));
        sopl((-1 * b - step1)/(2*a));
        if (!((-1 * b + step1)/(2*a) <= 0 || (-1 * b + step1)/(2*a) >= 0)){
            sopl("BATMAN!!");
        }
    }
    public static void quadraticFormula(int a, int b, int c){
        double A = a, B = b, C = c; 
        quadraticFormula(A,B,C);
    }
    public static void quadraticFormula(String a, String b, String c){
        double A = Double.parseDouble(a), B = Double.parseDouble(b), C = Double.parseDouble(c); 
        quadraticFormula(A,B,C);
    }
}
