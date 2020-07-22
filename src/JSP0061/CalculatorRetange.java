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
public class CalculatorRetange implements ICalculator {

    private double cd;
    private double cr;

    public CalculatorRetange() {
    }

    public CalculatorRetange(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }

    @Override
    public double perimeter() {
        return (cd + cr) * 2;
    }

    @Override
    public double area() {
        return cd * cr;
    }

    @Override
    public void display() {
        System.out.println("-------Retangle-------");
        System.out.println("Length:" + cd);
        System.out.println("Width:" + cr);
        System.out.println("Perimeter:" + perimeter());
        System.out.println("Area:" + area());
    }
}
