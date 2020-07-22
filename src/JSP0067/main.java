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
public class main {

    public static final String name = "321sdhkjDFGH!@#$%^22fdsf3";

    public static void main(String[] args) {
        AnalyzeString analyzeString = new AnalyzeString();
        System.out.println("===== Analysis String program =====");
        System.out.printf("Input String: ");
        System.out.println(name);
        analyzeString.CheckOdd(name);
        analyzeString.CheckEven(name);
        analyzeString.CheckInterger(name);
        analyzeString.CheckLowerCharacter(name);
        analyzeString.CheckUpperCharacter(name);
        analyzeString.CheckSpecialCharacter(name);
        analyzeString.CheckAllCharacter(name);
        analyzeString.checkSquareNumber(0);
        System.out.println("");
    }
}
