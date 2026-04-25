package buoi4;

import java.util.*;

public class baitap1 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> ds = new ArrayList<>();

    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Sua sinh vien");
            System.out.println("4. Xoa sinh vien");
            System.out.println("5. Tim ten co chu 'An'");
            System.out.println("6. Sap xep");
            System.out.println("7. Dem so luong");
            System.out.println("0. Thoat");

            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1: them(); break;
                case 2: xuat(); break;
                case 3: sua(); break;
                case 4: xoa(); break;
                case 5: tim(); break;
                case 6: sapxep(); break;
                case 7: dem(); break;
            }

        } while (chon != 0);
    }

    // Thêm
    static void them() {
        System.out.print("Nhap ten: ");
        String ten = sc.nextLine();
        ds.add(ten);
    }

    // Xuất
    static void xuat() {
        for (String s : ds) {
            System.out.println(s);
        }
    }

    // Sửa
    static void sua() {
        System.out.print("Nhap vi tri can sua: ");
        int i = sc.nextInt();
        sc.nextLine();

        if (i >= 0 && i < ds.size()) {
            System.out.print("Nhap ten moi: ");
            ds.set(i, sc.nextLine());
        }
    }

    // Xóa theo tên chứa
    static void xoa() {
        System.out.print("Nhap tu khoa: ");
        String key = sc.nextLine();

        ds.removeIf(s -> s.contains(key));
    }

    // Tìm chứa "An"
    static void tim() {
        for (String s : ds) {
            if (s.contains("An")) {
                System.out.println(s);
            }
        }
    }

    // Sắp xếp
    static void sapxep() {
        Collections.sort(ds);
    }

    // Đếm
    static void dem() {
        System.out.println("So luong: " + ds.size());
    }
}
