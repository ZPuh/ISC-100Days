package isc100days.Method;

import java.util.Scanner;

public class MetPrima {

    public static void main(String[] args) {
        /*Tuliskan method Java yang menerima sebuah bilangan sebagai parameter 
        dan mengembalikan true jika bilangan tersebut prima, dan false jika tidak. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = sc.nextInt();
        if (prima(angka)) {
            System.out.println(angka + " Adalah Bilangan Prima");
        } else {
            System.out.println(angka + " Bukan Bilangan Prima");
        }
    }

    private static boolean prima(int a) {
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
}
