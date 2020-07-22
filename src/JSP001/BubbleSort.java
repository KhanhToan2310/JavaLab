package JSP001;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PHONG VU
 */
public class BubbleSort {

    public static Scanner sc = new Scanner(System.in);
    private int[] arr;
    private int size;

    public BubbleSort() {
    }

    public BubbleSort(int size) {
        this.size = size;
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

    }

    public void bubbleSort() {
        int temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j >= 1; j--) {

                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        System.out.println("=============BUBBLE SORT=============");
        System.out.println("Enter size of array:");
        BubbleSort bs = new BubbleSort(sc.nextInt());
        System.out.println("Array before sort:");
        bs.display();
        System.out.println(" ");
        System.out.println("Array after sort:");
        bs.bubbleSort();
        bs.display();

    }
}
