/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLP0025;

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author PHONG VU
 */
public class Normalize {

    File output;
    File input;
    String text;
    BufferedReader br;
    PrintWriter pw;

    public Normalize() {
    }

    public Normalize(File output, File input) throws FileNotFoundException, IOException {
        this.output = output;
        this.input = input;
        br = new BufferedReader(new FileReader(input));
        pw = new PrintWriter(new FileWriter(output));
    }

    public void readFile() throws IOException {
        text = "";
        String arr ;
        while ((arr = br.readLine()) != null) {
            text += arr;
        }
        br.close();
    }

    public String convert() {
        text = text.replaceAll("\\s+", " ");
        text = text.replaceAll("\\s*,\\s*", ", ").replaceAll("\\s*:\\s*", ": ");
        text = text.replace("[\\s&&[^\\n]]+", " ").replaceAll("\\s*\\.[\\s&&[^\n]]*", ", ");
        text = text.replaceAll("\\n+", "\n").replaceAll("^\n|\n$", "");
        String t = "";
        String[] arr = text.split("\\.");
        for (String string : arr) {
            string = string.toLowerCase();
            t += StringUtils.capitalize(string) + ".";
        }
        text = t;
        Pattern pattern = Pattern.compile("(\")(.+)(\")");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            text = text.replace(matcher.group(2), matcher.group(2).trim());
        }
        System.out.println(text);
        return text;

    }

    public void display() {
        pw.write(text);
        pw.close();
    }
}
