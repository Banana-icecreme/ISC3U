/*This class is used for testing codes. It's also why it's named Testing. 
 */
package ca.hdsb.gwss.elliex.ics3u.other;

import ca.hdsb.gwss.elliex.ics3u.u7.xml.Courses;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.ParsingException;

/**
 *
 * @author 1xuell
 */
public class Testing {

    public static Element root;
    public static Document email;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        xml();
        write("ddf");
    }

    public static void xml() {
        File file = new File("Marcus email.xml");
        if (file.exists()) {
            Builder builder = new Builder();
            try {
                email = builder.build(file);
                root = email.getRootElement();
            } catch (ParsingException | IOException ex) {
                Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            root = new Element("Friends");
            email = new Document(root);
        }
    }

    public static void write(String text) {
        Element newMail = new Element("new");
        newMail.appendChild(text);
        root.appendChild(newMail);
        try {
            FileWriter file2 = new FileWriter("Marcus email.xml");
            BufferedWriter writer = new BufferedWriter(file2);
            writer.write(email.toXML());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
