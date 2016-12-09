/*This class is used for testing codes. It's also why it's named Testing. 
 */
package ca.hdsb.gwss.elliex.ics3u.other;
import static ca.hdsb.gwss.elliex.ics3u.u6.Search.binarySearch;
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
        double twoLetters[] = new double[a];
        twoLetters[0] = 1;
        twoLetters[1] = 2;
        twoLetters[2] = 3;
        twoLetters[3] = 4;
        twoLetters[4] = 5;
        twoLetters[5] = 6;
        binarySearch(twoLetters, 6);
    }
}
