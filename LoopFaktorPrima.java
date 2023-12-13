package Looping;

import java.util.Scanner;

public class LoopFaktorPrima {

    public static void main(String[] args) {
        /*Buatlah program Java yang meminta input bilangan bulat positif N dan 
        menampilkan faktorisasi prima dari N. Misalnya, jika N = 12, outputnya 
        adalah "2 2 3". */
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int n = sc.nextInt();
        System.out.println("Faktorisasi prima Dari " + n + " Adalah :");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        System.out.println();
    }

}
