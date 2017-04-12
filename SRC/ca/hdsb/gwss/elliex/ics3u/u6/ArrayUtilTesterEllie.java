/* Ellie Xu             
 * 12. 12. 2016.
 * Tests the methods created in ArrayUtilEllie 
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.u6;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sop;
import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import static ca.hdsb.gwss.elliex.ics3u.other.ArrayUtilEllie.binarySearch;
import static ca.hdsb.gwss.elliex.ics3u.other.ArrayUtilEllie.bubbleSort;
import static ca.hdsb.gwss.elliex.ics3u.other.ArrayUtilEllie.linearSearch;
import static ca.hdsb.gwss.elliex.ics3u.other.ArrayUtilEllie.math;
import static ca.hdsb.gwss.elliex.ics3u.other.ArrayUtilEllie.printArray;
import static ca.hdsb.gwss.elliex.ics3u.other.ArrayUtilEllie.selectionSort;
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
        bubbleSort(dataint, true);
        sopl("\nDouble: ");
        bubbleSort(datadouble, true);
        sopl("\nString: ");
        bubbleSort(datastring, true);

        //CONFIRM
        for (int i = 1; i < dataint.length; i++) {
            if (dataint[i] < dataint[i - 1] || datadouble[i] < datadouble[i - 1] || datastring[i].compareTo(datastring[i - 1]) < 0) {
                passedTest = false;
            }
        }
//        assert passedTest == true;
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
        selectionSort(dataint, true);
        sopl("\nDouble: ");
        selectionSort(datadouble, true);
        sopl("\nString: ");
        selectionSort(datastring, true);

        //CONFIRM
        for (int i = 1; i < dataint.length; i++) {
            if (dataint[i] < dataint[i - 1] || datadouble[i] < datadouble[i - 1] || datastring[i].compareTo(datastring[i - 1]) < 0) {
                passedTest = false;
            }
        }
//        assert passedTest == true;
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
        mini = math(dataint, "min");
        sopl("\nDouble: ");
        mind = math(datadouble, "min");

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
        maxi = math(dataint, "max");
        sopl("\nDouble: ");
        maxd = math(datadouble, "max");

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
        avei = math(dataint, "average");
        sopl("\nDouble: ");
        aved = Double.parseDouble(nej.format(math(datadouble, "average")));

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
        int sumi, sum1 = 0;
        double sumd, sum2 = 0;
        int random = (int) (Math.random() * 1000);
        double randomr = Double.parseDouble(nej.format(Math.random() * 1000));
        int upby = (int) (Math.random() * 10);
        for (int a = 0; a < 6; a++) {
            dataint[a] = random;
            random = random + upby;
            datadouble[a] = randomr;
            randomr = randomr + upby;
        }

        // DISPLAY ARRAY
        sopl("\nDATA GOING UP BY: " + upby);
        sop("\nDATA BEFORE: \nInt: ");
        printArray(dataint);
        sop("\nDouble: ");
        printArray(datadouble);

        // SORT DATA
        sumi = math(dataint, "sum");
        sumd = math(datadouble, "sum");
        math(datadouble, "sum");
        sopl("\n\nDATA AFTER: \nInt: " + sumi);
        sopl("Double: " + sumd);
        

        //CONFIRM
        for (int i = 0; i < dataint.length; i++) {
            sum1 = ((dataint.length) * (dataint[0] + dataint[dataint.length - 1]))/2;
            sum2 = ((datadouble.length) * (datadouble[0] + datadouble[datadouble.length - 1]))/2;
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
        selectionSort(dataint, true);
        selectionSort(datadouble, true);
        selectionSort(datastring, true);

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
