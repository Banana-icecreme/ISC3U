/*This class is used for testing codes. It's also why it's named Testing. 
 */
package ca.hdsb.gwss.elliex.ics3u.other;

import static ca.hdsb.gwss.elliex.ics3u.other.QuadraticFormula.quadraticFormula;
import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
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
          for (int i = 0; i < 10; i++){
          sopl((int) (Math.random()* 6));
          }
    }
}
