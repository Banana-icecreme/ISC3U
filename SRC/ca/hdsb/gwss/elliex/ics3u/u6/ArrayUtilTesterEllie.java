/* Ellie Xu             
 * 12. 9. 2016.
 * methods: bubble, selection, max, average, min, println. 
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.u6;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sop;
import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.bubble;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.min;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.printArray;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.selection;
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
        minTest();
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
        }
        for (int a = 0; a < 6; a++) {
            double random = (Math.random() * 200) - 100;
            datadouble[a] = Double.parseDouble(nej.format(random));
        }
        for (int a = 0; a < 6; a++) {
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
        bubble (datastring, true);

        //CONFIRM
        for (int i = 1; i < dataint.length; i++) {
            if (dataint[i] < dataint[i - 1]) {
                passedTest = false;
            }
            if (datadouble[i] < datadouble[i - 1]) {
                passedTest = false;
            }
            if (datastring[i].compareTo( datastring[i - 1]) < 0) {
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
        }
        for (int a = 0; a < 6; a++) {
            double random = (Math.random() * 200) - 100;
            datadouble[a] = Double.parseDouble(nej.format(random));
        }
        for (int a = 0; a < 6; a++) {
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
        selection (dataint, true);
        sopl("\nDouble: ");
        selection (datadouble, true);
        sopl("\nString: ");
        selection (datastring, true);

        //CONFIRM
        for (int i = 1; i < dataint.length; i++) {
            if (dataint[i] < dataint[i - 1]) {
                passedTest = false;
            }
            if (datadouble[i] < datadouble[i - 1]) {
                passedTest = false;
            }
            if (datastring[i].compareTo( datastring[i - 1]) < 0) {
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
        }
        for (int a = 0; a < 6; a++) {
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
            if (mini > dataint[i]) {
                passedTest = false;
            }
            if (mind > datadouble[i]) {
                passedTest = false;
            }
        }
        assert passedTest == true;
        System.out.println("\nTEST CASE #1A RESULTS - passed = " + passedTest);
        return passedTest;
    }
}
