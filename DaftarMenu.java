package daftarmenu;
import java.util.Scanner;
public class DaftarMenu {
    public static void main(String[] args) {
        // Membuat Menu menggunakan Switch Statement
        Scanner scan = new Scanner (System.in);
        int makan,minum;
        double harga1=0,total,harga2=0;
        String menu;
        System.out.println("=====================");
        System.out.println("==   DAFTAR MENU   ==");
        System.out.println("=====================");
        System.out.println("A. MAKANAN\n1. Nasi Goreng\n2. Nasi Kuning\n3. Nasi Campur");
        System.out.println("---------------------");
        System.out.println("B. MINUMAN\n1. Es Teh\n2. Kopi\n3. Susu");
        System.out.println("---------------------");
        System.out.println("Masukkan pesanan : ");
        System.out.print("Makanan (0/1/2/3) : ");
        makan = scan.nextInt();
        System.out.print("Minuman (0/1/2/3) : ");
        minum = scan.nextInt();         
        switch (makan) {
            case 1:
                menu = "Nasi Goreng";
                harga1 = 7000;
                break;
            case 2:
                menu = "Nasi Kuning";
                harga1 = 10000;
                break;
            case 3:
                menu = "Nasi Campur ";
                harga1 = 12000;
                break;
            default:               
        }
        switch (minum) {
            case 1:
                menu = "Es Teh";
                harga2 = 5000;
                break;
            case 2:
                menu = "Kopi";
                harga2 = 7000;
                break;
            case 3:
                menu = "Susu";
                harga2 = 10000;
                break;
            default:   
        }
        total = harga1+harga2;
        System.out.println("---------------------");
        System.out.println("Total Harga : "+total);
        System.out.println("=====================");

    }
}       
            