/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.elliex.ics3u.u6;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;

/**
 *
 * @author 1xuell
 */
public class Search {

    public static void main(String[] args) {
        int a = 4;
        int twoLetters[] = new int[a];
        twoLetters[0] = 4;
        twoLetters[1] = 3;
        twoLetters[2] = 2;
        twoLetters[3] = 1;
        binarySearch(twoLetters, 4);
    }

    public static int binarySearch(double number[], double search) {
        int l = 0, r = number.length - 1, mid = (l + r) / 2;
        boolean a = false;

        if (number[l] < number[r]) {
            while (search != number[mid] && l < r) {
                if (search > number[mid]) {
                    l = mid + 1;
                }
                else {
                    r = mid - 1;
                }
                mid = (l + r) / 2;
            }
        } else {
            while (search != number[mid] && l < r) {
                if (search < number[mid]) {
                    l = mid + 1;
                }
                else {
                    r = mid - 1;
                }
                mid = (l + r) / 2;
            }
        }
        if (search != number[mid]) {
            mid = -1;
        }
        sopl(search + " is at" + " [" + mid + "].");
        return mid;
    }
    
    public static int binarySearch(int number[], int search){
     double number2 [] = new double[number.length];
     for (int a = 0; a < number.length; a++){
         number2[a] = number[a];
     }    
     return binarySearch(number2, search);
    }
    
    public static int binarySearch(String number[], String search){
        int l = 0, r = number.length - 1, mid = (l + r) / 2;
        boolean a = false;

        if (number[l].compareTo (number[r]) == 1) {
            while (search != number[mid] && l < r) {
                if (search.compareTo( number[mid]) == -1) {
                    l = mid + 1;
                }
                else {
                    r = mid - 1;
                }
                mid = (l + r) / 2;
            }
        } else {
            while (search != number[mid] && l < r) {
                if (search.compareTo( number[mid]) == 1) {
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
                mid = (l + r) / 2;
            }
        }
        if (search != number[mid]) {
            mid = -1;
        }
        sopl(search + " is at" + " [" + mid + "].");
        return mid;
    }
}
