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
        String twoLetters[] = new String[a];
        twoLetters[0] = "a";
        twoLetters[1] = "u";
        twoLetters[2] = "G";
        twoLetters[3] = "e";
        twoLetters[4] = "e";
        twoLetters[5] = "g";
        linearSearch(twoLetters, "e");
    }
}
