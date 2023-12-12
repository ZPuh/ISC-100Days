package Looping;

import java.util.Scanner;

public class LoopPola1 {
    public static void main(String[] args) {
        /*Buatlah program dalam Java yang menghasilkan pola segitiga siku-siku dengan
        tinggi yang ditentukan oleh pengguna. Contoh, jika tinggi adalah 5, program
        harus mencetak: 
        1
        12
        123
        1234
        12345
        */
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Tinggi : ");
        int tinggi = sc.nextInt();
        
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
