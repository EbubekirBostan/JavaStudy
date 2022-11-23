package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*
        task>> Girilen 5 sayının 10 ile 20 arası hariç diğerlerinin toplamını hesap eden code create ediniz
         */
        Scanner sc=new Scanner(System.in);
        int toplam=0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Bir sayı giriniz");
            int x=sc.nextInt();
            if(x>=20 || x<=10){
                toplam+=x;
            }
        }
        System.out.println("toplam = " + toplam);


    }
}
