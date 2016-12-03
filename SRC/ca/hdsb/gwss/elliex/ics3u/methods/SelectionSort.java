/* Ellie Xu             
 * 12. 2. 2016.
 * Method: selection(arrayName[], number of numbers/letters, true for sorting from small to big and false for sorting from big to small);
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.methods;

import static ca.hdsb.gwss.elliex.ics3u.methods.SOPL.sopl;

/**
 *
 * @author elli
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //selection(arrayName[], number of numbers/letters, true for sorting from small to big and false for sorting from big to small);
    }

    public static void selection(double number[], int i, boolean way) {
        int a = 0, x, unnessary = 0, cases = 1, compareCount = 0, spot, swappedCount = 0;
        double max;
        String output = "";

        while (cases <= (i - 1)) {
            spot = 0;
            x = 1;
            max = number[0];
            while (x < i - unnessary) {
                if (way == true) {
                    if (number[x] > max) {
                        max = number[x];
                        spot = x;
                        swappedCount++;
                    }
                } else if (number[x] < max) {
                    max = number[x];
                    spot = x;
                    swappedCount++;
                }
                compareCount++;
                x++;
            }
            swapSelection(number, i, max, spot, unnessary);
            unnessary++;
            cases++;
        }
        while (a < i) {
            output = output + number[a] + " ";
            a++;
        }
        sopl("Number of times compared: " + compareCount + "\nNumber of times swapped: " + swappedCount);
        sopl(output);
    }

    public static void selection(int number[], int i, boolean way) {
        double number2[] = new double[i];
        int a = 0;
        while (a < i) {
            number2[a] = number[a];
            a++;
        }
        selection(number2, i, way);
    }

    public static void selection(String number[], int i, boolean way) {
        int a = 0, x, unnessary = 0, cases = 1, compareCount = 0, spot, swappedCount = 0;
        String max;
        String output = "";

        int n = 0;
        while (n < i) {
            number[n] = number[n].toUpperCase();
            n++;
        }

        while (cases <= (i - 1)) {
            spot = 0;
            x = 1;
            max = number[0];
            while (x < i - unnessary) {
                if (way == true) {
                    if (number[x].compareTo(max) > 0) {
                        max = number[x];
                        spot = x;
                        swappedCount++;
                    }
                } else if (number[x].compareTo(max) < 0) {
                    max = number[x];
                    spot = x;
                    swappedCount++;
                }
                compareCount++;
                x++;
            }
            swapSelection(number, i, max, spot, unnessary);
            unnessary++;
            cases++;
        }
        while (a < i) {
            output = output + number[a] + " ";
            a++;
        }
        sopl("Times compared: " + compareCount + "\nTimes swapped: " + swappedCount);
        sopl(output);
    }

    public static void swapSelection(double[] number, int i, double max, int spot, int unnessary) {
        double sub;
        sub = number[(i - unnessary) - 1];
        number[(i - unnessary) - 1] = max;
        number[spot] = sub;
    }

    public static void swapSelection(String[] number2, int i, String max, int spot, int unnessary) {
        String sub;
        sub = number2[(i - unnessary) - 1];
        number2[(i - unnessary) - 1] = max;
        number2[spot] = sub;
    }

}
