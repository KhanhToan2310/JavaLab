/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0080;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHONG VU
 */
public class main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Cube(2));
        shapes.add(new Sphere(2));
        shapes.add(new Triangle(2, 2, 2));
        shapes.add(new Circle(2));
        for (Shape shape : shapes) {
            System.out.println("=============================");
          shape.display();
        }
    }
}
