package Day02;

import java.util.Scanner;

public class Q2_Modulus {
    /*
     *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("5 basamaklı bir sayı giriniz");
        int a=sc.nextInt();
        int ilkiki=a/1000;
        int soniki=a%100;
        int b=ilkiki/10;
        int c=ilkiki%10;
        int d=soniki/10;
        int e=soniki%10;
        System.out.println(b+c+d+e);








    }
}
