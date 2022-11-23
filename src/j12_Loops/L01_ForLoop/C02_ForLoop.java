package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        //Task >>> Girilen Sayıdan 100 ekadar 4 ün katı olan tamsayıları print ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi=sc.nextInt();
        if (sayi>100){
            System.out.println("100 den küçük sayı giriniz");
        }else {
            for (int i=sayi; i<100 ; i++){
                if (i%4==0){
                    System.out.print(i+" ");
                }
            }
        }








    }
}
