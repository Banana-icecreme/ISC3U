/* Ellie Xu             
 * Remebrance day. 2016.
 * String Methods. 
 * Version 1.1. 
 */
package ca.hdsb.gwss.elliex.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1xuell
 */
public class StringFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count;
        Scanner input = new Scanner(System.in);
        System.out.print("1 for counting vowels.\n2 for something else\n");
        count = input.nextInt();

        switch (count) {
            case 1:
                CountingVowels();
                break;
            case 2:
                WordSpace();
                break;
            default:
                System.out.println("There is no such program yet.");
        }
    }

    public static void CountingVowels() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nType in a sentence where you wish the vowel to be counted.");
        String vowel = input.nextLine();
        int count = 0;
        for (int i = 0; i < vowel.length(); i++) {
            switch (vowel.charAt(i)){
                case 'e':
                count++;
                break;
                case 'a':
                count++;
                break;
                case 'i':
                count++;
                break;
                case 'o':
                count++;
                break;
                case 'u':
                count++;
                break;
                case 'y':
                count++; 
                break;
        }
        }
        System.out.println(count);
    }

    public static void WordSpace() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nType in a sentence.");
        String sen = input.nextLine();
        for (int i = 0; i < sen.length(); i++) {
            System.out.println(sen.charAt(i));
        }

    }
}
