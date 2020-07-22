/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0065;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PHONG VU
 */
public class StudentList {

    ArrayList<Student> students = new ArrayList<>();

    public void input() {
        String type = " ";
        System.out.print("Name: ");
        String name = CheckInput.checkString();
        System.out.print("Classes: ");
        String classes = CheckInput.checkString();
        System.out.print("Maths: ");
        double math = CheckInput.checkMIN_MAX(0, 10);
        System.out.print("Chemistry: ");
        double chemistry = CheckInput.checkMIN_MAX(0, 10);
        System.out.print("Physics: ");
        double physics = CheckInput.checkMIN_MAX(0, 10);
        double AVG = ((math + chemistry + physics) / 3);
        if (AVG > 7.5) {
            type = "A";
        } else if (AVG >= 6 && AVG <= 7.5) {
            type = "B";
        } else if (AVG >= 4 && AVG < 6) {
            type = "C";
        } else {
            type = "D";
        }
        students.add(new Student(name, classes, AVG, type));
    }
// Cach 1:
//    public HashMap<String, Double> Percent() {
//        HashMap<String, Double> percent = new HashMap<>();
//        int rs = students.size();
//        double A = 0, B = 0, C = 0, D = 0;
//        for (int i = 0; i < rs; i++) {
//            if (students.get(i).getType() == "A") {
//                A++;
//            }
//            if (students.get(i).getType() == "B") {
//                B++;
//            }
//            if (students.get(i).getType() == "C") {
//                C++;
//            }
//            if (students.get(i).getType() == "D") {
//                D++;
//            }
//        }
//        percent.put("A", A / rs * 100);
//        percent.put("B", B / rs * 100);
//        percent.put("C", C / rs * 100);
//        percent.put("D", D / rs * 100);
//        return percent;
//    }
//in cach 1
//    public void displayPercent() {
//        int total = students.size();
//        HashMap<String, Double> getPercent = Percent();
//        System.out.println("========== Classification Info ==========");
//        for (Map.Entry stu : getPercent.entrySet()) {
//            System.out.println(stu.getKey() + " :" + String.format("%.2f",stu.getValue()) + "%");
//        }
//    }
// Cach 2:
//    public HashMap<String, Double> Percent() {
//        HashMap<String, Double> percent = new HashMap<>();
//        String[] arr = {"A", "B", "C", "D"};
//        for (String string : arr) {
//            percent.put(string, 0.0);
//        }
//        double n = 0;
//        for (Student student : students) {
//                n = percent.get(student.getType());
//                n++;
//
//            percent.put(student.getType(), n);
//        }
//        return percent;
//    }
////in cach 2
//    public void displayPercent() {
//        int total = students.size();
//        HashMap<String, Double> getPercent = Percent();
//        System.out.println("========== Classification Info ==========");
//        for (Map.Entry stu : getPercent.entrySet()) {
//            System.out.println(stu.getKey() + " :" + String.format("%.2f", Double.valueOf(stu.getValue().toString()) /total * 100) + "%");
//        }
//    }
// cach 3

    public HashMap<String, Double> Percent() {
        HashMap<String, Double> percent = new HashMap<>();
        double[] arr = {0, 0, 0, 0};
        for (Student student : students) {
            arr[student.getType().charAt(0) - 'A']++;
        }
        for (int i = 0; i < arr.length; i++) {
            percent.put(String.format("%s", (char)(65 + i )), arr[i]);
        }
        return percent;
    }
    public void displayPercent() {
        int total = students.size();
        HashMap<String, Double> getPercent = Percent();
        System.out.println("========== Classification Info ==========");
        for (Map.Entry stu : getPercent.entrySet()) {
            System.out.println(stu.getKey() + " :" + String.format("%.2f", Double.valueOf(stu.getValue().toString()) /total * 100) + "%");
        }
    }
    public void display() {
        int i = 0;
        for (Student student : students) {
            i++;
            System.out.println("========== Student " + i + " Info ==========");
            System.out.println(student.toString());
        }
    }
}
