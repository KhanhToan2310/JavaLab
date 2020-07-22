/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0051;

import java.util.Scanner;

/**
 *
 * @author TRUONG KHANH TOAN
 */
public class NormalCalculator {

    public double s1;
    public double s2;
    public double rs;
    public char pt;
    public static Scanner sc = new Scanner(System.in);

    public char inputOperator() {
        char s;
        do {
            System.out.println("Enter operator: ");
            s = sc.next().charAt(0);
            if (s != '+' && s != '-' && s != '*' && s != '/' && s != '^' && s != '=') {
                System.out.println("Please enter again!");
            }
        } while (s != '+' && s != '-' && s != '*' && s != '/' && s != '^' && s != '=');
        return s;
    }

    public void EnterElement() {
        System.out.println("Enter first element: ");
        s1 = sc.nextDouble();
        pt = inputOperator();
        System.out.println("Enter second element: ");
        s2 = sc.nextDouble();
        calculator(s1, s2, pt);
    }

    public void calculator(double s1, double s2, char pt) {
        switch (pt) {
            case '+':
                rs = s1 + s2;
                break;
            case '-':
                rs = s1 - s2;
                break;
            case '*':
                rs = s1 * s2;
                break;
            case '^':
                rs = Math.pow(s1, s2);
                break;
            case '=':
                rs =s1;
                break;
        }
        System.out.println("Memory" + rs);
    }

    public void calculate() {
        do {
            pt = inputOperator();
            if (pt == '=') {
                break;
            }
            System.out.println("Enter first element: ");
            s1 = sc.nextDouble();
            calculator(rs, s1, pt);
        } while (pt != '=');
        System.out.println("Result: " + rs);
    }

}
