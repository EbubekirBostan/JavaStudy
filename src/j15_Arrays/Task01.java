package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task->Kullanıcıdan alınan datalarla bir int array elemanlarını büyükten küçüğe print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("Kaç elemanlı Array istiyorsun");
        int arrBoyut=sc.nextInt();
        int arr[]=new int[arrBoyut];
        for (int i = 0; i <arrBoyut ; i++) {
            System.out.println(i+"index elemanı giriniz");
            arr[i]=sc.nextInt();
        }
        System.out.println("İstediğiniz Array"+Arrays.toString(arr));
        Arrays.sort(arr);// arr k->b sortingen yapıldı..
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }


    }
}
