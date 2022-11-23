package j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        // task>> girilen tam sayının rakamları toplamını print eden method create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Tamsayı Giriniz = ");
        int num=sc.nextInt();
        System.out.println(rakamTopla(num));


    }

    private static int rakamTopla(int num) {
        int rakamToplami=0;
        while (num>0){
            rakamToplami+=num%10;
            num/=10;
        }
        return rakamToplami;
    }
}
