package J04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /*    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         bölümünü print eden code create ediniz. */
        Scanner sc=new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        int f=sc.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int g=sc.nextInt();
        int bolum=(f/g);
        System.out.println("bolum = " + bolum);


    }
}
