package Day01;

import java.util.Scanner;

public class Q8_Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz :");
        int num1=sc.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int num2=sc.nextInt();
        int toplam=num1+num2;
        System.out.println("toplam = " + toplam);
    }
}
