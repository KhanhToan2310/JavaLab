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
public class Sphere extends ThreeDemensionalShape {

    public final float pi = 3.14f;
    public double r;

    public Sphere() {
    }

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public double Area() {
        return 4 * pi * r * r;
    }

    @Override
    public double Volume() {
        return (4 / 3) * pi * r * r * r;
    }

    @Override
    public void display() {
        System.out.println("The area of sphere is: " + Area());
        System.out.println("The volume of sphere is: " + Volume());
    }
}
