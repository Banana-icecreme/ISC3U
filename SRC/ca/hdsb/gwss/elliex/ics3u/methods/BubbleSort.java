/* Ellie Xu             
 * 12. 2. 2016.
 * Method: selection(arrayName[], number of numbers/letters, true for sorting from small to big and false for sorting from big to small);
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.methods;

import static ca.hdsb.gwss.elliex.ics3u.methods.SOPL.sopl;

/**
 *
 * @author 1xuell
 */
public class BubbleSort {

    public static void bubble(double number[], int i, boolean way) {
        int a = 0, x, y, cases = 1, unnessary = 0, compareCount = 0, swappedCount = 0;
        String output = "";

        while (cases <= (i - 1)) {
            x = 0;
            y = 1;
            while (y < i - unnessary) {
                if (way == true) {
                    if (number[x] > number[y]) {
                        swapBubble(number, x, y);
                        swappedCount += 1;
                    }
                }
                else {
                    if (number[x] < number[y]) {
                        swapBubble(number, x, y);
                        swappedCount += 1;
                    }
                }
                x++;
                y++;
                compareCount++;
            }
            if (swappedCount == 0) {
                cases = i;
            }
            unnessary++;
            cases++;
        }
        while (a < i) {
            output = output + number[a] + " ";
            a++;
        }
        sopl("Number of times compared: " + compareCount + "\nNumber of times swapped: " + swappedCount * 3);
        sopl(output);
    }

    public static void bubble(int number[], int i, boolean way) {
        double number2[] = new double[i];
        int a = 0;
        while (a < i) {
            number2[a] = number[a];
            a++;
        }
        bubble(number2, i, way);
    }

    public static void bubble(String number[], int i, boolean way) {
        int a = 0, x, y, cases = 1, unnessary = 0, compareCount = 0, swappedCount = 0;
        String output = "";

        int n = 0;
        while (n < i) {
            number[n] = number[n].toUpperCase();
            n++;
    }
        
        while (cases <= (i - 1)) {
            x = 0;
            y = 1;
            while (y < i - unnessary) {
                if (way == true) {
                    if (number[x].compareTo(number[y]) > 0) {
                        swapBubble(number, x, y);
                        swappedCount += 1;
                    }
                }
                else {
                    if (number[x].compareTo(number[y]) < 0) {
                        swapBubble(number, x, y);
                        swappedCount += 1;
                    }
                }
                x++;
                y++;
                compareCount++;
            }
            if (swappedCount == 0) {
                cases = i;
            }
            unnessary++;
            cases++;
        }
        while (a < i) {
            output = output + number[a] + " ";
            a++;
        }
        sopl("Number of times compared: " + compareCount + "\nNumber of times swapped: " + swappedCount * 3);
        sopl(output);
    }

    public static void swapBubble(double[] number, int x, int y) {
        double x2 = number[x];
        number[x] = number[y];
        number[y] = x2;
    }

    public static void swapBubble (String[] number, int x, int y){
        String sub = number[x];
        number[x] = number[y];
        number[y] = sub;
    }
}
