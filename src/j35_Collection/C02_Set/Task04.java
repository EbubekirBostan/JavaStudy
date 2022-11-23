package j35_Collection.C02_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Predicate;

public class Task04 {
    /*
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
   olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */
    public static void main(String[] args) {
        HashSet<String> hst=new HashSet<>(Arrays.asList("banana","strawberry","kiwi","pineapple"));
        String str1="banana";
        String str2="peach";
        System.out.println("changeSet(hst,str1,str2) = " + changeSet(hst, str1, str2));//[kiwi, pineapple, strawberry, peach]
    }
    private static HashSet<String> changeSet(HashSet<String> hst, String str1, String str2) {
        if (hst.removeIf(Predicate.isEqual(str1))){// hem kontrol edip hemde siliyoruz
            hst.add(str2);
        }
        return hst;
    }
}
