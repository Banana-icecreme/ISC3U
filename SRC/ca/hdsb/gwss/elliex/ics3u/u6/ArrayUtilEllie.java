/* Ellie Xu             
 * 12. 11. 2016.
 * methods: bubble, selection, max, average, min, println. 
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.u6;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import java.text.NumberFormat;
import java.util.Random;

public class ArrayUtilEllie {

    public static int totalcom = 0;
    public static int totalswap = 0;

    public static void bubble(double number[], boolean way) {
        //variables
        int a = 0, x, y, cases = 1, unnessary = 0, compareCount = 0, swappedCount = 0, i = number.length;
        String output = "";
        
        while (cases <= (i - 1)) {//sorting by cases
            x = 0;
            y = 1;
            while (y < i - unnessary) {//sorting the numbers in a case
                if (way == true) {//soring order. If way is true, then it's sorted from small to big
                    if (number[x] > number[y]) {
                        swapBubble(number, x, y);
                        swappedCount += 1;
                    }
                } else if (number[x] < number[y]) {
                    swapBubble(number, x, y);
                    swappedCount += 1;
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
        for (; a < i; a++) {
            output = output + number[a] + " ";
        }
        
        //output
        sopl("Number of times compared: " + compareCount + "\nNumber of times swapped: " + swappedCount);
        sopl(output);
        totalcom = compareCount + totalcom;
        totalswap = swappedCount + totalswap;
    }

    public static void bubble(int number[], boolean way) {
        //variables
        int a = 0, i = number.length;
        double number2[] = new double[i];
        while (a < i) {
            number2[a] = number[a];
            a++;
        }
        bubble(number2, way);//using the already coded bubble double sort to sort this
        a = 0;
        while (a < i) {
            number[a] = (int) number2[a];
            a++;
        }
    }

    public static void bubble(String number[], boolean way) {
        //variables
        int a = 0, x, y, cases = 1, unnessary = 0, compareCount = 0, swappedCount = 0, i = number.length;
        String output = "";

        //changing the input letters to uppercase so it's not case sensitive
        for (int n = 0; n < i; n++) {
            number[n] = number[n].toUpperCase();
        }

        for (; cases <= (i - 1); cases++, unnessary++) {// counting the cases
            for (x = 0, y = 1; y < i - unnessary; x++, y++, compareCount++) {//coutnting the letters in each case
                if (way == true) {//sorting order
                    if (number[x].compareTo(number[y]) > 0) {
                        swapBubble(number, x, y);
                        swappedCount += 1;
                    }
                } else if (number[x].compareTo(number[y]) < 0) {
                    swapBubble(number, x, y);
                    swappedCount += 1;
                }
            }
            if (swappedCount == 0) {
                cases = i;
            }
        }
        for (; a < i; a++) {
            output = output + number[a] + " ";
        }
        //output
        sopl("Number of times compared: " + compareCount + "\nNumber of times swapped: " + swappedCount);
        sopl(output);
        totalcom = compareCount + totalcom;
        totalswap = swappedCount + totalswap;
    }

    public static void swapBubble(double[] number, int x, int y) {
        //just the swapping process
        double x2 = number[x];
        number[x] = number[y];
        number[y] = x2;
    }

    public static void swapBubble(String[] number, int x, int y) {
        String sub = number[x];
        number[x] = number[y];
        number[y] = sub;
    }

    public static void selection(double number[], boolean way) {
        //variables
        int x, unnessary = 0, compareCount = 0, i = number.length, max;
        String output = "";

        for (int cases = 1; cases <= (i - 1); cases++) {//counting cases
            max = 0;
            for (x = 1; x < i - unnessary; x++) {//couting and soring the numbers in a case
                if (way == true) {//sorting order
                    if (number[x] > number[max]) {
                        max = x;
                    }
                } else if (number[x] < number[max]) {
                    max = x;
                }
                compareCount++;
            }
            swapSelection(number, i, max, unnessary);
            unnessary++;
        }
        for (int a = 0; a < i; a++) {
            output = output + number[a] + " ";
        }
        //output
        sopl("Number of times compared: " + compareCount + "\nNumber of times swapped: " + (i - 1));
        sopl(output);
        totalcom = compareCount + totalcom;
        totalswap = (i-1) + totalswap;
    }

    public static void selection(int number[], boolean way) {
        //variables
        int a = 0, i = number.length;
        double number2[] = new double[i];
        while (a < i) {//chaging the int numbers to double numbers so i can use the double selection method
            number2[a] = number[a];
            a++;
        }
        selection(number2, way); // using the double selection method
        a = 0;
        while (a < i) {
            number[a] = (int) number2[a];
            a++;
        }
    }

    public static void selection(String number[], boolean way) {
        //variables
        int x, unnessary = 0, cases = 1, compareCount = 0, i = number.length, max;
        String output = "";

        //changing the letters to uppercase to avoid case sensititvity problems
        for (int n = 0; n < i; n++) {
            number[n] = number[n].toUpperCase();
        }

        for (; cases <= (i - 1); cases++) {//counting cases
            max = 0;
            for (x = 1; x < i - unnessary; x++) {//sorting the numbers in a case
                if (way == true) {//sorting order
                    if (number[x].compareTo(number[max]) > 0) {
                        max = x;
                    }
                } else if (number[x].compareTo(number[max]) < 0) {
                    max = x;
                }
                compareCount++;
            }
            swapSelection(number, i, max, unnessary);
            unnessary++;
        }
        for (int a = 0; a < i; a++) {
            output = output + number[a] + " ";
        }
        //output
        sopl("Times compared: " + compareCount + "\nTimes swapped: " + (i - 1));
        sopl(output);
        totalcom = compareCount + totalcom;
        totalswap = (i-1) + totalswap;
    }

    public static void swapSelection(double[] number, int i, int max, int unnessary) {
        //swapping process for swapSelection
        double sub;
        sub = number[(i - unnessary) - 1];
        number[(i - unnessary) - 1] = number[max];
        number[max] = sub;
    }

    public static void swapSelection(String[] number2, int i, int max, int unnessary) {
        String sub;
        sub = number2[(i - unnessary) - 1];
        number2[(i - unnessary) - 1] = number2[max];
        number2[max] = sub;
    }

    public static String printArray(double number[]) {
        //variables
        int a = 0, i = number.length;
        String output = "";

        while (a < i) {//plays the entered number array in a loop to display the outputs
            output = output + number[a] + " ";
            a++;
        }
        sopl(output);
        return output;
    }

    public static String printArray(int number[]) {
        //same as double printArray
        int a = 0, i = number.length;
        String output = "";
        while (a < i) {
            output = output + number[a] + " ";
            a++;
        }
        sopl(output);
        return output;
    }

    public static String printArray(String number[]) {
        //same as double printArray
        int a = 0, i = number.length;
        String output = "";

        while (a < i) {
            output = output + number[a] + " ";
            a++;
        }
        sopl(output);
        return output;
    }

    public static double max(double[] number) {
        //variables
        int x, i = number.length;
        double max;

        x = 1;
        max = number[0];
        while (x < i) {//compares the numbers for the biggest number
            if (number[x] > max) {
                max = number[x];
            }
            x++;
        }
        sopl(max);
        return max;
    }

    public static int max(int[] number) {
        //varibles
        int a = 0, i = number.length;
        double number2[] = new double[i];
        while (a < i) {
            number2[a] = number[a];
            a++;
        }
        return (int) max(number2);
    }

    public static double average(double number[]) {
        //varibles
        double total = 0;
        int a = 0, i = number.length;
        for (; a < i; a++) {//adds all the numbers up and divides it by number.length
            total = number[a] + total;
        }
        sopl(total / i);
        return total / i;
    }

    public static int average(int number[]) {
        //varibles
        int a = 0, i = number.length, total = 0;
        for (; a < i; a++) {//same as double average
            total = number[a] + total;
        }
        sopl(total / i);
        return total / i;
    }

    public static double min(double[] number) {
        //varibles
        int x, i = number.length;
        double min;

        x = 1;
        min = number[0];
        while (x < i) {//like max but the other way around
            if (number[x] < min) {
                min = number[x];
            }
            x++;
        }
        sopl(min);
        return min;
    }

    public static int min(int[] number) {
        //varibles
        int a = 0, i = number.length;
        double number2[] = new double[i];
        while (a < i) {
            number2[a] = number[a];
            a++;
        }
        return (int) min(number2);//uses double min
    }

    public static double sum(double[] number) {
        //varibles
        int a = 0, i = number.length;
        double sum = 0;
        for (; a < i; a++) {//adds everything and displays them
            sum = number[a] + sum;
        }
        sopl(sum);
        return sum;
    }

    public static int sum(int[] number) {
        //varibles
        int a = 0, i = number.length;
        int sum = 0;
        for (; a < i; a++) {
            sum = number[a] + sum;
        }
        sopl(sum);
        return sum;
    }

    public static int linearSearch(double number[], double search) {
        //varibles
        int correct = 0, a = 0, com = 1;
        boolean exsistence = false; // to see if the searched number is even there at all 
        for (; a < number.length; a++) {
            if (search == number[a]) {//checking with each number to see if it's correct
                correct = a;
                a = number.length;
                exsistence = true;
                com--;
            } else {
                correct = -1;
            }
            com++;
        }
        //output
        sopl("number of comparisons: " + com);
        sopl(search + " is at" + " [" + correct + "].");
        totalcom = com + totalcom;
        return correct;
    }

    public static int linearSearch(int number[], int search) {
        //varibles
        double number2[] = new double[number.length];
        for (int a = 0; a < number.length; a++) {
            number2[a] = number[a];
        }
        return (int) linearSearch(number2, search);
    }

    public static int linearSearch(String number[], String search) {
        //varibles
        int correct = 0, a = 0, com = 1;
        boolean exsistence = false;
        for (; a < number.length; a++) {//same as double linearSearch
            if (search.equalsIgnoreCase(number[a])) {
                correct = a;
                a = number.length;
                exsistence = true;
                com--;
            } else {
                correct = -1;
            }
            com++;
        }
        sopl("number of comparisons: " + com);
        sopl(search + " is at" + " [" + correct + "].");
        totalcom = com + totalcom;
        return correct;
    }

    public static int binarySearch(double number[], double search) {
        //varibles
        int l = 0, r = number.length - 1, mid = (l + r) / 2, com = 1;
        boolean a = false;//to see if the searched number is in the array

        if (number[l] < number[r]) { //this is to check the order the sorted array is sorted
            while (search != number[mid] && l < r) {//determines if the searched number is gearter than or smaller than the middle number
                com++;
                if (search > number[mid]) {//cuts the array according to where the searched number is 
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
                mid = (l + r) / 2;
            }
        } else {
            while (search != number[mid] && l < r) {
                com++;
                if (search < number[mid]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
                mid = (l + r) / 2;
            }
        }
        if (search != number[mid]) {//if the search number is not there
            mid = -1; 
            com = number.length;
        }
        sopl("number of comparisons: " + com);
        sopl(search + " is at" + " [" + mid + "].");
        totalcom = com + totalcom;
        return mid;
    }

    public static int binarySearch(int number[], int search) {
        //varibles
        double number2[] = new double[number.length];
        for (int a = 0; a < number.length; a++) {
            number2[a] = number[a];
        }
        return binarySearch(number2, search);
    }

    public static int binarySearch(String number[], String search) {
        //varibles
        int l = 0, r = number.length - 1, mid = (l + r) / 2, com = 1;
        boolean a = false;
        search = search.toUpperCase();
        for (int i = 0; i < number.length; i++) {//converting to upper case letters
            number[i] = number[i].toUpperCase();
        }
        if (number[l].compareTo(number[r]) < 0) {//it's basically the same as double binarySearch
            while (!search.equals(number[mid]) && l < r) {
                com++;
                if (search.compareTo(number[mid]) < 0) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
                mid = (l + r) / 2;
            }
        } else {
            while (!search.equals(number[mid]) && l < r) {
                com++;
                if (search.compareTo(number[mid]) < 0) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
                mid = (l + r) / 2;
            }
        }
        if (!search.equals(number[mid])) {
            mid = -1;
            com = number.length;
        }
        sopl("number of comparisons: " + com);
        sopl(search + " is at" + " [" + mid + "].");
        totalcom = com + totalcom;
        return mid;
    }
}
