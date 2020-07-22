/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0059;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 *
 * @author PHONG VU
 */
public class PersonList {

    ArrayList<Person> list = new ArrayList<>();

    public void search() {
        System.out.println("Enter file path: ");
        String path = CheckInput.checkInputPathFile();
        list = loadFile(path);
        System.out.println("Enter Money: ");
        double money = CheckInput.checkPositive();
        display(money);
    }

    public ArrayList<Person> loadFile(String fileName) {
        File file = new File(fileName);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String countLine;
            while ((countLine = bufferedReader.readLine()) != null) {
                String[] infor = countLine.split(";");
                list.add(new Person(infor[0], infor[1], Double.parseDouble(infor[2])));
            }
        } catch (Exception e) {
            System.err.println("Error!");
        }
        return list;
    }

    public void display(double money) {
        System.out.printf("%-10s %-10s %-10s", "Name", "Address", "Money");
        System.out.println("");
        for (Person person : list) {
            if (person.getMoney() >= money) {
                System.out.println(person.toString());
            }
        }
        BubbleSort();
        System.out.println("Max: " + list.get(list.size() - 1).getName());
        System.out.println("Min: " + list.get(0).getName());
    }

    public void BubbleSort() {
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j - 1).getMoney() > list.get(j).getMoney()) {
                    Person t = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, t);
                }
            }
        }
    }

    public void Coppy(File fileTo, File FileFrom) throws IOException {
        Files.copy(FileFrom.toPath(), fileTo.toPath());
    }

    public void CoppyFile() {
        System.out.println("Enter Source:");
        String fileFrom = CheckInput.checkInputPathFile();
        System.out.println("Enter new file name:");
        String fileTo = CheckInput.checkInputPathFile();
        File from = new File(fileFrom);
        File to = new File(fileTo);
        try {
            Coppy(to, from);
            System.out.println("Coppy done.");
        } catch (Exception e) {
            System.err.println("Error!");
        }
    }
}
