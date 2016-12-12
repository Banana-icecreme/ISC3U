/*This class is used for testing codes. It's also why it's named Testing. 
 */
package ca.hdsb.gwss.elliex.ics3u.other;
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
        int b = 6;
        int twoLetters[] = new int[b];
        twoLetters[0] = 7;
        twoLetters[1] = 2;
        twoLetters[2] = 3;
        twoLetters[3] = 4;
        twoLetters[4] = 6;
        twoLetters[5] = 7;

        sopl(twoLetters[0] + twoLetters[9]);
    }
}
