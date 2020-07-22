/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0052;

/**
 *
 * @author PHONG VU
 */
public class Country {

    private String ID;
    private String Name;
    private double Area;
    private String Terrain;

    public Country() {
    }

    public Country(String ID, String Name, double Area, String Terrain) {
        this.ID = ID;
        this.Name = Name;
        this.Area = Area;
        this.Terrain = Terrain;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public String getTerrain() {
        return Terrain;
    }

    public void setTerrain(String Terrain) {
        this.Terrain = Terrain;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-10s %-15.1f %-8s", ID, Name, Area, Terrain);
    }

}
