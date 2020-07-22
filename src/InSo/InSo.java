/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InSo;

import java.util.Scanner;

/**
 *
 * @author PHONG VU
 */
public class InSo {
    public static void nhapSo(int n) {  
        Scanner s = new Scanner(System.in);
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
    }
    public static void InSoLe(int a[],int n) {
        System.out.println("Cac so le la:");
        for (int i = 0; i < n; i++) {
            if (a[i]%2 != 0) {
                System.out.println(a[i]);
            }
        }
    }
    public static void InSoChan(int a[],int n) {
        System.out.println("Cac so chan la:");
        for (int i = 0; i < n; i++) {
            if (a[i]%2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a[] = null,n = 0;
        System.out.print("Enter no. of elements you want in array:");
        nhapSo(x.nextInt());
        int choice;
        do {            
            System.out.println("1. In so le.");
            System.out.println("2. In so chan.");
            System.out.println("3. In so chinh phuong.");
            System.out.println("4. Exit.");
            choice = x.nextInt();
            switch(choice){
                 case 1:
                     InSoLe(a, n);
                     break;
                case 2:
                    InSoChan(a, n);
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        } while (choice != 4);
        System.out.println("Thank you!");
    }
    
}
