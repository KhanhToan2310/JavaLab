/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0065;

/**
 *
 * @author PHONG VU
 */
public class Student {

    public String name;
    public String classes;
    public double AVG;
    public String Type;

    public Student() {
    }

    public Student(String name, String classes, double AVG, String Type) {
        this.name = name;
        this.classes = classes;
        this.AVG = AVG;
        this.Type = Type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getAVG() {
        return AVG;
    }

    public void setAVG(double AVG) {
        this.AVG = AVG;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nClasses: " + classes + "\nAVG: " + String.format("%.2f", AVG) + "\nType: " + Type + "\n";
    }

}
