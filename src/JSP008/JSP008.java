/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP008;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Khanh Toan
 */
public class JSP008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String:");
        String a = sc.nextLine();
        a = a.replaceAll("," , "");
        String[] a1 = a.split(" ");
        String a2 = "";
        Integer v;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<a1.length;i++){
                a2 = a1[i];
            if(map.containsKey(a2)){
                v = map.get(a2);
                map.remove(a2);
                map.put(a2, v + 1);
            } else{
                map.put(a2, 1);
            }
        }
        Set set=map.keySet();
        Iterator i = set.iterator();
        System.out.print("{ ");
    while(i.hasNext()){
        a2 = (String)i.next();
        System.out.print(a2+" = "+map.get(a2)+",");
    }
        System.out.print("}");
        System.out.println(" ");
        a = a.replaceAll(" ","");
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        char[] character = a.toCharArray();
        for (char b : character){
            if(count.containsKey(b)){
                count.put(b, count.get(b)+1);
            }
            else{
                count.put(b, 1);
            }
        }
        System.out.println(count);
    }
}
