package day5;
public class Day5 {
    public static void main(String[] args) {
  // Type Casting (Konversi Tipe Data)
  // Konveksi Otomatis 
  // byte -> short -> int -> long -> float -> double
     byte inibyte = 96;
     System.out.println(inibyte);
     short inishort = inibyte;//karna wadah short>byte maka otomatis terkonveksi
     System.out.println(inishort);
     int iniint = inishort;
     System.out.println(iniint);
     long inilong = iniint;
     System.out.println(inilong);
     float inifloat = inilong;
     System.out.println(inifloat);
     double inidouble = inifloat;
     System.out.println(inidouble); 
  // Konveksi Manual
  // double -> float ->long -> int -> short -> byte
     double inidouble2 = 111.1111111;
     System.out.println(inidouble2);
     float inifloat2 = (float)inidouble2;//karna wadah double>float maka kita
     System.out.println(inifloat2);    //harus konveksi secara manual       
     long inilong2 = (long)inifloat2;
     System.out.println(inilong2);
     int iniint2 = (int)inilong2;
     System.out.println(iniint2);
     short inishort2 = (short)iniint2;
     System.out.println(inishort2);
     byte inibyte2 = (byte)inishort2;
     System.out.println(inibyte2); // output 111
}}