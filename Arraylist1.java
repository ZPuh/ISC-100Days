package ArrayList;

import java.util.ArrayList;

public class Arraylist1 {

    public static void main(String[] args) {
        // Membuat Arraylist
        ArrayList<String> Buah = new ArrayList<>();

        // Menambahkan item di ArrayList
        Buah.add("Pisang");
        Buah.add("Durian");
        Buah.add("Mangga");

        System.out.println(Buah); //[Pisang, Durian, Mangga]

        Buah.add(0, "Rambutan");
        System.out.println(Buah); //[Rambutan, Pisang, Durian, Mangga]

        Buah.add(2, "Salak");
        System.out.println(Buah); //[Rambutan, Pisang, Salak, Durian, Mangga]

        // Mengakses item dari ArrayList.              
        System.out.println(Buah.get(0)); //Rambutan
        System.out.println(Buah.get(1)); //Pisang
        System.out.println(Buah.get(2)); //Salak
        System.out.println(Buah.get(3)); //Durian
        System.out.println(Buah.get(4)); //Mangga
    }

}
