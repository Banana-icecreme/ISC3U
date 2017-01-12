/* Ellie Xu             
 * 1. 12. 2016.
 * References and notes for unit 7. 
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.u7;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sop;
import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import ca.hdsb.gwss.elliex.ics3u.u7.xml.Courses;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.ParsingException;
import nu.xom.Serializer;

/**
 *
 * @author ellie
 */
public class resources {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //This explains the things learned in unit 7 
    }

    public static void Tokenizer() {
        //tokenizer splits a string
        String a = "a, b, c";
        StringTokenizer token = new StringTokenizer(a, ",a", false);
        //true means the , will be included as a token. 
        //if false or nothing, it means the , will not be included
        //the default , is space. So if nothing is put there, then it will 
        //be split at any space

        //** even if there is only one space between ','
        //the space will still be counted as a token 
        while (token.hasMoreTokens()) {
            sopl(token.nextToken());
        }
        //this will display:
        // b
        // c

        //sop will display them all in a line just like before it was split
        //if nextToken() found not token, it will reutrn "NoSuchElementExpection"
        //to avoid that, put it in a loop that will end with .hasMoreToken()
        //this will stop it when there are no more tokens to be displayed
    }

    public static void CreatingXML() {
        //xml stands for Extensible Markup Language

        //Document creates the document of the XML
        Element rootNodeName = new Element("rootTag");
        Document documentName = new Document(rootNodeName);

        //creating tags
        //the words "Tag 1" will be displayed like <Tag 1>
        Element tag1 = new Element("Tag 1");
        Element tag2 = new Element("Tag 2");

        //this adds a value to tag1
        //tag1 will look like <tag 1>abc</tag 1>
        tag1.appendChild("abc");

        //this attaches tag1 to rootNodeName
        //it will look like <rootNodeName> 
        //                      <tag 1>abc</tag 1>
        //                  <rootNodeName>
        rootNodeName.appendChild(tag1);

        //This will format the output
        try {
            Serializer serializer = new Serializer(System.out);
            serializer.setIndent(4);
            serializer.setMaxLength(64);
            serializer.write(documentName);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public static void fileWriter() {
        try {
            //create a fileWriter 
            //It can create a file and write in it
            FileWriter name = new FileWriter("fileName");

            //to write to file, use: 
            name.write("String");
            //.close closes the data inputing to the file
            name.close();
        } catch (IOException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void buffer() {
        try {
            //bufferWriter holds all the data and sends them toghter to the file
            //to create a bufferWriter file, do: 
            BufferedWriter name = new BufferedWriter(new PrintWriter("filename"));

            //to write to the file use: it's the same as fileWriter
            name.write("String");
            //.close closes the data inputing to the file
            name.close();
        } catch (IOException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void tryAndCatch() {
        //try and catch catches errors and tells the user how to deal with it
        try {
            //the try statment is a way of checking each line of code for an error before executing the next line of code.   
            //As soon as an error is produced, the rest of the code in the try-statement is skipped. 
            //The computer jumps down to the next “catch” statement to see how to deal with the error.
            File file = new File("animal.xml");
            Builder bob = new Builder();
            Document doc = bob.build(file);
            //the above is just something random to put in here

        } catch (ParsingException ex) {
            //the ParsingException ex will hold the error once it is caught here
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            //the IOException ex will hold the error once it is caught here
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }
        //if no error is found, it will skip the catch statments
    }

    public static void SavingXML() {
        //Saving XML data
        try {
            //creates a file
            FileWriter file = new FileWriter("firstWords.xml");
            //buffers the file
            BufferedWriter writer = new BufferedWriter(file);
            //writes to the file
            writer.write("Mr. Watson -- come here -- I want to see you.");
            //finishing and close the message written to the file
            writer.close();

        } catch (IOException ex) {
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void ReadingXML() {
        //an xml is unpacked like: builder > root > elements > what's in the elements 
        //this is not displaying xml. See next method for that 
        try {
            File file = new File("firstWords.xml");
            //this is not FileWriter, it simply creates a connection to the file.
            //it can also create a file 
            Builder builder = new Builder();

            Document doc = builder.build(file);
            Element root = doc.getRootElement();
            Elements friends = root.getChildElements();
        } catch (Exception e) {

        }
    }

    public static void displayingXML() {
        try {
            //this is here because java will say error when you display something unless you put
            //something here
            //just ignore this 
            File file = new File("firstWords.xml");
            Builder builder = new Builder();
            Document doc = builder.build(file);
            Element root = doc.getRootElement();
            Elements friends = root.getChildElements();

            //the first one prints out everything including the tags
            System.out.println(doc.toXML());
            //the second one prints out the value in between the tags. 
            //the tags don't get printed. Sorry tags 
            System.out.println(friends.get(0).getFirstChildElement("name").getValue());

            //the elements are all labeled starting with 0
            //.get will get everything within the tags of the element selected. 
            //including other tags
            int integer = 0;
            friends.get(integer);
            //this will print out the element selected with ALL the tags
            sopl(friends.get(integer).toXML());
            //this will print out the element selected with NO tags
            //aka this prints out the value
            sopl(friends.get(integer).getValue());

            //to get a subelement within an element:
            //(only works for root)
            root.getFirstChildElement("subElement name");
            //"subElement name" is the tag of the sub element

            //example
            //print out the specific subelement value within the root element:
            sopl(root.getFirstChildElement("subElement name").getValue());

            //the difference between getFirstChildElement and get(integer) is that 
            //in getFirst, you type in the tag name
            //and in get(int), it's good if you want to get the first element, but 
            //you don't know the name of the tags. 
        } catch (Exception e) {

        }
    }

    public static void SearchingXML() {
        //see SearchXml.java under u7.xml
    }

    public static void WritingfilesThatAreLikeTxt() throws IOException {
        //note the "throws IOException" above, you need it for PrintWriter ^

        File file = new File("firstWords.txt");
        //this is not FileWriter, it simply creates a connection to the file.
        //it can also create a file
        PrintWriter a = new PrintWriter(file);

        //the 2 File and PrintWriter are not nessacary, you can combine them into one
        //Like:
        //PrintWriter a = new PrintWriter("firstWords.txt");
        a.write("anything written here is written on the data");

        a.close();
        //this means it finished writing to the file.
        //you have to include this here pretty much for any case 
        //that you use the file.
        //it's like closing a book after you finished readin/writing/whatever
        //with it. 
    }

    public static void ReadingfilesThatAreLikeTxt() throws IOException {
        //note the "throws IOException" above, you need it for PrintWriter ^

        Scanner input = new Scanner("file.txt");

        while (input.hasNext()) {
            sopl(input.nextLine());
        }

        input.close();
        //close the file after reading it
    }
}
