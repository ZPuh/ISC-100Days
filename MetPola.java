package isc100days.Method;

import java.util.Scanner;

public class MetPola {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang : ");
        int p = sc.nextInt();
        System.out.print("Lebar   : ");
        int l = sc.nextInt();
        pola(p, l);
    }

    public static void pola(int j, int i) {
        for (int k = 1; k <= i; k++) {
            for (int l = 1; l <= j; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
