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
        double twoLetters[] = new double[a];
        twoLetters[0] = 4;
        twoLetters[1] = 3;
        twoLetters[2] = 2;
        twoLetters[3] = 1;
        binarySearch(twoLetters, 5);
    }

//    public static void binarySearch(double number[], double search) {
//        int a = 2;
//        double i = number[number.length / a];
//        boolean yes;
//        int place = 0;
//        if (search == i) {
//            place = number.length / a;
//        } else if (search > i) {
//            a = 4;
//            while (a <= number.length) {
//
//                i = number[number.length - number.length / a];
//                if (search == i) {
//                    place = number.length - number.length / a;
//                    a = number.length + 1;
//                    yes = true;
//                }
//                a *= 2;
//            }
//        } else {
//
//        }sopl(place);
//    }
    public static void binarySearch(double number[], double search) {
        int l = 0, r = number.length - 1, mid = (l + r) / 2, i = 0;
        boolean a = false;

        if (number[1] < number[r]){
            while (search != number[mid] && l < r) {
                if (search > number[mid]) {
                    l = mid + 1;
                }
                if (search < number[mid]) {
                    r = mid - 1;
                }
                mid = (l + r) / 2;
                i++;
            }
        } else {
            while (search != number[mid] && l > r) {
                if (search < number[mid]) {
                    l = mid + 1;
                }
                if (search > number[mid]) {
                    r = mid - 1;
                }
                mid = (l + r) / 2;
            }
        }
        if (search == number[mid]) {
            sopl(mid);
        }
    }
}
