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
        System.out.print("1 for counting vowels.\n2 for word square.\n3 for compass.\n4 for "
                + "palindrome. \n5 for SIN check.\n");
        count = input.nextInt();

        switch (count) {
            case 1:
                CountingVowels();
                break;
            case 2:
                WordSquare();
                break;
            case 3:
                Compass();
                break;
            case 4:
                Palindrome();
                break;
            case 5:
                SINCheck();
                break;
            default:
                System.out.println("There is no such program.");
        }
    }

    public static void CountingVowels() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nType in a sentence where you wish the vowel to be counted.");
        String vowel = input.nextLine();
        vowel.toLowerCase();
        int count = 0;
        for (int i = 0; i < vowel.length(); i++) {
            switch (vowel.charAt(i)) {
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

    public static void WordSquare() {
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("\nType in a sentence.");
        String sentence = input.nextLine();
        System.out.println("");
        while (i <= sentence.length()) {
            String rest = sentence.substring(1);
            //System.out.println(rest + sentence.charAt(0));
            System.out.println(sentence);
            sentence = rest + sentence.charAt(0);
            i++;
        }
    }

    public static void Compass() {
        String com, direction = null, face = null;
        Scanner input = new Scanner(System.in);
        System.out.println("\nType in the compass direction.");
        com = input.nextLine();
        com.toUpperCase();
        System.out.println(" ");

        switch (com.charAt(0)) {
            case 'S':
                face = "South";
                break;
            case 'N':
                face = "North";
                break;
            case 'W':
                face = "West";
                break;
            case 'E':
                face = "East";
                break;
            default:
                System.out.println("You have a typo.");
        }
        switch (com.charAt(3)) {
            case 'S':
                direction = "South";
                break;
            case 'N':
                direction = "North";
                break;
            case 'W':
                direction = "West";
                break;
            case 'E':
                direction = "East";
                break;
            default:
                System.out.println("You have a typo.");
        }
        System.out.println("Start facing " + face + ". Turn " + com.substring(1, 3) + " degrees towards the " + direction + ".");
    }

    public static void Palindrome() {
        String pal, check = "", blank = "", letter, endletter;
        int i, length;
        Scanner input = new Scanner(System.in);
        System.out.println("\nType in the word.");
        pal = input.nextLine();
        System.out.println(" ");
        pal.toUpperCase();
        i = pal.length() - 1;

        while (i >= 0) {
            letter = pal.charAt(i) + blank;
            length = pal.length()/2;
            endletter = pal.charAt(length) + blank;
            letter.equalsIgnoreCase(endletter);
            System.out.print(pal.charAt(i));
            check = check + pal.charAt(i);
            i--;
        }
        if (check.equalsIgnoreCase(pal)) {
            System.out.println("\n" + pal + " IS a palindrome.");
        } else {
            System.out.println("\n" + pal + " is NOT a palindrome.");
        }
    }

    public static void SINCheck() {
        //Double.parseDouble
        int i = 1, b = 0, e = 0, f = 0, odd = 0;
        String num, word = "", blank = "", c, d = "", g;
        Scanner input = new Scanner(System.in);
        System.out.println("\nType in your Social Insurance Number:");
        num = input.nextLine();
        while (i < num.length()) {
            word = num.charAt(i) + blank;
            b = Integer.parseInt(word) * 2;
            c = Integer.toString(b);
            d = d + c;
            i += 2;
        }
        //130692544  
        while (e < d.length()) {
            g = d.charAt(e) + blank;
            f = Integer.parseInt(g) + f;
            e++;
        }
        System.out.println(f);
    }

    while (odd< num.length () 
    

) {
        
        
    }

}
