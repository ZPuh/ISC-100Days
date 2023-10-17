package day9;
import java.util.Scanner;
public class Day9 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        String nama,kelas,nim;
        int mmd,fsk,ddp,psti,pcsl,kwgn,bind,agm;
        double mean;
        System.out.println("=====RAPOR SEMESTER SATU=====");
        System.out.println("======BIODATA MAHASISWA======");
        System.out.print("NAMA  : ");
        nama = masuk.nextLine();
        System.out.print("KELAS : ");
        kelas = masuk.nextLine();
        System.out.print("NIM   : ");
        nim = masuk.nextLine();
        System.out.println("=============================");
        System.out.println("");
        System.out.println("============DAFTAR NILAI============ ");
        System.out.print("MATEMATIKA DASAR            : ");
        mmd = masuk.nextInt();
        System.out.print("FISIKA ELEKTRONIKA          : ");
        fsk = masuk.nextInt();
        System.out.print("DASAR DASAR  PEMROGRAMAN    : ");
        ddp = masuk.nextInt();
        System.out.print("SISTEM TEKNOLOGI INFORMASI  : ");
        psti = masuk.nextInt();
        System.out.print("PENDIDIKAN PANCASILA        : ");
        pcsl = masuk.nextInt();
        System.out.print("PENDIDIKAN KEWARGANEGARAAN  : ");
        kwgn = masuk.nextInt();
        System.out.print("PENDIDIKAN AGAMA            : ");
        agm = masuk.nextInt();
        System.out.print("BAHASA INDONESIA            : ");
        bind = masuk.nextInt();
        
        mean =(double)(mmd+fsk+ddp+psti+pcsl+kwgn+agm+bind)/8;
        System.out.println("RATA RATA                   : "+mean);
        System.out.println("====================================");
        System.out.println("Jadi Rata Rata Nilai Semester 1 "+nama+" adalah "+mean);
        
                
    
    }
    
}
