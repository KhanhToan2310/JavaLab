/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0068;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author PHONG VU
 */
public class InputInfoStudent {

    ArrayList<Student> std = new ArrayList<>();
    public void input(){
        System.out.println("====== Collection Sort Program ======");
        System.out.println("Please input student information");
        System.out.print("Name: ");
        String name = main.sc.nextLine();
        System.out.print("Classes: ");
        String classes = main.sc.nextLine();
        System.out.print("Mark: ");
        float mark =  main.sc.nextFloat();
        std.add(new Student(name, mark, classes));
    }
    public void Sort() {
        ArrayList<Student> nameFind = new ArrayList<>();
        Collections.sort(nameFind, new Comparator<Student>() {
            @Override
            public int compare(Student t1, Student t2) {
                return t1.getName().compareTo(t2.getName());
            }
        });
    }
    public void display(){
        for (Student student : std) {
            System.out.println("============ Student ============");
            System.out.println(student.toString());
        }
    }
}
