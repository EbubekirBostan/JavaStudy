package j35_Collection.C02_Set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.function.Predicate;

public class Task05 {
    public static void main(String[] args) {
        /*
    Task->
   return tipi linkedhashset olan removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli.

    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i return et.
     */
        LinkedHashSet<String> lhs=new LinkedHashSet<>(Arrays.asList("Germany" , "France" , "USA" , "Canada" , "Mexico" , "Brazil"));
        String str1= "Germany";
        String str2 = "USA";
        System.out.println("removing(lhs,str1,str2) = " + removing(lhs, str1, str2));//[France, Canada, Mexico, Brazil]
    }
    private static LinkedHashSet<String> removing(LinkedHashSet<String> lhs, String str1, String str2) {
        lhs.removeIf(Predicate.isEqual(str1));
        lhs.removeIf(Predicate.isEqual(str2));
        return lhs;
    }
}
