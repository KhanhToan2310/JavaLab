/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0062;

import java.util.Scanner;

/**
 *
 * @author PHONG VU
 */
public class main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        AnalyzeFilePath path = new AnalyzeFilePath();
        path.inputURL();
    }
}
