package j23_Varargs_StringBuilder.Varargs;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan method create ediniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("İstediğiniz kadar sayı giriniz : ");
        int arr []=new int[sc.nextInt()];
        int x=arr[0];
        System.out.println("toplaCarp(x,arr) = " + toplaCarp(x, arr));

    }
    public static int toplaCarp(int a,int... b){
        int toplam=0;
        for (int i = 1; i < b.length ; i++) {
            toplam+=b[i];
        }
        return a*toplam;
    }
}
