/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP006_JSP0010;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Khanh Toan
 */
public class BinaryLinearSearch {

    public static int linearSearch(int key, int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int n, int a[]) {
        int min = 0;
        int max = a.length;
        int mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;
            if (a[mid] == n) {
                return mid;
            } else if (a[mid] < n) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Binary search.");
            System.out.println("1. Linear search.");
            System.out.println("1. Exit.");
            System.out.println("Enter you choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int n = (int) (Math.random() * 10);
                    int a[] = new int[n];
                    for (int i = 0; i < n; i++) {
                        a[i] = (int) (Math.random() * 100);
                    }
                    System.out.println("So phan tu " + n + " ");
                    System.out.print("Cac so trong chuoi:");
                    Arrays.sort(a);
                    for (int i = 0; i < n; i++) {
                        System.out.print(" " + a[i]);
                    }
                    System.out.println(" ");
                    System.out.println("Nhap vao so can tim:");
                    int x = sc.nextInt();

                    if (BinarySearch(x, a) == -1) {
                        System.out.println("Khong the tim duoc so trong day.");
                    } else {
                        System.out.println("So duoc tim kiem bang binary Search la: " + BinarySearch(x, a));
                    }
                    break;
                case 2:
                    int m = (int) (Math.random() * 10);
                    int arr[] = new int[m];
                    for (int i = 0; i < m; i++) {
                        arr[i] = (int) (Math.random() * 100);
                    }
                    System.out.println("So phan tu " + m + " ");
                    System.out.print("Cac so trong chuoi:");
                    for (int i = 0; i < m; i++) {
                        System.out.print(" " + arr[i]);
                    }
                    System.out.println(" ");
                    System.out.println("Nhap vao so can tim:");
                    int y = sc.nextInt();
                    if (linearSearch(y, arr) == -1) {
                        System.out.println("Khong the tim duoc so trong day.");
                    } else {
                        System.out.println("So duoc tim bang linear search la: " + linearSearch(y, arr));
                    }
                    break;
                case 3:
                    break;

            }

        } while (choice != 3);

    }
}
