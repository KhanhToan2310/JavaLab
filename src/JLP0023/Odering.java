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
public class Odering {
    public int id;
    public Fruit fruit;
    public int quantity;

    public Odering() {
    }

    public Odering(int id, Fruit fruit, int quantity) {
        this.id = id;
        this.fruit = fruit;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
