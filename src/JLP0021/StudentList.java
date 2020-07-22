/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLP0021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Truong Khanh toan
 */
public class StudentList {

    ArrayList<Student> std = new ArrayList<>();

    public void input() {
        Student st = new Student();
        System.out.println("Enter code of student:");
        st.setId(CheckInput.checkString());
        System.out.println("Enter student name:");
        st.setStudentName(CheckInput.checkString());
        System.out.println("Enter semester:");
        st.setSemester(CheckInput.checkPositive());
        System.out.println("Enter course name:");
        st.setCourseName(CheckInput.checkString());
        std.add(st);
//        if (std.add(st) == 3) {
//            System.out.println(""); 
//        }
    }

    public Student findID(String id) {
        for (Student student : std) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void test() {
        std.add(new Student("DE140045", "Nguyen Van Toan", 2, "C/C++"));
        std.add(new Student("DE1400042", "Nguyen Khanh Toan", 3, "Java"));
        std.add(new Student("DE140032", "Nguyen Thi Nhan", 1, "Java"));
        std.add(new Student("DE140043", "Le Hoang Toan", 3, "Web"));
        std.add(new Student("DE1400042", "Nguyen Khanh Toan", 2, "Java"));
        std.add(new Student("DE140054", "Tran Anh Toan", 2, "C/C++"));
        std.add(new Student("DE140013", "Truong Xuan Toan ", 4, "Javacrispt"));
    }

    public void findSort() {
        String nameStudent;
        ArrayList<Student> nameFind = new ArrayList<>();
        System.out.print("Enter name of student: ");
        nameStudent = main.sc.nextLine();
        for (Student student : std) {
            if (student.getStudentName().matches("(.*)" + nameStudent + "(.*)")) {
                nameFind.add(student);
            }
        }
        Collections.sort(nameFind, new Comparator<Student>() {
            @Override
            public int compare(Student t1, Student t2) {
                return t1.getStudentName().compareTo(t2.getStudentName());
            }
        });
        System.out.printf("%-20s |%-2s |%-10s", "Student name", "Semester", "Course name");
        System.out.println("");
        for (Student stdf : nameFind) {
            System.out.printf("%-20s |%-8d |%-10s", stdf.getStudentName(), stdf.getSemester(), stdf.getCourseName());
            System.out.println("");
        }
        System.out.println("");
    }
//
//    public void display() {
//        System.out.printf("%8s |%-20s |%-2s |%10s ", "ID", "student name", "semester", "course name");
//        System.out.println("");
//        for (Student student : std) {
//            System.out.println(student.toString());
//        }
//    }

    public void report() {
        int[] count = new int[std.size()];
        int i = 0;
        for (Student student1 : std) {
            for (Student student2 : std) {
                if (student1.getId().equals(student2.getId())
                        && student1.getStudentName().equals(student2.getStudentName())
                        && student1.getCourseName().equals(student2.getCourseName())) {
                    count[i]++;
                }
            }
            i++;
        }
        ArrayList<String> display = new ArrayList<>();
        int j = 0;

        for (Student student3 : std) {
            String rs = String.format("%-20s |%-8s |%-10s", student3.getStudentName(), student3.getCourseName(), count[j]);
            display.add(rs);
            j++;
        }
        Set<String> setting = new HashSet<>(display);
        display.clear();
        display.addAll(setting);
        for (String rs : setting) {
            System.out.println(rs);
        }
    }

    public void UpdateOrDelete() {
        String id;
        System.out.println("Enter id of student:");
        id = main.sc.nextLine();
        Student st = findID(id);
        if (st == null) {
            System.out.println("Please enter student id.");
            return;
        }

        int choice;
        do {
            System.out.println("1. Update.");
            System.out.println("2. Delete.");
            System.out.println("3. Exit.");
            System.out.println("Enter your choice:");
            choice = CheckInput.checkPositive();
            switch (choice) {
                case 1:
                    System.out.println("Enter code student:");
                    st.setId(CheckInput.checkString());
                    System.out.println("Enter number name of student:");
                    st.setStudentName(CheckInput.checkString());
                    System.out.println("Enter semester:");
                    st.setSemester(CheckInput.checkPositive());
                    System.out.println("Enter course name:");
                    st.setCourseName(CheckInput.checkString());
                    break;
                case 2:

//                        student = findID(id);
                    std.remove(st);

                    break;
                case 3:
                    break;
            }
        } while (choice != 3);
    }
}
