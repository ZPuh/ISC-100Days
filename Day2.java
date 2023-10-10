package day2;
public class Day2 {
    public static void main(String[] args) {
    /*Hy Kak,dihari kedua dikegiatan 100 hari ngoding. Saya akan membuat content 
      tipe data primitif.
      Tipe data primitif adalah tipe data yang menyimpan satu nilai seperti 
      digit, byte, atau karakter.Hari ini saya akan lebih fokus membahas tipe 
      data  nomor/angka*/                           
      // TIPE DATA NOMOR/ANGKA 
      // tipe data angka terbagi 2 yaitu :
      // 1. TIPE DATA BILANGAN BULAT
      // Contoh :
        System.out.println("===TIPE DATA BILANGAN BULAT===");
        byte inibyte = 1; 
        System.out.println("=====BYTE=====");
        System.out.println("Minimal nilai = "+ -128);
        System.out.println("Maximal nilai = "+ 127);
        short inishort = 1;
        System.out.println("=====SHORT=====");
        System.out.println("Minimal nilai = "+ -32768);
        System.out.println("Maximal nilai = "+ 32767);
        int iniinteger = 1;
        System.out.println("=====INTEGER=====");
        System.out.println("Minimal nilai = "+ -2147483648);
        System.out.println("Maximal nilai = "+ 2147483647);
        long inilong = 1L; // "L" untuk menandai bahwa ini adalah tipe data long
        System.out.println("=====LONG=====");
        System.out.println("Minimal nilai = "+ -9223372036854775808L);
        System.out.println("Maximal nilai = "+ 9223372036854775807L);
      // 2. TIPE DATA BILANGAN DESIMAL
      // Contoh : 
        System.out.println("===TIPE DATA BILANGAN DESIMAL===");
        float inifloat = 1.0F;//"F" untuk menandai bahwa ini adalah tipe data Float
        System.out.println("=====FLOAT=====");
        System.out.println("Minimal nilai = "+ 1.4E-45F);
        System.out.println("Maximal nilai = "+ 3.4028235E38F);
        double inidouble = 1.0;
        System.out.println("=====DOUBLE=====");
        System.out.println("Minimal nilai = "+ 4.9E-324);
        System.out.println("Maximal nilai = "+ 1.7976931348623157E308);   
        
        //Sekian dari saya Kak,Mohon maaf kalau ada kesalahan 
    }    
}