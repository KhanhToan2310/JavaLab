/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0067;

/**
 *
 * @author PHONG VU
 */
public class AnalyzeString {
    public static boolean checkSquareNumber(int n) {
        if (Math.sqrt(n) * Math.sqrt(n) == n) {
            return true;
        }
        return false;
    }

    public void CheckInterger(String str) {
        str = str.replaceAll("\\D+", " ");
        String[] number = str.split(" ");
        System.out.println(" ");
        System.out.println("Integer numbers: ");
        for (int i = 0; i < number.length; i++) {
            try {
                int num = Integer.parseInt(number[i]);
                System.out.print(" " + num);
            } catch (Exception e) {
                System.out.println("Don't have integer number.");
            }
        }
    }

    public void CheckEven(String str) {
        str = str.replaceAll("\\D+", " ");
        String[] number = str.split(" ");
        System.out.println(" ");
        System.out.println("Even numbers: ");
        for (int i = 0; i < number.length; i++) {
            try {
                int num = Integer.parseInt(number[i]);
                if (num % 2 == 0) {
                    System.out.print(" " + num);
                }
            } catch (Exception e) {
                System.out.println("Don't have even integer.");
            }
        }
    }

    public void CheckOdd(String str) {
        int num;
        str = str.replaceAll("\\D+", " ");
        String[] number = str.split(" ");
        System.out.println(" ");
        System.out.println("Odd numbers: ");
        for (int i = 0; i < number.length; i++) {
            try {
                num = Integer.parseInt(number[i]);
                if (num % 2 == 1) {
                    System.out.print(" " + num);
                }
            } catch (Exception e) {
                System.out.println("Don't have odd integer.");
            }
        }
    }

    public void CheckLowerCharacter(String str) {
        char[] character = str.toCharArray();
        System.out.println(" ");
        System.out.println("Character lower: ");
        for (int i = 0; i < str.length(); i++) {
            try {
                if (Character.isLowerCase(character[i])) {
                    System.out.print(" " + character[i]);
                }
            } catch (Exception e) {
                System.out.println("Don't have lower character.");
            }
        }
    }

    public void CheckUpperCharacter(String str) {
        char[] character = str.toCharArray();
        System.out.println(" ");
        System.out.println("Character upper: ");
        for (int i = 0; i < str.length(); i++) {
            try {
                if (Character.isUpperCase(character[i])) {
                    System.out.print(" " + character[i]);
                }
            } catch (Exception e) {
                System.out.println("Don't have upper character.");
            }
        }
    }

    public void CheckSpecialCharacter(String str) {
        str = str.replaceAll("\\w", " ");
        String[] character = str.split(" ");
        System.out.println(" ");
        System.out.println("Character special: ");
        for (int i = 0; i < character.length; i++) {
            try {
                System.out.print(character[i]);
            } catch (Exception e) {
                System.out.println("Don't have special character.");
            }
        }
    }

    public void CheckAllCharacter(String str) {
        str = str.replaceAll("[0-9]", " ");
        String[] character = str.split(" ");
        System.out.println(" ");
        System.out.println("All Character: ");
        for (int i = 0; i < character.length; i++) {
            try {
                System.out.print(character[i]);
            } catch (Exception e) {
                System.out.println("Don't have character.");
            }
        }
    }
}
