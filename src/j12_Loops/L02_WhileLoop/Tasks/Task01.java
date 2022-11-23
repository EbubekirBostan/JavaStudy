package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */
    Scanner sc=new Scanner(System.in);
    int toplam=0;
    int sayiAdet=0;
    while (toplam<334){
        System.out.println("Bir Sayi Giriniz : ");
        int gsayi=sc.nextInt();
        toplam+=gsayi;
        sayiAdet++;
    }
        System.out.println("Girdiğiniz sayı adeti : "+sayiAdet+" olup Toplamı : "+toplam);


    }
}
