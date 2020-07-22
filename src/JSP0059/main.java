/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0059;

/**
 *
 * @author PHONG VU
 */
public class main {

    public static void main(String[] args) {
        PersonList list = new PersonList();
        int choice = 0;
        do {
            System.out.println("1. Find person info");
            System.out.println("2. Copy Text to new file");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = CheckInput.checkInt();
            switch (choice) {
                case 1:
                    list.search();
                    break;
                case 2:
                    list.CoppyFile();
                    break;
                case 3:
                    break;
            }
        } while (choice != 3);
    }
}
