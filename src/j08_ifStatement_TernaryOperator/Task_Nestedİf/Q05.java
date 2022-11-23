package j08_ifStatement_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        Scanner sc=new Scanner(System.in);
        System.out.println(" Lütfen Yasinizi Giriniz : ");
        int yas=sc.nextInt();
        System.out.println(" Lütfen Kilonuzu Giriniz : ");
        int kilo=sc.nextInt();
        System.out.println(yas < 18 ? "kan bagisi yapamaz" : (yas >= 18 && kilo < 50) ? "kan bagisi yapamaz" : "kan bagisi yapabilr");












       /* if (yas>=18){

            if (kilo<50){
                System.out.println(" Kan Bagisi Yapamazsiniz ");
            }else System.out.println(" Kan Bagisi Yapabilirsiniz");
        }else System.out.println(" Kan Bagisi Yapamazsiniz ");

        */






    }

}
