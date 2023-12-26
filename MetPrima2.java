package Method;

import java.util.Scanner;

public class MetPrima2 {

    public static void main(String[] args) {
        // Program Bilangan Prima 
        Scanner sc = new Scanner(System.in);
        System.out.print("Start : ");
        int st = sc.nextInt();
        System.out.print("Finish : ");
        int fn = sc.nextInt();

        bilPrime(st, fn);
    }

    private static boolean cekPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void bilPrime(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (cekPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
