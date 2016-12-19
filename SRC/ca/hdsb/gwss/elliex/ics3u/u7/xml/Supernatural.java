/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.elliex.ics3u.u7.xml;

import java.io.IOException;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

/**
 *
 * @author 1xuell
 */
public class Supernatural {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Element rootSupernatural = new Element("SPN");
        
        Element HunterNote1 = new Element("Notes");
        Element HunterName1 = new Element("Name");
        Element HunterNote2 = new Element("Notes");
        Element HunterNote201 = new Element("Notes");
        Element HunterName2 = new Element("Name");
        Element Hunters = new Element("Species");
        
        Element AngelNote1 = new Element ("Notes");
        Element AngelRank1 = new Element ("Rank");
        Element AngelName1 = new Element ("Name");
        Element AngelNote2 = new Element ("Notes");
        Element AngelRank2 = new Element ("Rank");
        Element AngelName2 = new Element ("Name");
        Element Angels = new Element("Species");
        
        Element DemonRank1 = new Element ("Rank");
        Element DemonName1 = new Element ("Name");
        Element Demons = new Element("Species");
        Element DemonRank2 = new Element ("Rank");
        Element DemonName2 = new Element ("Name");

        Document SupernaturalDocument = new Document(rootSupernatural);
        rootSupernatural.appendChild(Hunters);
        Hunters.appendChild("Hunter");
        Hunters.appendChild(HunterName1);
        HunterName1.appendChild("Dean Piechester");
        HunterName1.appendChild(HunterNote1);
        HunterNote1.appendChild("Killing machine #1");
        Hunters.appendChild(HunterName2);
        HunterName2.appendChild("Sam Moosechester");
        HunterName2.appendChild(HunterNote2);
        HunterNote2.appendChild("Killing machine #2");
        HunterName2.appendChild(HunterNote201);
        HunterNote201.appendChild("Hunter by day Moose by night");
             
        rootSupernatural.appendChild(Angels);
        Angels.appendChild("Angel");
        Angels.appendChild(AngelName1);
        AngelName1.appendChild("Castiel");
        AngelName1.appendChild(AngelRank1);
        AngelRank1.appendChild("Seraph");
        AngelName1.appendChild(AngelNote1);
        AngelNote1.appendChild("Angel in a trench coat");
        Angels.appendChild(AngelName2);
        AngelName2.appendChild("Gabriel");
        AngelName2.appendChild(AngelRank2);
        AngelRank2.appendChild("Archangel");
        AngelName2.appendChild(AngelNote2);
        AngelNote2.appendChild("\"Tuesdays\"");
        
        rootSupernatural.appendChild(Demons);
        Demons.appendChild("Demon");
        Demons.appendChild(DemonName1);
        DemonName1.appendChild("Crowley");
        DemonName1.appendChild(DemonRank1);
        DemonRank1.appendChild("King of Hell");
        Demons.appendChild(DemonName2);
        DemonName2.appendChild("Meg");
        DemonName2.appendChild(DemonRank2);
        DemonRank2.appendChild("Depends...");

        try {
            Serializer serializer = new Serializer(System.out);
            serializer.setIndent(4);
            serializer.setMaxLength(64);
            serializer.write(SupernaturalDocument);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

}
