package J04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        double h=sc.nextDouble();
        System.out.println("Bir sayı giriniz");
        double i=sc.nextDouble();
        System.out.println("Bir sayı giriniz");
        double k=sc.nextDouble();
        double sonuc=(h*i*k);
        System.out.println("sonuc = " + sonuc);


    }
}
