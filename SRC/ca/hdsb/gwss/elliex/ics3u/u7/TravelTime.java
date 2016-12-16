/* Ellie Xu             
 * 12. 11. 2016.
 * It calulates the travel time. 
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.u7;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author elli
 */
public class TravelTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //variables and arrays 
        StringTokenizer str = null;
        StringTokenizer str1 = null;
        File file = new File("travel.txt");
        String time[] = new String[3];
        String atime;
        String time1[] = new String[3];
        int i, hour = 0, minute, second, travel = 0, zone = 0;
        Scanner input = new Scanner(file);

        while (input.hasNext()) {//reading the lines of the file
            i = 0;
            str = new StringTokenizer(input.nextLine(), " ", false);
            while (i < 3) {//reading the letter in a line
                String a = str.nextToken();
                time[i] = a;
                //sopl(time[i]);
                i++;
            }
            //sorting the inital time
            i = 0;
            atime = time[0];
            travel = Integer.parseInt(time[1]);
            zone = Integer.parseInt(time[2]);
            str1 = new StringTokenizer(atime, ":", false);
            while (str1.hasMoreTokens()) {
                String a = str1.nextToken();
                time1[i] = a;
                //sopl(time1[i]);
                i++;
            }
            //putting toghter the final value
            hour = Integer.parseInt(time1[0]);
            minute = Integer.parseInt(time1[1]);
            second = Integer.parseInt(time1[2]);

            hour = hour + zone + travel;
            if (hour > 24) {
                hour = hour - 24;
            }
            sopl(hour + ":" + minute + ":" + second);
        }
    }
}
