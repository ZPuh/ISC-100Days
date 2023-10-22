package jenissegitiga;
import java.util.Scanner;
public class JenisSegiTiga {
    public static void main(String[] args) {
        //  JENIS SEGITIGA BERDASARKAN PANJANG SISI
        // 1. Segitiga sama sisi 
        //    semua panjang sisinya bernilai sama
        // 2. Segitiga sama kaki
        //    dua panjang sisinya bernilai sama
        // 3. Segitiga sembarang
        //    semua panjang sisinya tidak bernilai sama
        Scanner input = new Scanner (System.in);
        int sisi1,sisi2,sisi3;
        String jenis;
        System.out.println("===============================");
        System.out.println("PENENTUAN JENIS SEGITIGA");
        System.out.println("===============================");
        System.out.println("1. Segitiga Sama Sisi \n2. Segitiga Sama Kaki \n3. Segitiga Sembarang");
        System.out.println("-------------------------------");
        System.out.print("Masukkan Panjang Sisi 1 : ");
        sisi1 = input.nextInt();
        System.out.print("Masukkan Panjang Sisi 2 : ");
        sisi2 = input.nextInt();
        System.out.print("Masukkan Panjang Sisi 3 : ");
        sisi3 = input.nextInt();
        System.out.println("-------------------------------");
        
        if (sisi1 <= 0 || sisi2 <= 0  ||sisi3 <= 0) {
            jenis = "Kesalahan !!!";
        }else if (sisi1 == sisi2 && sisi2 == sisi3) {
            jenis = "Segitiga Sama Sisi";
        }else if(sisi1 == sisi2 || sisi2 == sisi3 || sisi3 == sisi1){
            jenis = "Segitiga Sama Kaki";
        }else{
            jenis = "Segitiga Sembarang";
        }
        System.out.println("Jenis Segitiga : "+jenis);
        System.out.println("===============================");
    }
    
}
