package ifstatement;
public class IfStatement {
    public static void main(String[] args) {
        // If Statement (Percabangan)
        // If Else Statement
        
        System.out.println("=======================");
        int a,b;
        a = 75;
        System.out.println("A = "+a);
        
        if (a<100) {
            System.out.println("A < 100");
        }else{
            System.out.println("A > 100");
        }
        System.out.println("Selesai");
        System.out.println("=======================");
        
        // Else If statement
        
        b = 120;
        System.out.println("B = "+b);
        
        if (b<100) {
            System.out.println("B < 100");
        }else if (b<200&&b>100) {
            System.out.println("B > 100 & B < 200");
        }else{
            System.out.println("B > 200");
        }
        System.out.println("Selesai");
        System.out.println("=======================");
        
        // Nested If (If Bercabang)
        
        if (a<100) {
            System.out.println("A < 100");
            if (b<100) {
            System.out.println("B < 100");    
            }else{
            System.out.println("B > 100");    
            }
        }else{
            System.out.println("A > 100");    
        }
        System.out.println("Selesai");
        System.out.println("=======================");
    }
    
}