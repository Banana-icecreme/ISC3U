/*This class is used for testing codes. It's also why it's named Testing. 
 */
package ca.hdsb.gwss.elliex.ics3u.other;

import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.bubble;
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
        int b = 6;
        String twoLetters[] = new String[b];
        twoLetters[0] = "e";
        twoLetters[1] = "d";
        twoLetters[2] = "3";
        twoLetters[3] = "w";
        twoLetters[4] = "a";
        twoLetters[5] = "w";
        bubble(twoLetters, false);
//        for (int a = 0; a< twoLetters.length; a++){
//            sopl(twoLetters[a]);
//        }
        linearSearch(twoLetters, "3");
    }
}
