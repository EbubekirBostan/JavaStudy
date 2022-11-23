package Deneme02;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        int x=5;
        int y=6;
        int toplam=0;
        System.out.println("sum(x, y, toplam) = " + sum(x, y, toplam));
        sumVoid(x,y,toplam);

    }
    public static int sum(int x, int y, int toplam){
        toplam=x+y;
        return toplam;
    }
    public static void sumVoid(int x, int y, int toplam){
        toplam=x+y;
        System.out.println("sonuc = " + toplam);
    }
    
}
