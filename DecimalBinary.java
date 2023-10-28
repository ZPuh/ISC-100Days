package decimalbinary;
import java.util.Scanner;
public class DecimalBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int desimal,decimal;
        String biner,binary;
        //Program Decimal To Binary
        System.out.println("=====================");
        System.out.println("===DecimalToBinary===");
        System.out.println("---------------------");
        System.out.print("Decimal : ");
        desimal = sc.nextInt();        
        biner = Integer.toBinaryString(desimal);
        System.out.println("Binary : "+biner);
        System.out.println("=====================");
        System.out.println("");
        
        //Program Binary To Decimal
        System.out.println("=====================");
        System.out.println("===BinaryToDecimal===");
        System.out.println("---------------------");
        System.out.print("Binary : ");
        binary = sc.next();        
        decimal = Integer.parseInt(binary,2);
        System.out.println("Decimal : "+decimal);
        System.out.println("=====================");
        
                
    
    }
    
}
