package j10_StringManipulations;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
   Girilen passwordun aşagıdakişartları sağlamasını kontrol eden coden create ediniz
    a)Ilk karakteri buyuk harf olmalı
    b)Son karakteri sayi olamlı
    c)en az 6 karakter uzunlugunda olmalı

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Password enter");
        String pass=scan.next();
         if ((pass.charAt(0)>='A'&&pass.charAt(0)<='Z')&&
             (pass.charAt(pass.length()-1)>='0'&& pass.charAt(pass.length()-1)<='9')&&(pass.length()>=6)){
             System.out.println("Password Geçerli");
        }else System.out.println("Password Geçersiz");









    }
}
