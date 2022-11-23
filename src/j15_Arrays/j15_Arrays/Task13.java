package j15_Arrays.j15_Arrays;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)
         */
        Scanner sc=new Scanner(System.in);
        int a[]=new int[8];
        int count=0;
        int adet=0;
        for (int i = 0; i < a.length ; i++) {
            System.out.print(i+". Elemanı giriniz : ");
            a[i]=sc.nextInt();
            adet=(a[i]%3)==0?count++:count;
        }
        System.out.println(adet);
    }

}
