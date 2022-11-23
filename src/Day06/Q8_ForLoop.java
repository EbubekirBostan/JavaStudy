package Day06;

import java.util.Scanner;

public class Q8_ForLoop {// Kullanicidan iki sayi isteyin.
// Girilen sayilar ve aralarindaki tum
// tamsayilari toplayip, sonucu yazdiran bir program yaziniz
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int tpl=0;
    for (int i =(num1<num2?num1:num2)+1; i <(num1>num2?num1:num2) ; i++) {
        System.out.println(" "+i);
        tpl+=i;


    }
    System.out.println("toplam= "+tpl);






}
}
