package j35_Collection.C02_Set;

import java.util.Arrays;
import java.util.HashSet;

public class Task06 {
    public static void main(String[] args) {
    /*
    Task
    totalCount() isminde bir method oluşturun.
    Parametresi  'Integer Hashset' olmalı

    HashSetteki eleman sayısını alın.
    totalCount'u döndürün.
    Örnek:
    hashset ; 4,2,3,1,7
    cevap: 5
     */
        HashSet<Integer> hs=new HashSet<>(Arrays.asList(4,2,3,1,7));
        System.out.println("totalCount(hs) = " + totalCount(hs));//totalCount(hs) = 5
    }
    private static int totalCount(HashSet<Integer> hs) {
        return hs.size();
    }
}
