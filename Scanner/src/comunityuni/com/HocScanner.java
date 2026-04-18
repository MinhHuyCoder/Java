package comunityuni.com;

import java.util.Scanner;

public class HocScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen: ");
        int a = sc.nextInt();

        System.out.print("Nhap so double: ");
        double d = sc.nextDouble();

        System.out.print("Nhap so float: ");
        float f = sc.nextFloat();

        sc.nextLine(); // 

        System.out.print("Moi ban nhap ten: ");
        String ten = sc.nextLine();

        System.out.println("Ten: " + ten);
        System.out.println("a = " + a);
        System.out.println("d = " + d);
        System.out.println("f = " + f);

        sc.close();
    }
}