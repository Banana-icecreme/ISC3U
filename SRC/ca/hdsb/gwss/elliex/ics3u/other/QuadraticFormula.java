/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
}
