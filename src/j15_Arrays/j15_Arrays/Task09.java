package j15_Arrays.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        int array[]=new int[5];
        for (int i = 0; i < array.length ; i++) {
            System.out.println(i+". elemanı giriniz");
            array[i]=sc.nextInt();
        }
        int newArray[]=new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            newArray[(newArray.length-1)-i]=array[i];
        }
        System.out.println(Arrays.toString(newArray));


    }
}
