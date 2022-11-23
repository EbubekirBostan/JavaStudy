package j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        //Task>>> Girilen tamsayının tam bölen sayısını print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Tamsayı Giriniz = ");
        int num=sc.nextInt();
        int a=1;
        int bolAdet=0;
        while (a<=num){
            if (num%a==0){
                bolAdet++;
            }
            a++;

        }
        System.out.println("bolAdet = " + bolAdet);


    }
}
