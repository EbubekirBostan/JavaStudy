package j03_ScannerClass_TypeCasting.scanner;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

        Scanner input=new Scanner(System.in);
        System.out.println("Kilonuz");
        byte kilo=input.nextByte();
        System.out.println("kilo = " + kilo);


    }
}
