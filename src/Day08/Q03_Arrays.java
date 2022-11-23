package Day08;

import java.util.Arrays;

public class Q03_Arrays {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
        String apple="HeySiri";
        String yeniApple=apple.replace("Hey","Bye");
        System.out.println("yeniApple = " + yeniApple);
        String arr[]=new String[1];
        arr[0]=yeniApple;
        System.out.println(Arrays.toString(arr));
        //2.YOLLL daha güzel
        String newApple[]=new String[1];
        newApple[0]=apple;
        System.out.println(Arrays.toString(newApple).replace("Hey","Bye"));

    }
}
