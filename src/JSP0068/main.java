/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0068;

import java.util.Scanner;

/**
 *
 * @author PHONG VU
 */
public class main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String con = " ";
        InputInfoStudent input = new InputInfoStudent();
        do {
            input.input();
            System.out.print("Do you want to enter more student information?(Y/N): ");
            con = sc.next();
            sc.nextLine();
        } while (con.equals("Y"));
        input.Sort();
        input.display();
    }
}
