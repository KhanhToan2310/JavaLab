/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0063;

/**
 *
 * @author PHONG VU
 */
public class main {

    public static void main(String[] args) {
        PersonList prl = new PersonList();
        prl.test();
        int choice = 0, count = 0;
        do {
            System.out.println("=====Management Person programer=====");
            System.out.println("1. Input information.");
            System.out.println("2. Display information.");
            System.out.println("3. Sort by salary.");
            System.out.println("4. Exit.");
            System.out.print("Enter your choice: ");
            choice = CheckInput.checkPositive();
            System.out.println(" ");
            switch (choice) {
                case 1:
                    do {
                        prl.input();
                        count++;
                    } while (count != 3);
                    break;
                case 2:
                    prl.display();
                    break;
                case 3:
                    prl.sort();
                    break;
                case 4:
                    break;
            }

        } while (choice != 4);
    }
}
