package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {
// TASK-> girilen bir tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi=scan.nextInt();
        String sonuc=(sayi>9 || sayi<-9) ? "Sayi 2 veya daha fazla basamaklı" : "Sayı tek basamaklı";
        System.out.println("sonuc = " + sonuc);





    }
}
