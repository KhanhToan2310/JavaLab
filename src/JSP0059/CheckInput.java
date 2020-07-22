/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0059;

import java.util.Scanner;

/**
 *
 * @author PHONG VU
 */
public class CheckInput {

    private static Scanner sc = new Scanner(System.in);

    public static int checkInput(int min, int max) {
        while (true) {
            try {
                int rs = Integer.parseInt(sc.nextLine().trim());
                if (rs < min || rs > max) {
                    throw new NumberFormatException();
                }
                return rs;
            } catch (NumberFormatException e) {
                System.out.println("Enter number in range [" + min + "," + max + "]");
                System.out.println("Please enter again:");
            }
        }
    }

    public static String checkString() {
        //loop until user input correct
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static int checkInt() {
        while (true) {
            try {
                int rs = Integer.parseInt(sc.nextLine().trim());
                return rs;
            } catch (NumberFormatException e) {
                System.out.println("You must input digidt.");
                System.out.println("Please enter again:");
            }
        }
    }

    public static int checkPositive() {
        while (true) {
            try {
                int rs = Integer.parseInt(sc.nextLine().trim());
                if (rs < 0) {
                    System.out.println("Salary is greater than zero.");
                    continue;
                }
                return rs;
            } catch (NumberFormatException e) {
                System.out.println("You must input digidt.");
                System.out.println("Please enter again:");
            }
        }
    }

    public static String checkInputPathFile() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty!");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }


}
