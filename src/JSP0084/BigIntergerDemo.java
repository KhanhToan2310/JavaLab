/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0084;

import java.math.BigInteger;

/**
 *
 * @author PHONG VU
 */
public class BigIntergerDemo{
    private BigInteger i1;
    private BigInteger i2;

    public BigIntergerDemo() {
    }

    public BigIntergerDemo(BigInteger i1, BigInteger i2) {
        this.i1 = i1;
        this.i2 = i2;
    }

    public BigInteger getI1() {
        return i1;
    }

    public void setI1(BigInteger i1) {
        this.i1 = i1;
    }

    public BigInteger getI2() {
        return i2;
    }

    public void setI2(BigInteger i2) {
        this.i2 = i2;
    }
    public void input(){
        System.out.println("Enter first big number:");
        i1 = main.sc.nextBigInteger();
        System.out.println("Enter second big number:");
        i2 = main.sc.nextBigInteger();
    }
    public void displayRS(){
        System.out.println(" ");
        System.out.printf("The result of bigInteger is:\n" + i1.multiply(i2));
        System.out.println("");
    }
}
