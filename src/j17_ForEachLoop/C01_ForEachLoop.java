package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        /*
        for-each loop for loopun gelişmiş halidir.
        1. clean code - yazım kolaylığı
        2. code okuma kolaylığı
        3. hata yapma riskini azaltır
         */
        List<Integer> sayiList=new ArrayList<>(List.of(16,5,2,33,22,27,41,24));
        // task list elemanlarını ayrı satırlara print ediniz
        for (int a: sayiList){
            System.out.println("a = " + a);
        }
        // task list elemanlarını ilk üç eleman hariç tek olanları print ediniz
        System.out.println("***TAsk2***");
        for (Integer b: sayiList.subList(3, sayiList.size())){
            if (b%2==1){
                System.out.println("b = " + b);
            }
        }
        //task3 list elemanlarını 2 ile 5 index elemanları toplamını print ediniz
        System.out.println("*** task3***");
        int tpl=0;
        for (Integer c:sayiList.subList(2,6)){
            tpl+=c;
        }
        System.out.println("tpl = " + tpl);



    }
}
