package Day09;

import java.util.Arrays;

public class Q02_Arrays {
    public static void main(String[] args) {

        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */
        //1.yol
        String str="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        System.out.println(str.replace(" ","").length());
        //2.yol
        String arr[]=str.replace(" ","").split("");
        System.out.println(arr.length);






    }
}
