/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.elliex.ics3u.u6;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sop;
import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.binarySearch;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.bubble;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.linearSearch;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.printArray;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.selection;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.totalcom;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.totalswap;
import java.text.NumberFormat;
import java.util.Random;

/**
 *
 * @author elli
 */
public class SequentialSearch {

    public static String order;

    public static void main(String[] args) {
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(2);
        nej.setMaximumFractionDigits(2);
        //variables and arrays 
        int searchi, arraysize = 10;
        double searchd;
        String searchs;
        int[] dataint = new int[arraysize];
        double[] datadouble = new double[arraysize];
        String datastring[] = new String[arraysize];
        Random w = new Random();
        //generating random arrays
        for (int a = 0; a < arraysize; a++) {
            double random = (Math.random() * 1000);
            dataint[a] = (int) random;
            datadouble[a] = Double.parseDouble(nej.format(random));
            Random r = new Random();
            datastring[a] = (char) (r.nextInt(26) + 'a') + "";
        }
        //generating random search value;
        searchi = dataint[(int) (Math.random() * arraysize)];
        searchd = datadouble[(int) (Math.random() * arraysize)];
        searchs = datastring[(int) (Math.random() * arraysize)];
        //generating random search order
        boolean way = w.nextBoolean();
        //running methods
        
        bubbleSort2(datadouble, searchd, way);
//        bubbleSort2(dataint, searchi, way);
//        bubbleSort2(datastring, searchs, way);
        selectionSort2(datadouble, searchd, way);
//        selectionSort2(dataint, searchi, way);
//        selectionSort2(datastring, searchs, way);
    }

    public static void order(boolean way) {
        if (way == true) {
            order = "LEAST TO GREATEST";
        } else {
            order = "GREATEST TO LEAST";
        }
    }

    public static void bubbleSort2(double number[], double search, boolean way) {
        sopl("\n-------BUBBLESORT2-------");
        sopl("---------DOUBLE---------");
        order(way);
        sopl("\nORIGINAL ARRAY: ");
        printArray(number);
        sopl("\nLINEAR SEARCH FOR " + search + ":");
        linearSearch(number, search);
        sop("\nBUBBLE SORT: ");
        sopl("\nSORT ORDER: " + order);
        bubble(number, way);
        sopl("\nBINARY SEARCH FOR " + search + ":");
        binarySearch(number, search);
        sopl("\nTOTAL NUMBER OF COMPARISONS: " + totalcom);
        sopl("TOTAL NUMBER OF SWAPS MADE: " + totalswap);
        totalswap = 0;
        totalcom = 0;
    }

    public static void bubbleSort2(int number[], int search, boolean way) {
        sopl("\n-------BUBBLESORT2-------");
        sopl("----------INT----------");
        order(way);
        sopl("\nORIGINAL ARRAY: ");
        printArray(number);
        sopl("\nLINEAR SEARCH FOR " + search + ":");
        linearSearch(number, search);
        sop("\nBUBBLE SORT: ");
        sopl("\nSORT ORDER: " + order);
        bubble(number, way);
        sopl("\nBINARY SEARCH FOR " + search + ":");
        binarySearch(number, search);
        sopl("\nTOTAL NUMBER OF COMPARISONS: " + totalcom);
        sopl("TOTAL NUMBER OF SWAPS MADE: " + totalswap);
        totalswap = 0;
        totalcom = 0;
    }

    public static void bubbleSort2(String number[], String search, boolean way) {
        sopl("\n-------BUBBLESORT2-------");
        sopl("---------STRING---------");
        order(way);
        sopl("\nORIGINAL ARRAY: ");
        printArray(number);
        sopl("\nLINEAR SEARCH FOR " + search + ":");
        linearSearch(number, search);
        sop("\nBUBBLE SORT: ");
        sopl("\nSORT ORDER: " + order);
        bubble(number, way);
        sopl("\nBINARY SEARCH FOR " + search + ":");
        binarySearch(number, search);
        sopl("\nTOTAL NUMBER OF COMPARISONS: " + totalcom);
        sopl("TOTAL NUMBER OF SWAPS MADE: " + totalswap);
        totalswap = 0;
        totalcom = 0;
    }

    public static void selectionSort2(double number[], double search, boolean way) {
        sopl("\n-------SELECTIONSORT2-------");
        sopl("-----------DOUBLE-----------");
        order(way);
        sopl("\nORIGINAL ARRAY: ");
        printArray(number);
        sopl("\nLINEAR SEARCH FOR " + search + ":");
        linearSearch(number, search);
        sop("\nSELECTION SORT: ");
        sopl("\nSORT ORDER: " + order);
        selection(number, way);
        sopl("\nBINARY SEARCH FOR " + search + ":");
        binarySearch(number, search);
        sopl("\nTOTAL NUMBER OF COMPARISONS: " + totalcom);
        sopl("TOTAL NUMBER OF SWAPS MADE: " + totalswap);
        totalswap = 0;
        totalcom = 0;
    }

    public static void selectionSort2(int number[], int search, boolean way) {
        sopl("\n-------SELECTIONSORT2-------");
        sopl("------------INT------------");
        order(way);
        sopl("\nORIGINAL ARRAY: ");
        printArray(number);
        sopl("\nLINEAR SEARCH FOR " + search + ":");
        linearSearch(number, search);
        sop("\nSELECTION SORT: ");
        sopl("\nSORT ORDER: " + order);
        selection(number, way);
        sopl("\nBINARY SEARCH FOR " + search + ":");
        binarySearch(number, search);
        sopl("\nTOTAL NUMBER OF COMPARISONS: " + totalcom);
        sopl("TOTAL NUMBER OF SWAPS MADE: " + totalswap);
        totalswap = 0;
        totalcom = 0;
    }

    public static void selectionSort2(String number[], String search, boolean way) {
        sopl("\n-------SELECTIONSORT2-------");
        sopl("----------STRING----------");
        order(way);
        sopl("\nORIGINAL ARRAY: ");
        printArray(number);
        sopl("\nLINEAR SEARCH FOR " + search + ":");
        linearSearch(number, search);
        sop("\nSELECTION SORT: ");
        sopl("\nSORT ORDER: " + order);
        selection(number, way);
        sopl("\nBINARY SEARCH FOR " + search + ":");
        binarySearch(number, search);
        sopl("\nTOTAL NUMBER OF COMPARISONS: " + totalcom);
        sopl("TOTAL NUMBER OF SWAPS MADE: " + totalswap);
        totalswap = 0;
        totalcom = 0;
    }
}
