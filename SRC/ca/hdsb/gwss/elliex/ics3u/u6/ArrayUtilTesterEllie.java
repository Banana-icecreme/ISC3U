/* Ellie Xu             
 * 12. 9. 2016.
 * Tests the methods created in ArrayUtilEllie 
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.u6;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sop;
import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
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
        binarySearchTest();
    }

    public static boolean bubbleTest() {
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #1A      : Bubble Sort");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers; int, double, or string");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);
        int[] dataint = new int[6];
        double[] datadouble = new double[6];
        String[] datastring = new String[6];
        boolean passedTest = true;
        for (int a = 0; a < 6; a++) {
            dataint[a] = (int) (Math.random() * 200) - 100;
            double random = (Math.random() * 200) - 100;
            datadouble[a] = Double.parseDouble(nej.format(random));
            Random r = new Random();
            datastring[a] = (char) (r.nextInt(26) + 'a') + "";
        }
        // DISPLAY ARRAY
        System.out.println("\nDATA BEFORE: ");
        sop("Int: ");
        printArray(dataint);
        sop("Double: ");
        printArray(datadouble);
        sop("String: ");
        printArray(datastring);

        // SORT DATA
        System.out.println("\nDATA AFTER: ");
        sopl("Int: ");
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
        System.out.println("\nTEST CASE #1A RESULTS - passed = " + passedTest);
        return passedTest;
    }

    public static boolean selectionTest() {
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #1A      : Selection Sort");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers; int, double, or string");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);
        int[] dataint = new int[6];
        double[] datadouble = new double[6];
        String[] datastring = new String[6];
        boolean passedTest = true;
        for (int a = 0; a < 6; a++) {
            dataint[a] = (int) (Math.random() * 200) - 100;
            double random = (Math.random() * 200) - 100;
            datadouble[a] = Double.parseDouble(nej.format(random));
            Random r = new Random();
            datastring[a] = (char) (r.nextInt(26) + 'a') + "";
        }
        // DISPLAY ARRAY
        System.out.println("\nDATA BEFORE: ");
        sop("Int: ");
        printArray(dataint);
        sop("Double: ");
        printArray(datadouble);
        sop("String: ");
        printArray(datastring);

        // SORT DATA
        System.out.println("\nDATA AFTER: ");
        sopl("Int: ");
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
        System.out.println("\nTEST CASE #1A RESULTS - passed = " + passedTest);
        return passedTest;
    }

    public static boolean minTest() {
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #1A      : Minimum");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers; int, or double");
        System.out.println("POST CONDITION     : displays the minimum");
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);
        int[] dataint = new int[6];
        double[] datadouble = new double[6];
        boolean passedTest = true;
        for (int a = 0; a < 6; a++) {
            dataint[a] = (int) (Math.random() * 200) - 100;
            double random = (Math.random() * 200) - 100;
            datadouble[a] = Double.parseDouble(nej.format(random));
        }

        // DISPLAY ARRAY
        System.out.println("\nDATA BEFORE: ");
        sop("Int: ");
        printArray(dataint);
        sop("Double: ");
        printArray(datadouble);

        // SORT DATA
        int mini;
        double mind;
        System.out.println("\nDATA AFTER: ");
        sopl("Int: ");
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
        System.out.println("\nTEST CASE #1A RESULTS - passed = " + passedTest);
        return passedTest;
    }

    public static boolean maxTest() {
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #1A      : Maximum");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers; int, or double");
        System.out.println("POST CONDITION     : displays the maximum");
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);
        int[] dataint = new int[6];
        double[] datadouble = new double[6];
        boolean passedTest = true;
        for (int a = 0; a < 6; a++) {
            dataint[a] = (int) (Math.random() * 200) - 100;
            double random = (Math.random() * 200) - 100;
            datadouble[a] = Double.parseDouble(nej.format(random));
        }

        // DISPLAY ARRAY
        System.out.println("\nDATA BEFORE: ");
        sop("Int: ");
        printArray(dataint);
        sop("Double: ");
        printArray(datadouble);

        // SORT DATA
        int maxi;
        double maxd;
        System.out.println("\nDATA AFTER: ");
        sopl("Int: ");
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
        System.out.println("\nTEST CASE #1A RESULTS - passed = " + passedTest);
        return passedTest;
    }

    public static boolean averageTest() {
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #1A      : Average");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers; int, or double");
        System.out.println("POST CONDITION     : displays the average");
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);
        int[] dataint = new int[6];
        double[] datadouble = new double[6];
        boolean passedTest = true;
//        for (int a = 0; a < 6; a++) {
//            dataint[a] = (int) (Math.random() * 200) - 100;
//            double random = (Math.random() * 200) - 100;
//            datadouble[a] = Double.parseDouble(nej.format(random));
//        }
//
//        // DISPLAY ARRAY
//        System.out.println("\nDATA BEFORE: ");
//        sop("Int: ");
//        printArray(dataint);
//        sop("Double: ");
//        printArray(datadouble);
//
//        // SORT DATA
//        int avei;
//        double aved;
//        System.out.println("\nDATA AFTER: ");
//        sopl("Int: ");
//        avei = Integer.parseInt(nej.format(average(dataint)));
//        sopl("\nDouble: ");
//        aved = Double.parseDouble(nej.format(average(datadouble)));
//
//        //CONFIRM
//        for (int i = 0; i < dataint.length; i++) {
//            if (avei < dataint[i] || aved < datadouble[i]) {
//                passedTest = false;
//            }
//        }
//        assert passedTest == true;
//        System.out.println("\nTEST CASE #1A RESULTS - passed = " + passedTest);
        return passedTest;
    } //how do i test for average???

    public static boolean sumTest() {
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #1A      : Sum");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers; int, or double");
        System.out.println("POST CONDITION     : displays the sum");
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);
        int[] dataint = new int[6];
        double[] datadouble = new double[6];
        boolean passedTest = true;
        for (int a = 0; a < 6; a++) {
            dataint[a] = (int) (Math.random() * 200) - 100;
            double random = (Math.random() * 200) - 100;
            datadouble[a] = Double.parseDouble(nej.format(random));
        }

        // DISPLAY ARRAY
        System.out.println("\nDATA BEFORE: ");
        sop("Int: ");
        printArray(dataint);
        sop("Double: ");
        printArray(datadouble);

        // SORT DATA
        int sumi;
        double sumd;
        System.out.println("\nDATA AFTER: ");
        sopl("Int: ");
        sumi = sum(dataint);
        sopl("\nDouble: ");
        sumd = sum(datadouble);

        //CONFIRM
        int sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < dataint.length; i++) {
            sum1 = dataint[i] + sum1;
            sum2 = datadouble[i] + sum2;
        }
        if (sum1 != sumi || sum2 != sumd) {
            passedTest = false;
        }
        assert passedTest == true;
        System.out.println("\nTEST CASE #1A RESULTS - passed = " + passedTest);
        return passedTest;
    }

    public static boolean linearSearchTest() {
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #1A      : Linear Search");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers; int, double, or string");
        System.out.println("POST CONDITION     : displays the posistion of the number being searched");
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);
        int[] dataint = new int[6];
        double[] datadouble = new double[6];
        String datastring[] = new String[6];
        boolean passedTest = true;
        for (int a = 0; a < 6; a++) {
            dataint[a] = (int) (Math.random() * 200) - 100;
            double random = (Math.random() * 200) - 100;
            datadouble[a] = Double.parseDouble(nej.format(random));
            Random r = new Random();
            datastring[a] = (char) (r.nextInt(26) + 'a') + "";
        }

        // DISPLAY ARRAY
        System.out.println("\nDATA BEFORE: ");
        sop("Int: ");
        printArray(dataint);
        sop("Double: ");
        printArray(datadouble);
        sop("String: ");
        printArray(datastring);

        // SORT DATA
        int lini, searchi, lind, lins;
        double searchd;
        String searchs;
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
        if (searchi != dataint[lini] || searchd != datadouble[lind] || !searchs.equals (datastring[lins])) {
            passedTest = false;
        }
        assert passedTest == true;
        System.out.println("\nTEST CASE #1A RESULTS - passed = " + passedTest);
        return passedTest;
    }
    
    public static boolean binarySearchTest() {
        System.out.println("-------------------------------");
        System.out.println("TEST CASE #1A      : Binary Search");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers; int, double, or string");
        System.out.println("POST CONDITION     : displays the posistion of the number being searched");
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);
        int[] dataint = new int[6];
        double[] datadouble = new double[6];
        String datastring[] = new String[6];
        boolean passedTest = true;
        for (int a = 0; a < 6; a++) {
            dataint[a] = (int) (Math.random() * 200) - 100;
            double random = (Math.random() * 200) - 100;
            datadouble[a] = Double.parseDouble(nej.format(random));
            Random r = new Random();
            datastring[a] = (char) (r.nextInt(26) + 'a') + "";
        }
        sopl("");
        selection(dataint, true);
        selection(datadouble, true);
        selection(datastring, true);

        // DISPLAY ARRAY
        System.out.println("\nDATA BEFORE: ");
        sop("Int: ");
        printArray(dataint);
        sop("Double: ");
        printArray(datadouble);
        sop("String: ");
        printArray(datastring);

        // SORT DATA
        int bini, searchi, bind, bins;
        double searchd;
        String searchs;
        System.out.println("\nDATA AFTER: ");
        sopl("Int: ");
        searchi = dataint[(int) (Math.random() * 6)];
        bini = binarySearch(dataint, searchi);
        sopl("\nDouble: ");
        searchd = datadouble[(int) (Math.random() * 6)];
        bind = binarySearch(datadouble, searchd);
        sopl("\nString: ");
        searchs = datastring[(int) (Math.random() * 6)];
        bins = binarySearch(datastring, searchs);
        
        //CONFIRM
        if (searchi != dataint[bini] || searchd != datadouble[bind] || !searchs.equals (datastring[bins])) {
            passedTest = false;
        }
        assert passedTest == true;
        System.out.println("\nTEST CASE #1A RESULTS - passed = " + passedTest);
        return passedTest;
    }
}
