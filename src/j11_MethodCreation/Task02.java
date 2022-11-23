package j11_MethodCreation;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //Task03>>>>Girilen ad ve soyadın ilk harfleri büyük diğerlerini küçük yapan method create ediniz.
        Scanner scanner=new Scanner(System.in);
        System.out.print("Adınızı yazınız: ");
        String ad=scanner.next();
        System.out.print("Soyadınızı yazınız: ");
        String soyad=scanner.next();
        String sonhali=adsoyad(ad,soyad);
        System.out.println("Ad-Soyad = " + sonhali);


    }

    private static String adsoyad(String ad, String soyad) {
        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        return ad+" "+soyad;
    }


}
