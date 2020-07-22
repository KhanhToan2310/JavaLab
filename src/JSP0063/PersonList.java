/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0063;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author PHONG VU
 */
public class PersonList {

    ArrayList<Info> person = new ArrayList<>();

    public void input() {
        Info inf = new Info();
        System.out.print("Please input name: ");
        inf.setName(CheckInput.checkString());
        System.out.print("Please enter address: ");
        inf.setAddress(CheckInput.checkString());
        System.out.println("Please input salary: ");
        inf.setSalary(CheckInput.checkPositive());
        person.add(inf);
    }

    public void display() {
        for (Info info : person) {
            System.out.println("Information of Person you have entered:");
            System.out.println(info.toString());
            System.out.println("");
        }
    }

    public void sort() {
        Collections.sort(person, (Info i1, Info i2) -> (int) (i1.getSalary() - i2.getSalary()));
    }

    public void test() {
        person.add(new Info("Truong Khanh Toan", "180/6 Ong Ich Khiem", 1000));
        person.add(new Info("Truong Khanh Nguyen", "180/6 Ong Ich Khiem", 90000));
        person.add(new Info("Nguyen Ngoc Anh Thy", "44/1 Phan Thanh", 10));
        person.add(new Info("Le Quynh Trang", "180/4 Ong Ich Khiem", 1000));
        person.add(new Info("Truong Van Huy", "180/2 Ong Ich Khiem", 1010));
        person.add(new Info("Vo Thi Anh Dao", "180/8 Ong Ich Khiem", 11230));
    }

}
