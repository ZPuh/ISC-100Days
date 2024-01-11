package Method;

import java.util.Scanner;

public class IsLove {

    /*
Timmy & Sarah merasa terhubung secara khusus, tetapi di tengah lingkungan mereka, 
kepastian hanya bisa didapatkan setelah mereka meraih kelopak bunga masing-masing. 
Apabila jumlah kelopak pada salah satu bunga merupakan bilangan genap, sementara 
bunga yang lain memiliki jumlah kelopak ganjil, itulah tanda bahwa mereka tengah 
berada dalam pelukan cinta.
    
Tulislah sebuah fungsi yang akan mengambil jumlah kelopak setiap bunga dan 
mengembalikan nilai true jika keduanya jatuh cinta dan false jika tidak jatuh cinta.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bunga 1 : ");
        int bunga1 = sc.nextInt();
        System.out.print("Bunga 2 : ");
        int bunga2 = sc.nextInt();
        boolean love = pengecekCinta(bunga1, bunga2);

        if (love) {
            System.out.println("Keduanya Jatuh Cinta");
        } else {
            System.out.println("Tidak Jatuh Cinta");
        }
    }

    public static boolean pengecekCinta(int bunga1, int bunga2) {
        return bunga1 % 2 != bunga2 % 2;
    }
}
