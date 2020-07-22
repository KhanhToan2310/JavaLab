/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLP0023;

import com.sun.java.accessibility.util.EventID;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author PHONG VU
 */
public class FruitList {

    ArrayList<Fruit> list = new ArrayList<>();
    ArrayList<Odering> oderings = new ArrayList<>();
    Hashtable<String, ArrayList<Odering>> listHashtable = new Hashtable<>();

    public FruitList() {
    }

    public void createFruit() {
        int id = 1;
        System.out.println("Enter name product:");
        String name = CheckInput.checkString();
        System.out.println("Enter origin of product:");
        String origin = CheckInput.checkString();
        System.out.println("Enter quantity of product:");
        int quantity = CheckInput.checkPositive();
        System.out.println("Enter price of product:");
        int price = CheckInput.checkPositive();
        list.add(new Fruit(id++, name, origin, quantity, price));
    }

    public void shopping() {
        int choice, quan, id = 1;
        String conn = " ";
        oderings = new ArrayList<>();
        do {
            System.out.println("Enter seclect id: ");
            choice = CheckInput.checkPositive();
            Fruit f = list.get(choice - 1);
            System.out.println("You select: " + f.getName());
            System.out.println("Enter quantity; ");
            quan = CheckInput.checkMIN_MAX(0, f.getQuantity());
            f.setQuantity(f.getQuantity() - quan);
            oderings.add(new Odering(id++, f, quan));
            System.out.println("Do you want to continue? (Y/N)");
            conn = CheckInput.checkString();
        } while (conn.equals("Y"));
        System.out.println("Enter your name:");
        String name = CheckInput.checkString();
        listHashtable.put(name, oderings);
    }

    public void view() {
        int total = 0;
        Set<String> arr = listHashtable.keySet();
        Iterator<String> interator = arr.iterator();
        while (interator.hasNext()) {
            String name = interator.next();
            System.out.println("Custumer: " + name);
            System.out.printf("%-8s| %-8s| %-5s| %-6s", "Product", "Quantity", "Price", "Amount");
            System.out.println("");
            for (Odering o : oderings) {
                int Amount = o.getQuantity() * o.getFruit().getPrice();
                System.out.printf("%-1d. %-8s| %-8d| %5d$| %6d$", o.getId(), o.getFruit().getName(), o.getQuantity(), o.getFruit().getPrice(), Amount);
                System.out.println("");
                total += Amount;
                System.out.println("Total: " + total + "$");
            }
        }
    }

    public void displayFruit() {
        System.out.printf("| %-5s | %-10s | %-10s | %-10s | %-5s", "Item", "Fruit Name", "Origin", "Quantity", "Price");
        System.out.println("");
        for (Fruit fruit : list) {
            System.out.printf("  %-5d   %-10s   %-10s  %-10s  %-5d$ ", fruit.getId(), fruit.getName(), fruit.getOrigin(), fruit.getQuantity(), fruit.getPrice());
            System.out.println("");
        }
    }

}
