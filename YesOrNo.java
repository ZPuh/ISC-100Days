package Method;

import java.util.Scanner;

public class YesOrNo {
/*
Input  |  Output 
 true  -> Yes
 false -> No
*/    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("true/false : ");
        boolean b = sc.nextBoolean();
        
        System.out.println("output : "+boolToWord(b));
    }
    
    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }
}
