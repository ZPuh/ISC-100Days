package ArrayList;

import java.util.*;

public class NameList {

    public static void main(String[] args) {
        ArrayList<String> namaList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Beberapa Nama (Ketik 'selesai' untuk berhenti) : ");
        while (true) {
            String nama = sc.nextLine();
            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }
            namaList.add(nama);
        }
        System.out.println("\nDaftar Nama :");
        for (String nama : namaList) {
            System.out.println(nama);
        }
    }

}
