/* Ellie Xu             
 * 3. 14. 2017.
 * methods: bubble sort, selection sort, max, average, min, shuffle, linear search, binary search. 
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.other;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sop;
import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayUtilEllie {

    public static void bubbleSort(double number[], boolean way) {
        String array[] = new String[number.length];
        for (int i = 0; i < number.length; i++) {
            array[i] = number[i] + "";
        }
        bubbleSort(array, way);
        for (int i = 0; i < number.length; i++) {
            number[i] = Double.parseDouble(array[i]);
        }
    }

    public static void bubbleSort(int number[], boolean way) {
        String array[] = new String[number.length];
        for (int i = 0; i < number.length; i++) {
            array[i] = number[i] + "";
        }
        bubbleSort(array, way);
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(array[i]);
        }
    }

    public static void bubbleSort(String number[], boolean way) {
        //variables
        int x, y, cases = 1, unnessary = 0, compareCount = 0, swappedCount = 0, i = number.length;

        for (; cases <= (i - 1); cases++, unnessary++) {// counting the cases
            for (x = 0, y = 1; y < i - unnessary; x++, y++, compareCount++) {//coutnting the letters in each case
                if (way == true) {//sorting order
                    if (number[x].compareToIgnoreCase(number[y]) > 0) {
                        swapBubble(number, x, y);
                        swappedCount += 1;
                    }
                } else if (number[x].compareToIgnoreCase(number[y]) < 0) {
                    swapBubble(number, x, y);
                    swappedCount += 1;
                }
            }
            if (swappedCount == 0) {
                cases = i;
            }
        }
        //output
        sopl("Number of times compared: " + compareCount + "\nNumber of times swapped: " + swappedCount);
    }

    public static void swapBubble(String[] number, int x, int y) {
        String sub = number[x];
        number[x] = number[y];
        number[y] = sub;
    }

    public static void selectionSort(double number[], boolean way) { //sorting
        String array[] = new String[number.length];
        for (int i = 0; i < number.length; i++) {
            array[i] = number[i] + "";
        }
        selectionSort(array, way);
        for (int i = 0; i < number.length; i++) {
            number[i] = Double.parseDouble(array[i]);
        }
    }

    public static void selectionSort(int number[], boolean way) {
        String number2[] = new String[number.length];
        for (int i = 0; i < number.length; i++) {
            number2[i] = number[i] + "";
        }
        selectionSort(number2, way);
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(number2[i]);
        }
    }

    public static void selectionSort(String number[], boolean way) {
        //variables
        int x, unnessary = 0, cases = 1, compareCount = 0, i = number.length, max;

        for (; cases <= (i - 1); cases++) {//counting cases
            max = 0;
            for (x = 1; x < i - unnessary; x++) {//sorting the numbers in a case
                if (way == true) {//sorting order
                    if (number[x].compareToIgnoreCase(number[max]) > 0) {
                        max = x;
                    }
                } else if (number[x].compareToIgnoreCase(number[max]) < 0) {
                    max = x;
                }
                compareCount++;
            }
            String sub;
            sub = number[(i - unnessary) - 1];
            number[(i - unnessary) - 1] = number[max];
            number[max] = sub;
            unnessary++;
        }
        //output
        sopl("Times compared: " + compareCount + "\nTimes swapped: " + (i - 1));
    }

    public static void printArray(double number[]) {
        for (int i = 0; i < number.length; i++) {
            sop(number[i] + " ");
        }
    }

    public static void printArray(int number[]) {
        for (int i = 0; i < number.length; i++) {
            sop(number[i] + " ");
        }
    }

    public static void printArray(String number[]) {
        for (String number1 : number) {
            sop(number1 + " ");
        }
    }

    public static double math(double[] number, String which) { //average sum min max
        double ans = -1;
        if (which.equalsIgnoreCase("max") || which.equalsIgnoreCase("min")) {
            ans = number[0];
            for (int i = 1; i < number.length; i++) {//compares the numbers for the biggest number
                if (which.equalsIgnoreCase("max")) {
                    if (number[i] > ans) {
                        ans = number[i];
                    }
                } else if (number[i] < ans) {
                    ans = number[i];
                }
            }
        } else if (which.equalsIgnoreCase("sum") || which.equalsIgnoreCase("average")) {
            ans = 0;
            for (int i = 0; i < number.length; i++) {
                ans = number[i] + ans;
            }
            if (which.equalsIgnoreCase("average")) {
                ans = ans / number.length;
            }
        }
        return ans;
    }

    public static int math(int[] number, String which) {
        double array[] = new double[number.length];
        for (int i = 0; i < number.length; i++) {
            array[i] = number[i];
        }
        return (int) math(array, which);
    }

    public static int linearSearch(double number[], double search) {
        String number2[] = new String[number.length], b = search + "";
        for (int a = 0; a < number.length; a++) {
            number2[a] = number[a] + "";
        }
        return linearSearch(number2, b);
    }

    public static int linearSearch(int number[], int search) {
        String number2[] = new String[number.length], b = search + "";
        for (int a = 0; a < number.length; a++) {
            number2[a] = number[a] + "";
        }
        return linearSearch(number2, b);
    }

    public static int linearSearch(String number[], String search) {
        //varibles
        int correct = 0, com = 1;
        for (int a = 0; a < number.length; a++) {
            if (search.equalsIgnoreCase(number[a])) {
                correct = a;
                com--;
                break;
            } else {
                correct = -1;
            }
            com++;
        }
        sopl("number of comparisons: " + com);
        sopl(search + " is at" + " [" + correct + "].");
        return correct;
    }

    public static int binarySearch(double number[], double search) {
        String number2[] = new String[number.length], b = search + "";
        for (int a = 0; a < number.length; a++) {
            number2[a] = number[a] + "";
        }
        return binarySearch(number2, b);
    }

    public static int binarySearch(int number[], int search) {
        String number2[] = new String[number.length], b = search + "";
        for (int a = 0; a < number.length; a++) {
            number2[a] = number[a] + "";
        }
        return binarySearch(number2, b);
    }

    public static int binarySearch(String number[], String search) {
        //varibles
        int l = 0, r = number.length - 1, mid = (l + r) / 2, com = 1;

        if (number[l].compareTo(number[r]) < 0) {
            while (!search.equalsIgnoreCase(number[mid]) && l < r) {
                com++;
                if (search.compareToIgnoreCase(number[mid]) < 0) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
                mid = (l + r) / 2;
            }
        } else {
            while (!search.equalsIgnoreCase(number[mid]) && l < r) {
                com++;
                if (search.compareToIgnoreCase(number[mid]) < 0) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
                mid = (l + r) / 2;
            }
        }
        if (!search.equalsIgnoreCase(number[mid])) {
            mid = -1;
            com = number.length;
        }
        sopl("number of comparisons: " + com);
        sopl(search + " is at" + " [" + mid + "].");
        return mid;
    }

    public static void shuffleArray(String array[]) { //creates a list with randoms numbers that doesn't repeat itself
        List<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        Collections.shuffle(list);
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
    }

    public static void shuffleArray(double a[]) {
        String array[] = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i] + "";
        }
        shuffleArray(array);
        for (int i = 0; i < a.length; i++) {
            a[i] = Double.parseDouble(array[i]);
        }
    }

    public static void shuffleArray(int a[]) {
        String array[] = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i] + "";
        }
        shuffleArray(array);
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(array[i]);
        }
    }
}
