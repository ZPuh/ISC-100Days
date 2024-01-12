package Method;

import java.util.Scanner;

public class MakeNegatif {

    /*
Dalam tugas sederhana ini Anda diberi nomor dan harus menjadikannya negatif. Tapi mungkinkah angkanya sudah negatif?

Contoh
Kata.makeNegative(1);  // return -1
Kata.makeNegative(-5); // return -5
Kata.makeNegative(0);  // return 0
Catatan
-Angkanya mungkin sudah negatif, sehingga tidak diperlukan perubahan.
-Nol (0) tidak dicentang untuk tanda tertentu. Angka nol negatif tidak masuk akal secara matematis.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Before : ");
        int angka = sc.nextInt();
        
        System.out.println("After : "+makeNegative(angka));
    }

    public static int makeNegative(int x) {
        if (x < 0) {
            return x;
        } else {
            return -x;
        }
    }
}
