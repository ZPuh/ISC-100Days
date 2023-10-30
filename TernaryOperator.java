package ternaryoperator;
public class TernaryOperator {
    public static void main(String[] args) {
        //Ternary Operator
        //Operator ternary merupakan shorthand untuk percabangan if , tapi lebih singkat dan to the point. 
        int bil1,bil2;
        String hasil;
        
        //If Else        
        bil1 = 10;
        bil2 = 0;
        if (bil1>bil2) {
            System.out.println("Angka 1 > Angka 2");            
        }else if (bil1<bil2) {
            System.out.println("Angka 1 < Angka 2");
        }else{
            System.out.println("angka 1 = Angka 2");
        }                
        
        //Ternary Operator
        //variable = (condition) ? expressionTrue :  expressionFalse;  
        bil1 = 10;
        bil2 = 0;
        hasil = bil1 > bil2 ? "Angka 1 > Angka 2" : bil1 < bil2 ? "Angka 1 < Angka 2" : "Angka 1 = Angka 2";
        System.out.println(hasil);
    }
    
}
