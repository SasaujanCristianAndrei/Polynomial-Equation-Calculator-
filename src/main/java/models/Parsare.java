package models;

import models.Monom;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parsare {
    public static String litera = "x";

    public static String getLitera() {
        return litera;
    }

    public static void setLitera(String litera) {
        Parsare.litera = litera;
    }

    public static List<Monom> parsarePolinom(String polinom) {
        Pattern termPat = Pattern.compile("([+-]?([0-9]+|(?=[a-z|A-Z])))([a-z|A-Z](\\^([+-]?([0-9]+)))?)?");
        Matcher m = termPat.matcher(polinom.replaceAll("\\s+", ""));
        List<Monom> Parts = new ArrayList<>();
        String aux, aux2;
        while (m.find()) {
            if (m.group(3) == null) {
                ;
            } else if (m.group(3).matches("[a-zA-Z]+")) {
                setLitera(m.group(3).substring(0, 1));
            }
            if (m.group(2).length() == 0) {
                aux = "1"; //verific in cazul in care am x sa adauge coeficient 1 // imi returneaza empty string ptr null
            } else aux = "";
            int coeficient = Integer.parseInt(m.group(1) + aux);

            if (m.group(3) == null) //daca am in grupu 3 null atunci pun la exponent 0;
            {
                aux2 = "0";
            } else if (m.group(5) == null) //daca am de exemplu x imi detecteaza null si pun exponent1
            {
                aux2 = "1";
            } else aux2 = m.group(5); //altfel ii pun exponentul
            int exponent = Integer.parseInt(aux2);
            Parts.add(new Monom(coeficient, exponent));
        }
        return Parts;
    }
}
