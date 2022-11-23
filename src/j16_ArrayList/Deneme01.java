package j16_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Deneme01 {public static void main(String[] args) {
    // Task-> girilen int değeri tersten print eden code create ediniz.
    Scanner sc = new Scanner(System.in);

    System.out.print("Kaç elemanlı bir array olşturmak istersiniz : ");
    //int arrBoyut = sc.nextInt();

    int arr[] = new int[sc.nextInt()];//boyutu belirlenmiş boş int array

    for (int i = 0; i < arr.length; i++) {//bu loop array elamanlrını alıp atama yapar
        System.out.print(i + ". index  elemanı giriniz : ");
        arr[i] = sc.nextInt();

    }
    System.out.println("olusturdugunuz array : " + Arrays.toString(arr));


    for (int j=arr[(arr.length)-1] ; j>=arr[0] ; j--){

        System.out.println( arr[j]);
    }

}
}
