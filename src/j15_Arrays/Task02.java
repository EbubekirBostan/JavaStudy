package j15_Arrays;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task->girilen int array elemanları toplamını print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Kaç elemanlı Array istiyorsun");
        //int arrBoyut=sc.nextInt();
        int arr[]=new int[sc.nextInt()];
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(i+". index elemanı giriniz");
            arr[i]=sc.nextInt();
        }
        for (int a:arr){
            toplam+=a;
        }

        System.out.println("toplam = " + toplam);
    }
}
