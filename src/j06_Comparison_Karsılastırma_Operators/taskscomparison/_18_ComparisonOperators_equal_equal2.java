package j06_Comparison_Karsılastırma_Operators.taskscomparison;

import java.util.Scanner;

public class _18_ComparisonOperators_equal_equal2 {

    public static void main(String[] args) {

    /*    Oluşturulan double'lar hakkında (num1, num2)
          birbirine eşit olup olmadıklarını doğrulayın.
          Eğer eşitlerse konsolda true yazacaktır.  */

        Scanner dp = new Scanner(System.in);
        System.out.println("num1 giriniz");
        double num1 = dp.nextDouble();
        System.out.println("num2 giriniz");
        double num2 = dp.nextDouble();
        boolean esit=(num1==num2);
        System.out.println("Sayılar eşit mi?="+esit);

        // Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
    }
}
