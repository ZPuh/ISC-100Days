package whileloop;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        //Syntax
        /*
        while (kondisi){
            
        }
        */
        
        // Contoh Kasus
        // Membuat Program Faktorial Menggunakan While
                  
        Scanner sc = new Scanner(System.in);      

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        int faktorial = 1;
        int i = 1;

        while (i <= angka) {
            faktorial *= i;
            i++;
        }
        System.out.println(angka + "! = " + faktorial);
    }
    
}
