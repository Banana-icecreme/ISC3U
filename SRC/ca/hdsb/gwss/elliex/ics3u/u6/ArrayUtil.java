/* Ellie Xu             
 * 12. 2. 2016.
 * Method parameters
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.u6;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import static ca.hdsb.gwss.elliex.ics3u.u6.Sort.bubble;
import static ca.hdsb.gwss.elliex.ics3u.u6.Sort.selection;
import static ca.hdsb.gwss.elliex.ics3u.u6.Sort.swapBubble;
import static ca.hdsb.gwss.elliex.ics3u.u6.Sort.swapSelection;
import java.util.Scanner;

/**
 *
 * @author 1xuell
 */
public class ArrayUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int choice;
        sopl("Type 1 for bubble sort. \nType 2 for selection sort. \nType 3 for print array.");
        choice = input.nextInt();
        sopl(" ");
        switch (choice){
            case 1:
                bubbleNum ();
                break;
            case 2:
                selectionNum();
                break;
            case 3:
                printArray();
                break;
        }
    }
        
    public static void printArray(){
        Scanner input = new Scanner(System.in);
        int i, a = 0;
        String output = "";

            sopl("How many number?");
            i = input.nextInt();
            double[] number = new double[i];
            sopl("Type in the numbers:");
            while (a < i) {
                number[a] = input.nextDouble();
                a++;
            }
            
            a=0;
            while (a < i) {
            output = output + number[a] + " ";
            a++;
        }
            sopl (output);
    }
    
    public static void max(double[]number, int i){
        int x, unnessary = 0, cases = 1, spot;
        double max;
        
            spot = 0;
            x = 1;
            max = number[0];
            while (x < i) {
                if (number[x] > max) {
                    max = number[x];
                    spot = x;
                }
                x++;
            }
    }
    
    public static void bubbleNum (){
        Scanner input = new Scanner(System.in);
        int i, a = 0;

            sopl("How many number do you wish to be sorted?");
            i = input.nextInt();
            double[] number = new double[i];
            sopl("Type in the numbers:");
            while (a < i) {
                number[a] = input.nextDouble();
                a++;
            }
                    sopl(bubble(i, number));
    }
    
    public static void selectionNum (){
        Scanner input = new Scanner(System.in);
        int i, a = 0;

            sopl("How many number do you wish to be sorted?");
            i = input.nextInt();
            double[] number = new double[i];
            sopl("Type in the numbers:");
            while (a < i) {
                number[a] = input.nextDouble();
                a++;
            }
                    sopl(selection(i, number));
    }
}
