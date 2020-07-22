/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0056;

import java.util.Scanner;

/**
 *
 * @author PHONG VU
 */
public class main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ManagerWorker managerWorker = new ManagerWorker();
        int choice = 0;
        do {
            System.out.println("1. Add Worker");
            System.out.println("2. Up salary");
            System.out.println("3. Down salary");
            System.out.println("4. Display Information salary");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    managerWorker.add();
                    break;
                case 2:
                    managerWorker.changeS(1);
                    break;
                case 3:
                    managerWorker.changeS(2);
                    break;
                case 4:
                    managerWorker.display();
                    break;
                case 5:
                    break;

            }
        } while (true);
    }
}
