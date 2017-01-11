/* Ellie Xu             
 * 1, 11, 2017
 * Animal data base with search xml.
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.u7.xml;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;
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
        part5();
    }

    public static void part1() {
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

    public static void part2() {
        try {
            File file = new File("animals.xml");

            Builder bob = new Builder();
            Document doc = bob.build(file);
            Element animals = doc.getRootElement();
            Elements animal = animals.getChildElements();

            for (int j = 0; j < animal.size(); j++) {
                if (animal.get(j).getFirstChildElement("animalClass").getValue().equals("Aves")) {
                    sopl(animal.get(j).getFirstChildElement("animalName").toXML());
                }
            }

        } catch (ParsingException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void part3() {
        try {
            File file = new File("animals.xml");

            Builder bob = new Builder();
            Document doc = bob.build(file);
            Element animals = doc.getRootElement();
            Elements animal = animals.getChildElements();

            for (int j = 0; j < animal.size(); j++) {
                if (animal.get(j).getFirstChildElement("habitat").getValue().equals("North America")) {
                    sopl(animal.get(j).toXML());
                }
            }

        } catch (ParsingException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void part4() {
        try {
            File file = new File("animals.xml");

            Builder bob = new Builder();
            Document doc = bob.build(file);
            Element animals = doc.getRootElement();
            Elements animal = animals.getChildElements();

            for (int j = 0; j < animal.size(); j++) {
                if (animal.get(j).getFirstChildElement("animalName").getValue().equals("Moose")) {
                    sopl(animal.get(j).toXML());
                }
            }

        } catch (ParsingException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void part5() {
        try {
            File file = new File("animals.xml");

            Builder bob = new Builder();
            Document doc = bob.build(file);
            Element animals = doc.getRootElement();
            Elements animal = animals.getChildElements();

            for (int j = 0; j < animal.size(); j++) {
                if (animal.get(j).getFirstChildElement("animalName").getValue().equals("Toucan")) {
                    sopl(animal.get(j).getFirstChildElement("animalName").getValue());
                }
            }

        } catch (ParsingException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void part6() {
        try {
            File file = new File("animals.xml");

            Builder bob = new Builder();
            Document doc = bob.build(file);
            Element animals = doc.getRootElement();
            Elements animal = animals.getChildElements();

            for (int j = 0; j < animal.size(); j++) {
                if (animal.get(j).getFirstChildElement("animalClass").getValue().equals("Mammalia")) {
                    sopl(animal.get(j).getFirstChildElement("animalName").toXML());
                }
            }

        } catch (ParsingException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void part7() {
        try {
            File file = new File("animals.xml");

            Builder bob = new Builder();
            Document doc = bob.build(file);
            Element animals = doc.getRootElement();
            Elements animal = animals.getChildElements();

            for (int j = 0; j < animal.size(); j++) {
                if (animal.get(j).getFirstChildElement("diet").getValue().equals("Omnivore")) {
                    sopl(animal.get(j).toXML());
                }
            }

        } catch (ParsingException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
