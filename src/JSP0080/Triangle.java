/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0080;

/**
 *
 * @author PHONG VU
 */
public class Triangle extends TwoDemensionalShape {

    public double a;
    public double b;
    public double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double Area() {
        double p = (a + b + c) / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void display() {
        System.out.println("The area of triangle is: " + Area());
    }
}
