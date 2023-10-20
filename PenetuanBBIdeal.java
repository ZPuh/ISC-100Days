package penetuanbbideal;
import java.util.Scanner;
public class PenetuanBBIdeal {
    public static void main(String[] args) {
        /*Ada 2 Cara Manghitung Berat badan ideal yaitu :
          1. Rumus BMI             
             BMI = bb/(tb^2)
          2. Rumus Broca
             L = (tb-100)-(10%(tb-10))
             P = (tb-100)-(15%(tb-10))*/
        Scanner input = new Scanner (System.in);
        double bb,tb,imt,broca;       
        String jk,kategori;
        System.out.println("====================================");
        System.out.println("PENENTUAN KATEGORI BERAT BADAN IDEAL");
        System.out.println("====================================");
        System.out.println("1. Laki-Laki (L) \n2. Perempuan (P)");
        System.out.println("------------------------------------");
        System.out.print("Masukkan Jenis Kelamin(L/P): ");
        jk = input.next();
        System.out.print("Masukkan Berat Badan (Kg)  : ");
        bb = input.nextDouble();
        System.out.print("Masukkan Tinggi Badan (Cm) : ");  
        tb = input.nextDouble();
        System.out.println("------------------------------------");
                
        if (jk.equalsIgnoreCase("L")) {
            System.out.println("BERAT BADAN IDEAL LAKI-LAKI");
            broca = (tb-100)-(0.1*(tb-100));
            tb /= 100;
            imt = bb/(tb*tb);
            if (imt<=17) {
           kategori="Berat Badan Kurang (Kurus)";
            }else if (imt<=23) {
           kategori="Berat Badan Normal (Ideal)";
            }else if (imt <= 27) {
           kategori="Kelebihan Berat Badan(Gemuk)";
            }else{
           kategori="Obesitas";
        }              
                     
        }else{
            System.out.println("BERAT BADAN IDEAL PEREMPUAN");
            broca = (tb-100)-(0.15*(tb-100));
            tb /= 100;
            imt = bb/(tb*tb);
           if (imt<=18) {
           kategori="Berat Badan Kurang (Kurus)";
            }else if (imt<=25) {
           kategori="Berat Badan Normal (Ideal)";
            }else if (imt <= 27) {
           kategori="Kelebihan Berat Badan (Gemuk)";
            }else{
           kategori="Obesitas"; 
            }
        }
        System.out.println("Indeks Massa Tubuh   : "+imt);
        System.out.println("Kategori Berat Badan : "+kategori);
        System.out.println("Berat Badan Ideal    : "+broca);
        System.out.println("====================================");
    
    }
      
}
