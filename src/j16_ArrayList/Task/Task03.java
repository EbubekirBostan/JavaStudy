package j16_ArrayList.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // bir listte istenen sayının varlığını control eden code create ediniz
        List<Integer> listSayi=new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));
        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi=sc.nextInt();
        boolean varMi=false;
        for (int i = 0; i <listSayi.size() ; i++) {
            if (sayi==listSayi.get(i)){
                varMi=true;
                break;
            }
        }
        System.out.println("varMi = " + varMi);



    }
}
