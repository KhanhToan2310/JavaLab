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
public class Circle extends TwoDemensionalShape {

    public final float pi = 3.14f;
    public double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double Area() {

        return pi * r * r;
    }

    @Override
    public void display() {
        System.out.println("The area of circle is: " + Area());
    }
}
