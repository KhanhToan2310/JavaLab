/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0058;

import java.util.HashMap;

/**
 *
 * @author PHONG VU
 */
public class main {

    public static void main(String[] args) {
        HashMap<String, String> h = new HashMap<>();
        Action ac = new Action();
        int choice = 0;
        ac.readFile();
        do {
            System.out.println("1) Add new word.");
            System.out.println("2) Delete word.");
            System.out.println("3) Search word.");
            System.out.println("4) Exit.");
            choice = CheckInput.checkPositive();
            switch (choice) {
                case 1:
                    ac.addMore(h);
                    break;
                case 2:
                    ac.delete(h);
                    break;
                case 3:
                    ac.search(h);
                    break;
                case 4:
                    break;
            }
        } while (choice != 4);
    }

}
