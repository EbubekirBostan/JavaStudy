package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task07_NestedForLoop {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int a=sc.nextInt();
        for (int i=1; i<=a; i++){
            for (int j=1; j<=a; j++){
                if (i==j){
                    System.out.print("1  ");
                }else System.out.print("0  ");
            }
            System.out.println();
        }





    }
}
