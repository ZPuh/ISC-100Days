package jmlhharidlmbulan;
import java.util.Scanner;
public class JmlhHariDlmBulan {
    public static void main(String[] args) {
        //Membuat Program Jumlah Hari dalam bulan dengan menggabungan percabangan
        // ( if statement,switch statement,ternary operator)
        Scanner input = new Scanner(System.in);        
        System.out.print("Masukkan angka bulan (1-12): ");
        int bulan = input.nextInt();          
        String hari = null;
        if (bulan >= 1 && bulan <= 12) {
          switch (bulan) {
            case 1,3,5,7,8,10,12:
                hari = "31";
                break;
            case 4,6,9,11:
                hari = "30";
                break;
            default:
                hari = "28 atau 29";                                           
            }                 
        } else{
          System.out.println("Masukkan angka bulan yang valid (1-12).");
          System.exit(0);     
        }
        String nama_bulan = bulan==1 ? "Januari" :
                            bulan==2 ? "February": 
                            bulan==3 ? "Maret": 
                            bulan==4 ? "April" : 
                            bulan==5 ? "Mey" : 
                            bulan==6 ? "Juni" : 
                            bulan==7 ? "Juli" :
                            bulan==8 ? "Agustus":
                            bulan==9 ? "September" : 
                            bulan==10? "Oktober":
                            bulan==11? "November":
                            "Desember";           
        System.out.println(nama_bulan + " memiliki " + hari + " hari.");          
        input.close();          
    }
}
