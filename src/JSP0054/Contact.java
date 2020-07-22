/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0054;

/**
 *
 * @author PHONG VU
 */
public class Contact {

    public int ID;
    public String Name;
    public String FirstName;
    public String LastName;
    public String Group;
    public String Address;
    public String Phone;

    public Contact() {

    }

    public Contact(int ID, String FirstName, String LastName, String Group, String Address, String Phone) {
        this.ID = ID;

        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Group = Group;
        this.Address = Address;
        this.Phone = Phone;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return FirstName + LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String Group) {
        this.Group = Group;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Override
    public String toString() {
        return String.format("%-1d %-14s %-4s %-8s %-4s %-7s %-10s", ID, getName(), FirstName, LastName, Group, Address, Phone);
    }
}
