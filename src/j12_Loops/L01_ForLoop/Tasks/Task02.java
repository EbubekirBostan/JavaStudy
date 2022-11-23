package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        Girilen ifadenin polindrome olmasını control eden method create ediniz
        polindrome= Her iki yönde okunduğunda eşit olan ifadeler
        ör:"Ey Edip Adana da Pide ye"
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir İfade Giriniz");
        String str=sc.nextLine();
        polindrome(str);
    }

    private static void polindrome(String str) {
      String strTers="";
        for (int i =str.length()-1; i >=0 ; i--) {
            strTers+=str.charAt(i);
        }
        System.out.println("Girilen İfadenin Tersi = "+strTers);
        if (str.equalsIgnoreCase(strTers)){
            System.out.println("Polindrome'dur");
        }else System.out.println("Polindrome NAU NAU");
    }
}
