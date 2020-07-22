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
public class Tetrahedron extends ThreeDemensionalShape {

    public double edge;

    public Tetrahedron() {
    }

    public Tetrahedron(double edge) {
        this.edge = edge;
    }
    @Override
    public double Area() {
        return (Math.sqrt(3) * edge * edge);
    }

    @Override
    public double Volume() {
        return (Math.sqrt(2) * edge * edge * edge)/12;
        
    }

    @Override
    public void display() {
        System.out.println("The area of tetrahedron: " + Area());
        System.out.println("The volume of tetrahedron: " + Volume());
    }
}
