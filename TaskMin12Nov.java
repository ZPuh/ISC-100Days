package taskmin12nov;
import java.util.Scanner;
public class TaskMin12Nov {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Batas Akhir : ");
        int b = sc.nextInt();
        
        int j = 0;
        for (int i = 1; i <= b; i += 2) {
            j += i ;
             
            if (i<b-1) {
                System.out.print(i+"+");
            }else{
                System.out.print(i+"=");
            }
            
        }
        System.out.println(j);
        
    }    
}
