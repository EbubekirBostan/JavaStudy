package j15_Arrays;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        //task-> girilen bir array elemanlarında ortalamadan büyük olan eleman sayısını print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("Kaç elemanlı Array istiyorsun");
        int arr[]=new int[sc.nextInt()];
        int toplam=0;


        for (int i = 0; i <arr.length ; i++) {
            System.out.println(i+". index elemanı giriniz");
            arr[i]=sc.nextInt();
            toplam+=arr[i];
        }
        int buykelsayisi=0;
        double ortlm=toplam/arr.length;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>ortlm){
                buykelsayisi++;
            }
        }
        System.out.println("buykelsayisi = " + buykelsayisi);


    }
}
