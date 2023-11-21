package array;
import java.util.Scanner;
public class ArrSearch {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      int detect = 0 ;
      String[] a = {
        "Mangga","Durian","Jeruk",
        "Pepaya","Apel","Semangka"};
        for (String b : a) {
            System.out.print(b+" ");
        }
        System.out.println();
        System.out.print("Search : ");
        String search = sc.nextLine();
        for (int i = 0; i < a.length; i++) {
            if (search.equalsIgnoreCase(a[i])) {
                System.out.println("Index-"+i); 
                detect++;
            }            
        }
        if (detect == 0) {
            System.out.println("Data Tidak Ditemukan"); 
        }
    }    
}
