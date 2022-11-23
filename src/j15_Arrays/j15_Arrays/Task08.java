package j15_Arrays.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        int array[]=new int[7];
        for (int i = 0; i < array.length ; i++) {
            System.out.print(i+". Array elemanını giriniz: ");
             array[i]=sc.nextInt();
        }
        System.out.print(Arrays.toString(array));
        System.out.println();
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]%2==1?" "+array[i]:"");
        }

    }
}
