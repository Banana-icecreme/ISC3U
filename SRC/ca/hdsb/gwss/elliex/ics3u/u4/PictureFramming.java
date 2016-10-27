/*
 * Ellie Xu
 * 5 days till Nov 1 2016
 * version 1.0
 * A picture frame where you can put in the dimentions, and it will print a frame out in the output.
 */
package ca.hdsb.gwss.elliex.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1xuell
 */
public class PictureFramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //variables
        int n, m, p, q;

        System.out.println("What is the width of the picture?");
        n = input.nextInt();
        System.out.println("What is the height of the picture?");
        m = input.nextInt();
        System.out.println("What is the width of the mat?");
        p = input.nextInt();
        System.out.println("What is the width of the frame?");
        q = input.nextInt();
        
        for (int f = 0; f < m ; f++){
            System.out.println(".");
            for (int f2 = 0; f2 < n; f++){
            System.out.println(".");
        }
        }
    }

}
