package array;
import java.util.Scanner;
public class ArrBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        String[] judul = {"Atomic Habits", "Laut Bercerita", "Cantik Itu Luka", "Filosofi Teras", "Gadis Kretek"};
        int[] stok = {10, 8, 0, 12, 15};       
        System.out.println("--- Inventaris Buku ---");
        for (int i = 0; i < judul.length; i++) {
            System.out.println(judul[i] + ": " + stok[i] + " eksemplar");
        }
        System.out.print("\nMasukkan judul buku yang ingin dipinjam: ");
        String buku = sc.nextLine();
        boolean Tersedia = false;
        for (int i = 0; i < judul.length; i++) {
            if (judul[i].equalsIgnoreCase(buku)) {
                if (stok[i] > 0) {
                    stok[i]--; 
                    System.out.println("Peminjaman berhasil. Sisa stok " + buku + ": " + stok[i] + " eksemplar.");
                } else {
                    System.out.println("Maaf, stok " + buku + " habis.");
                }
                Tersedia = true;
                break;
            }
        }
        if (!Tersedia) {
            System.out.println("Buku dengan judul '" + buku + "' tidak ditemukan.");
        }
    }
}