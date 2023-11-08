package dowhile;
public class Dowhile {
    public static void main(String[] args) {
        // Do While Loop
        // Syntax
        /*
        do {
        
        } while (kondisi);
        */
        
        // Program Bilangan Genap Menggunakan do while loop
        int i = 1;
        do {            
            ++i;
            int z = i%2;
            if (z==0) {
                System.out.println("Bilangan Genap : "+i);
            }
        } while (i<=10);
    }
    
}
