package buoi4;

public class Bai4 {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int[] M = {3,6,7,8,11,17,2,90,2,5,4,5,8};

        int demLe = 0, demChan = 0;

        
        System.out.print("So le: ");
        for (int x : M) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
                demLe++;
            }
        }
        System.out.println("=> " + demLe + " so le");

        
        System.out.print("So chan: ");
        for (int x : M) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
                demChan++;
            }
        }
        System.out.println("=> " + demChan + " so chan");

       
        System.out.print("So nguyen to: ");
        for (int x : M) {
            if (isPrime(x)) {
                System.out.print(x + " ");
            }
        }
        System.out.println();

        
        System.out.print("Khong phai so nguyen to: ");
        for (int x : M) {
            if (!isPrime(x)) {
                System.out.print(x + " ");
            }
        }
    }
}