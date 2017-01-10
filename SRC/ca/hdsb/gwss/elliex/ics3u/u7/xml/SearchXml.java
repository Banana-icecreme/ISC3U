/* Ellie Xu             
 * 1. 10. 2017.
 * Searches for words in tags in xml. 
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.u7.xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
public class SearchXml {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        try {

            File file = new File("XML.xml");

            Builder bob = new Builder();
            Document doc = bob.build(file);
            Element root = doc.getRootElement();

            Elements songs = root.getChildElements();
            Element song;
            for (int i = 0; i < songs.size(); i++) {
                song = songs.get(i);
                System.out.println(song.toXML());
            }
        } catch (ParsingException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
