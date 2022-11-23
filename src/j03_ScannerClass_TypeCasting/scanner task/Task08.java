package j03_ScannerClass_TypeCasting.scanner;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Vize1 notunuzu giriniz");
        int vize1= input.nextInt();
        System.out.println("Vize2 notunuzu giriniz");
        int vize2=input.nextInt();
        System.out.println("Final notunuzu giriniz");
        int finalnot=input.nextInt();
        System.out.println("Geçme Notu = " + ((((vize1+vize2)/2)*0.3)+(finalnot*0.7)));





    }
}
