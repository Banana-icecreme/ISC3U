/*This class is used for testing codes. It's also why it's named Testing. 
 */
package ca.hdsb.gwss.elliex.ics3u.other;

import static ca.hdsb.gwss.elliex.ics3u.other.ArrayUtilEllie.math;
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
        int array[] = new int[6];
        for (int i = 0; i < 6; i++) {
            array[i] = i;
        }
        array[3] = 200;
        shuffleArray(array);
        sopl(array);
        math(array, "max");

    }
}
