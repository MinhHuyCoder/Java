package buoi3;

import java.util.Random;
import java.util.Scanner;

public class BaiDoanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean choiTiep = true;

        while (choiTiep) {
            int soMay = rand.nextInt(101); 
            int soLanDoan = 0;
            boolean win = false;

            System.out.println("=== GAME ĐOÁN SỐ ===");

            while (soLanDoan < 7) {
                System.out.print("Nhập số bạn đoán: ");
                int doan = sc.nextInt();
                soLanDoan++;

                if (doan == soMay) {
                    System.out.println("WIN! Bạn đoán đúng!");
                    win = true;
                    break;
                } else if (doan < soMay) {
                    System.out.println("Số bạn đoán NHỎ hơn.");
                } else {
                    System.out.println("Số bạn đoán LỚN hơn.");
                }

                System.out.println("Còn " + (7 - soLanDoan) + " lần đoán.");
            }

            if (!win) {
                System.out.println("LOST! Số đúng là: " + soMay);
            }

            System.out.print("Chơi tiếp không? (y/n): ");
            char tl = sc.next().charAt(0);

            if (tl != 'y' && tl != 'Y') {
                choiTiep = false;
            }
        }

        System.out.println("Thoát game.");
        sc.close();
    }
}
