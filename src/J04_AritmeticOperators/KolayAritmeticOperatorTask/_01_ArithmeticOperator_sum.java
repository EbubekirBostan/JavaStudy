package J04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         toplamını print eden code create ediniz. */
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num1=sc.nextInt();
        System.out.println("Bir sayı giriniz");
        int num2=sc.nextInt();
        int toplam=(num1+num2);
        System.out.println("Sayıların toplamı="+toplam);



    }
}
