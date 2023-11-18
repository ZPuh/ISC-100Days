package array;
import java.util.Scanner;
public class ArrScan {
    public static void main(String[] args) {
        // Membuat Array Menggunakan Scanner
        Scanner sc = new Scanner (System.in);
        System.out.print("Jumlah Index : ");
        int jml_index = sc.nextInt();
        int [] arr = new int [jml_index];
        System.out.println("Input");
        System.out.println("--------------");
        for (int i = 0; i < jml_index; i++) {
            System.out.print("index-"+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("--------------");
        System.out.println("Output");
        for (int i = 0; i < jml_index; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
