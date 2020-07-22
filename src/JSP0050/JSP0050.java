package JSP0050;

import java.util.Scanner;

/**
 *
 * @author KHANH TOAN
 */
public class JSP0050 {
    public static void InSoLe(int a[]) {
        
    }
    public static void PTB1(double a,double b) {
        double c;

        if(a == 0){
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else {
            c = -b/a;
            if (c == -0){
                System.out.println("Phuong trinh co nghiem la 0.00");
            }
            else {
            System.out.println("Phuong trinh co nghiem la " + c);
        } 
    }
    }
     public static void PTB2(double a, double b, double c){
        double x1,x2;
        double denta = Math.pow(b, b) - 4*a*c;
        if (a == 0) {
            PTB1(b,c);
        }
        else if (a !=0){
            if(denta == 0){
                x1 = x2 = (-b/(2*a));
                System.out.println("Phuong trinh co 1 nghiem:" + x1);
            }
            else if (denta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            }
            else{
                x1 = (-b-Math.sqrt(denta))/(2*a);
                x2 = (-b+Math.sqrt(denta))/(2*a);
                System.out.println("Phuong trinh co 2 nghiem phan biet la" + x1 + "va" + x2 );
            }
        }
    }
    public static boolean InSoLe(int n){
            if (n % 2 != 0) {
               return true;
            }
            return false;
    }
    public static boolean InSoChan(int n) {
            if (n % 2 == 0) {
                return true;
            }
        return false;
    }
    public static boolean InSoChinhPhuong(int n){   
        for (int i = 0; i < n; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int choice;
        Scanner x = new Scanner(System.in);
        do {   
        System.out.println("=============JSP0050=============");
        System.out.println("1. Phuong trinh bac nhat.");
        System.out.println("2. Phuong trinh bac hai.");
        System.out.println("3. In so.");
        System.out.println("4. Exit.");
        System.out.println("Enter your choice(1 - 4):");
        choice = x.nextInt();
        x.nextLine();
        switch(choice){
            case 1:
                System.out.println("Nhap so a va b:");
                PTB1(x.nextDouble(), x.nextDouble());
                break;
            case 2:
                System.out.println("Nhap 3 so a b c:");
                PTB2(x.nextDouble(),x.nextDouble(), x.nextDouble());
                break;
            case 3:
                System.out.println("Nhap vao So bat dau:");
                int d = x.nextInt();
                System.out.println("Nhap vao so ket thuc:");
                int e = x.nextInt();
               System.out.printf("Cac so le tu" + " " + d + " " + "den" +" "+ e +" "+"la:");
                for (int i = d; i <= e; i++) {
                    if (InSoLe(i)) {
                        System.out.println(i + " ");
                    }
                }
                System.out.printf("Cac so chan tu" + " " + d + " " + "den" +" "+ e +" "+"la:");
                for (int i = d; i <= e; i++) {
                    if (InSoChan(i)) {
                        System.out.println(i + " ");
                    }
                }
                System.out.printf("Cac so chinh phuong tu" + " " + d + " " + "den" +" "+ e +" "+"la:");
                for (int i = d; i <= e; i++) {
                    if (InSoChinhPhuong(i)) {
                        System.out.println(i + " ");
                    }
                }
                break;
            case 4:
                break;
        }
        } while (choice != 4);
        System.out.println("=============Thank you=============");
}
}
