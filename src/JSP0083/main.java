/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0083;

/**
 *
 * @author PHONG VU
 */
public class main {

    public static void main(String[] args) {
        MyLinkedlist mll = new MyLinkedlist();
        System.out.println("Stack");
        mll.push(1);
        mll.push(2);
        mll.push(3);
        mll.push(4);
        System.out.println("============POP============");
        System.out.println(mll.pop());
        System.out.println("============PEEK============");
        System.out.println(mll.peek()); 

    }
}
