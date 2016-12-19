/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.elliex.ics3u.other;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import static ca.hdsb.gwss.elliex.ics3u.u5.NumbersToWords2.num;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1xuell
 */
public class life {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        sopl("What is your name?");
        name = input.nextLine();
        sopl("Your supernatural ability is...");
        sopl("...");
        sopl(ability());
    }
    
    public static String ability(){
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(0);
        nej.setMaximumFractionDigits(0);
        String ability = nej.format((Math.random() * 10));
        String weakness = nej.format((Math.random() * 10));
        switch (ability) {
            case "0":
            case "1":
            case "2":
                ability = "You are normal.";
                break;
            case "3":
                ability = "You can manipulate air or any form of gas.";
                break;
            case "4":
                ability = "You can manipulate water. Doesn't matter what state it is in.";
                break;
            case "5":
                ability = "You can manipulate fire and any form of energy that is in the form of heat.";
                break;
            case "6":
                ability = "You can manipulate any inorganic minerals that are found in the earth.";
                break;
            case "7":
                ability = "You have the power of telepathicness.";
                break;
            case "8":
                ability = "You create things out of nothing. Although, you are not telekinetic.";
                break;
            case "9":
                ability = "You are extremely smart. Your iq is easily over 180.";
                break;
        }
        return ability;
    }
}
