package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // girilen sayının negatif pozitifliğini kontrol ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi=sc.nextInt();
        if (sayi>0) {
            System.out.println("sayı pozitiftir");
        } else if (sayi==0) {
            System.out.println("sayı sıfıra eşittir");
        }
        else {
            System.out.println("sayı negatiftir");
        }
    }
}
