package Deneme01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
TASK => Girilen iki sayının EBOB ve EKOK larını print eden method yazınız.
Ekok(a,b)= |a*b|/ebob(a.b)
 */

public class C03_Deneme {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        int num1= sc.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int num2=sc.nextInt();
        System.out.println("obebBul(num1,num2) = " + obebBul(num1, num2));
        System.out.println("okek(num1,num2,obebE) = " + okek(num1, num2, obebBul(num1,num2)));
    }

    private static int obebBul(int num1, int num2) {
        List<Integer> obeb=new ArrayList<>();
        for (int i = 1; i <=Math.abs(Math.max(num1,num2)) ; i++) {
            for (int j = 1; j <=Math.abs(Math.min(num1,num2)) ; j++) {
                    if (num1%i==0 && num2%j==0){
                        if (i==j){
                            obeb.add(j);
                        }
                    }
                }
            }

        int obebE=obeb.get(obeb.size()-1);
        return obebE;
    }

    private static int okek(int num1, int num2, int obebE) {
        int okek=Math.abs(num1*num2)/obebE;
        return okek;
    }
}
