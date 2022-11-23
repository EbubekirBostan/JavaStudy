package J04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _05_ArithmeticOperator_sum3 {

    public static void main(String[] args) {

          /*    kullanıcıdan alınan 3 tane int
         toplamını print eden code create ediniz. */

        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int c=sc.nextInt();
        System.out.println("bir sayı giriniz");
        int d=sc.nextInt();
        System.out.println("bir sayı giriniz");
        int e=sc.nextInt();
        int plus=(c+d+e);
        System.out.println("plus = " + plus);


    }
}
