package Day07;

import java.util.Scanner;

public class Q07_DoWhile {/*
 Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
 ve x girildiğinde ise "Program bitti" yazan programı yazınız.
 */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char harf;
        do {
            System.out.println("Program Çalışıyor");
            System.out.println("bir harf giriniz");
            harf=sc.next().toLowerCase().charAt(0);

        }while(harf!='x');
        System.out.println("Game Over");

    }
}
