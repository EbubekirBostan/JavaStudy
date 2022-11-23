package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz: ");
        int num1=sc.nextInt();
        System.out.println("İkinci Sayıyı Giriniz: ");
        int num2=sc.nextInt();
        for (int i = (num1<num2?num1:num2)+1; i <(num1>num2?num1:num2) ; i++) {
            System.out.print(" "+i);
        }
        System.out.println();

        while ((num1)<num2-1){
            System.out.print(" "+(++num1));
        }
        while ((num2)<num1-1){
            System.out.print(" "+ ++num2);
        }



    }
}
