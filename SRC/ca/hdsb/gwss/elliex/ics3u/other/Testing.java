/*This class is used for testing codes. It's also why it's named Testing. 
 */
package ca.hdsb.gwss.elliex.ics3u.other;

import java.util.StringTokenizer;

/**
 *
 * @author 1xuell
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "a, b, c";
        StringTokenizer token = new StringTokenizer(str,",a");
        while (token.hasMoreTokens()) {
                System.out.println(token.nextToken());
            }
    }
}
