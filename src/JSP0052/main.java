/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0052;

/**
 *
 * @author PHONG VU
 */
public class main {

    public static void main(String[] args) {
        CountryList list = new CountryList();
        int choice = 0;
        do {
            System.out.println("==========================================================================");
            System.out.println("1. Input the information of 11 countries in East Asia");
            System.out.println("2. Display the information of country you've just input");
            System.out.println("3. Search the information of country by user-entered name");
            System.out.println("4. Display the information of countries sorted name in ascending order");
            System.out.println("5. Exit");
            System.out.println("==========================================================================");
            System.out.print("Enter your choice: ");
            choice = CheckInput.checkPositive();
            switch (choice) {
                case 1:
                    list.input();
                    break;
                case 2:
                    list.displayLast();
                    break;
                case 3:
                    list.search();
                    break;
                case 4:
                    list.displayAll();
                    break;
                case 5:
                    break;
            }
        } while (choice != 5);
    }
}
