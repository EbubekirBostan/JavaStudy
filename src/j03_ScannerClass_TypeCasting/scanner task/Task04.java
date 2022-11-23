package j03_ScannerClass_TypeCasting.scanner;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("İsim ve Soyisim");
        String isim=input.nextLine();
        System.out.println("Yas");
        int yas=input.nextInt();
        System.out.println("kilo");
        int kilo=input.nextInt();
        System.out.println("boy");
        int boy=input.nextInt();
        System.out.println("salona devam edecegi ay sayisi");
        int ay=input.nextInt();
        System.out.println("İsim Soyisim :"+isim+", Yas :" +yas+",  Kilo:"+kilo+ ", Boy :"+boy+",Ücretiniz :"+(ay*20)+ "$");

    }
}
