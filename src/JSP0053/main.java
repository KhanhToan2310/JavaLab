/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0053;

import java.util.Scanner;

/**
 *
 * @author PHONG VU
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int size;
        SortOne_dimensionalArray sort = new SortOne_dimensionalArray();
        do {
            System.out.println("============== BUBBLE SORT Program ==============");
            System.out.println("1.Input element.");
            System.out.println("2. Sort ascending.");
            System.out.println("3. Sort descending.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("Enter size of array:");
                        size = sc.nextInt();
                    } while (size <= 0);
                    sort.SortOne_dimensionalArray(size);
                    System.out.println("Your array is:");
                    sort.display();
                    break;
                case 2:
                    sort.ascending();
                    sort.display();
                    break;
                case 3:
                    sort.descending();
                    sort.display();
                    break;
                case 4:
                    break;
            }
        } while (choice != 4);
    }
}
