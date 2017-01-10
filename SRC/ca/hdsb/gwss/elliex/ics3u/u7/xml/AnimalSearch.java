/* Ellie Xu             
 * 1. 10. 2017.
 * Animal data base. 
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.u7.xml;

import java.io.File;
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
public class AnimalSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        part2();
    }
    public static void part1(){
        try {
            File file = new File("animals.xml");

            Builder bob = new Builder();
            Document doc = bob.build(file);
            Element animals = doc.getRootElement();

            Elements animal = animals.getChildElements();
            Element out;
            for (int i = 0; i < animal.size(); i++) {
                out = animal.get(i);
                System.out.print(out.toXML());
            }
        } catch (ParsingException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void part2(){
        try {
            File file = new File("animals.xml");

            Builder bob = new Builder();
            Document doc = bob.build(file);
            Element animals = doc.getRootElement();
            Elements animal = animals.getChildElements();
            Elements animalName = animal.getChildElements();
            
            Element out;
            for (int i = 0; i < animal.size(); i++) {
                out = animal.get(i);
                System.out.print(out.toXML());
            }
        } catch (ParsingException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
