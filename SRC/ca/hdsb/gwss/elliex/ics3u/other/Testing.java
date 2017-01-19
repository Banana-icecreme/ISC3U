/*This class is used for testing codes. It's also why it's named Testing. 
 */
package ca.hdsb.gwss.elliex.ics3u.other;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import ca.hdsb.gwss.elliex.ics3u.u7.xml.Courses;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.ParsingException;

/**
 *
 * @author 1xuell
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static int right = 0, wrong = 0;
    public static void main(String[] args) {
        Element root;
        Document doc;
        //variables
        List<Integer> ques = new ArrayList<>();
        int[] arrayQues;

        File file = new File("questions.xml");
        Builder builder = new Builder();
        try {
            doc = builder.build(file);
            root = doc.getRootElement();
            Elements questions = root.getChildElements();

            for (int i = 0; i < 7; i++) {
                ques.add(i);
            }
            Collections.shuffle(ques);

            arrayQues = new int[ques.size()];
            for (int i = 0; i < ques.size(); i++) {
                arrayQues[i] = ques.get(i);
            }
            for (int a = 0; a < 5; a++) {
                random(questions, a, arrayQues);
            }
            sopl("Right: " + right +"\n" + "Wrong: " + wrong);
        } catch (ParsingException | IOException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void random(Elements questions, int a, int[] arrayQues) {
        Scanner input = new Scanner (System.in);
        String[] ans = new String[4];
        String rightAns, userAns;
        String Question = (questions.get(arrayQues[a]).getFirstChildElement("question").getValue());
        ans[0] = (questions.get(arrayQues[a]).getFirstChildElement("rightAns").getValue());
        rightAns = (questions.get(arrayQues[a]).getFirstChildElement("rightAns").getValue());
        ans[1] = (questions.get(arrayQues[a]).getFirstChildElement("ans1").getValue());
        ans[2] = (questions.get(arrayQues[a]).getFirstChildElement("ans2").getValue());
        ans[3] = (questions.get(arrayQues[a]).getFirstChildElement("ans3").getValue());

        List<String> num = new ArrayList<>();
        num.addAll(Arrays.asList(ans));
        Collections.shuffle(num);

        for (int i = 0; i < num.size(); i++) {
            ans[i] = num.get(i);
        }

        sopl(Question);
        for (String an : ans) {
            sopl(an);
        }
        //SAME AS: 
        //for (int i = 0; i < ans.length; i++) {
        //    sopl(ans[i]);
        //}
        userAns = input.nextLine();
        if (userAns.toLowerCase().equals(rightAns.toLowerCase().trim())){
            sopl("correct");
            right ++;
        }
        else{
         sopl("wrong" + rightAns);   
         wrong++;
        }
        sopl(" ");
    }
}
