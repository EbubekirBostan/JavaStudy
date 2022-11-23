package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        /*
        TASK -> girilen iki sayıyı seçilen dört işlemden birini uygulayıp sonucu print eden kod create ediniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz = ");
        double num1=sc.nextDouble();
        System.out.print("ikinci sayı giriniz = ");
        double num2=sc.nextDouble();
        System.out.println("+ için 1, \n * için 2, \n - için 3, \n / için 4 ü giriniz");
       int secim=sc.nextInt();
        if (secim==1){
            System.out.println("toplama sonucu : " + num1 +"+" + num2 + "=" + (num1+num2));
        } else if (secim==2) {
            System.out.println("çarpma sonucu : "+ num1 +"*" +num2 + "="+ (num1*num2));
            } else if (secim==3) {
            System.out.println("çıkarma sonucu : "+ num1 +"-" +num2 + "="+ (num1-num2));
        } else if (secim==4) {
            System.out.println("bölme sonucu : "+ num1 +"/" +num2 + "="+ (num1/num2));
        }else {
            System.out.println("yanlış seçim yaptınız");
        }


    }
}
