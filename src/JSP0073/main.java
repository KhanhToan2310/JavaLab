/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0073;

import java.util.Scanner;

/**
 *
 * @author PHONG VU
 */
public class main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        ExpenseManager expenseManager = new ExpenseManager();
        do {
            System.out.println("1. Add an expense");
            System.out.println("2. Display all expenses");
            System.out.println("3. Remove an expense");
            System.out.println("4. Exit");
            System.out.println("Please enter your choice:");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    expenseManager.add();
                    break;
                case 2:
                    expenseManager.display();
                    break;
                case 3:
                    expenseManager.DeleteInfo();
                    break;
                case 4:
                    break;
            }
        } while (true);

    }
}
