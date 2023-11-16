package array;
public class NonPrimitif {
    public static void main(String[] args) {
        //Deklarasi Array Bertipe Non Primitif
        String[] Buah;
        Buah = new String [4];
        Buah[0] = "Apel";
        Buah[1] = "Mangga";
        Buah[2] = "Durian";
        Buah[3] = "Pisang";
        
        for (int i = 0; i < Buah.length; i++) {
            System.out.println("Buah Ke-"+(i+1)+" adalah "+Buah[i]);
        }
        
    }    
}
