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
public class Square extends TwoDemensionalShape {

    public double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public double Area() {
        return edge * edge;
    }

    @Override
    public void display() {
        System.out.println("The area of the square is: " + Area());
    }
}
