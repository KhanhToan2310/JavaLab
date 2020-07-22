/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP004;

import java.util.Scanner;

/**
 *
 * @author PHONG VU
 */
public class QuickSort {

    public static Scanner sc = new Scanner(System.in);
    private int[] arr;
    private int size;

    public QuickSort() {
    }

    public QuickSort(int size) {
        this.size = size;
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

    }

    public int partition(int a, int b) {
        int mustry = arr[b];
        int i = (a - 1);
        for (int j = a; j < b; j++) {
            if (arr[j] < mustry) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[b];
        arr[b] = temp;
        return i + 1;
    }

    public void quickSort(int a, int b) {
        if (a < b) {
            int partitionIndex = partition(a, b);

            quickSort(a, partitionIndex - 1);
            quickSort(partitionIndex + 1, b);
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        System.out.println("Enter size of your array:");
        int size = QuickSort.sc.nextInt();
        QuickSort qs = new QuickSort(size);
        System.out.println("Array before sort:");
        qs.display();
        System.out.println("Array affter sort:");
        qs.quickSort(0, size - 1);
        qs.display();
    }

}
