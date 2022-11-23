package j03_ScannerClass_TypeCasting.scanner;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Günde kaç saat uyuyorsunuz");
        double saat=input.nextDouble();
        double ay=(saat/24)*30;
        double yil=ay*12;
        double kirkyil=yil*40;
        System.out.println("Ayda = " + ay+" "+"Gün uyuyorsunuz");
        System.out.println("Yilda = " + yil+" "+"Gün uyuyorsunuz");
        System.out.println("Kirkyilda = " + kirkyil+" "+"Gün uyuyorsunuz");

    }
}
