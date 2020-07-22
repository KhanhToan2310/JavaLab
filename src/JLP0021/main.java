/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLP0021;

import java.util.Scanner;

/**
 *
 * @author Truong Khanh toan
 */
public class main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StudentList stl = new StudentList();
        stl.test();
        int choice = 0;
        do {
            System.out.println("1. Create information.");
            System.out.println("2. Find or Sort.");
            System.out.println("3. Update or Delete.");
            System.out.println("4. Report.");
            System.out.println("5. Exit.");
            System.out.println("Enter you choice:");
            choice = CheckInput.checkPositive();
            switch (choice) {
                case 1:
                    stl.input();
                    break;
                case 2:
                    stl.findSort();
                    break;
                case 3:
                    stl.UpdateOrDelete();
                    break;
                case 4:
                   stl.report();
                    break;
                case 5:
                    break;
            }
        } while (choice != 5);
    }

}
