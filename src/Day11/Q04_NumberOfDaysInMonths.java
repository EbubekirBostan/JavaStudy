package Day11;

import java.time.LocalDate;
import java.util.Scanner;

public class Q04_NumberOfDaysInMonths {
    public static void main(String[] args) {
        /*
Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

INPUT:
Ay Numarasi:
2
Yil :
2016
OUTPUT :
Subat 2016 29 Gundur.*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir yil Giriniz");
        int yil=sc.nextInt();
        System.out.println("Bir ay giriniz");
        int ay= sc.nextInt();
        LocalDate tarih=LocalDate.of(yil,ay,1);
        System.out.println(tarih.lengthOfMonth());
    }
}
