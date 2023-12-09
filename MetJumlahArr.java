package isc100days.Method;

import java.util.Arrays;

public class MetJumlahArr {

    public static void main(String[] args) {
        /*Tuliskan method Java yang menerima dua array integer sebagai parameter
        dan mengembalikan array yang berisi hasil penjumlahan elemen-elemen kedua
        array tersebut. */
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};

        int[] Hasiljumlah = JumlahArray(a, b);
        System.out.println("Array 1 : " + Arrays.toString(a));
        System.out.println("Array 2 : " + Arrays.toString(b));
        System.out.println("Hasil   : " + Arrays.toString(Hasiljumlah));
    }

    private static int[] JumlahArray(int[] a, int[] b) {
        int[] hasil = new int[5];

        for (int i = 0; i < hasil.length; i++) {
            hasil[i] = a[i] + b[i];
        }

        return hasil;
    }
}
