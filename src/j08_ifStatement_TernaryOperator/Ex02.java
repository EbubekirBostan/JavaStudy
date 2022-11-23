package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /*
 Kullanicidan 100 uzerinden notunu isteyin.
 Not'u harf sistemine cevirip yazdirin.
 50’den kucukse "D",
 =50  <60 arasi "C",
 =60  <80 arasi "B",
 =80’nin uzerinde ise "A"
 */
        Scanner sc=new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        int not=sc.nextInt();
      /*  if (not<0 || not>100){
            System.out.println("notunuzu yanlış girdiniz");
        } else if (not<50) {
            System.out.println("D");
        } else if (not<60) {
            System.out.println("C");
        } else if (not<80) {
            System.out.println("B");
        }else {
            System.out.println("A");

        }

       */
        // Başka çözüm

        if (not<0 ){
            System.out.println("notunuzu yanlış girdiniz");
        } else if (not<50) {
            System.out.println("D");
        } else if (not>=50 && not<60) {
            System.out.println("C");
        } else if (not>=60 && not<80) {
            System.out.println("B");
        }else if (not>80 && not<=100){
            System.out.println("A");
        }else {
            System.out.println("notunuzu yanlış girdiniz");
        }








    }
}
