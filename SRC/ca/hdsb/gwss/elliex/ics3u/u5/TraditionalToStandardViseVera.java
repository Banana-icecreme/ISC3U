/* Ellie Xu             
 * 11. 18. 2016.
 * Method parameters
 * Version 10. 
 */
package ca.hdsb.gwss.elliex.ics3u.u5;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.trim;

/**
 *
 * @author 1xuell
 */
public class TraditionalToStandardViseVera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String choice, part2 = "", part1 = "", part3 = "";
        Scanner input = new Scanner(System.in);
        sopl("Type in a time");
        choice = input.nextLine();
        if (choice.length() < 6) {
            part1 = choice.substring(0, 2);
            part2 = choice.substring(3);
            convertToTraditional(part1, part2);
        }
        else {;
            int colon = choice.indexOf(":");
            part1 = choice.substring(0,colon);
            part2 = choice.substring(colon+1, colon +3);
            int m = choice.indexOf("m");
            part3 = choice.substring (m - 1, m +1);
            convertToStandardTime( part1, part2, part3);
        }
    }

    public static void convertToTraditional(String part1, String part2) {
        String zero = "";
        int hour = Integer.parseInt(part1);
        int minute = Integer.parseInt(part2);
        if (minute > 60) {
            minute = minute - 60;
            hour++;
        }
        if (minute < 10) {
            zero = "0";
        }
        if (hour == 24) {
            hour = 00;
        }
        if (hour >= 12 && hour < 24) {
            if (hour > 12) {
                hour = hour - 12;
            }
            sopl(hour + ":" + zero + minute + " pm");
        } else if (hour >= 0 && hour < 24) {
            sopl(hour + ":" + zero + minute + " am");
        } else {
            sopl("You have a typo");
        }
    }
    public static void convertToStandardTime(String part1, String part2, String part3){
        String zeroh = "", zerom = "";
        int hour = Integer.parseInt(part1);
        int minute = Integer.parseInt(part2);
        
        if (part3.equalsIgnoreCase("pm") && Integer.parseInt(part1) < 12){
            hour += 12;
        }
        if (minute > 60) {
            minute = minute - 60;
            hour++;
        }
        if (hour < 10) {
            zeroh = "0";
        }
         if (minute < 10) {
            zerom = "0";
        }
        sopl ( zeroh + hour + ":" + zerom + minute);
    }
}
