package String;

import java.util.Scanner;

public class Banjo {

    /*
Buatlah suatu fungsi yang dapat menanggapi pertanyaan "Apakah Anda bermain banjo?".    
Jika nama Anda dimulai dengan huruf "R" atau huruf kecil "r", maka itu berarti Anda sedang bermain banjo!    
Fungsi ini menerima nama sebagai satu-satunya argumen, dan akan mengembalikan salah satu dari dua string berikut:
- `name + " bermain banjo"`
- `name + " tidak bermain banjo"`
Pastikan bahwa nama yang diberikan selalu merupakan string yang valid.  
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Apakah Anda bermain banjo?");
        System.out.print("Nama : ");
        String name = sc.nextLine();
        System.out.println(areYouPlayingBanjo(name));

    }

    public static String areYouPlayingBanjo(String name) {
        return (name.charAt(0) == 'R' || name.charAt(0) == 'r') ? name + " bermain banjo" : name + " tidak bermain banjo";
    }
}
