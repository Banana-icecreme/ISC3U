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
        String twoLetters[] = new String[a];
        twoLetters[0] = "b";
        twoLetters[1] = "f";
        twoLetters[2] = "hp";
        twoLetters[3] = "r";
        twoLetters[4] = "r";
        twoLetters[5] = "e";
        binarySearch(twoLetters, "e");
    }
}
