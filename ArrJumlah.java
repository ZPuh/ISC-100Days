package isc100days.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrJumlah {
    public static void main(String[] args) {
        /*Buat program Java yang membuat array integer dengan panjang 5. Isi array
        dengan nilai-nilai yang dimasukkan oleh pengguna. Program kemudian menghitung
        dan menampilkan jumlah semua elemen dalam array. */
        Scanner sc = new Scanner (System.in);
        int[] ArrayInt = new int [5];
        int total = 0;
        System.out.println("Masukkan Nilai Array : ");
        for (int i = 0; i < ArrayInt.length; i++) {
            System.out.print("Array "+(i+1)+" : ");
            ArrayInt[i] = sc.nextInt();
            total += ArrayInt[i];
        }
        System.out.println(Arrays.toString(ArrayInt));
        System.out.println("Jumlah  : "+total);
    }
    
}
