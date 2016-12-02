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
        int choice, restart, i, a = 0;
  
        do {
            restart = 0;
            sopl("Type 1 for bubble sort.\nType 2 for selection sort");
            choice = input.nextInt();
            sopl("How many number do you wish to be sorted?");
            i = input.nextInt();
            int[] number = new int[i];
            sopl("Type in the numbers:");
            while (a < i) {
                number[a] = input.nextInt();
                a++;
            }

            switch (choice) {
                case 1:
                    sopl(bubble(i, number));
                    break;
                case 2:
                    sopl(selection(i, number));
                    break;
                default:
                    sopl("\nThis program doesn't exsit.\nPress 1 to restart");
                    restart = input.nextInt();
            }
        } while (restart == 1);
    }

    public static String bubble(int i, int[] number) {
        int a = 0, x, y, cases = 1, unnessary = 0, compareCount = 0, swappedCount = 0;
        String output = "";

        while (cases <= (i -1 )) {
            x = 0;
            y = 1;
            while (y < i - unnessary) {
                if (number[x] > number[y]) {
                    int x2 = number[x];
                    number[x] = number[y];
                    number[y] = x2;
                    swappedCount += 1;
                }
                x++;
                y++;
                compareCount++;
            }
            unnessary++;
            cases++;
        }
        while (a < i) {
            output = output + number[a] + " ";
            a++;
        }
        sopl("Number of times compared: " + compareCount + "\nNumber of times swapped: " + swappedCount * 3);
        return output;
    }

    public static String selection(int i, int[] number) {
        int a = 0, max, x, sub, unnessary = 0, cases = 1, compareCount = 0, spot, swappedCount = 0;
        String output = "";

        while (cases <= (i - 1)) {
            spot = 0;
            x = 1;
            max = number[0];
            while (x < i - unnessary) {
                if (number[x] > max) {
                    max = number[x];
                    spot = x;
                    swappedCount ++;
                }
                compareCount ++;
                x++;
            }
            sub = number[(i - unnessary) - 1];
            number[(i - unnessary) - 1] = max;
            number[spot] = sub;
            unnessary++;
            cases++;
        }
        while (a < i) {
            output = output + number[a] + " ";
            a++;
        }
        sopl("Number of times compared: " + compareCount + "\nNumber of times swapped: " + swappedCount);
        return output;
    }
}
