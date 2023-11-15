package array;
public class BertipePrimitif {
    public static void main(String[] args) {
        // Deklarasi array bertipe primitif
        
        // Deklarasi array bertipe int
        int[] arrayInt;
        
        arrayInt = new int[5];
        arrayInt[0] = 10;
        arrayInt[1] = 20;
        arrayInt[2] = 30;
        arrayInt[3] = 40;
        arrayInt[4] = 50;          
        
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Nilai array ke-" + i + " adalah " + arrayInt[i]);
        }         
        // Deklarasi array bertipe double
        double[] arrayDouble;
        
        arrayDouble = new double[5];          
        arrayDouble[0] = 10.5;
        arrayDouble[1] = 20.7;
        arrayDouble[2] = 30.2;
        arrayDouble[3] = 40.8;
        arrayDouble[4] = 50.3; 
        
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.println("Nilai array ke-" + i + " adalah " + arrayDouble[i]);
        }        
    }    
}