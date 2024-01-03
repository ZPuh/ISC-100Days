package ArrayList;

import java.util.ArrayList;

public class ArrayList2 {

    public static void main(String[] args) {
        ArrayList<String> buah = new ArrayList<>();

        buah.add("Pisang");
        buah.add("Durian");
        buah.add("Mangga");
        buah.add("Rambutan");
        buah.add("Salak");

        // Ukuran (size)
        System.out.println(buah.size()); // 5

        //Mengubah item
        buah.set(2, "Jeruk"); // [Pisang, Durian, Jeruk, Rambutan, Salak]
        System.out.println(buah);

        // Menghapus item
        // Menghapus berdasarkan indeks
        buah.remove(1);
        System.out.println(buah); // [Pisang, Jeruk, Rambutan, Salak]
        // Menghapus berdasarkan nilai
        buah.remove("Salak");
        System.out.println(buah); // [Pisang, Jeruk, Rambutan]
        // Menghapus semua elemen
        buah.clear();
        System.out.println(buah); // []

    }

}
