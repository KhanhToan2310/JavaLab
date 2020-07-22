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
public class main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        NormalCalculator cl = new NormalCalculator();
        BMICaculate bmi = new BMICaculate();
        System.out.println("1. Normal calculate.");
        System.out.println("2. BMI calculate.");
        System.out.println("3. Exit.");
        System.out.println("Enter your choice:");
        do {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("----------Normal Calculate----------");
                    cl.EnterElement();
                    cl.calculate();
                    break;
                case 2:
                    System.out.println("----------BMI Calculate----------");
                    bmi.EnterElementBMI();
                    if (bmi.CalculatorBMI() < 18) {
                        System.out.println("Thin");
                    } else if (bmi.CalculatorBMI() <= 24.9) {
                        System.out.println("Standard");
                    } else if (bmi.CalculatorBMI() <= 29.9) {
                        System.out.println("Fat I");
                    } else if (bmi.CalculatorBMI() <= 34.9) {
                        System.out.println("Fat II");
                    } else {
                        System.out.println("Fat III");
                    }
                    System.out.println(+bmi.CalculatorBMI());
                    break;
                case 3:
                    break;
            }
        } while (choice != 3);
    }
}
