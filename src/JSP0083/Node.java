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
public class Node {

    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(Node next, int data) {
        this.next = next;
        this.data = data;
    }

}
