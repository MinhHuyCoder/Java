package buoi8;

//InvoiceTest.java
package bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceTest {

 static ArrayList<Invoice> list = new ArrayList<>();
 static Scanner sc = new Scanner(System.in);

 public static void main(String[] args) {

     int choice;

     do {
         System.out.println("\n===== MENU =====");
         System.out.println("1. Nhap danh sach Invoice");
         System.out.println("2. Xuat danh sach Invoice");
         System.out.println("3. Sap xep theo ma mat hang");
         System.out.println("4. Tim Invoice theo ma");
         System.out.println("5. Xoa Invoice theo ma");
         System.out.println("0. Thoat");
         System.out.print("Nhap lua chon: ");

         choice = Integer.parseInt(sc.nextLine());

         switch (choice) {
             case 1:
                 nhapDanhSach();
                 break;

             case 2:
                 xuatDanhSach();
                 break;

             case 3:
                 sapXep();
                 break;

             case 4:
                 timInvoice();
                 break;

             case 5:
                 xoaInvoice();
                 break;

             case 0:
                 System.out.println("Thoat chuong trinh.");
                 break;

             default:
                 System.out.println("Lua chon khong hop le!");
         }

     } while (choice != 0);
 }

 // Nhập danh sách
 public static void nhapDanhSach() {
     System.out.print("Nhap so luong Invoice (>=10): ");
     int n = Integer.parseInt(sc.nextLine());

     if (n < 10) {
         System.out.println("Phai nhap it nhat 10 Invoice!");
         return;
     }

     for (int i = 0; i < n; i++) {

         System.out.println("\nInvoice thu " + (i + 1));

         String ma;

         while (true) {
             System.out.print("Nhap ma mat hang: ");
             ma = sc.nextLine();

             if (kiemTraTrungMa(ma)) {
                 System.out.println("Ma da ton tai, nhap lai!");
             } else {
                 break;
             }
         }

         System.out.print("Nhap mo ta: ");
         String mota = sc.nextLine();

         System.out.print("Nhap so luong: ");
         int sl = Integer.parseInt(sc.nextLine());

         System.out.print("Nhap gia: ");
         double gia = Double.parseDouble(sc.nextLine());

         Invoice iv = new Invoice(ma, mota, sl, gia);

         list.add(iv);
     }
 }

 // Kiểm tra trùng mã
 public static boolean kiemTraTrungMa(String ma) {
     for (Invoice iv : list) {
         if (iv.getPartNumber().equalsIgnoreCase(ma)) {
             return true;
         }
     }
     return false;
 }

 // Xuất danh sách
 public static void xuatDanhSach() {

     if (list.isEmpty()) {
         System.out.println("Danh sach rong!");
         return;
     }

     System.out.println("\n===== DANH SACH INVOICE =====");

     for (Invoice iv : list) {
         System.out.println(iv);
     }
 }

 // Bubble Sort theo mã mặt hàng
 public static void sapXep() {

     for (int i = 0; i < list.size() - 1; i++) {

         for (int j = 0; j < list.size() - i - 1; j++) {

             if (list.get(j).getPartNumber()
                     .compareToIgnoreCase(list.get(j + 1).getPartNumber()) > 0) {

                 Invoice temp = list.get(j);
                 list.set(j, list.get(j + 1));
                 list.set(j + 1, temp);
             }
         }
     }

     System.out.println("Da sap xep theo ma mat hang.");
 }

 // Tìm Invoice
 public static void timInvoice() {

     System.out.print("Nhap ma can tim: ");
     String ma = sc.nextLine();

     boolean found = false;

     for (Invoice iv : list) {

         if (iv.getPartNumber().equalsIgnoreCase(ma)) {
             System.out.println("Tim thay:");
             System.out.println(iv);
             found = true;
         }
     }

     if (!found) {
         System.out.println("Khong tim thay!");
     }
 }

 // Xóa Invoice
 public static void xoaInvoice() {

     System.out.print("Nhap ma can xoa: ");
     String ma = sc.nextLine();

     for (int i = 0; i < list.size(); i++) {

         if (list.get(i).getPartNumber().equalsIgnoreCase(ma)) {

             list.remove(i);

             System.out.println("Da xoa Invoice!");
             return;
         }
     }

     System.out.println("Khong tim thay ma de xoa!");
 }
}