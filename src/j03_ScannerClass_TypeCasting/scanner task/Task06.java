package j03_ScannerClass_TypeCasting.scanner;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner input=new Scanner(System.in);
        System.out.println("Birinci dik kenar");
        double dikkenar1=input.nextDouble();
        System.out.println("İkinci dik kenar");
        double dikkenar2=input.nextDouble();
        double hipotenus=Math.sqrt((dikkenar1*dikkenar1)+(dikkenar2*dikkenar2));
        System.out.println("hipotenus = " + hipotenus+" birimdir");
        





    }
}
