package j06_Comparison_Karsılastırma_Operators.taskscomparison;

import java.util.Scanner;

public class _17_ComparisonOperators_equal_equal {

    public static void main(String[] args) {

        /*  Verilen iki tane int (num1, num2) ile ilgili,
            Eger num1  num2 ya  eşitse console'da true yazsın.
            Değilse false  */
        Scanner sc=new Scanner(System.in);
        System.out.println("Num1 giriniz");
        int num1=sc.nextInt();
        System.out.println("Num2 giriniz");
        int num2=sc.nextInt();
        boolean esit=(num1==num2);
        System.out.println("Sayılar Eşit mi:"+esit);




    }
}
