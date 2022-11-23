package j12_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        //task>> girilen sayı 17 den küçük isse kazandınız değilse ise kaybettiniz print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        int num=0;
        do {
            System.out.println("Bir Tamsayı Giriniz = ");
            num=sc.nextInt();
            System.out.println(num+ " için kazandınız");
            num++;
        }while (num<=17);
        System.out.println(num+ " için kaybettiniz... :(");







    }
}
