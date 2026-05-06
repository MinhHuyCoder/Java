package buoi5;

import java.util.Scanner;

class NhanVien {
    private String ho;
    private String ten;
    private int soSP;

    public NhanVien(String ho, String ten, int soSP) {
        this.ho = ho;
        this.ten = ten;

        if (soSP < 0) {
            this.soSP = 0;
        } else {
            this.soSP = soSP;
        }
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if (soSP < 0) {
            this.soSP = 0;
        } else {
            this.soSP = soSP;
        }
    }

    public double getLuong() {
        double donGia;

        if (soSP >= 1 && soSP <= 199) {
            donGia = 0.5;
        } 
        else if (soSP <= 399) {
            donGia = 0.55;
        } 
        else if (soSP <= 599) {
            donGia = 0.6;
        } 
        else {
            donGia = 0.65;
        }

        return soSP * donGia;
    }

    public boolean LonHon(NhanVien nv2) {
        return this.soSP > nv2.soSP;
    }

    public void xuat() {
        System.out.println(
            ho + " " + ten +
            " | So SP: " + soSP +
            " | Luong: " + getLuong()
        );
    }
}

public class baitap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap nhan vien 1:");
        System.out.print("Ho: ");
        String ho1 = sc.nextLine();

        System.out.print("Ten: ");
        String ten1 = sc.nextLine();

        System.out.print("So san pham: ");
        int sp1 = sc.nextInt();
        sc.nextLine();

        NhanVien nv1 = new NhanVien(ho1, ten1, sp1);

        System.out.println("\nNhap nhan vien 2:");
        System.out.print("Ho: ");
        String ho2 = sc.nextLine();

        System.out.print("Ten: ");
        String ten2 = sc.nextLine();

        System.out.print("So san pham: ");
        int sp2 = sc.nextInt();

        NhanVien nv2 = new NhanVien(ho2, ten2, sp2);

        System.out.println("\nThong tin nhan vien:");
        nv1.xuat();
        nv2.xuat();

        System.out.println("\nSo sanh dung ham LonHon:");

        if (nv1.LonHon(nv2)) {
            System.out.println(
                nv1.getTen() + " nhieu hon " +
                (nv1.getSoSP() - nv2.getSoSP()) + " san pham"
            );
        } 
        else if (nv2.LonHon(nv1)) {
            System.out.println(
                nv2.getTen() + " nhieu hon " +
                (nv2.getSoSP() - nv1.getSoSP()) + " san pham"
            );
        } 
        else {
            System.out.println("Hai nhan vien bang nhau");
        }

        System.out.println("\nSo sanh khong dung ham LonHon:");

        if (nv1.getSoSP() > nv2.getSoSP()) {
            System.out.println(
                nv1.getTen() + " nhieu hon " +
                (nv1.getSoSP() - nv2.getSoSP()) + " san pham"
            );
        } 
        else if (nv2.getSoSP() > nv1.getSoSP()) {
            System.out.println(
                nv2.getTen() + " nhieu hon " +
                (nv2.getSoSP() - nv1.getSoSP()) + " san pham"
            );
        } 
        else {
            System.out.println("Hai nhan vien bang nhau");
        }

        sc.close();
    }
}