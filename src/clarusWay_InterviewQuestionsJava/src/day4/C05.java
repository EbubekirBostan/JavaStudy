package clarusWay_InterviewQuestionsJava.src.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05 {
    /*
        Problem Tanımı :
getSum isminde bir method oluşturun.
Parametresi ArrayList'tir.
Dizideki tüm $ ları kaldır ve tüm sayıları topla
return yaptğımız veri tipi 'int' olmalıdır.
sonuç 0'dan küçükse, -1 yazdırın.
Örnek1:
ArrayList = $13, $15, $20
Cevap = 48 olmalı
Örnek 2 :
ArrayList= $-13, $0, $0
Cevap = -1 olmalı.
     */
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("$13", "$15", "$20"));
        getSum(list);


    }

    private static void getSum(List<String> list) {
        int tpl=0;
        for (String s:list){
            String str=s.replace("$","");
            tpl+=Integer.parseInt(str);
        }
        System.out.println("cevap : "+ (tpl<0?-1:tpl));
    }
}
