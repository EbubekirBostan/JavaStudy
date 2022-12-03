package j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class JavaTekrar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        int sayi=sc.nextInt();
        int tplm=0;
        do {
            tplm=sayi%10;
            sayi=sayi/10;
        }while(sayi>0);
    }
}
