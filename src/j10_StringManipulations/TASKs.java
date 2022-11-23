package j10_StringManipulations;

import java.util.Scanner;

public class TASKs {
    public static void main(String[] args) {
        //task>>> girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create ediniz
        //ternary kullan
       Scanner scan=new Scanner(System.in);
        System.out.println("Bir Cümle Giriniz");
        String cumle=scan.nextLine();
        System.out.println("Aradığınız kelimeyi giriniz");
        String kelime=scan.nextLine();
        String sonuc=(cumle.contains(kelime)? "True" : "False");
        System.out.println("sonuc = " + sonuc);

         /*
        task>>> girilen e mail hesabının @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        gmail.com ile bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesabı giriniz print eden code create ediniz
         */
        System.out.println("Lütfen e-mail hesabınızı giriniz");
        String email=scan.nextLine();
        String gmail="@gmail.com";
        String bitis="gmail.com";
        if (!(email.contains(gmail))){
            System.out.println("Lütfen gmail hesabı giriniz");
        } else if (email.endsWith(bitis)) {
            System.out.println("Hesabınız Onaylandı");
        }else System.out.println("Geçerli Bir Hesap Giriniz");


    }
}
