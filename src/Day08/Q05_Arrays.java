package Day08;

import java.util.Scanner;

public class Q05_Arrays {
    /*
  Kullanicidan aldigimiz 8 elemanli arrayin icinde
  kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
 */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[8];
        for (int i = 0; i < array.length ; i++) {
            System.out.print(i+". sayıyı giriniz: ");
            array[i]=sc.nextInt();
        }
        int count=0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i]%3==0){
                count++;
            }

        }
        System.out.println("3 e bölünen " + count+ " sayı var");
    }
}
