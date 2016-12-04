/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.elliex.ics3u.other;

import static ca.hdsb.gwss.elliex.ics3u.methods.MaxMinAverage.average;
import static ca.hdsb.gwss.elliex.ics3u.methods.SelectionSort.selection;

/**
 *
 * @author 1xuell
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a =2;
      String twoLetters[] = new String [a];
      twoLetters[0] = "dc";
      twoLetters[1] = "ac";
      selection(twoLetters, a, false);
      
      int average[] = new int [a];
      average[0] = 2;
      average [1] = 4;
      average(average, a);
}
}
