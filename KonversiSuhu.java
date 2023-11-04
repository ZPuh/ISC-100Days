package konversisuhu;
import java.util.Scanner;
public class KonversiSuhu {
    public static void main(String[] args) {
        // Membuat Program Konversi suhu (Tugas 4 November)
        // Celcius , Fahrenheit , Kelvin , Reamur
        Scanner sc = new Scanner (System.in);                              
        double c,f,k,r;
        System.out.println("-----------------------");
        System.out.println("-----KONVERSI SUHU-----");
        System.out.println("-----------------------");
        System.out.println("Jenis Suhu : ");
        System.out.println("1. Celcius ");
        System.out.println("2. Fahrenheit ");
        System.out.println("3. Kelvin ");
        System.out.println("4. Reamur ");
        System.out.println("-----------------------");
        System.out.print("Pilihan 1  : ");
        int k1 = sc.nextInt();
        System.out.print("Pilihan 2  : ");
        int k2 = sc.nextInt();
        System.out.println("-----------------------");
        if (k1 >= 1 && k1 <= 4 && k2 >= 1 && k2 <= 4 ) {
            if (k1==1) {
                System.out.print("Celcius    : ");
                c = sc.nextDouble();            
            switch(k2){
                case 2:
                    f = (c * 9/5)+ 32;
                    System.out.println("Fahrenheit : "+f);
                    break;
                case 3:
                    k = c + 273.15;
                    System.out.println("Kelvin     : "+k);
                    break;
                case 4:
                    r = (4*c)/5;
                    System.out.println("Reamur     : "+r);
                    break;                                    
                }                    
            }else if(k1==2){
                System.out.print("Fahrenheit : ");
                f = sc.nextDouble();            
            switch(k2){
                case 1:
                    c = (f-32)* 5/9;
                    System.out.println("Celcius    : "+c);
                    break;
                case 3:
                    k = (f+459.67)* 5/9;
                    System.out.println("Kelvin     : "+k);
                    break;
                case 4:
                    r = (f-32)/2.25;
                    System.out.println("Reamur     : "+r);
                    break;
                }
            }else if(k1==3){
                System.out.print("Kelvin     : ");
                k = sc.nextDouble();            
            switch(k2){
                case 1:
                    c = k - 273.15;
                    System.out.println("Celcius    : "+c);
                    break;
                case 2:
                    f = (k*9/5)-459.67;
                    System.out.println("Fahrenheit : "+f);
                    break;
                case 4:
                    r =(k-273.15)*0.8;
                    System.out.println("Reamur     : "+r);
                    break;
                }
            }else{
                System.out.print("Reamur     : ");
                r = sc.nextDouble();            
            switch(k2){
                case 1:
                    c = r * 1.25;
                    System.out.println("Celcius    : "+c);
                    break;
                case 2:
                    f = (r*2.25)+32;
                    System.out.println("Fahrenheit : "+f);
                    break;
                case 3:
                    k = (r/0.8)+273.15;
                    System.out.println("Kelvin     : "+k);
                    break;
                }
            } 
        }else{
            System.out.println("Masukkan Angka (1-4)");
        }
            System.out.println("-----------------------");            
            System.out.println("----PROGRAM SELESAI----");            
            System.out.println("-----------------------");            
    }    
}