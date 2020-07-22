/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0058;

import java.util.Scanner;

/**
 *
 * @author PHONG VU
 */
public class CheckInput {

    private static Scanner sc = new Scanner(System.in);

    public static int checkMIN_MAX(int min, int max) {
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

    public static int checkInt() {
        while (true) {
            try {
                int rs = Integer.parseInt(sc.nextLine().trim());
                return rs;
            } catch (NumberFormatException e) {
                System.out.println("Has to be integer number.");
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

    public static double checkDouble() {
        while (true) {
            try {
                double rs = Double.parseDouble(sc.nextLine().trim());
                return rs;
            } catch (NumberFormatException e) {
                System.out.println("Has to be double number");
                System.out.println("Please enter again:");
            }
        }
    }

    public static int checkPositive() {
        while (true) {
            try {
                int rs = Integer.parseInt(sc.nextLine().trim());
                if (rs < 0) {
                    System.out.println("Has to be positive integer");
                    continue;
                }
                return rs;
            } catch (NumberFormatException e) {
                System.out.println("Has to be positive integer");
                System.out.println("Please enter again:");
            }
        }
    }

    public static boolean checkYesNo() {
        System.out.println("Do you want to continue(y/n): ");
        while (true) {
            String rs = checkString();
            if (rs.equalsIgnoreCase("y")) {
                return true;
            }
            if (rs.equalsIgnoreCase("n")) {
                return false;
            }
            System.out.println("Please enter just y or n");
            System.out.println("Please enter again:");
        }
    }
}
