/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0054;

import java.util.Scanner;

/**
 *
 * @author PHONG VU
 */
public class main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        ContactProgram contactProgram = new ContactProgram();

        do {
            System.out.println("1. Add a contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Delete a contact");
            System.out.println("4. Exit");
            System.out.println("Please enter your choice:");
            choice = sc.nextInt();
            main.sc.nextLine();
            switch (choice) {
                case 1:
                    String conn = " ";
                    do {
                        contactProgram.add();
                        System.out.println("Do you want to continue?(Y/N):");
                        conn = sc.next();
                        sc.nextLine();
                    } while (conn.equals("Y"));
                    break;
                case 2:
                    contactProgram.display();
                    break;
                case 3:
                    contactProgram.deleteMember();
                    break;
                case 4:
                    break;
            }
        } while (choice != 4);

    }
}
