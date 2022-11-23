package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task09_NestedForLoop {
    public static void main(String[] args) {
         /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *
​
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int a=sc.nextInt();
        for (int i=1; i<=a; i++){
            for (int j=1; j<=i; j++){
                    System.out.print(" * ");
            }
            System.out.println();
        }



    }
}
