package J04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _13_ArithmeticOperator_reminder3 {

    public static void main(String[] args) {

        /* Verilen iki int hakkında,
            num1'in num2'ye bölümünden kalanı yazdırınız.  */

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Tarih Giriniz (Yil Olarak)");
        String isim="";
        int d=sc.nextInt();
        int a=(d%4);
        int b=(d%100);
        int c=(d%400);
        isim= b==0 ? (c==0 ? "Artık Yıl" : "Artık Yıl Değildir") : (a==0 ? "Artık Yıl" : "Artık Yıl Değildir");
        System.out.println(isim);




        }


    }

