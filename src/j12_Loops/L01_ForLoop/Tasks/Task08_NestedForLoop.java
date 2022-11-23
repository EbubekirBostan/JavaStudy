package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task08_NestedForLoop {
    public static void main(String[] args) {
        /*
        task>> boyutta kare çarpım tablosu print eden code create ediniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int a=sc.nextInt();
        for (int i=1; i<=a; i++){
            for (int j=1; j<=a; j++){
                System.out.print(" "+(i*j));
            }
            System.out.println();



    }
}}
