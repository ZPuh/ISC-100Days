package Arrays;

import java.util.*;

public class ArrGanjil {

    public static void main(String[] args) {
// Buat program Java untuk mencari jumlah bilangan ganjil dalam suatu array.
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Banyak Index : ");
        int index = sc.nextInt();
        int[] bilangan = new int[index];
        int jumlah = 0;
        System.out.println("Masukkan Angka : ");
        for (int i = 0; i < bilangan.length; i++) {
            System.out.print("Angka -" + (i + 1) + " : ");
            bilangan[i] = sc.nextInt();
        }
        System.out.print("Jumlah Angka Ganjil dari Array Tersebut : ");
        for (int i : bilangan) {
            if (i % 2 == 1) {
                jumlah += i;
            }
        }
        System.out.println(jumlah);  
    }

}
