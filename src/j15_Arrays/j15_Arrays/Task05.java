package j15_Arrays.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int num=sc.nextInt();
        int mun=0;
        while (num >0) {
            mun=(mun*10)+(num%10);
            num/=10;
        }
        System.out.println(num);



    }
  
}
