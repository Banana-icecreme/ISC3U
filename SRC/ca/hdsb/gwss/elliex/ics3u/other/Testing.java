/*This class is used for testing codes. It's also why it's named Testing. 
 */
package ca.hdsb.gwss.elliex.ics3u.other;

import static ca.hdsb.gwss.elliex.ics3u.other.ArrayUtilEllie.bubbleSort;
import static ca.hdsb.gwss.elliex.ics3u.other.ArrayUtilEllie.shuffleArray;
import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;

/**
 *
 * @author 1xuell
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String array[] = new String[6];
        array[0] = "a";
        array[1] = "b";
        array[2] = "z";
        array[3] = "c";
        array[4] = "d";
        array[5] = "A";
        shuffleArray(array);
        sopl(array);
        bubbleSort(array, true);
        sopl(array);

    }
}
