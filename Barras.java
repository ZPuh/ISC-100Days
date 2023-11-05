package barras;
import java.util.Scanner;
public class Barras {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long rp,t=0;
        int br;
        double ds;
        System.out.println("------------------");                     
        System.out.println("TOKO BERAS BAGOGO");                     
        System.out.println("------------------");                          
        System.out.println(">>>>>PROMO!!!<<<<<");
        System.out.println("------------------");
        System.out.println("Harga Rp. 500.000/karung");
        System.out.println("Diskon 3% Jika Membeli >= 150 Karung");
        System.out.println("Diskon 7% Jika Membeli >= 300 Karung");
        System.out.println("Sangat Murah Bukan ?");
        System.out.println("Ayo Beli Sebelum Kehabisan!");
        
        rp = 500000l;
        System.out.println("------------------");
        System.out.print("Jumlah Beras :");
        br = sc.nextInt();        
        ds = 0;
        
        if (br>=150&&br<300) {
            System.out.println("------------------");
            System.out.println("Anda Mendapatkan Diskon 3%");
            ds = 0.03*(rp*br);
            long ds2 = (long)ds;
            t =(rp*br)-ds2;                        
        }else if (br>=300) {
            System.out.println("------------------");
            System.out.println("Anda Mendapatkan Diskon 7%");
            ds = 0.07*(rp*br);            
            long ds2 = (long)ds;            
            t =(rp*br)-ds2;
        }else{
            System.out.println("------------------");
            System.out.println("Anda Tidak Mendapatkan Diskon");
            t = rp*br;
        }        
        System.out.println("Harga Yang Harus Anda Bayar Adalah Rp."+t);
        System.out.println("-------------------");
    }    
}