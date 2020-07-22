/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0011;

import java.util.Scanner;

/**
 *
 * @author Khanh Toan
 */
public class JSP0011 {
    public static int charToInt(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
       return c - 'a'+10;
    }
    public static int intToChar(int c) {
        if (c >= '0' && c <= '9') {
            return (char)(c + '0');
        }
       return (char)(c + 'a'+10);
    }
    public static int hexToDec(String hex) {
        int dec = 0;
        int base = 1;
        for (int i = hex.length() - 1 ; i >= 0; i--) {
            dec += charToInt(hex.charAt(i)) * base;
            base = base * 16;
        }
        return dec;
    }
    public static String decToHex(int dec) {
        String hex = "";
        while (dec != 0) {
            int temp = 0;
            temp = dec % 16;
            if (temp < 10) {
                hex += (char) (temp + 48);
            } else {
                hex += (char) (temp + 55);
            }
            dec = dec / 16;
        }
        StringBuffer sb = new StringBuffer(hex);
        //reverse string
        hex = sb.reverse().toString();
        return hex;
    }

    public static int binToDec(int bin) {
        int dec = 0, base = 1;
        int temp = 0;
        while (bin > 0) {
            temp = bin % 10;
            dec += temp * base;
            base *= 2;
            bin /= 10;
        }
        return dec;
    }

    public static String decToBin(int dec) {
        String bin = "";
        while (dec > 0) {
            int temp = dec % 2;
            bin += temp;
            dec /= 2;
        }
        StringBuffer sb = new StringBuffer(bin);
        //reverse string
        bin = sb.reverse().toString();
        return bin;
    }

    public static boolean checkHex(String hex) {
        for (int i = 0; i < hex.length(); i++) {
            if (hex.charAt(i) >= 'G' && hex.charAt(i) <= 'Z') {
                System.out.println("Invalid Hex number");
                return false;
            }
        }
        return true;
    }

    public static boolean checkInt(String hex) {
        for (int i = 0; i < hex.length(); i++) {
            if (hex.charAt(i) >= 'G' && hex.charAt(i) <= 'Z') {
                System.out.println("Invalid Hex number");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String hex;
        Scanner sc = new Scanner(System.in);
        int dec, bin;
        System.out.println("=====HEX TO DEC=====");
        do {
        System.out.print("Input Hex number: ");
        hex = sc.nextLine();
        } while (checkHex(hex) == false);
        System.out.println("Dec is: " + hexToDec(hex));
        System.out.println("=====DEC TO HEX=====");
        System.out.print("Input Dec number: ");
        dec = sc.nextInt();
        System.out.println("Hex is: " + decToHex(dec));
        System.out.println("=====BIN TO DEC=====");
        System.out.print("Input Bin number: ");
        bin = sc.nextInt();
        System.out.println("Dec is: " + binToDec(bin));
        System.out.println("=====DEC TO BIN=====");
        System.out.print("Input Dec number: ");
        dec = sc.nextInt();
        System.out.println("Bin is: " + decToBin(dec));
    }
}