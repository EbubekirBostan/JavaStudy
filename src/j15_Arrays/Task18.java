package j15_Arrays;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        //task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr' ya atayıp print eden code create ediniz
        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        int yeniArr[]=new int[sayi.length];
        for (int i = 0; i <sayi.length ; i++) {
            int tpl=0;
            for (int j = 0; j < sayi[i].length; j++) {
                tpl+=sayi[i][j];
            }
            yeniArr[i]=tpl;
        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
