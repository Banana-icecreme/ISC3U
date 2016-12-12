/* Ellie Xu             
 * 12. 11. 2016.
 * Tests the methods created in ArrayUtilEllie 
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.u6;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sop;
import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.average;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.binarySearch;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.bubble;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.linearSearch;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.max;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.min;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.printArray;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.selection;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.sum;
import java.text.NumberFormat;
import java.util.Random;

/**
 *
 * @author elli
 */
public class ArrayUtilTesterEllie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bubbleTest();
        selectionTest();
        minTest();
        maxTest();
        averageTest();
        sumTest();
        linearSearchTest();
        binarySearchTest();
    }

    public static boolean bubbleTest() {
        sopl("\n-------------------------------");
        sopl("TEST CASE #1A      : Bubble Sort");
        sopl("PRE CONDITION      : unsorted array; + and - numbers; int, double, or string");
        sopl("POST CONDITION     : array sorted, lowest to highest");
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);
        //variables and arrays 
        int[] dataint = new int[6];
        double[] datadouble = new double[6];
        String[] datastring = new String[6];
        boolean passedTest = true;
        for (int a = 0; a < 6; a++) {
            double random = (Math.random() * 1000);
            dataint[a] = (int) random;
            datadouble[a] = Double.parseDouble(nej.format(random));
            Random ran = new Random();
            datastring[a] = (char) (ran.nextInt(26) + 'a') + "";
        }
        // DISPLAY ARRAY
        sop("\nDATA BEFORE: \nInt: ");
        printArray(dataint);
        sop("Double: ");
        printArray(datadouble);
        sop("String: ");
        printArray(datastring);

        // SORT DATA
        sopl("\nDATA AFTER: \nInt: ");
        bubble(dataint, true);
        sopl("\nDouble: ");
        bubble(datadouble, true);
        sopl("\nString: ");
        bubble(datastring, true);

        //CONFIRM
        for (int i = 1; i < dataint.length; i++) {
            if (dataint[i] < dataint[i - 1] || datadouble[i] < datadouble[i - 1] || datastring[i].compareTo(datastring[i - 1]) < 0) {
                passedTest = false;
            }
        }
        assert passedTest == true;
        sopl("\nTEST CASE #1A RESULTS - passed = " + passedTest);
        return passedTest;
    }

    public static boolean selectionTest() {
        sopl("\n-------------------------------");
        sopl("TEST CASE #2A      : Selection Sort");
        sopl("PRE CONDITION      : unsorted array; + and - numbers; int, double, or string");
        sopl("POST CONDITION     : array sorted, lowest to highest");
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);
        //variabels and arrays 
        int[] dataint = new int[6];
        double[] datadouble = new double[6];
        String[] datastring = new String[6];
        boolean passedTest = true;
        for (int a = 0; a < 6; a++) {
            double random = (Math.random() * 1000);
            dataint[a] = (int) random;
            datadouble[a] = Double.parseDouble(nej.format(random));
            Random ran = new Random();
            datastring[a] = (char) (ran.nextInt(26) + 'a') + "";
        }
        // DISPLAY ARRAY
        sop("\nDATA BEFORE: \nInt: ");
        printArray(dataint);
        sop("Double: ");
        printArray(datadouble);
        sop("String: ");
        printArray(datastring);

        // SORT DATA
        sopl("\nDATA AFTER: \nInt: ");
        selection(dataint, true);
        sopl("\nDouble: ");
        selection(datadouble, true);
        sopl("\nString: ");
        selection(datastring, true);

        //CONFIRM
        for (int i = 1; i < dataint.length; i++) {
            if (dataint[i] < dataint[i - 1] || datadouble[i] < datadouble[i - 1] || datastring[i].compareTo(datastring[i - 1]) < 0) {
                passedTest = false;
            }
        }
        assert passedTest == true;
        sopl("\nTEST CASE #2A RESULTS - passed = " + passedTest);
        return passedTest;
    }

    public static boolean minTest() {
        sopl("\n-------------------------------");
        sopl("TEST CASE #3A      : Minimum");
        sopl("PRE CONDITION      : unsorted array; + and - numbers; int, or double");
        sopl("POST CONDITION     : displays the minimum");
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);
        //variables and arrays
        int[] dataint = new int[6];
        double[] datadouble = new double[6];
        boolean passedTest = true;
        int mini;
        double mind;
        for (int a = 0; a < 6; a++) {
            double random = (Math.random() * 1000);
            dataint[a] = (int) random;
            datadouble[a] = Double.parseDouble(nej.format(random));
        }

        // DISPLAY ARRAY
        sop("\nDATA BEFORE: \nInt: ");
        printArray(dataint);
        sop("Double: ");
        printArray(datadouble);

        // SORT DATA
        sopl("\nDATA AFTER: \nInt: ");
        mini = min(dataint);
        sopl("\nDouble: ");
        mind = min(datadouble);

        //CONFIRM
        for (int i = 0; i < dataint.length; i++) {
            if (mini > dataint[i] || mind > datadouble[i]) {
                passedTest = false;
            }
        }
        assert passedTest == true;
        sopl("\nTEST CASE #3A RESULTS - passed = " + passedTest);
        return passedTest;
    }

    public static boolean maxTest() {
        System.out.println("\n-------------------------------");
        System.out.println("TEST CASE #4A      : Maximum");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers; int, or double");
        System.out.println("POST CONDITION     : displays the maximum");
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);
        //variabels and arrays 
        int[] dataint = new int[6];
        double[] datadouble = new double[6];
        boolean passedTest = true;
        int maxi;
        double maxd;
        for (int a = 0; a < 6; a++) {
            double random = (Math.random() * 1000);
            dataint[a] = (int) random;
            datadouble[a] = Double.parseDouble(nej.format(random));
        }

        // DISPLAY ARRAY
        System.out.println("\nDATA BEFORE: ");
        sop("Int: ");
        printArray(dataint);
        sop("Double: ");
        printArray(datadouble);

        // SORT DATA
        sopl("\nDATA AFTER: \nInt: ");
        maxi = max(dataint);
        sopl("\nDouble: ");
        maxd = max(datadouble);

        //CONFIRM
        for (int i = 0; i < dataint.length; i++) {
            if (maxi < dataint[i] || maxd < datadouble[i]) {
                passedTest = false;
            }
        }
        assert passedTest == true;
        System.out.println("\nTEST CASE #4A RESULTS - passed = " + passedTest);
        return passedTest;
    }

    public static boolean averageTest() {
        System.out.println("\n-------------------------------");
        System.out.println("TEST CASE #5A      : Average");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers; int, or double");
        System.out.println("POST CONDITION     : displays the average");
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);
        NumberFormat number = NumberFormat.getIntegerInstance();
        //variables and arrays 
        int[] dataint = new int[6];
        double[] datadouble = new double[6];
        boolean passedTest = true;
        int avei, sumi = 0;
        double aved, sumd = 0;
        for (int a = 0; a < 6; a++) {
            double random = (Math.random() * 1000);
            dataint[a] = (int) random;
            datadouble[a] = Double.parseDouble(nej.format(random));
        }

        // DISPLAY ARRAY
        sop("\nDATA BEFORE: \nInt: ");
        printArray(dataint);
        sop("Double: ");
        printArray(datadouble);

        // SORT DATA
        sopl("\nDATA AFTER: \nInt: ");
        avei = average(dataint);
        sopl("\nDouble: ");
        aved = Double.parseDouble(nej.format(average(datadouble)));

        //CONFIRM
        for (int i = 0; i < dataint.length; i++) {
            sumi = sumi + dataint[i];
            sumd = sumd + datadouble[i];
        }
        sumi = sumi/dataint.length;
        sumd = Double.parseDouble(nej.format(sumd/datadouble.length));
        if (avei != sumi || aved != sumd) {
            passedTest = false;
        }
        assert passedTest == true;
        System.out.println("\nTEST CASE #5A RESULTS - passed = " + passedTest);
        return passedTest;
    }

    public static boolean sumTest() {
        System.out.println("\n-------------------------------");
        System.out.println("TEST CASE #6A      : Sum");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers; int, or double");
        System.out.println("POST CONDITION     : displays the sum");
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);
        //variabels and arrays 
        int[] dataint = new int[6];
        double[] datadouble = new double[6];
        boolean passedTest = true;
        int sumi;
        double sumd;
        int sum1 = 0;
        double sum2 = 0;
        for (int a = 0; a < 6; a++) {
            dataint[a] = (int) (Math.random() * 1000);
            double random = (Math.random() * 1000);
            datadouble[a] = Double.parseDouble(nej.format(random));
        }

        // DISPLAY ARRAY
        sop("\nDATA BEFORE: \nInt: ");
        printArray(dataint);
        sop("Double: ");
        printArray(datadouble);

        // SORT DATA
        sopl("\nDATA AFTER: \nInt: ");
        sumi = sum(dataint);
        sopl("\nDouble: ");
        sumd = sum(datadouble);

        //CONFIRM
        for (int i = 0; i < dataint.length; i++) {
            sum1 = dataint[i] + sum1;
            sum2 = datadouble[i] + sum2;
        }
        if (sum1 != sumi || sum2 != sumd) {
            passedTest = false;
        }
        assert passedTest == true;
        System.out.println("\nTEST CASE #6A RESULTS - passed = " + passedTest);
        return passedTest;
    }

    public static boolean linearSearchTest() {
        System.out.println("\n-------------------------------");
        System.out.println("TEST CASE #7A      : Linear Search");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers; int, double, or string");
        System.out.println("POST CONDITION     : displays the posistion of the number being searched");
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);
        //variables and arrays 
        int[] dataint = new int[6];
        double[] datadouble = new double[6];
        String datastring[] = new String[6];
        boolean passedTest = true;
        int lini, searchi, lind, lins;
        double searchd;
        String searchs;
        for (int a = 0; a < 6; a++) {
            dataint[a] = (int) (Math.random() * 1000);
            double random = (Math.random() * 1000);
            datadouble[a] = Double.parseDouble(nej.format(random));
            Random r = new Random();
            datastring[a] = (char) (r.nextInt(26) + 'a') + "";
        }

        // DISPLAY ARRAY
        sop("\nDATA BEFORE: \nInt: ");
        printArray(dataint);
        sop("Double: ");
        printArray(datadouble);
        sop("String: ");
        printArray(datastring);

        // SORT DATA
        System.out.println("\nDATA AFTER: ");
        sopl("Int: ");
        searchi = dataint[(int) (Math.random() * 6)];
        lini = linearSearch(dataint, searchi);
        sopl("\nDouble: ");
        searchd = datadouble[(int) (Math.random() * 6)];
        lind = linearSearch(datadouble, searchd);
        sopl("\nString: ");
        searchs = datastring[(int) (Math.random() * 6)];
        lins = linearSearch(datastring, searchs);

        //CONFIRM
        if (searchi != dataint[lini] || searchd != datadouble[lind] || !searchs.equals(datastring[lins])) {
            passedTest = false;
        }
        assert passedTest == true;
        System.out.println("\nTEST CASE #7A RESULTS - passed = " + passedTest);
        return passedTest;
    }

    public static boolean binarySearchTest() {
        System.out.println("\n-------------------------------");
        System.out.println("TEST CASE #8A      : Binary Search");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers; int, double, or string");
        System.out.println("POST CONDITION     : displays the posistion of the number being searched");
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);
        //variabels and arrays 
        int[] dataint = new int[6];
        double[] datadouble = new double[6];
        String datastring[] = new String[6];
        boolean passedTest = true;
        int bini, searchi, bind, bins;
        double searchd;
        String searchs;
        for (int a = 0; a < 6; a++) {
            double random = (Math.random() * 1000);
            dataint[a] = (int) random;
            datadouble[a] = Double.parseDouble(nej.format(random));
            Random r = new Random();
            datastring[a] = (char) (r.nextInt(26) + 'a') + "";
        }
        sopl("");
        selection(dataint, true);
        selection(datadouble, true);
        selection(datastring, true);

        // DISPLAY ARRAY
        sop("\nDATA BEFORE: \nInt: ");
        printArray(dataint);
        sop("Double: ");
        printArray(datadouble);
        sop("String: ");
        printArray(datastring);

        // SORT DATA
        sopl("\nDATA AFTER: \nInt: ");
        searchi = dataint[(int) (Math.random() * 6)];
        bini = binarySearch(dataint, searchi);
        sopl("\nDouble: ");
        searchd = datadouble[(int) (Math.random() * 6)];
        bind = binarySearch(datadouble, searchd);
        sopl("\nString: ");
        searchs = datastring[(int) (Math.random() * 6)];
        bins = binarySearch(datastring, searchs);

        //CONFIRM
        if (searchi != dataint[bini] || searchd != datadouble[bind] || !searchs.equals(datastring[bins])) {
            passedTest = false;
        }
        assert passedTest == true;
        System.out.println("\nTEST CASE #8A RESULTS - passed = " + passedTest);
        return passedTest;
    }
}
