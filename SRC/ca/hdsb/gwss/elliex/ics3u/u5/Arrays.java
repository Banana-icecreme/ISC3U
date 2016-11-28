/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.elliex.ics3u.u5;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sop;
import java.util.Scanner;

/**
 *
 * @author 1xuell
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int program, restart = 0;

        do {
            restart = 0;
            sopl("Type 1 for Golf\nType 2 for Temperature");
            program = input.nextInt();
            switch (program) {
                case 1:
                    Golf();
                    break;
                case 2:
                    Temperature();
                    break;
                default:
                    sopl("There is no such program.\nPress 1 to restart.");
                    restart = input.nextInt();
            }
        } while (restart == 1);
    }

    public static void Golf() {
        Scanner input = new Scanner (System.in);
        int i = 0;
        int[] score = new int [18];
        
        while (i < 18){
        sopl ("Score " + i);
        score[i] = input.nextInt();
        i++;
        }
        sopl("");
        i = 0;
        while (i < 18){
          sopl (score [i]);  
          i++;
        }
    }
    
    public static void Temperature() {
        Scanner input = new Scanner (System.in);
        int i = 0;
        double [] temp = new double [7];
        double average;
        String [] day = new String [7];
        day [0] = "moon";
        day [1] = "tues";
        day [2] = "wednes";
        day [3] = "thur";
        day [4] = "fri";
        day [5] = "satur";
        day [6] = "sun";
        
        while (i<7){
            sop (day [i] + "day: ");
            temp [i] = input.nextDouble();
            i++;
        }
        sopl("");
        i = 0;
        while (i < 7){
            sopl (day [i] + "day: " + temp[i]);
            i ++; 
        }
}
}