/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0059;

/**
 *
 * @author PHONG VU
 */
public class Person {
    private String Name;
    private String Address;
    private double Money;

    public Person() {
    }

    public Person(String Name, String Address, double Money) {
        this.Name = Name;
        this.Address = Address;
        this.Money = Money;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getMoney() {
        return Money;
    }

    public void setMoney(double Money) {
        this.Money = Money;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10.1f", Name, Address, Money);
    }

}
