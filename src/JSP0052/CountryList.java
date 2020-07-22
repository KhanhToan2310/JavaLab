/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0052;

import java.util.ArrayList;

/**
 *
 * @author PHONG VU
 */
public class CountryList {

    ArrayList<Country> list = new ArrayList<>();
    String name;
    String id;
    double money;
    String ter;

    public void input() {
        Country country = new Country();
        String id = "";
        do {
            System.out.println("Enter code of country: ");
            id = CheckInput.checkString();
            if (!checkCExist(id)) {
                System.err.println("Country exist.");
            }
        } while (!checkCExist(id));
        country.setID(id);
        System.out.println("Enter name of country: ");
        String name = CheckInput.checkString();
        System.out.println("Enter total Area: ");
        double area = CheckInput.checkPositive();
        System.out.println("Enter terrain of country: ");
        String ter = CheckInput.checkString();
        list.add(new Country(id, name, area, ter));
    }

    public void displayAll() {
        System.out.printf("%-5s %-10s %-15s %-8s", "ID", "Name", "Total Area", "Terrain");
        System.out.println("");
        BubbleSort();
        for (Country country : list) {
            System.out.println(country.toString());
        }
    }

    public void displayLast() {
        System.out.printf("%-5s %-10s %-15s %-8s", "ID", "Name", "Total Area", "Terrain");
        System.out.println("");
        System.out.printf("%-5s %-10s %-15f %-8s", id, name, money, ter);
        System.out.println("");
    }

    public boolean checkCExist(String id) {
        for (Country country : list) {
            if (country.getID().equalsIgnoreCase(id)) {
                return false;
            }
        }
        return true;
    }

    public void BubbleSort() {
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j - 1).getName().compareTo(list.get(j).getName()) > 0) {
                    Country t = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, t);
                }
            }
        }
    }

    public void search() {
        System.out.println("Enter the name you want to search for: ");
        String name = CheckInput.checkString();
        System.out.printf("%-5s %-10s %-15s %-8s", "ID", "Name", "Total Area", "Terrain");
        System.out.println("");
        for (Country country : list) {
            if (country.getName().equalsIgnoreCase(name)) {
                System.out.println(country.toString());
            }
        }
    }
}
