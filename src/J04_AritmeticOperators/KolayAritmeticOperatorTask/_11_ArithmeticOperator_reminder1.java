package J04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _11_ArithmeticOperator_reminder1 {

    public static void main(String[] args) {

        /*  Verilen int ler hakkında (num1, num2),
            num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
            int sonucu yazdırın.  */
        Scanner sc=new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        int m=sc.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int n=sc.nextInt();
        int kalan=(m%n);
        System.out.println("kalan = " + kalan);


    }
}
