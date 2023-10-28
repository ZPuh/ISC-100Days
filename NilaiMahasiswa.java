package nilaimahasiswa;
import java.util.Scanner;
public class NilaiMahasiswa {
    public static void main(String[] args) {
        //Program Input Nilai Mahasiswa
        //NB : Rata-rata diperoleh dari 30% nilai presensi,30% nilai tugas,dan 40% nilai UAS
        Scanner sc = new Scanner (System.in);
        String nim,nama,matkul;
        double absen,tugas,uas,rata;
        System.out.println("=====================");
        System.out.println("===Nilai Mahasiswa===");
        System.out.println("---------------------");
        System.out.print("NIM            : ");
        nim = sc.nextLine();
        System.out.print("Nama           : ");
        nama = sc.nextLine();
        System.out.print("Mata Kuliah    : ");
        matkul = sc.nextLine();
        System.out.print("Nilai Presensi : ");
        absen = sc.nextDouble();
        System.out.print("Nilai Tugas    : ");
        tugas = sc.nextDouble();
        System.out.print("Nilai UAS      : ");
        uas = sc.nextDouble();
        rata = 0.3*absen+0.3*tugas+0.4*uas;
        System.out.println("Rata-Rata      : "+rata);
        System.out.println("======================");
    }
    
}
