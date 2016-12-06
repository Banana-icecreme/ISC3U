/*This class is used for testing codes. It's also why it's named Testing. 
 */
package ca.hdsb.gwss.elliex.ics3u.other;

import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.selection;
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
        int a = 6;
        String twoLetters[] = new String[a];
        twoLetters[0] = "f";
        twoLetters[1] = "e";
        twoLetters[2] = "a";
        twoLetters[3] = "g";
        twoLetters[4] = "g";
        twoLetters[5] = "b";
        selection(twoLetters, true);
        int b =0;
        while (b < twoLetters.length){
            sopl(twoLetters[b]);
            b++;
        }
    }
}
