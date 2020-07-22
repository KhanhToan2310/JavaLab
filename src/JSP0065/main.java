/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0065;

import java.util.Scanner;

/**
 *
 * @author PHONG VU
 */
public class main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String conn = " ";
        StudentList studentList = new StudentList();
        System.out.println("====== Management Student Program ======");
        do {
            studentList.input();
            System.out.println("Do you want to continue? (Y/N):");
            conn = sc.nextLine();
        } while (conn.equals("Y"));
        studentList.display();
        studentList.displayPercent();
    }
}
