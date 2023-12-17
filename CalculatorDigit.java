package Looping;

import java.util.Scanner;

public class CalculatorDigit {
    public static void main(String[] args) {
        /*Membuat Kalkulator jumlah digit
        contoh :
        angka = 1234
        jumlah = 1+2+3+4 = 10
        */
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Angka : ");
        int angka = sc.nextInt();
        int digit = 0 ;
        
        while (angka > 0) {            
            digit += angka % 10;
            angka /= 10;
            
        }
        System.out.println("Jumlah digit : "+digit);
    }
    
}
