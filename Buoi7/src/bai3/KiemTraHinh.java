package bai3;

public class KiemTraHinh {

    public static void main(String[] args) {

        HinhChuNhat hcn = new HinhChuNhat("Do", 5, 3);

        HinhTron ht = new HinhTron("Xanh", 4);

        HinhVuong hv = new HinhVuong("Vang", 6);

        // Hình chữ nhật
        System.out.println(hcn.layThongTin());
        System.out.println("Dien tich: " + hcn.tinhDienTich());
        System.out.println("Chu vi: " + hcn.tinhChuVi());

        System.out.println();

        // Hình tròn
        System.out.println(ht.layThongTin());
        System.out.println("Dien tich: " + ht.tinhDienTich());
        System.out.println("Chu vi: " + ht.tinhChuVi());

        System.out.println();

        // Hình vuông
        System.out.println(hv.layThongTin());
        System.out.println("Dien tich: " + hv.tinhDienTich());
        System.out.println("Chu vi: " + hv.tinhChuVi());
    }
}