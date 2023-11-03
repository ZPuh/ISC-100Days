package javaapplication62;

import java.util.Scanner;

public class JavaApplication62 {
    public static void main(String[] args) {
        // Pola Segi Tiga Angka 
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Baris : ");
        int baris = sc.nextInt();        
        for (int i = 1; i <= baris; i++) {
            for (int j = baris; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
