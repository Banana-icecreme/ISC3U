/*This class is used for testing codes. It's also why it's named Testing. 
 */
package ca.hdsb.gwss.elliex.ics3u.other;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.max;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.min;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.sum;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.linearSearch;
/**
 *
 * @author 1xuell
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 6;
        int twoLetters[] = new int[a];
        twoLetters[0] = 2;
        twoLetters[1] = 2;
        twoLetters[2] = 4;
        twoLetters[3] = 2;
        twoLetters[4] = 2;
        twoLetters[5] = 2;
        linearSearch(twoLetters, 2);
    }
}
