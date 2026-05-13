package buoi7;

import java.util.Scanner;

public class bai2 {

    public static void NegativeNumberInStrings(String str) {

        for (int i = 0; i < str.length(); i++) {

            // Nếu gặp dấu -
            if (str.charAt(i) == '-') {

                int j = i + 1;

                // Kiểm tra phía sau có phải số không
                if (j < str.length() && Character.isDigit(str.charAt(j))) {

                    System.out.print("-");

                    // In toàn bộ số phía sau
                    while (j < str.length() && Character.isDigit(str.charAt(j))) {

                        System.out.print(str.charAt(j));
                        j++;
                    }

                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();

        System.out.println("Cac so nguyen am trong chuoi:");

        NegativeNumberInStrings(str);
    }
}