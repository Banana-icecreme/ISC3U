/* Ellie Xu             
 * 12. 2. 2016.
 * Methods: max, min, average. 
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.methods;

import static ca.hdsb.gwss.elliex.ics3u.methods.SOPL.sopl;

/**
 *
 * @author 1xuell
 */
public class MaxMinAverage {

    public static String printArray(double number[], int i) {
        int a = 0;
        String output = "";

        while (a < i) {
            output = output + number[a] + " ";
            a++;
        }
        sopl(output);
        return output;
    }

    public static void printArray(int number[], int i) {
        double number2[] = new double[i];
        int a = 0;
        while (a < i) {
            number2[a] = number[a];
            a++;
        }
        printArray(number2, i);
    }

    public static double max(double[] number, int i) {
        int x;
        double max;

        x = 1;
        max = number[0];
        while (x < i) {
            if (number[x] > max) {
                max = number[x];
            }
            x++;
        }
        sopl(max);
        return max;
    }

    public static void max(int[] number, int i) {
        double number2[] = new double[i];
        int a = 0;
        while (a < i) {
            number2[a] = number[a];
            a++;
        }
        max(number2, i);
    }

    public static double average(double number[], int i) {
        double total = 0;
        int a = 0;
        while (a < i) {
            total = number[a] + total;
            a++;
        }
        sopl(total / i);
        return total / i;
    }

    public static void average(int number[], int i) {
        double number2[] = new double[i];
        int a = 0;
        while (a < i) {
            number2[a] = number[a];
            a++;
        }
        average(number2, i);
    }

    public static double min(double[] number, int i) {
        int x;
        double min;

        x = 1;
        min = number[0];
        while (x < i) {
            if (number[x] < min) {
                min = number[x];
            }
            x++;
        }
        sopl(min);
        return min;
    }

    public static void min(int[] number, int i) {
        double number2[] = new double[i];
        int a = 0;
        while (a < i) {
            number2[a] = number[a];
            a++;
        }
        min(number2, i);
    }
}
