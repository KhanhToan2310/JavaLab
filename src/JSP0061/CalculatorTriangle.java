/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0061;

/**
 *
 * @author TRUONG KHANH TOAN
 */
public class CalculatorTriangle implements ICalculator {

    private double sideA;
    private double sideB;
    private double sideC;

    public CalculatorTriangle() {
    }

    public CalculatorTriangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double area() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public void display() {

        System.out.println("-------Triangle-------");
        System.out.println("Side A:" + sideA);
        System.out.println("Side B" + sideB);
        System.out.println("Side C:" + sideC);
        System.out.println("Perimeter:" + perimeter());
        System.out.println("Area:" + area());
    }

}
