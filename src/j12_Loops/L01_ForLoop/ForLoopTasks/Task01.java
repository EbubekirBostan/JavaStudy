package j12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
       		- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
       		- Sayi 5’in kati ise sayi yerine “CAN'dır” yazdirin.
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz
       		*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("100 den küçük tamsayı giriniz");
        int num=scanner.nextInt();
        for (int i = 1; i <=num ; i++) {
            if (i%3==0 && i%5==0){
                System.out.println(i+" JavaCAN");
            } else if (i%3==0) {
                System.out.println(i+" Java");

            } else if (i%5==0) {
                System.out.println(i+" Can");

            }else System.out.println(i+" Javasız Canımlar");

        }

    }
}
