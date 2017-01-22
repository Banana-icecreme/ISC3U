/* Ellie Xu             
 * 01. 13. 2017.
 * Unit 7 test. 
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.u7;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import ca.hdsb.gwss.elliex.ics3u.u7.xml.Courses;
import java.io.File;
import java.io.FileWriter;
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
public class Standings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File file = new File("AL.STANDINGS.xml");

            Builder bob = new Builder();
            Document doc = bob.build(file);
            Element americanLeagueTeams = doc.getRootElement();

            Elements team = americanLeagueTeams.getChildElements();
            sopl("American League East");
            loop(team, "East");

            sopl("\nAmerican League Central");
            loop(team, "Central");

            sopl("\nAmerican League Central");
            loop(team, "West");

            east();

        } catch (ParsingException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loop(Elements team, String way) {
        String name, record;
        sopl(" ------------------");
        System.out.format("%-15s %-10s \n", "Team", "Record");
        for (int j = 0; j < team.size(); j++) {
            if (team.get(j).getFirstChildElement("division").getValue().equals(way)) {
                name = team.get(j).getFirstChildElement("name").getValue();
                record = team.get(j).getFirstChildElement("record").getValue();
                System.out.format("%-15s %-10s \n", name, record);
            }
        }
    }

    public static void east() {
        String name = "";
        Document doc;
        Document doc2;
        Element americanLeagueTeams;
        File file = new File("AL.STANDINGS.xml");

        if (file.exists()) {
            Builder builder = new Builder();
            try {
                doc = builder.build(file);

                americanLeagueTeams = doc.getRootElement();
                Elements team = americanLeagueTeams.getChildElements();

                String division;
                String record;

                Element ROOT = new Element("americanLeagueEastTeams"); 
                doc2 = new Document(ROOT);
                //newFile.write(americanLeagueTeams.toXML());
                for (int j = 0; j < team.size(); j++) {
                    if (team.get(j).getFirstChildElement("division").getValue().equals("East")) {
                        name = team.get(j).getFirstChildElement("name").getValue();
                        division = team.get(j).getFirstChildElement("division").getValue();
                        record = team.get(j).getFirstChildElement("record").getValue();
                        Element TEAM = new Element("team");
                        Element NAME = new Element("name");
                        Element DIVISION = new Element("Course");
                        Element RECORD = new Element("Code");
                               //name = team.get(j).toXML();
                        //newFile.write(name);
                        TEAM.appendChild(NAME);
                        TEAM.appendChild(DIVISION);
                        TEAM.appendChild(RECORD);
                        NAME.appendChild(name);
                        DIVISION.appendChild(division);
                        RECORD.appendChild(record);
                        ROOT.appendChild(TEAM);
                    }
                }

                try {
                    FileWriter newFile = new FileWriter("AL.EAST.STANDINGS.XML");
                    newFile.write(doc2.toXML());
                    newFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } catch (ParsingException ex) {
                Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            americanLeagueTeams = new Element("americanLeagueEastTeams");
            doc = new Document(americanLeagueTeams);
        }
    }

}
