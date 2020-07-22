/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0054;

import java.util.ArrayList;

/**
 *
 * @author PHONG VU
 */
public class ContactProgram {

    public int ID = 1;
    ArrayList<Contact> list = new ArrayList<>();
    public void add() {
        String phone = " ";
        System.out.println("Enter First Name:");
        String firstName = main.sc.nextLine();
        System.out.println("Enter Last Name:");
        String lastName = main.sc.nextLine();
        System.out.println("Enter Group:");
        String group = main.sc.nextLine();
        System.out.println("Enter Address:");
        String addrress = main.sc.nextLine();
        do {
            System.out.println("Enter Phone:");
            phone = main.sc.nextLine();
            if (CheckPhoneNumber(phone) == false) {
                System.out.println("Please input Phone flow");
                System.out.println("1234567890");
                System.out.println("123-456-7890");
                System.out.println("123-456-7890 x1234");
                System.out.println("123-456-7890 ext1234");
                System.out.println("123.456.7890");
                System.out.println("123 456 7890");
            } else {
                System.out.println("Successfull!");
                break;
            }
        } while (true);
        list.add(new Contact(ID++, firstName, lastName, group, addrress, phone));
    }

    public Boolean CheckPhoneNumber(String phoneNumber) {
        String VALID_PHONE = "[(]?[0-9]{3}[)]?[-. ]?[0-9]{3}[-. ]?[0-9]{4}" + "|[0-9]{3}[-][0-9]{3}[-][0-9]{4}[ a-z0-9]+";
        if (!phoneNumber.matches(VALID_PHONE)) {
            return false;
        }
        return true;
    }

    public void display() {
        System.out.printf("%-1s %-14s %-4s %-8s %-4s %-7s %-10s", "ID ", "Name ", "First Name ", "Last Name ", "Group ", "Address ", "Phone ");
        System.out.println("");
        for (Contact contact : list) {           
            System.out.println(contact.toString());
        }
    }
    public void deleteMember(){
        System.out.println("Enter id want to delete: ");
        int idMember =  main.sc.nextInt();
        Contact idcontact = Delete(idMember);
        if (idcontact == null) {
            System.out.println("Don't have this member in list!");
            return;
        }else{
            list.remove(idcontact);
            System.out.println("Delete successfull!");
        }
    }    
    public Contact Delete(int idNumber){
        for (Contact contact : list) {
            if (contact.getID() == idNumber) {
                return contact;
            }
        }
        return null;
    }
}
