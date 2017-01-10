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
        int i = 0;
        String str = "a, b, c";
        StringTokenizer token = new StringTokenizer(str,",",true);
        while (i < 5) {
                System.out.println(token.nextToken());
                i++;
            }
    }
}
