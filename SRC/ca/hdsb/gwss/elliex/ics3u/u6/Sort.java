/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.elliex.ics3u.u6;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import java.util.Scanner;

/**
 *
 * @author 1xuell
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, restart, i = 0 , a = 0;
        int [] number = new int [i];  
        
        do {
            restart = 0;      
        sopl ("Type 1 for bubble sort.\nType 2 for selection sort");
        choice = input.nextInt();
        sopl ("How many number do you wish to be sorted?");
        i = input.nextInt();
        sopl ("Type in the numbers:");
        while (a < i) {
            number[a] = input.nextInt();
            a++;
        }
        
        switch (choice){
            case 1:
                sopl (bubble(number[]));
                break;
            case 2:
                sopl (selection(number));
                break;
            default:
                sopl ("\nThis program doesn't exsit.\nPress 1 to restart");
                restart = input.nextInt(); 
        }}while (restart == 1);
    }
    
    public static int bubble(int[] number){
        return number[];
    }
    `
    public static int selection(int number){
        return number;
    }
}
