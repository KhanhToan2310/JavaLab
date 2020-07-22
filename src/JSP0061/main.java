/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0061;

import java.util.Scanner;

/**
 *
 * @author TRUONG KHANH TOAN
 */
public class main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input side width of Rectangle: ");
        double cr = sc.nextDouble();
        System.out.println("Please input length of Rectangle:");
        double cd = sc.nextDouble();
        CalculatorRetange crt = new CalculatorRetange(cd, cr);
        System.out.println("Please input radius of Circle:");
        double rd = sc.nextDouble();
        CalculatorCircle ccl = new CalculatorCircle(rd);
        System.out.println("Please input side A of Triangle:");
        double sideA = sc.nextDouble();
        System.out.println("Please input side B of Triangle:");
        double sideB = sc.nextDouble();
        System.out.println("Please input side C of Triangle:");
        double sideC = sc.nextDouble();
        CalculatorTriangle ctl = new CalculatorTriangle(sideA, sideB, sideC);

        crt.display();

        ccl.display();
        ctl.display();

    }
}
