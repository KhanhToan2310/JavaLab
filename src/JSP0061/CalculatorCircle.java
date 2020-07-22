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
public class CalculatorCircle implements ICalculator {

    private double radius;
    final float PI = 3.14f;

    public CalculatorCircle() {
    }

    public CalculatorCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("-------Circle-------");
        System.out.println("Radius:" + radius);
        System.out.println("Perimeter:" + perimeter());
        System.out.println("Area:" + area());
    }
}
