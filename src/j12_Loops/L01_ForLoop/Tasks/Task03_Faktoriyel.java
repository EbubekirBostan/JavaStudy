package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task03_Faktoriyel {
    public static void main(String[] args) {
        /*
        Task ->> girilen sayının faktoriyelini hesaplayan method create ediniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int x=sc.nextInt();
        faktöriyel(x);




    }

    private static void faktöriyel(int x) {
        int fakt=1;
        for (int i=1 ; i<x+1 ; i++){
            fakt*=i;
        }
        System.out.println("faktoriyel : "+fakt);
    }
}
