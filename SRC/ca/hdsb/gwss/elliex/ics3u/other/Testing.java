/*This class is used for testing codes. It's also why it's named Testing. 
 */
package ca.hdsb.gwss.elliex.ics3u.other;

import static ca.hdsb.gwss.elliex.ics3u.other.QuadraticFormula.quadraticFormula;
import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sop;
import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1xuell
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    palindrome();
    }

    public static int TournamentSelection() {
        Scanner input = new Scanner(System.in);
        int score = 0, group;
        for (int i = 0; i < 6; i++) {
            if (input.nextLine().equalsIgnoreCase("w")) {
                score++;
            }
        }
        switch (score) {
            case 6:
            case 5:
                group = 1;
                break;
            case 4:
            case 3:
                group = 2;
                break;
            case 2:
            case 1:
                group = 3;
                break;
            default:
                group = -1;
        }
        return group;
    }

    public static void magicSqaures() {
        Scanner input = new Scanner(System.in);
        String num;
        int line1[] = new int[4];
        int line2[] = new int[4];
        int line3[] = new int[4];
        int line4[] = new int[4];
        for (int i = 0; i < 4; i++) {
            StringTokenizer token = new StringTokenizer(input.nextLine());
            for (int a = 0; token.hasMoreTokens(); a++) {
                num = token.nextToken();
                if (i == 0) {
                    line1[a] = Integer.parseInt(num);
                }
                if (i == 1) {
                    line2[a] = Integer.parseInt(num);
                }
                if (i == 2) {
                    line3[a] = Integer.parseInt(num);
                }
                if (i == 3) {
                    line4[a] = Integer.parseInt(num);
                }
            }
        }
        int total[] = new int[8];
        for (int i = 0; i < 4; i++) {
            total[0] = line1[i] + total[0]; 
        }
        for (int i = 0; i < 4; i++) {
            total[1] = line2[i] + total[1]; 
        }
        for (int i = 0; i < 4; i++) {
            total[2] = line3[i] + total[2]; 
        }
        for (int i = 0; i < 4; i++) {
            total[3] = line4[i] + total[3]; 
        }
        total[4] = line1[0] + line2[0] + line3[0] + line4[0];
        total[5] = line1[1] + line2[1] + line3[1] + line4[1];
        total[6] = line1[2] + line2[2] + line3[2] + line4[2];
        total[7] = line1[3] + line2[3] + line3[3] + line4[3];
        
        
        Boolean magic = true; 
        for(int i = 0; i < 8; i++){
            for (int a = 0; a < 8; a ++){
             if (total[i] != total[a]){
              magic = false;
             }
            }
        }
        if (magic == true){
         sopl("magic");   
        }
        else {
         sopl("not magic");   
        }
    }
    
    public static void palindrome(){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int last = word.length() - 1;
        int first = 0;
        boolean palin = false; 
        for (int i = 0; i < word.length(); i++){
            first = i;
            for (int a = 1; (word.charAt(first) == (word.charAt(last)))&& palin == false; a++){
                first ++;
                last = last - 1;
                if (word.charAt(first) != (word.charAt(last))){
                    a = 1;
                }
                if (first > last){
                    first = 0;
                }
                if (first == last || first > last){
                    if (a != 1){
                        a = a*2;
                        palin = true;
                    }
                    
                    if (first == last){
                        a++;
                    }
                sopl(a);
            }
            }
        }
        System.out.println(palin);
    }
}
