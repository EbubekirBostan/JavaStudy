package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {
    /* taskk> girilen yaşın 18 dn büyüklüğünü kontrol eden code create ediniz.

     */
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz");
        int yas=sc.nextInt();
        if (yas>18) {
            System.out.println("Ehliyet alabilirsiniz");
        }
        else  {
            System.out.println("Ehliyet alamazsınız");


        }*/
        //girilen yaşın 18 dn büyüklüğünü kontrol eden code create ediniz. küçükse ehliyet alamazsınız
        Scanner sc=new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz");
        int yas=sc.nextInt();
        if (yas>=18) {// girilen yaşın 18 den büyük ve eşit olmasını kontrol eder
            System.out.println("yaşınız 18 den küçük değil");
        }
        else  {
            System.out.println("Ehliyet alamazsınız");// if şartı sağlamazsa >yaş 18 den büyük ve eşit değil
            //yasın  18 den küçük olması

        }



















    }
}
