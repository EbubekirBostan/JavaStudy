package j03_ScannerClass_TypeCasting.scanner;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*  kullanıcını sevdiği meyveyi print eden code create ediniz  */
        Scanner scan=new Scanner(System.in);
        System.out.println("En sevdiginiz meyveyi giriniz");
        String meyve=scan.nextLine();
        System.out.println("meyve = " + meyve);


    }
}
