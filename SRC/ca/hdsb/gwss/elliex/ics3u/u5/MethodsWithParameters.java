/* Ellie Xu             
 * 11. 18. 2016.
 * Method parameters
 * Version 10. 
 */
package ca.hdsb.gwss.elliex.ics3u.u5;

import static ca.hdsb.gwss.elliex.ics3u.u5.testing.sopl;
import java.util.Scanner;

/**
 *
 * @author 1xuell
 */
public class MethodsWithParameters {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int program;
        sopl("Type:\n1 for Standard Time.");
        program = a.nextInt();

        switch (program) {
            case 1:
                StandardTime();
                break;
            default:
                sopl("This program doesn't exist.");
        }
    }

    public static void StandardTime() {
        String part1 ="", part2 ="", choice;
        Scanner input = new Scanner(System.in);
        sopl("Type in a time");
        choice = input.nextLine();
        if (choice.length() < 6){
            part1 = choice.substring( 0,2 ); 
            part2 = choice.substring(3);
        }
        convertToTraditional(part1, part2);
    }
    public static void convertToTraditional(String part1, String part2){
        sopl(part1);
    }
}
