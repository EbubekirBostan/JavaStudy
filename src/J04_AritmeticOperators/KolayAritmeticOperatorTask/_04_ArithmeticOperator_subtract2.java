package J04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int n1=sc.nextInt();
        System.out.println("ikinci sayı giriniz");
        int n2=sc.nextInt();
        System.out.println("üçüncü sayı giriniz");
        int n3=sc.nextInt();
        System.out.println("dördüncü sayı giriniz");
        int n4=sc.nextInt();
        int Farklar=(n1-n2-n3-n4);
        System.out.println("Farklar = " + Farklar);


    }
}
