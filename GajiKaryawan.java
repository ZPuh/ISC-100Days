package gajikaryawan;
import java.util.Scanner;
public class GajiKaryawan {
    public static void main(String[] args) {
        //PROGRAM UNTUK MENGHITUNG GAJI KARYAWAN
        //Petunjuk:
        /*
        1. Gaji dasar dihitung dengan mengalikan jumlah jam kerja dengan tarif 
        per jam.
        2. Jika karyawan bekerja lebih dari 40 jam, maka jam kerja lembur 
        dihitung sebagai selisih dari jumlah jam kerja dengan 40 jam, dan tarif 
        lembur adalah 1,5 kali tarif per jam.
        3. Jika karyawan bekerja 40 jam atau kurang, tidak ada lembur.*/         
        Scanner input = new Scanner (System.in);
        String nama;
        double jam,tarif,gjdasar,gjtotal=0,lembur,trlembur,gjlembur;
        System.out.println("===========================");
        System.out.println("PROGRAM PENGGAJIAN KARYAWAN");
        System.out.println("===========================");
        System.out.print("NAMA KARYAWAN     : ");
        nama = input.nextLine();
        System.out.print("JAM KERJA/(PEKAN) : ");
        jam = input.nextDouble();
        System.out.print("GAJI/(JAM)        : ");
        tarif = input.nextDouble();
        System.out.println("---------------------------");
        gjdasar = jam*tarif;        
        if (jam<=0 || tarif <=0) {            
            System.out.println("Jam Kerja Dan Tarif Harus Lebih Dari 0");            
        }else{            
            if (jam>40) {                
            lembur = jam-40;
            trlembur = tarif*1.5;
            gjlembur = lembur*trlembur;
            gjtotal = 4*(gjdasar+gjlembur);            
            }else{                
            gjtotal = 4*(gjdasar);            
            }        
        }        
        System.out.println("HASIL PERHITUNGAN GAJI");
        System.out.println("---------------------------");
        System.out.println("NAMA KARYAWAN     : "+nama);
        System.out.println("GAJI/(JAM)        : "+tarif);
        System.out.println("JAM KERJA/(PEKAN) : "+jam);
        System.out.println("TOTAL GAJI (BULAN): "+gjtotal); 
        System.out.println("===========================");
    
    }
    
}
