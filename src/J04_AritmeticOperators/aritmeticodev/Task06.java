package J04_AritmeticOperators.aritmeticodev;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *

         */
                Scanner sc=new Scanner(System.in);
        System.out.println("3 basamaklı bir sayi giriniz");
        int sayi2=sc.nextInt();
        System.out.println("Girdiğiniz sayının birler basamagi = " + sayi2%10);
        System.out.println("Girdiğiniz sayının onlar basamagi = " + (sayi2/10)%10);
        System.out.println("Girdiğiniz sayının yüzler basamagi = " + sayi2/100);



    }
}
