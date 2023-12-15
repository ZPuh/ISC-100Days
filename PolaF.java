package Looping;

public class PolaF {

    public static void main(String[] args) {
        int f = 5;
        
        for (int i = 0; i < f; i++) {
            System.out.print("*");
            
            if (i == 0 || i == f / 2) {
                
                for (int j = 0; j < f - 1; j++) {
                    System.out.print("*");
                    
                }
            }

            System.out.println();
        }
    }
}
