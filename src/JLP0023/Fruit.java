/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLP0023;

/**
 *
 * @author PHONG VU
 */
public class Fruit {

    public int id;
    public String Name;
    public String Origin;
    public int Quantity;
    public int Price;

    public Fruit() {
    }

    public Fruit(int id, String Name, String Origin, int Quantity, int Price) {
        this.id = id;
        this.Name = Name;
        this.Origin = Origin;
        this.Quantity = Quantity;
        this.Price = Price;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
        
}
