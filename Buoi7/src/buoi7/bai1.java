package buoi7;

import java.util.Scanner;

public class bai1 {

    // Tìm UCLN
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Kiểm tra số hoàn thiện
    public static boolean soHoanThien(int n) {
        int tong = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }

        return tong == n;
    }

    // Kiểm tra toàn chữ số chẵn
    public static boolean toanSoChan(int n) {

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 != 0) {
                return false;
            }

            n /= 10;
        }

        return true;
    }

    // Hàm tính giai thừa
    public static long giaiThua(int n) {
        long gt = 1;

        for (int i = 1; i <= n; i++) {
            gt *= i;
        }

        return gt;
    }

    // Tính S(x,n)
    public static double tinhS(double x, int n) {
        double s = x;

        for (int i = 1; i <= n; i++) {
            s += Math.pow(x, 2 * i + 1) / giaiThua(2 * i + 1);
        }

        return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== Bài 1 =====
        System.out.print("Nhap a: ");
        int a = sc.nextInt();

        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        System.out.println("UCLN = " + UCLN(a, b));

        // ===== Bài 2 =====
        System.out.print("\nNhap n de kiem tra so hoan thien: ");
        int n1 = sc.nextInt();

        if (soHoanThien(n1)) {
            System.out.println(n1 + " la so hoan thien");
        } else {
            System.out.println(n1 + " khong phai so hoan thien");
        }

        // ===== Bài 3 =====
        System.out.print("\nNhap n de kiem tra toan chu so chan: ");
        int n2 = sc.nextInt();

        if (toanSoChan(n2)) {
            System.out.println(n2 + " toan chu so chan");
        } else {
            System.out.println(n2 + " khong phai toan chu so chan");
        }

        // ===== Bài 4 =====
        System.out.print("\nNhap x: ");
        double x = sc.nextDouble();

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        double ketQua = tinhS(x, n);

        System.out.println("S(x,n) = " + ketQua);

        sc.close();
    }
}
