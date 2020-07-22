/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLP0023;

import java.util.Scanner;

/**
 *
 * @author PHONG VU
 */
public class main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        FruitList list = new FruitList();
        do {
            System.out.println(" 1. Create Fruit");
            System.out.println("2. View orders");
            System.out.println("3. Shopping");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    list.createFruit();
                    break;
                case 2:
                    list.view();
                    break;
                case 3:
                    list.shopping();
                    break;
                case 4:
                    break;
            }

        } while (choice != 4);

    }
}
