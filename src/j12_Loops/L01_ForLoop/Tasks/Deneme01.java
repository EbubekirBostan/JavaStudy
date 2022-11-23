package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Deneme01 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Harf Giriniz");
        int sayi=sc.nextLine().toUpperCase().charAt(0);
        System.out.println("kaç defa dönsün");
        int dongu=sc.nextInt();

        for (int i =0; i <=dongu ; i++) {
            for (int j=0; j <=i ; j++) {
                System.out.print((char) (sayi+i)+" ");
            }
            System.out.println();


        }






    }
}
