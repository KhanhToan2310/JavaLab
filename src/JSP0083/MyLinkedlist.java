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
public class MyLinkedlist {

    private Node head;
    private Node tail;

    public MyLinkedlist() {
         head = tail = null;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void push(int x) {
        Node p = new Node(x);
        if (isEmpty() ) {
            head = tail = p;
        } else {
            p.next = head;
            head = p;
        }
    }

    public int peek() {
        return head.data;
    }

    public int pop() {
        int x;
        x = head.data;
        head = head.next;
        return x;
    }
}
