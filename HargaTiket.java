package hargatiket;
import java.util.Scanner;
public class HargaTiket {
    public static void main(String[] args) {
        // Membuat Penentuan Harga Tiket Transportasi
        Scanner input = new Scanner (System.in);
        int kategori,jarak;
        float harga=0;
        String spesies=null;
        System.out.println("=====================");
        System.out.println("====TERMINAL BIJI====");
        System.out.println("---------------------");
        System.out.println("KATEGORI PENUMPANG :\n1. Anak-anak\n2. Dewasa\n3. Lansia");
        System.out.println("---------------------");
        System.out.print("Kategori(1-3): ");
        kategori = input.nextInt();
        System.out.print("Jarak (Km)   : ");
        jarak = input.nextInt();
        System.out.println("---------------------");
        
        if (jarak>0) {
            switch (kategori) {
                case 1:
                    harga = jarak * 250f;
                    spesies = " Anak-Anak ";
                    break;
                case 2:
                    harga = jarak * 500f;
                    spesies = " Dewasa ";
                    break;
                case 3:
                    harga = jarak * 400f;
                    spesies = " Lansia ";
                    break;
                default:
                    System.out.println("Kategori Tidak Valid!!!");
                    System.out.println("---------------------");
            }
        }else{
            System.out.println("Jarak Tidak Valid!!!");
            System.out.println("---------------------");
        }
        System.out.println("Harga Tiket : ");   
        System.out.println("---------------------");
        System.out.println("Kategori :"+spesies);   
        System.out.println("Jarak    : "+jarak+" Km");   
        System.out.println("Harga    : Rp."+harga);  
        System.out.println("=====================");
    }    
}
