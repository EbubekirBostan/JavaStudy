package j06_Comparison_Karsılastırma_Operators.taskscomparison;

import java.util.Scanner;

public class ComparisonCevaplar {
    public static void main(String[] args) {
        //TASK 14
        int a=13;
        int b=10;
        System.out.println("a büyüktür b den=" +(a>b));
        //ÇIKTI 14
       // a büyüktür b den=true
        //TASK 15
        int c=17;
        int d=20;
        System.out.println("ilk int ikinci int'ten küçüktür="+(c<d));
        //ÇIKTI 15
       // ilk int ikinci int'ten küçüktür=true
        //TASK 16
        int e=13;
        int f=13;
        System.out.println("İlk int İkinci int'e küçük veya eşittir="+(e<=f));
        //ÇIKTI 16
        //İlk int İkinci int'e küçük veya eşittir=true
        //TASK 17
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
        //ÇIKTI 17
        //Num1 giriniz
        //10
        //Num2 giriniz
        //10
        //Sayılar Eşit mi:true
        //Num1 giriniz
        //8
        //Num2 giriniz
        //6
        //Sayılar Eşit mi:false
        //TASK 18
     /*    Oluşturulan double'lar hakkında (num1, num2)
          birbirine eşit olup olmadıklarını doğrulayın.
          Eğer eşitlerse konsolda true yazacaktır.  */

        /*Scanner dp = new Scanner(System.in);
        System.out.println("num1 giriniz");
        double num1 = dp.nextDouble();
        System.out.println("num2 giriniz");
        double num2 = dp.nextDouble();
        boolean esit=(num1==num2);
        System.out.println("Sayılar eşit mi?="+esit);

         */
        //ÇIKTI 18
        //num1 giriniz
        //5
        //num2 giriniz
        //2
        //Sayılar eşit mi?=false
        //TASK 19

        //ÇIKTI 19







    }




}
