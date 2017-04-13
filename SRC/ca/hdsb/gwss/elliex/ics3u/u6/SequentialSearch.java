/* Ellie Xu             
 * 12. 11. 2016.
 * Uses the methods created in ArrayUtilEllie.java to created a mega method that does multiple things. 
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.u6;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sop;
import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import static ca.hdsb.gwss.elliex.ics3u.other.ArrayUtilEllie.binarySearch;
import static ca.hdsb.gwss.elliex.ics3u.other.ArrayUtilEllie.bubbleSort;
import static ca.hdsb.gwss.elliex.ics3u.other.ArrayUtilEllie.linearSearch;
import static ca.hdsb.gwss.elliex.ics3u.other.ArrayUtilEllie.selectionSort;
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
        
        //Uncomment the codes below to run them:
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
        sopl(number);
        sopl("\nLINEAR SEARCH FOR " + search + ":");
        linearSearch(number, search);
        sop("\nBUBBLE SORT: ");
        sopl("\nSORT ORDER: " + order);
        bubbleSort(number, way);
        sopl("\nBINARY SEARCH FOR " + search + ":");
        binarySearch(number, search);
    }

    public static void bubbleSort2(int number[], int search, boolean way) {
        sopl("\n-------BUBBLESORT2-------");
        sopl("----------INT----------");
        order(way);
        sopl("\nORIGINAL ARRAY: ");
        sopl(number);
        sopl("\nLINEAR SEARCH FOR " + search + ":");
        linearSearch(number, search);
        sop("\nBUBBLE SORT: ");
        sopl("\nSORT ORDER: " + order);
        bubbleSort(number, way);
        sopl("\nBINARY SEARCH FOR " + search + ":");
        binarySearch(number, search);
    }

    public static void bubbleSort2(String number[], String search, boolean way) {
        sopl("\n-------BUBBLESORT2-------");
        sopl("---------STRING---------");
        order(way);
        sopl("\nORIGINAL ARRAY: ");
        sopl(number);
        sopl("\nLINEAR SEARCH FOR " + search + ":");
        linearSearch(number, search);
        sop("\nBUBBLE SORT: ");
        sopl("\nSORT ORDER: " + order);
        bubbleSort(number, way);
        sopl("\nBINARY SEARCH FOR " + search + ":");
        binarySearch(number, search);
    }

    public static void selectionSort2(double number[], double search, boolean way) {
        sopl("\n-------SELECTIONSORT2-------");
        sopl("-----------DOUBLE-----------");
        order(way);
        sopl("\nORIGINAL ARRAY: ");
        sopl(number);
        sopl("\nLINEAR SEARCH FOR " + search + ":");
        linearSearch(number, search);
        sop("\nSELECTION SORT: ");
        sopl("\nSORT ORDER: " + order);
        selectionSort(number, way);
        sopl("\nBINARY SEARCH FOR " + search + ":");
        binarySearch(number, search);
    }

    public static void selectionSort2(int number[], int search, boolean way) {
        sopl("\n-------SELECTIONSORT2-------");
        sopl("------------INT------------");
        order(way);
        sopl("\nORIGINAL ARRAY: ");
        sopl(number);
        sopl("\nLINEAR SEARCH FOR " + search + ":");
        linearSearch(number, search);
        sop("\nSELECTION SORT: ");
        sopl("\nSORT ORDER: " + order);
        selectionSort(number, way);
        sopl("\nBINARY SEARCH FOR " + search + ":");
        binarySearch(number, search);
    }

    public static void selectionSort2(String number[], String search, boolean way) {
        sopl("\n-------SELECTIONSORT2-------");
        sopl("----------STRING----------");
        order(way);
        sopl("\nORIGINAL ARRAY: ");
        sopl(number);
        sopl("\nLINEAR SEARCH FOR " + search + ":");
        linearSearch(number, search);
        sop("\nSELECTION SORT: ");
        sopl("\nSORT ORDER: " + order);
        selectionSort(number, way);
        sopl("\nBINARY SEARCH FOR " + search + ":");
        binarySearch(number, search);
    }
}
