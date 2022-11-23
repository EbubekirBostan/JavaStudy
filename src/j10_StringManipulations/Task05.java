package j10_StringManipulations;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /* Task->
Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Ad-Soyad Giriniz");
        String firstName=scan.next(),lastname=scan.next();
        System.out.println(firstName.toUpperCase().charAt(0)+firstName.substring(1));
        System.out.println(lastname.toUpperCase().charAt(0)+lastname.substring(1));
        //veya
        System.out.println(firstName.toUpperCase().substring(0,1)+firstName.substring(1));
        System.out.println(lastname.toUpperCase().substring(0,1)+lastname.substring(1));











    }
}
