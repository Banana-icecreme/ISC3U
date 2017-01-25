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
        sopl("Your supernatural ability and weakness is...");
        sopl("...");
        NumberFormat nej = NumberFormat.getNumberInstance();
        nej.setMinimumFractionDigits(0);
        nej.setMaximumFractionDigits(0);
        String ability = nej.format((Math.random() * 11));
        ability(ability, 1);
        if (Integer.parseInt(ability) < 9) {
            String weakness = nej.format((Math.random() * 5));
            ability(weakness, 2);
        }
    }

    public static void ability(String number, int a) {
        String ability, weakness = null;
        switch (number) {
            case "0":
                ability = "You can manipulate air or any form of gas,";
                weakness = "But you havea deadly allergy to garlic and a case of Spectrophobia.";
                break;
            case "1":
                ability = "You can manipulate water. Doesn't matter what state it is in,";
                weakness = "But you suffer from a rare case of Aquagenic urticaria.";
                break;
            case "2":
                ability = "You can manipulate fire and any form of energy that is in the form of heat,";
                weakness = "But moonlight is deadly to you.";
                break;
            case "3":
                ability = "You can manipulate any inorganic minerals that are found in the earth,";
                weakness = "But you easily get sick, and have skin that is easily brunt from sunlight.";
                break;
            case "4":
                ability = "You have the power of telepathicness,";
                weakness = "But you have hemophilia.";
                break;
            case "5":
                ability = "You create things out of nothing. Although, you are not telekinetic,";
                weakness = "But you are physically weak, including conditions such as asthma.";
                break;
            case "6":
                ability = "You are extremely smart. Your iq is easily over 180,";
                break;
            case "7":
                ability = "You can shapeshift,";
                break;
            case "8":
                ability = "Anything you touch turns to stone,";
                break;
            default:
                ability = "You are normal.";
        }
        if (a == 1) {
            sopl(ability);
        } else {
            sopl(weakness);
        }
    }
}
