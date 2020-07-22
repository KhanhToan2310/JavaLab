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
public class BMICaculate {
    public double weight;
    public double height;
    public static Scanner sc = new Scanner(System.in);
    public void EnterElementBMI(){
        System.out.println("Enter weight(kg): ");
        weight = sc.nextDouble();
        System.out.println("Enter height(cm): ");
        height = sc.nextDouble();
    }
    public double CalculatorBMI(){
       
        return weight/Math.pow(height/100,2);
    }
}
