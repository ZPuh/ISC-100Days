package Looping;

import java.util.Scanner;

public class PrintStringCharacters {
    public static void main(String[] args) {
        /*buatlah program yang meminta pengguna memasukkan sebuah kata, lalu mencetak
        setiap karakter kata tersebut dengan memberikan spasi di antara karakter-karakternya.  */
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukan Kata/Kalimat : ");
        String kata = sc.nextLine();
        
        for (int i = 0; i < kata.length(); i++) {
            System.out.print(kata.charAt(i)+" ");
            
        }
        System.out.println();
    }
    
}
