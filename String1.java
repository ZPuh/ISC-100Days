package String;

public class String1 {

    public static void main(String[] args) {        
        String iniString = "Hello Adiks Adiks";
        
        // String CharAt
        char iniChar = iniString.charAt(10);
        System.out.println("Index ke 5 dari " + iniString + " Adalah " + iniChar);
        
        // length()
        int lengthString = iniString.length();
        System.out.println("length/size dari "+ iniString +" Adalah "+lengthString);
        
        // toLowerCase & toUpperCase
        System.out.println("toLowerCase : "+iniString.toLowerCase());
        System.out.println("toUpperCase : "+iniString.toUpperCase());
        
        // Contains
        boolean containsString1 = iniString.contains("Adiks");
        boolean containsString2 = iniString.contains("Adeks");
        System.out.println("Contains 'Adiks' : "+containsString1);
        System.out.println("Contains 'Adeks' : "+containsString2);
        
        
    }

}
