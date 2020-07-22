/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0056;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author PHONG VU
 */
public class ManagerWorker {

    ArrayList<Worker> workerlist = new ArrayList<>();
    ArrayList<HistoryInfor> historyInforlist = new ArrayList<>();

    public void add() {
        System.out.println("Enter Code:");
        String code = CheckInput.checkString();
        System.out.println("Enter Name:");
        String name = CheckInput.checkString();
        System.out.println("Enter Age:");
        int age = CheckInput.checkPositive();
        System.out.println("Enter Salary:");
        int salary = CheckInput.checkPositive();
        System.out.println("Enter work location:");
        String location = CheckInput.checkString();
        workerlist.add(new Worker(code, name, age, salary, location));
    }

    public void changeS(int comment) {
        System.out.print("Enter id: ");
        String id = CheckInput.checkString();
        Worker worker = getWorker(id);
        if (worker == null) {
            System.err.println("Don't have worker.");
        } else {
            int salaryCurrent = worker.getSalary();
            int salaryUpdate;
            if (comment == 1) {
                System.out.print("Enter salary want to up: ");
                while (true) {
                    salaryUpdate = CheckInput.checkPositive();
                    if (salaryUpdate <= salaryCurrent) {
                        System.err.println("Must be greater than current salary.");
                        System.out.print("Enter again: ");
                    } else {
                        break;
                    }
                }
                historyInforlist.add(new HistoryInfor(worker.getId(),
                        worker.getName(), worker.getAge(), salaryUpdate,
                        worker.getWorkLocation(), "UP", getDate()));
            } else {
                System.out.print("Enter salary want to down: ");
                while (true) {
                    salaryUpdate = CheckInput.checkPositive();
                    if (salaryUpdate >= salaryCurrent) {
                        System.err.println("Must be smaller than current salary.");
                        System.out.print("Enter again: ");
                    } else {
                        break;
                    }
                }

                historyInforlist.add(new HistoryInfor(worker.getId(),
                        worker.getName(), worker.getAge(), salaryUpdate,
                        worker.getWorkLocation(), "DOWN", getDate()));
            }
            worker.setSalary(salaryUpdate);      
        }
    }

    public Worker getWorker(String id) {
        for (Worker worker : workerlist) {
            if (id.equalsIgnoreCase(worker.getId())) {
                return worker;
            }
        }
        return null;
    }

    public String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        return dateFormat.format(calendar.getTime());
    }

    public void display() {
        System.out.printf("%-5s %-15s %-5s %-10s %-10s %-20s\n", "Code", "Name", "Age", "Salary", "Status", "Date");
        for (HistoryInfor historyInfor : historyInforlist) {
            System.out.printf("%-5s %-15s %-5d %-10d %-10s %-20s \n", historyInfor.getId(),
                    historyInfor.getName(), historyInfor.getAge(), historyInfor.getSalary(),
                    historyInfor.getComment(), historyInfor.getDate());

        }
    }
}
