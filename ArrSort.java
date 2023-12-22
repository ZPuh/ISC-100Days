package Arrays;

import java.util.*;

public class ArrSort {

    public static void main(String[] args) {
//Tulis program Java untuk mengurutkan elemen-elemen dalam suatu array menggunakan
//algoritma pengurutan pilihan (selection sort).
        Scanner sc = new Scanner(System.in);
        int[] angka = new int[5];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka -" + (i + 1) + " : ");
            angka[i] = sc.nextInt();
        }
        System.out.println("Before Sorting : \n" + Arrays.toString(angka));

        Arrays.sort(angka);
        System.out.println("After Sorting : \n" + Arrays.toString(angka));
    }

}
