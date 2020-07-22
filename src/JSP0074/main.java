/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0074;

import java.util.Scanner;

/**
 *
 * @author TRUONG KHANH TOAN
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("1. Add two matrix.");
        System.out.println("2. Sub two matrix.");
        System.out.println("3. Multi two matrix.");
        System.out.println("4. Exit.");
        System.out.print("Enter your choice:");
        do {
            choice = sc.nextInt();
            Matrix mt = new Matrix();
            Matrix mt2 = new Matrix();
            switch (choice) {
                case 1:

                    Matrix result = Matrix.add(mt, mt2);
                    result.display();
                    break;
                case 2:

                    Matrix result2 = Matrix.sub(mt, mt2);
                    result2.display();
                    break;
                case 3:

                    Matrix result3 = Matrix.mul(mt, mt2);
                    result3.display();
                    break;
                case 4:
                    break;
            }
        } while (choice != 4);
    }

}
