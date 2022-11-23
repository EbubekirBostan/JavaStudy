package j15_Arrays.odev;

import java.util.Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */
        String word="Removes white space from both ends of a string";
        System.out.println(word = word.replace("\\W", ""));
        String wordArr[]=word.split(" ");
        System.out.println(Arrays.toString(wordArr));
        System.out.println(wordArr.length);//[Removes, white, space, from, both, ends, of, a, string]=9




    }
}