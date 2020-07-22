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
public class Cube extends ThreeDemensionalShape {

    public double edge;

    public Cube() {
    }

    public Cube(double edge) {
        this.edge = edge;
    }

    @Override
    public double Area() {
        return 6 * edge * edge;
    }

    @Override
    public double Volume() {
        return edge * edge * edge;
    }

    @Override
    public void display() {
        System.out.println("The area of cube: " + Area());
        System.out.println("The volume of cube: " + Volume());
    }
}
