/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.elliex.ics3u.methods;

/**
 *
 * @author 1xuell
 */
public class SOPL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v = 5;
        sop("a ");
        sopl(v);
    }

    public static int sop(String a) {
        System.out.print(a);
        return 'a';
    }

    public static int sop(int a) {
        System.out.print(a);
        return 'a';
    }

    public static int sop(double a) {
        System.out.print(a);
        return 'a';
    }

    public static int sopl(String a) {
        System.out.println(a);
        return 'a';
    }

    public static int sopl(int a) {
        System.out.println(a);
        return 'a';
    }

    public static int sopl(double a) {
        System.out.println(a);
        return 'a';
    }
}
