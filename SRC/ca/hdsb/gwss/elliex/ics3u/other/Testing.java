/*This class is used for testing codes. It's also why it's named Testing. 
 */
package ca.hdsb.gwss.elliex.ics3u.other;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import static ca.hdsb.gwss.elliex.ics3u.other.ArrayUtilEllie.bubbleSort;
import static ca.hdsb.gwss.elliex.ics3u.other.ArrayUtilEllie.math;
import static ca.hdsb.gwss.elliex.ics3u.other.ArrayUtilEllie.printArray;
import static ca.hdsb.gwss.elliex.ics3u.other.ArrayUtilEllie.shuffleArray;

/**
 *
 * @author 1xuell
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        shuffleArray(array); 
        printArray(array);
        sopl("");
        math(array, "sum"); 
        printArray(array);
        
    }
}
