package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /*
        Girilen iki sayı arasındaki çift sayıları print eden code create ediniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz");
        int x=sc.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int y=sc.nextInt();

        for (int i=(x<y?x:y) ; i<=(x>y?x:y) ; i++){
            if (i%2==0){
                System.out.println(i+ " Çift sayıdır");
            }else System.out.println(i+" Tek sayidir");
        }



    }
}
