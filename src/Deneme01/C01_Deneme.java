package Deneme01;

import java.util.Scanner;

public class C01_Deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayı giriniz : ");
        int tamSayi = scan.nextInt();
        System.out.println("faktoriyelH(tamSayi) = " + faktoriyelH(tamSayi));


    }
  public static int faktoriyelH(int a){
        int faktoriyel=1;
      for (int i = 1; i <=a ; i++) {
          faktoriyel*=i;
      }
      return faktoriyel;
  }
}
