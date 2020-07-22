/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0058;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author PHONG VU
 */
public class Action {

    ArrayList<String> list = new ArrayList<>();
    HashMap<String, String> hash = null;

    public void readFile() {
        File file = new File("D:\\NetBeansProjects\\netbean\\JavaLab\\wordin.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String arr;
            while ((arr = reader.readLine()) != null) {
                String[] data = arr.split("-");
                if (Integer.parseInt(data[0]) == 1) {
                    hash.put(data[1], data[2]);
                }
            }
            reader.close();
        } catch (Exception e) {
        }
    }

    public void addMore(HashMap<String, String> h) {
        System.out.println("Enter English word:");
        String elw = CheckInput.checkString();
        for (String word : h.keySet()) {
            if (elw.equalsIgnoreCase(word)) {
                System.out.println("");
                return;
            }
        }
        System.out.println("Enter Viet Name word:");
        String vnw = CheckInput.checkString();
        h.put(elw, vnw);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\NetBeansProjects\\netbean\\JavaLab\\wordin.txt", true));
            writer.append("1-" + elw + "-" + vnw + "\n");
            writer.newLine();
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.err.println("Error!");
        }
    }

    public void delete(HashMap<String, String> h) {
        System.out.println("Enter English word want to delete: ");
        String elw = CheckInput.checkString();
        h.remove(elw);
        boolean key = false;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\NetBeansProjects\\netbean\\JavaLab\\wordin.txt"));
            String count = " ";
            while ((count = reader.readLine()) != null) {
                if (count.contains(elw)) {
                    count = count.replace("1", "0");
                    key = true;
                }
                list.add(count);
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\NetBeansProjects\\netbean\\JavaLab\\wordin.txt"));
            for (String string : list) {
                writer.write(string);
                writer.newLine();
            }
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.err.println("Error!");
        }

    }

    public void search(HashMap<String, String> h) {
        System.out.println("Enter English word want to search: ");
        String elw = CheckInput.checkString();
        Set<Map.Entry<String, String>> e = h.entrySet();
        for (Map.Entry<String, String> entry : e) {
            if (entry.getKey().equals(elw)) {
                System.out.println("" + entry.getValue());
                return;
            }
        }
    }
//    public void display() throws IOException {  
//        PrintWriter writer = new PrintWriter(new FileWriter("D:\\NetBeansProjects\\netbean\\JavaLab\\wordin.txt"));
//        writer.close();
//    }
}
