/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0073;

import java.util.ArrayList;

/**
 *
 * @author PHONG VU
 */
public class ExpenseManager {

    public int id = 1;
    ArrayList<Expense> list = new ArrayList<>();

    public void add() {
        String date = " ";
        Expense ex = new Expense();
        do {
            System.out.print("Enter date: ");
            date = main.sc.nextLine();
            if (checkFormatDay(date)) {
                ex.setDate(date);
                break;
            } else {
                System.out.println("Enter date in format like 17-Oct-2000");
                System.out.println("Please enter again: ");
            }
        } while (true);
        System.out.println("Enter amount of money:");
        Double money = main.sc.nextDouble();
        main.sc.nextLine();
        System.out.println("Enter content:");
        String ct = main.sc.nextLine();
        list.add(new Expense(id++, date, money, ct));
    }

    public void display() {

        double total = 0;
        System.out.printf("%2s %-4s %13s %-7s", "ID", "Date", "Amount of money", "Content");
        System.out.println("");
        for (Expense expense : list) {
            System.out.println(expense.toString());
            total += expense.getNumber();
        }
        System.out.println("Total: " + total);
    }

    public void DeleteInfo() {
        System.out.println("Enter id you want to delete: ");
        int idexpense = main.sc.nextInt();
        Expense e = Delete(idexpense);
        if (e == null) {
            System.out.println("Don't have this expense in list");
        } else {
            list.remove(e);
            System.out.println("Delete successful!");
        }
    }

    public Expense Delete(int idnumber) {
        for (Expense expense : list) {
            if (expense.getID() == idnumber) {
                return expense;
            }
        }
        return null;
    }

    public boolean checkFormatDay(String date) {
        return date.matches("^\\d{2}-\\w{3}-\\d{4}$");
    }

}
