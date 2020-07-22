/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLP0025;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author PHONG VU
 */
public class main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Normalize normalize = new Normalize();
        normalize.br = new BufferedReader(new FileReader("D:\\NetBeansProjects\\netbean\\JavaLab\\input.txt"));
        normalize.pw = new PrintWriter(new FileWriter("D:\\NetBeansProjects\\netbean\\JavaLab\\output.txt"));
        normalize.readFile();
        normalize.convert();
        normalize.display();
    }
}
