/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.elliex.ics3u.other;

import static ca.hdsb.gwss.elliex.ics3u.methods.ArrayUtilEllie.printArray;
import static ca.hdsb.gwss.elliex.ics3u.methods.ArrayUtilEllie.selection;

/**
 *
 * @author 1xuell
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 6;
        int twoLetters[] = new int[a];
        twoLetters[0] = 6;
        twoLetters[1] = 5;
        twoLetters[2] = 4;
        twoLetters[3] = 3;
        twoLetters[4] = 2;
        twoLetters[5] = 1;
        selection(twoLetters, true);

        String average[] = new String[2];
        average[0] = "r";
        average[1] = "g";
        printArray(average);
    }
}
