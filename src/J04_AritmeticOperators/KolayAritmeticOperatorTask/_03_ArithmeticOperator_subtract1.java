package J04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*     /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int a=sc.nextInt();
        System.out.println("Bir sayı giriniz");
        int b=sc.nextInt();
        int farkı=(a-b);
        System.out.println("farkı = " + farkı);


    }
}
