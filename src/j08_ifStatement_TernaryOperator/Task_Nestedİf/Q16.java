package j08_ifStatement_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Birinci Sayiyi Giriniz");
        int i1=sc.nextInt();
        System.out.println("Ikinci Sayiyi Giriniz");
        int i2=sc.nextInt();
        System.out.println("Ucuncu Sayiyi Giriniz");
        int i3=sc.nextInt();
        System.out.println( i1>i2 && i1>i3?(i1): i2>i3 ?(i3):(i2));





      /*  if ((i1>i2)&&(i1>i3)){
            System.out.println("En Büyük Sayi = " + i1);
            if (i2>i3){
                System.out.println("En Küçük Sayi = " + i3);
            }else System.out.println("En Küçük Sayi = " + i2);
        } else if ((i2>i1)&&(i2>i3)) {
            System.out.println("En Büyük Sayi = " + i2);
            if (i1>i3){
                System.out.println("En Küçük Sayi = " + i3);
            }else System.out.println("En Küçük Sayi = " + i1);
        } else if((i3>i1)&&(i3>i2)){
            System.out.println("En Büyük Sayi = " + i3);
            if (i1>i2){
                System.out.println("En Küçük Sayi = " + i2);
            }else System.out.println("En Küçük Sayi = " + i1);
        }

       */


    }
}

