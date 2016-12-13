/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.elliex.ics3u.u7;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import static ca.hdsb.gwss.elliex.ics3u.u6.ArrayUtilEllie.selection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1xuell
 */
public class file {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
//        File file = creatingFile();
//        outputFile(file);
        tokenizer();
    }

    public static File creatingFile() throws FileNotFoundException {
        File file = new File("number.txt");
        PrintWriter output = new PrintWriter(file); //relating output to file

        for (int i = 0; i < 100; i++) {
            output.println((int) (Math.random() * 100));
            //this is adding data to file
            //output.println only prints when there are a lot of data
        }
        output.close(); //Stops inputing data
        return file;
    }

    public static String[] outputFile(File file) throws FileNotFoundException {
        int i = 0;
        Scanner input = new Scanner(file);
        String[] data = new String[100];
        while (input.hasNext()) {
            sopl(input.nextLine());
            data[i] = input.nextLine();
            i++;
        }
        return data;
    }

    public static void sort(String[] data) {
        selection(data, true);
    }

    public static void tokenizer() throws FileNotFoundException {
        StringTokenizer str = null;
        File file = new File("token.txt");
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            str = new StringTokenizer(input.nextLine(), ",", false);
            // true means , gets leaved in with the tokens
            // false means , gets left out
            // nothing means , gets replaced with space.
            while (str.hasMoreTokens()) {
                sopl(str.nextToken());
            }
        }
    }
}
